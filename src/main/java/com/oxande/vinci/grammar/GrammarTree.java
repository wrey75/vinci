package com.oxande.vinci.grammar;

import java.util.List;
import java.util.Objects;

/**
 * The grammar tree is the compilation tree. The grammar tree can be interpreted or directly assembled as virtual machine code or in any language.
 */
public class GrammarTree {

	
    public GrammarTree(OpCode code, VinciClass clazz, Object object) {
        this();
        this.opCode = code;
        this.type = clazz;
        this.values = new Object[] { object };
    }

    public static final GrammarTree NOP(){
        return new GrammarTree(OpCode.NOP, VinciClass.VOID);
    }

    protected VinciClass type;
    protected OpCode opCode;
    protected Object[] values = new Object[0];
    protected long coverage;

    public void setObject( Object obj ){
        values = new Object[0];
        addObject(obj);
    }

    protected void addObject( Object obj ){
        Object newArray [] = new Object[values.length+1];
        System.arraycopy(this.values, 0, newArray, 0, values.length);
        newArray[values.length] = obj;
        this.values = newArray;
    }

    public GrammarTree() {
    }

//    /**
//     * A easy way to create a tree with multiple entries.
//     * @param code the {@link OpCode}
//     * @param first the first element (mandatory)
//     * @param otherObjects other elements (if any)
//     */
//    public GrammarTree(OpCode code, GrammarTree first, GrammarTree ... otherObjects) {
//        this();
//        this.opCode = code;
//        addGrammars();
//    }

    private void addGrammars(GrammarTree objects[]){
        if( objects.length == 0 ){
            throw new IllegalArgumentException("At least one object is required!");
        }

        GrammarTree first = objects[0];
        this.type = first.type;
        for(int i = 0; i < objects.length; i++ ) {
            if (this.type != objects[i].type) {
                throw new IllegalArgumentException("The object " + objects[i] + " must have the type " + first.type + " (not " + objects[i].type +").");
            }
            this.addObject(objects[i]);
        }
    }

    public GrammarTree(OpCode code, GrammarTree ... objects) {
        this();
        this.opCode = code;
        addGrammars(objects);
    }
    
    /**
     * Create a command based on a group of statements.
     * 
     * @param list the list of statements
     * @return the statements
     */
    public static final GrammarTree statements(List<GrammarTree> list){
    	GrammarTree[] array = list.stream()
    			.filter(Objects::nonNull)
    			.toArray(GrammarTree[]::new);

    	if( array.length == 1 ){
    		return array[0];
    	}
    	
    	if( array.length == 0 ){
    		return GrammarTree.NOP();
    	}
    	
    	GrammarTree root = new GrammarTree(OpCode.BLOCK_OF_STATEMENTS, array);
    	return root;
    }

    /**
     * Create an object with a opeartion code and a type.
     * @param code the OpCode needed.
     * @param vinciClass the class is mandatory.
     */
    public GrammarTree(OpCode code, VinciClass vinciClass) {
        this();
        this.opCode = code;
        this.type = vinciClass;
    }

    /**
     * Provide the value -1.
     *
     * @return the value -1.
     */
    public static final GrammarTree getConstInteger(int v) {
        return new GrammarTree(OpCode.CONSTANT, VinciClass.INTEGER, (Integer)v );
    }
    
    public static final GrammarTree getConstString(CharSequence str) {
        return new GrammarTree(OpCode.CONSTANT, VinciClass.STRING, str.toString() );
    }

//    public static final GrammarTree getConstInt64(long v) {
//        return new GrammarTree(OpCode.CONSTANT, VinciClass.INT64, (Long)v );
//    }

//    public static final GrammarTree getConstNumeric(BigDecimal v) {
//        return new GrammarTree(OpCode.CONSTANT, VinciClass.NUMERIC, v );
//    }
    
    public static final GrammarTree getConstFloat(double v) {
        return new GrammarTree(OpCode.CONSTANT, VinciClass.FLOAT, v );
    }


    /**
     *
     * Convert a {@link GrammarTree} to its equivalent in the new type. Mainly
     * used for casting integers to double.
     *
     * @param dest the destination type.
     * @param explicit if the conversion is explicit (used to convert floats to int)
     * @return The convered value (can be the same or a new one).
     */
    public final GrammarTree cast(VinciClass dest, boolean explicit) throws ClassCastException {
        if( dest.equals(type) ){
            // Very simple case
            return this;
        }

        switch (dest) {
        case INTEGER:
            switch(type){
            case FLOAT:
                if( explicit ) {
                    return new GrammarTree(OpCode.CAST_FLOAT_TO_INT, VinciClass.FLOAT, this);
                }
                else {
                    throw new ClassCastException("Conversion from FLOAT to INTEGER must be explicit.");
                }
            }
            break;

        case FLOAT:
            switch(type){
            case INTEGER:
                return new GrammarTree( OpCode.CAST_INT_TO_FLOAT, VinciClass.FLOAT, this );
            }
            break;

        default:
            throw new ClassCastException("No cast available to " + dest);
        }

        throw new ClassCastException("Can not cast from " + this.type + " to " + dest);
    }

    public boolean isNumeric(){
        return this.type == VinciClass.INTEGER || this.type == VinciClass.FLOAT /* || this.type == VinciClass.NUMERIC */;
    }

    public static final GrammarTree[] castNumeric(GrammarTree ... operands ) throws ClassCastException {
        VinciClass[] checks = new VinciClass[operands.length];
        GrammarTree[] ret = new GrammarTree[operands.length];
        VinciClass dest = VinciClass.INTEGER;
        for(int i = 0; i < operands.length; i++ ){
            // All operands must be numeric
//            if( !operands[i].isNumeric() ){
//                throw new ClassCastException("At least one of the operands is NOT numeric");
//            }

            if( operands[i].type.ordinal() > dest.ordinal() ){
                dest = operands[i].type;
            }
        }

        // Now cast them all!
        for(int i = 0; i < operands.length; i++ ){
            ret[i] = operands[i].cast(dest, false);
        }
        return ret;
    }

    public OpCode getOpCode() {
        return opCode;
    }

    public VinciClass getType() {
        return type;
    }

    public void resetCoverage(){

    }

    public void covered(){
        this.coverage++;
    }

    public Object getOperand(int i){
        return this.values[i];
    }
    
    public int getNumberOfOperands(){
    	return this.values.length;
    }

    public Object getValue(){
        return getOperand(0);
    }

}
