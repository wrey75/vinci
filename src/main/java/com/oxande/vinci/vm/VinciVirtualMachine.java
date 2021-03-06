package com.oxande.vinci.vm;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import com.oxande.vinci.grammar.GrammarTree;

/**
 * The JAVA virtual machine
 */
public class VinciVirtualMachine implements Runnable {

	public static final int STOPPED = 0;
	public static final int RUNNING = 1;
	public static final int HALTED = 2;

	int ip; // Instruction pointer

	boolean autoFlush = true;
	PrintStream out;
	PrintStream err;
	InputStream in;
	int exitCode = -1;

	int mode = STOPPED;
	GrammarTree code = GrammarTree.NOP();
	VinciState state = new VinciState();

	/**
	 * Initialize a {@link VinciVirtualMachine}.
	 *
	 */
	public VinciVirtualMachine() {
		this.out = System.out;
		this.err = System.err;
		this.in = System.in; // Why is it a stream?
		this.ip = 0;
	}

	/**
	 * In case the output stream or the error stream have been changed, you can
	 * ask for an auto flushing when data are written to these outputs.
	 *
	 * @param b
	 *            true to set the auto flushing.
	 */
	public void setAutoflush(boolean b) {
		this.autoFlush = b;
	}

	public void setOutput(OutputStream out) {
		try {
			setOutput(out, Charset.defaultCharset().name());
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Default encoding not supported???", ex);
		}
	}

	public void setError(OutputStream out) {
		try {
			setError(out, Charset.defaultCharset().name());
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Default encoding not supported???", ex);
		}
	}

	public void setInput(InputStream in) {
		this.in = in;
	}

	public void setOutput(OutputStream out, String encoding) throws UnsupportedEncodingException {
		this.out = new PrintStream(out, this.autoFlush, encoding);
	}

	public void setError(OutputStream out, String encoding) throws UnsupportedEncodingException {
		this.err = new PrintStream(out, this.autoFlush, encoding);
	}

	protected void println(VinciValue v) {
		this.out.println(v.value());
	}

	/**
	 * Load the code in the VVM.
	 *
	 * @param code
	 *            the compiled code.
	 */
	public void load(GrammarTree code) {
		this.code = code;
	}

	/**
	 * Runs the code
	 */
	@Override
	public void run() {
		this.mode = RUNNING;
		VinciValue var = execute(this.code, this.state);
		if( var != null ){
			println(var);
		}
		this.exitCode = 0;
	}

	public VinciValue execute(GrammarTree tree, VinciState state) {
		GrammarTree op0, op1, op2;
		VinciValue var0, var1, var2;
		String varName;
		int n;

		VinciValue var = null;
		switch (tree.getOpCode()) {
			case ADD:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = var1.add(var2);
				break;
			
			case STRING_MULTIPLY:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = var1.string_multiply(var2);
				break;
				
			case MULTIPLY:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = var1.multiply(var2);
				break;
				
			case DIVIDE:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = var1.divide(var2);
				break;

			case EQUALS:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = VinciValue.fromBoolean(var1.compare(var2) == 0);
				break;

			case BELOW:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = VinciValue.fromBoolean(var1.compare(var2) < 0);
				break;

			case BELOW_OR_EQUALS:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = VinciValue.fromBoolean(var1.compare(var2) <= 0);
				break;

			case CONSTANT:
				switch (tree.getType()) {
					case INTEGER:
						var = VinciValue.fromInteger((int) tree.getValue());
						break;
					case FLOAT:
						var = VinciValue.fromFloat((double) tree.getValue());
						break;
					case STRING:
						var = VinciValue.fromString((CharSequence)tree.getValue());
						break;
					default:
						throw new UnsupportedOperationException(
								"Operation CONSTANT not supported for type " + tree.getType());
				}
				break;

			case CAST_INT_TO_FLOAT:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var = VinciValue.fromFloat(var1.intValue());
				break;
			case PRINTLN:
				var0 = execute((GrammarTree) tree.getValue(), state);
				// Returns the value but print it first.
				println(var0);
				break;
				
			case BOOLEAN_NOT:
				var1 = execute((GrammarTree) tree.getValue(), state);
				var = VinciValue.fromBoolean(!var1.booleanValue());
				break;

			case BLOCK_OF_STATEMENTS:
				n = tree.getNumberOfOperands();
				for (int i = 0; i < n; i++) {
					var = execute((GrammarTree) tree.getOperand(i), state);
				}
				break;
				
			case REFERENCE:
				var = state.getVariable(tree);
				break;
				
			case STORE:
				var1 = execute((GrammarTree) tree.getOperand(0), state);
				var2 = execute((GrammarTree) tree.getOperand(1), state);
				var = state.putValue(var1.getName(), var2);
				break;
				
			default:
				throw new UnsupportedOperationException("Operation code " + tree.getOpCode() + " not supported.");
		}
		tree.covered();
		return var;
	}

	public int getExitCode() {
		return this.exitCode;
	}

}
