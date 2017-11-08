// Generated from com/oxande/vinci/antlr4/Vinci.g4 by ANTLR 4.7
package com.oxande.vinci.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VinciParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Auto=14, Break=15, Case=16, Char=17, 
		Const=18, Continue=19, Default=20, Do=21, Double=22, Else=23, Enum=24, 
		Extern=25, Float=26, For=27, Goto=28, If=29, Inline=30, Int=31, Long=32, 
		Register=33, Restrict=34, Return=35, Short=36, Signed=37, Sizeof=38, Static=39, 
		Struct=40, Switch=41, Typedef=42, Union=43, Unsigned=44, Void=45, Volatile=46, 
		While=47, Alignas=48, Alignof=49, Atomic=50, Bool=51, Complex=52, Generic=53, 
		Imaginary=54, Noreturn=55, StaticAssert=56, ThreadLocal=57, LeftParen=58, 
		RightParen=59, LeftBracket=60, RightBracket=61, LeftBrace=62, RightBrace=63, 
		Less=64, LessEqual=65, Greater=66, GreaterEqual=67, LeftShift=68, RightShift=69, 
		Plus=70, PlusPlus=71, Minus=72, MinusMinus=73, Star=74, Div=75, Mod=76, 
		And=77, Or=78, AndAnd=79, OrOr=80, Caret=81, Not=82, Tilde=83, Question=84, 
		Colon=85, Semi=86, Comma=87, Assign=88, StarAssign=89, PlusAssign=90, 
		MinusAssign=91, LeftShiftAssign=92, RightShiftAssign=93, AndAssign=94, 
		XorAssign=95, OrAssign=96, Equal=97, NotEqual=98, Arrow=99, Dot=100, Ellipsis=101, 
		Identifier=102, Constant=103, DigitSequence=104, StringLiteral=105, ComplexDefine=106, 
		AsmBlock=107, LineAfterPreprocessing=108, LineDirective=109, PragmaDirective=110, 
		Whitespace=111, Newline=112, BlockComment=113, LineComment=114;
	public static final int
		RULE_primaryExpression = 0, RULE_postfixExpression = 1, RULE_argumentExpressionList = 2, 
		RULE_unaryExpression = 3, RULE_unaryOperator = 4, RULE_castExpression = 5, 
		RULE_multiplicativeExpression = 6, RULE_additiveExpression = 7, RULE_shiftExpression = 8, 
		RULE_relationalExpression = 9, RULE_equalityExpression = 10, RULE_andExpression = 11, 
		RULE_exclusiveOrExpression = 12, RULE_inclusiveOrExpression = 13, RULE_logicalAndExpression = 14, 
		RULE_logicalOrExpression = 15, RULE_conditionalExpression = 16, RULE_assignmentExpression = 17, 
		RULE_expression = 18, RULE_constantExpression = 19, RULE_declaration = 20, 
		RULE_declarationSpecifiers = 21, RULE_declarationSpecifiers2 = 22, RULE_declarationSpecifier = 23, 
		RULE_initDeclaratorList = 24, RULE_initDeclarator = 25, RULE_storageClassSpecifier = 26, 
		RULE_typeSpecifier = 27, RULE_structOrUnionSpecifier = 28, RULE_structOrUnion = 29, 
		RULE_structDeclarationList = 30, RULE_structDeclaration = 31, RULE_specifierQualifierList = 32, 
		RULE_structDeclaratorList = 33, RULE_structDeclarator = 34, RULE_enumSpecifier = 35, 
		RULE_enumeratorList = 36, RULE_enumerator = 37, RULE_enumerationConstant = 38, 
		RULE_atomicTypeSpecifier = 39, RULE_typeQualifier = 40, RULE_functionSpecifier = 41, 
		RULE_alignmentSpecifier = 42, RULE_declarator = 43, RULE_directDeclarator = 44, 
		RULE_gccDeclaratorExtension = 45, RULE_gccAttributeSpecifier = 46, RULE_gccAttributeList = 47, 
		RULE_gccAttribute = 48, RULE_nestedParenthesesBlock = 49, RULE_pointer = 50, 
		RULE_typeQualifierList = 51, RULE_parameterTypeList = 52, RULE_parameterList = 53, 
		RULE_parameterDeclaration = 54, RULE_identifierList = 55, RULE_typeName = 56, 
		RULE_abstractDeclarator = 57, RULE_directAbstractDeclarator = 58, RULE_typedefName = 59, 
		RULE_initializer = 60, RULE_initializerList = 61, RULE_designation = 62, 
		RULE_designatorList = 63, RULE_designator = 64, RULE_staticAssertDeclaration = 65, 
		RULE_statement = 66, RULE_labeledStatement = 67, RULE_compoundStatement = 68, 
		RULE_blockItemList = 69, RULE_blockItem = 70, RULE_expressionStatement = 71, 
		RULE_selectionStatement = 72, RULE_iterationStatement = 73, RULE_forCondition = 74, 
		RULE_forDeclaration = 75, RULE_forExpression = 76, RULE_jumpStatement = 77, 
		RULE_compilationUnit = 78, RULE_translationUnit = 79, RULE_externalDeclaration = 80, 
		RULE_functionDefinition = 81, RULE_declarationList = 82;
	public static final String[] ruleNames = {
		"primaryExpression", "postfixExpression", "argumentExpressionList", "unaryExpression", 
		"unaryOperator", "castExpression", "multiplicativeExpression", "additiveExpression", 
		"shiftExpression", "relationalExpression", "equalityExpression", "andExpression", 
		"exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
		"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
		"expression", "constantExpression", "declaration", "declarationSpecifiers", 
		"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
		"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
		"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
		"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
		"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
		"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
		"gccDeclaratorExtension", "gccAttributeSpecifier", "gccAttributeList", 
		"gccAttribute", "nestedParenthesesBlock", "pointer", "typeQualifierList", 
		"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
		"typeName", "abstractDeclarator", "directAbstractDeclarator", "typedefName", 
		"initializer", "initializerList", "designation", "designatorList", "designator", 
		"staticAssertDeclaration", "statement", "labeledStatement", "compoundStatement", 
		"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
		"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
		"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
		"functionDefinition", "declarationList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'__extension__'", "'println'", "'boolean'", "'__m128'", "'__m128d'", 
		"'__m128i'", "'__inline__'", "'__stdcall'", "'__declspec'", "'__asm'", 
		"'__attribute__'", "'__asm__'", "'__volatile__'", "'auto'", "'break'", 
		"'case'", "'char'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
		"'else'", "'enum'", "'extern'", "'float'", "'for'", "'goto'", "'if'", 
		"'inline'", "'int'", "'long'", "'register'", "'restrict'", "'return'", 
		"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
		"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
		"'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", 
		"'_Imaginary'", "'_Noreturn'", "'_Static_assert'", "'_Thread_local'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
		"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
		"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", 
		"'='", "'*='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", 
		"'=='", "'!='", "'->'", "'.'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Auto", "Break", "Case", "Char", "Const", "Continue", "Default", 
		"Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", 
		"Inline", "Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", 
		"Sizeof", "Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", 
		"Void", "Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", "Complex", 
		"Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
		"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
		"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
		"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon", 
		"Semi", "Comma", "Assign", "StarAssign", "PlusAssign", "MinusAssign", 
		"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
		"Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", "Constant", 
		"DigitSequence", "StringLiteral", "ComplexDefine", "AsmBlock", "LineAfterPreprocessing", 
		"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Vinci.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VinciParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(VinciParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(VinciParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(VinciParser.StringLiteral, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(169); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(168);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(LeftParen);
				setState(174);
				expression();
				setState(175);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(180);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(181);
				match(LeftParen);
				setState(182);
				typeName();
				setState(183);
				match(RightParen);
				setState(184);
				match(LeftBrace);
				setState(185);
				initializerList(0);
				setState(186);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(188);
				match(LeftParen);
				setState(189);
				typeName();
				setState(190);
				match(RightParen);
				setState(191);
				match(LeftBrace);
				setState(192);
				initializerList(0);
				setState(193);
				match(Comma);
				setState(194);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(196);
				match(T__0);
				setState(197);
				match(LeftParen);
				setState(198);
				typeName();
				setState(199);
				match(RightParen);
				setState(200);
				match(LeftBrace);
				setState(201);
				initializerList(0);
				setState(202);
				match(RightBrace);
				}
				break;
			case 5:
				{
				setState(204);
				match(T__0);
				setState(205);
				match(LeftParen);
				setState(206);
				typeName();
				setState(207);
				match(RightParen);
				setState(208);
				match(LeftBrace);
				setState(209);
				initializerList(0);
				setState(210);
				match(Comma);
				setState(211);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(215);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(216);
						match(LeftBracket);
						setState(217);
						expression();
						setState(218);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(220);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(221);
						match(LeftParen);
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
							{
							setState(222);
							argumentExpressionList(0);
							}
						}

						setState(225);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						match(Dot);
						setState(228);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
						match(Arrow);
						setState(231);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(232);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(233);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(235);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(244);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(245);
					match(Comma);
					setState(246);
					assignmentExpression();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Token op;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryExpression);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				postfixExpression(0);
				}
				break;
			case PlusPlus:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((UnaryExpressionContext)_localctx).op = match(PlusPlus);
				setState(254);
				unaryExpression();
				}
				break;
			case MinusMinus:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				((UnaryExpressionContext)_localctx).op = match(MinusMinus);
				setState(256);
				unaryExpression();
				}
				break;
			case Plus:
			case Minus:
			case Not:
			case Tilde:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				unaryOperator();
				setState(258);
				castExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(VinciParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_castExpression);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(LeftParen);
				setState(266);
				typeName();
				setState(267);
				match(RightParen);
				setState(268);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(T__0);
				setState(271);
				match(LeftParen);
				setState(272);
				typeName();
				setState(273);
				match(RightParen);
				setState(274);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Token op;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(282);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(283);
						((MultiplicativeExpressionContext)_localctx).op = match(Star);
						setState(284);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(285);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(286);
						((MultiplicativeExpressionContext)_localctx).op = match(Div);
						setState(287);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(288);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(289);
						((MultiplicativeExpressionContext)_localctx).op = match(Mod);
						setState(290);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext a;
		public Token op;
		public MultiplicativeExpressionContext b;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(299);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(300);
						((AdditiveExpressionContext)_localctx).op = match(Plus);
						setState(301);
						((AdditiveExpressionContext)_localctx).b = multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(302);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(303);
						((AdditiveExpressionContext)_localctx).op = match(Minus);
						setState(304);
						((AdditiveExpressionContext)_localctx).b = multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(311);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(313);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(314);
						match(LeftShift);
						setState(315);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(316);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(317);
						match(RightShift);
						setState(318);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Token op;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(325);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(327);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(328);
						((RelationalExpressionContext)_localctx).op = match(Less);
						setState(329);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(330);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(331);
						((RelationalExpressionContext)_localctx).op = match(Greater);
						setState(332);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(333);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(334);
						((RelationalExpressionContext)_localctx).op = match(LessEqual);
						setState(335);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(336);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(337);
						((RelationalExpressionContext)_localctx).op = match(GreaterEqual);
						setState(338);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Token op;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(345);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(348);
						((EqualityExpressionContext)_localctx).op = match(Equal);
						setState(349);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(350);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(351);
						((EqualityExpressionContext)_localctx).op = match(NotEqual);
						setState(352);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(361);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(362);
					match(And);
					setState(363);
					equalityExpression(0);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(370);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(372);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(373);
					match(Caret);
					setState(374);
					andExpression(0);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(384);
					match(Or);
					setState(385);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(392);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(394);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(395);
					match(AndAnd);
					setState(396);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(405);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(406);
					match(OrOr);
					setState(407);
					logicalAndExpression(0);
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			logicalOrExpression(0);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(414);
				match(Question);
				setState(415);
				expression();
				setState(416);
				match(Colon);
				setState(417);
				conditionalExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public Token op;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(VinciParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentExpression);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				((AssignmentExpressionContext)_localctx).op = match(T__1);
				setState(423);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				unaryExpression();
				setState(425);
				match(Assign);
				setState(426);
				assignmentExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				declarationSpecifiers();
				setState(436);
				initDeclaratorList(0);
				setState(437);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				declarationSpecifiers();
				setState(440);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				staticAssertDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(445);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(448); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDeclarationSpecifiers2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(450);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declarationSpecifier);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(459);
				alignmentSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(463);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(465);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(466);
					match(Comma);
					setState(467);
					initDeclarator();
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initDeclarator);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				declarator();
				setState(475);
				match(Assign);
				setState(476);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeSpecifier);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Void))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				match(T__0);
				setState(484);
				match(LeftParen);
				setState(485);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(486);
				match(RightParen);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(490);
				typedefName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStructOrUnionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				structOrUnion();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(494);
					match(Identifier);
					}
				}

				setState(497);
				match(LeftBrace);
				setState(498);
				structDeclarationList(0);
				setState(499);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				structOrUnion();
				setState(502);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionContext extends ParserRuleContext {
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStructOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStructDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(509);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(511);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(512);
					structDeclaration();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structDeclaration);
		int _la;
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Struct:
			case Union:
			case Void:
			case Volatile:
			case Atomic:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				specifierQualifierList();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (Star - 58)) | (1L << (Caret - 58)) | (1L << (Colon - 58)) | (1L << (Identifier - 58)))) != 0)) {
					{
					setState(519);
					structDeclaratorList(0);
					}
				}

				setState(522);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_specifierQualifierList);
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				typeSpecifier();
				setState(529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(528);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				typeQualifier();
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(532);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStructDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(538);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(540);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(541);
					match(Comma);
					setState(542);
					structDeclarator();
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structDeclarator);
		int _la;
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (Star - 58)) | (1L << (Caret - 58)) | (1L << (Identifier - 58)))) != 0)) {
					{
					setState(549);
					declarator();
					}
				}

				setState(552);
				match(Colon);
				setState(553);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enumSpecifier);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(Enum);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(557);
					match(Identifier);
					}
				}

				setState(560);
				match(LeftBrace);
				setState(561);
				enumeratorList(0);
				setState(562);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(Enum);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(565);
					match(Identifier);
					}
				}

				setState(568);
				match(LeftBrace);
				setState(569);
				enumeratorList(0);
				setState(570);
				match(Comma);
				setState(571);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(Enum);
				setState(574);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(578);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(580);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(581);
					match(Comma);
					setState(582);
					enumerator();
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumerator);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				enumerationConstant();
				setState(590);
				match(Assign);
				setState(591);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitEnumerationConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitAtomicTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(Atomic);
			setState(598);
			match(LeftParen);
			setState(599);
			typeName();
			setState(600);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionSpecifier);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				gccAttributeSpecifier();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				match(T__8);
				setState(607);
				match(LeftParen);
				setState(608);
				match(Identifier);
				setState(609);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitAlignmentSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alignmentSpecifier);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(Alignas);
				setState(613);
				match(LeftParen);
				setState(614);
				typeName();
				setState(615);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(Alignas);
				setState(618);
				match(LeftParen);
				setState(619);
				constantExpression();
				setState(620);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(624);
				pointer();
				}
			}

			setState(627);
			directDeclarator(0);
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(628);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(VinciParser.DigitSequence, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(635);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(636);
				match(LeftParen);
				setState(637);
				declarator();
				setState(638);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(640);
				match(Identifier);
				setState(641);
				match(Colon);
				setState(642);
				match(DigitSequence);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(645);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(646);
						match(LeftBracket);
						setState(648);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(647);
							typeQualifierList(0);
							}
						}

						setState(651);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
							{
							setState(650);
							assignmentExpression();
							}
						}

						setState(653);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(654);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(655);
						match(LeftBracket);
						setState(656);
						match(Static);
						setState(658);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(657);
							typeQualifierList(0);
							}
						}

						setState(660);
						assignmentExpression();
						setState(661);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(663);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(664);
						match(LeftBracket);
						setState(665);
						typeQualifierList(0);
						setState(666);
						match(Static);
						setState(667);
						assignmentExpression();
						setState(668);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(670);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(671);
						match(LeftBracket);
						setState(673);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(672);
							typeQualifierList(0);
							}
						}

						setState(675);
						match(Star);
						setState(676);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(677);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(678);
						match(LeftParen);
						setState(679);
						parameterTypeList();
						setState(680);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(682);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(683);
						match(LeftParen);
						setState(685);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(684);
							identifierList(0);
							}
						}

						setState(687);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(VinciParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(VinciParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitGccDeclaratorExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitGccDeclaratorExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(T__9);
				setState(694);
				match(LeftParen);
				setState(696); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(695);
					match(StringLiteral);
					}
					}
					setState(698); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(700);
				match(RightParen);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				gccAttributeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitGccAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitGccAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(T__10);
			setState(705);
			match(LeftParen);
			setState(706);
			match(LeftParen);
			setState(707);
			gccAttributeList();
			setState(708);
			match(RightParen);
			setState(709);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitGccAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitGccAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_gccAttributeList);
		int _la;
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				gccAttribute();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(712);
					match(Comma);
					setState(713);
					gccAttribute();
					}
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitGccAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitGccAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_gccAttribute);
		int _la;
		try {
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case ComplexDefine:
			case AsmBlock:
			case LineAfterPreprocessing:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (RightParen - 58)) | (1L << (Comma - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(723);
					match(LeftParen);
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
						{
						setState(724);
						argumentExpressionList(0);
						}
					}

					setState(727);
					match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitNestedParenthesesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(738);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(733);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(734);
					match(LeftParen);
					setState(735);
					nestedParenthesesBlock();
					setState(736);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_pointer);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				match(Star);
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(744);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				match(Star);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(748);
					typeQualifierList(0);
					}
				}

				setState(751);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				match(Caret);
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(753);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(756);
				match(Caret);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(757);
					typeQualifierList(0);
					}
				}

				setState(760);
				pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitTypeQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(764);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(766);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(767);
					typeQualifier();
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitParameterTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameterTypeList);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				parameterList(0);
				setState(775);
				match(Comma);
				setState(776);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(781);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(783);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(784);
					match(Comma);
					setState(785);
					parameterDeclaration();
					}
					} 
				}
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parameterDeclaration);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				declarationSpecifiers();
				setState(792);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				declarationSpecifiers2();
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(795);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(801);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(803);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(804);
					match(Comma);
					setState(805);
					match(Identifier);
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			specifierQualifierList();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (LeftBracket - 58)) | (1L << (Star - 58)) | (1L << (Caret - 58)))) != 0)) {
				{
				setState(812);
				abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(816);
					pointer();
					}
				}

				setState(819);
				directAbstractDeclarator(0);
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(820);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(825);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(829);
				match(LeftParen);
				setState(830);
				abstractDeclarator();
				setState(831);
				match(RightParen);
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(832);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(837);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(838);
				match(LeftBracket);
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(839);
					typeQualifierList(0);
					}
				}

				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(842);
					assignmentExpression();
					}
				}

				setState(845);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(846);
				match(LeftBracket);
				setState(847);
				match(Static);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(848);
					typeQualifierList(0);
					}
				}

				setState(851);
				assignmentExpression();
				setState(852);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(854);
				match(LeftBracket);
				setState(855);
				typeQualifierList(0);
				setState(856);
				match(Static);
				setState(857);
				assignmentExpression();
				setState(858);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(860);
				match(LeftBracket);
				setState(861);
				match(Star);
				setState(862);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(863);
				match(LeftParen);
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(864);
					parameterTypeList();
					}
				}

				setState(867);
				match(RightParen);
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(868);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(873);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(919);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(917);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(876);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(877);
						match(LeftBracket);
						setState(879);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(878);
							typeQualifierList(0);
							}
						}

						setState(882);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
							{
							setState(881);
							assignmentExpression();
							}
						}

						setState(884);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(885);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(886);
						match(LeftBracket);
						setState(887);
						match(Static);
						setState(889);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(888);
							typeQualifierList(0);
							}
						}

						setState(891);
						assignmentExpression();
						setState(892);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(894);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(895);
						match(LeftBracket);
						setState(896);
						typeQualifierList(0);
						setState(897);
						match(Static);
						setState(898);
						assignmentExpression();
						setState(899);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(901);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(902);
						match(LeftBracket);
						setState(903);
						match(Star);
						setState(904);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(905);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(906);
						match(LeftParen);
						setState(908);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(907);
							parameterTypeList();
							}
						}

						setState(910);
						match(RightParen);
						setState(914);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(911);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(916);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_initializer);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(LeftBrace);
				setState(926);
				initializerList(0);
				setState(927);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(929);
				match(LeftBrace);
				setState(930);
				initializerList(0);
				setState(931);
				match(Comma);
				setState(932);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(937);
				designation();
				}
			}

			setState(940);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(950);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(942);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(943);
					match(Comma);
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(944);
						designation();
						}
					}

					setState(947);
					initializer();
					}
					} 
				}
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			designatorList(0);
			setState(954);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDesignatorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(957);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(959);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(960);
					designator();
					}
					} 
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_designator);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				match(LeftBracket);
				setState(967);
				constantExpression();
				setState(968);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(Dot);
				setState(971);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(VinciParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(VinciParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(StaticAssert);
			setState(975);
			match(LeftParen);
			setState(976);
			constantExpression();
			setState(977);
			match(Comma);
			setState(979); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(978);
				match(StringLiteral);
				}
				}
				setState(981); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(983);
			match(RightParen);
			setState(984);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statement);
		int _la;
		try {
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(988);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(989);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(990);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(991);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(992);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(993);
				match(LeftParen);
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==LeftParen || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(994);
					logicalOrExpression(0);
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(995);
						match(Comma);
						setState(996);
						logicalOrExpression(0);
						}
						}
						setState(1001);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1004);
					match(Colon);
					setState(1013);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0 || _la==LeftParen || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
						{
						setState(1005);
						logicalOrExpression(0);
						setState(1010);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1006);
							match(Comma);
							setState(1007);
							logicalOrExpression(0);
							}
							}
							setState(1012);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(RightParen);
				setState(1021);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_labeledStatement);
		try {
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				match(Identifier);
				setState(1025);
				match(Colon);
				setState(1026);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				match(Case);
				setState(1028);
				constantExpression();
				setState(1029);
				match(Colon);
				setState(1030);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				match(Default);
				setState(1033);
				match(Colon);
				setState(1034);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(LeftBrace);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Auto) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Semi - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(1038);
				blockItemList(0);
				}
			}

			setState(1041);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1044);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1046);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1047);
					blockItem();
					}
					} 
				}
				setState(1052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_blockItem);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(1057);
				expression();
				}
			}

			setState(1060);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_selectionStatement);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(If);
				setState(1063);
				match(LeftParen);
				setState(1064);
				expression();
				setState(1065);
				match(RightParen);
				setState(1066);
				statement();
				setState(1069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1067);
					match(Else);
					setState(1068);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				match(Switch);
				setState(1072);
				match(LeftParen);
				setState(1073);
				expression();
				setState(1074);
				match(RightParen);
				setState(1075);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(VinciParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(VinciParser.Do, 0); }
		public TerminalNode For() { return getToken(VinciParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_iterationStatement);
		try {
			setState(1099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				match(While);
				setState(1080);
				match(LeftParen);
				setState(1081);
				expression();
				setState(1082);
				match(RightParen);
				setState(1083);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				match(Do);
				setState(1086);
				statement();
				setState(1087);
				match(While);
				setState(1088);
				match(LeftParen);
				setState(1089);
				expression();
				setState(1090);
				match(RightParen);
				setState(1091);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
				match(For);
				setState(1094);
				match(LeftParen);
				setState(1095);
				forCondition();
				setState(1096);
				match(RightParen);
				setState(1097);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_forCondition);
		int _la;
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				forDeclaration();
				setState(1102);
				match(Semi);
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1103);
					forExpression(0);
					}
				}

				setState(1106);
				match(Semi);
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1107);
					forExpression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1110);
					expression();
					}
				}

				setState(1113);
				match(Semi);
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1114);
					forExpression(0);
					}
				}

				setState(1117);
				match(Semi);
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1118);
					forExpression(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_forDeclaration);
		try {
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				declarationSpecifiers();
				setState(1124);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				declarationSpecifiers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1130);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(1132);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1133);
					match(Comma);
					setState(1134);
					assignmentExpression();
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_jumpStatement);
		int _la;
		try {
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(Goto);
				setState(1141);
				match(Identifier);
				setState(1142);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1143);
				match(Continue);
				setState(1144);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1145);
				match(Break);
				setState(1146);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
				match(Return);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1148);
					expression();
					}
				}

				setState(1151);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1152);
				match(Goto);
				setState(1153);
				unaryExpression();
				setState(1154);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VinciParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Auto) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Star - 70)) | (1L << (Caret - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Semi - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(1158);
				translationUnit(0);
				}
			}

			setState(1161);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1164);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1167);
					externalDeclaration();
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_externalDeclaration);
		try {
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1173);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1175);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1176);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1179);
				declarationSpecifiers();
				}
				break;
			}
			setState(1182);
			declarator();
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1183);
				declarationList(0);
				}
			}

			setState(1186);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1189);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1191);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1192);
					declaration();
					}
					} 
				}
				setState(1197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 2:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 6:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 7:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 8:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 9:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 10:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 11:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 12:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 13:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 14:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 15:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 24:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 30:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 33:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 36:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 44:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 51:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 53:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 55:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 58:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 61:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 63:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 69:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 76:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 79:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 82:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 7);
		case 30:
			return precpred(_ctx, 6);
		case 31:
			return precpred(_ctx, 5);
		case 32:
			return precpred(_ctx, 4);
		case 33:
			return precpred(_ctx, 3);
		case 34:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 5);
		case 39:
			return precpred(_ctx, 4);
		case 40:
			return precpred(_ctx, 3);
		case 41:
			return precpred(_ctx, 2);
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u04b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\6\2\u00ac\n\2\r\2\16\2\u00ad\3\2\3\2\3\2\3\2\5\2\u00b4\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00d8\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e2\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ef\n\3\f\3\16\3\u00f2\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\u00fa\n\4\f\4\16\4\u00fd\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0107\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0118\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0126\n\b\f\b\16\b\u0129\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0134\n\t\f\t\16\t\u0137\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u0142\n\n\f\n\16\n\u0145\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0156\n\13\f\13"+
		"\16\13\u0159\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0164\n\f\f"+
		"\f\16\f\u0167\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u016f\n\r\f\r\16\r\u0172"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u017a\n\16\f\16\16\16\u017d\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0185\n\17\f\17\16\17\u0188\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0190\n\20\f\20\16\20\u0193\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u019b\n\21\f\21\16\21\u019e\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01a6\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u01b0\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01be\n\26\3\27\6\27\u01c1\n\27\r\27\16"+
		"\27\u01c2\3\30\6\30\u01c6\n\30\r\30\16\30\u01c7\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u01cf\n\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01d7\n\32\f\32"+
		"\16\32\u01da\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u01e1\n\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01ee\n\35\3\36\3\36"+
		"\5\36\u01f2\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01fb\n\36\3"+
		"\37\3\37\3 \3 \3 \3 \3 \7 \u0204\n \f \16 \u0207\13 \3!\3!\5!\u020b\n"+
		"!\3!\3!\3!\5!\u0210\n!\3\"\3\"\5\"\u0214\n\"\3\"\3\"\5\"\u0218\n\"\5\""+
		"\u021a\n\"\3#\3#\3#\3#\3#\3#\7#\u0222\n#\f#\16#\u0225\13#\3$\3$\5$\u0229"+
		"\n$\3$\3$\5$\u022d\n$\3%\3%\5%\u0231\n%\3%\3%\3%\3%\3%\3%\5%\u0239\n%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u0242\n%\3&\3&\3&\3&\3&\3&\7&\u024a\n&\f&\16"+
		"&\u024d\13&\3\'\3\'\3\'\3\'\3\'\5\'\u0254\n\'\3(\3(\3)\3)\3)\3)\3)\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\5+\u0265\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0271"+
		"\n,\3-\5-\u0274\n-\3-\3-\7-\u0278\n-\f-\16-\u027b\13-\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\5.\u0286\n.\3.\3.\3.\5.\u028b\n.\3.\5.\u028e\n.\3.\3.\3.\3"+
		".\3.\5.\u0295\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02a4\n.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02b0\n.\3.\7.\u02b3\n.\f.\16.\u02b6\13"+
		".\3/\3/\3/\6/\u02bb\n/\r/\16/\u02bc\3/\3/\5/\u02c1\n/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u02cd\n\61\f\61\16\61\u02d0\13"+
		"\61\3\61\5\61\u02d3\n\61\3\62\3\62\3\62\5\62\u02d8\n\62\3\62\5\62\u02db"+
		"\n\62\3\62\5\62\u02de\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u02e5\n\63\f"+
		"\63\16\63\u02e8\13\63\3\64\3\64\5\64\u02ec\n\64\3\64\3\64\5\64\u02f0\n"+
		"\64\3\64\3\64\3\64\5\64\u02f5\n\64\3\64\3\64\5\64\u02f9\n\64\3\64\5\64"+
		"\u02fc\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u0303\n\65\f\65\16\65\u0306"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\5\66\u030d\n\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\7\67\u0315\n\67\f\67\16\67\u0318\13\67\38\38\38\38\38\58\u031f"+
		"\n8\58\u0321\n8\39\39\39\39\39\39\79\u0329\n9\f9\169\u032c\139\3:\3:\5"+
		":\u0330\n:\3;\3;\5;\u0334\n;\3;\3;\7;\u0338\n;\f;\16;\u033b\13;\5;\u033d"+
		"\n;\3<\3<\3<\3<\3<\7<\u0344\n<\f<\16<\u0347\13<\3<\3<\5<\u034b\n<\3<\5"+
		"<\u034e\n<\3<\3<\3<\3<\5<\u0354\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\5<\u0364\n<\3<\3<\7<\u0368\n<\f<\16<\u036b\13<\5<\u036d\n<\3<"+
		"\3<\3<\5<\u0372\n<\3<\5<\u0375\n<\3<\3<\3<\3<\3<\5<\u037c\n<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u038f\n<\3<\3<\7<\u0393"+
		"\n<\f<\16<\u0396\13<\7<\u0398\n<\f<\16<\u039b\13<\3=\3=\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\5>\u03a9\n>\3?\3?\5?\u03ad\n?\3?\3?\3?\3?\3?\5?\u03b4"+
		"\n?\3?\7?\u03b7\n?\f?\16?\u03ba\13?\3@\3@\3@\3A\3A\3A\3A\3A\7A\u03c4\n"+
		"A\fA\16A\u03c7\13A\3B\3B\3B\3B\3B\3B\5B\u03cf\nB\3C\3C\3C\3C\3C\6C\u03d6"+
		"\nC\rC\16C\u03d7\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u03e8\n"+
		"D\fD\16D\u03eb\13D\5D\u03ed\nD\3D\3D\3D\3D\7D\u03f3\nD\fD\16D\u03f6\13"+
		"D\5D\u03f8\nD\7D\u03fa\nD\fD\16D\u03fd\13D\3D\3D\5D\u0401\nD\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\5E\u040e\nE\3F\3F\5F\u0412\nF\3F\3F\3G\3G\3G"+
		"\3G\3G\7G\u041b\nG\fG\16G\u041e\13G\3H\3H\5H\u0422\nH\3I\5I\u0425\nI\3"+
		"I\3I\3J\3J\3J\3J\3J\3J\3J\5J\u0430\nJ\3J\3J\3J\3J\3J\3J\5J\u0438\nJ\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u044e\n"+
		"K\3L\3L\3L\5L\u0453\nL\3L\3L\5L\u0457\nL\3L\5L\u045a\nL\3L\3L\5L\u045e"+
		"\nL\3L\3L\5L\u0462\nL\5L\u0464\nL\3M\3M\3M\3M\5M\u046a\nM\3N\3N\3N\3N"+
		"\3N\3N\7N\u0472\nN\fN\16N\u0475\13N\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0480"+
		"\nO\3O\3O\3O\3O\3O\5O\u0487\nO\3P\5P\u048a\nP\3P\3P\3Q\3Q\3Q\3Q\3Q\7Q"+
		"\u0493\nQ\fQ\16Q\u0496\13Q\3R\3R\3R\3R\5R\u049c\nR\3S\5S\u049f\nS\3S\3"+
		"S\5S\u04a3\nS\3S\3S\3T\3T\3T\3T\3T\7T\u04ac\nT\fT\16T\u04af\13T\3T\2\35"+
		"\4\6\16\20\22\24\26\30\32\34\36 \62>DJZhlpv|\u0080\u008c\u009a\u00a0\u00a6"+
		"U\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\2\r\5\2HHJJTU\b\2\20\20\33\33##)),,;;\t\2\5\5\23\23\30\30\34\34"+
		"!\"&&//\3\2\6\b\4\2**--\6\2\24\24$$\60\60\64\64\5\2\t\n  99\4\2<=YY\3"+
		"\2<=\4\2\f\f\16\16\4\2\17\17\60\60\2\u051b\2\u00b3\3\2\2\2\4\u00d7\3\2"+
		"\2\2\6\u00f3\3\2\2\2\b\u0106\3\2\2\2\n\u0108\3\2\2\2\f\u0117\3\2\2\2\16"+
		"\u0119\3\2\2\2\20\u012a\3\2\2\2\22\u0138\3\2\2\2\24\u0146\3\2\2\2\26\u015a"+
		"\3\2\2\2\30\u0168\3\2\2\2\32\u0173\3\2\2\2\34\u017e\3\2\2\2\36\u0189\3"+
		"\2\2\2 \u0194\3\2\2\2\"\u019f\3\2\2\2$\u01af\3\2\2\2&\u01b1\3\2\2\2(\u01b3"+
		"\3\2\2\2*\u01bd\3\2\2\2,\u01c0\3\2\2\2.\u01c5\3\2\2\2\60\u01ce\3\2\2\2"+
		"\62\u01d0\3\2\2\2\64\u01e0\3\2\2\2\66\u01e2\3\2\2\28\u01ed\3\2\2\2:\u01fa"+
		"\3\2\2\2<\u01fc\3\2\2\2>\u01fe\3\2\2\2@\u020f\3\2\2\2B\u0219\3\2\2\2D"+
		"\u021b\3\2\2\2F\u022c\3\2\2\2H\u0241\3\2\2\2J\u0243\3\2\2\2L\u0253\3\2"+
		"\2\2N\u0255\3\2\2\2P\u0257\3\2\2\2R\u025c\3\2\2\2T\u0264\3\2\2\2V\u0270"+
		"\3\2\2\2X\u0273\3\2\2\2Z\u0285\3\2\2\2\\\u02c0\3\2\2\2^\u02c2\3\2\2\2"+
		"`\u02d2\3\2\2\2b\u02dd\3\2\2\2d\u02e6\3\2\2\2f\u02fb\3\2\2\2h\u02fd\3"+
		"\2\2\2j\u030c\3\2\2\2l\u030e\3\2\2\2n\u0320\3\2\2\2p\u0322\3\2\2\2r\u032d"+
		"\3\2\2\2t\u033c\3\2\2\2v\u036c\3\2\2\2x\u039c\3\2\2\2z\u03a8\3\2\2\2|"+
		"\u03aa\3\2\2\2~\u03bb\3\2\2\2\u0080\u03be\3\2\2\2\u0082\u03ce\3\2\2\2"+
		"\u0084\u03d0\3\2\2\2\u0086\u0400\3\2\2\2\u0088\u040d\3\2\2\2\u008a\u040f"+
		"\3\2\2\2\u008c\u0415\3\2\2\2\u008e\u0421\3\2\2\2\u0090\u0424\3\2\2\2\u0092"+
		"\u0437\3\2\2\2\u0094\u044d\3\2\2\2\u0096\u0463\3\2\2\2\u0098\u0469\3\2"+
		"\2\2\u009a\u046b\3\2\2\2\u009c\u0486\3\2\2\2\u009e\u0489\3\2\2\2\u00a0"+
		"\u048d\3\2\2\2\u00a2\u049b\3\2\2\2\u00a4\u049e\3\2\2\2\u00a6\u04a6\3\2"+
		"\2\2\u00a8\u00b4\7h\2\2\u00a9\u00b4\7i\2\2\u00aa\u00ac\7k\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b4\3\2\2\2\u00af\u00b0\7<\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\7=\2"+
		"\2\u00b2\u00b4\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ab"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\3\3\2\2\2\u00b5\u00b6\b\3\1\2\u00b6"+
		"\u00d8\5\2\2\2\u00b7\u00b8\7<\2\2\u00b8\u00b9\5r:\2\u00b9\u00ba\7=\2\2"+
		"\u00ba\u00bb\7@\2\2\u00bb\u00bc\5|?\2\u00bc\u00bd\7A\2\2\u00bd\u00d8\3"+
		"\2\2\2\u00be\u00bf\7<\2\2\u00bf\u00c0\5r:\2\u00c0\u00c1\7=\2\2\u00c1\u00c2"+
		"\7@\2\2\u00c2\u00c3\5|?\2\u00c3\u00c4\7Y\2\2\u00c4\u00c5\7A\2\2\u00c5"+
		"\u00d8\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8\7<\2\2\u00c8\u00c9\5r:"+
		"\2\u00c9\u00ca\7=\2\2\u00ca\u00cb\7@\2\2\u00cb\u00cc\5|?\2\u00cc\u00cd"+
		"\7A\2\2\u00cd\u00d8\3\2\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d0\7<\2\2\u00d0"+
		"\u00d1\5r:\2\u00d1\u00d2\7=\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\5|?\2\u00d4"+
		"\u00d5\7Y\2\2\u00d5\u00d6\7A\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00b5\3\2\2"+
		"\2\u00d7\u00b7\3\2\2\2\u00d7\u00be\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d7\u00ce"+
		"\3\2\2\2\u00d8\u00f0\3\2\2\2\u00d9\u00da\f\f\2\2\u00da\u00db\7>\2\2\u00db"+
		"\u00dc\5&\24\2\u00dc\u00dd\7?\2\2\u00dd\u00ef\3\2\2\2\u00de\u00df\f\13"+
		"\2\2\u00df\u00e1\7<\2\2\u00e0\u00e2\5\6\4\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00ef\7=\2\2\u00e4\u00e5\f\n"+
		"\2\2\u00e5\u00e6\7f\2\2\u00e6\u00ef\7h\2\2\u00e7\u00e8\f\t\2\2\u00e8\u00e9"+
		"\7e\2\2\u00e9\u00ef\7h\2\2\u00ea\u00eb\f\b\2\2\u00eb\u00ef\7I\2\2\u00ec"+
		"\u00ed\f\7\2\2\u00ed\u00ef\7K\2\2\u00ee\u00d9\3\2\2\2\u00ee\u00de\3\2"+
		"\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\5\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\4\1\2\u00f4\u00f5"+
		"\5$\23\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7\f\3\2\2\u00f7\u00f8\7Y\2\2\u00f8"+
		"\u00fa\5$\23\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\7\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0107"+
		"\5\4\3\2\u00ff\u0100\7I\2\2\u0100\u0107\5\b\5\2\u0101\u0102\7K\2\2\u0102"+
		"\u0107\5\b\5\2\u0103\u0104\5\n\6\2\u0104\u0105\5\f\7\2\u0105\u0107\3\2"+
		"\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0103\3\2\2\2\u0107\t\3\2\2\2\u0108\u0109\t\2\2\2\u0109\13\3\2\2\2\u010a"+
		"\u0118\5\b\5\2\u010b\u010c\7<\2\2\u010c\u010d\5r:\2\u010d\u010e\7=\2\2"+
		"\u010e\u010f\5\f\7\2\u010f\u0118\3\2\2\2\u0110\u0111\7\3\2\2\u0111\u0112"+
		"\7<\2\2\u0112\u0113\5r:\2\u0113\u0114\7=\2\2\u0114\u0115\5\f\7\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0118\7j\2\2\u0117\u010a\3\2\2\2\u0117\u010b\3\2"+
		"\2\2\u0117\u0110\3\2\2\2\u0117\u0116\3\2\2\2\u0118\r\3\2\2\2\u0119\u011a"+
		"\b\b\1\2\u011a\u011b\5\f\7\2\u011b\u0127\3\2\2\2\u011c\u011d\f\5\2\2\u011d"+
		"\u011e\7L\2\2\u011e\u0126\5\f\7\2\u011f\u0120\f\4\2\2\u0120\u0121\7M\2"+
		"\2\u0121\u0126\5\f\7\2\u0122\u0123\f\3\2\2\u0123\u0124\7N\2\2\u0124\u0126"+
		"\5\f\7\2\u0125\u011c\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0122\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\17\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u012a\u012b\b\t\1\2\u012b\u012c\5\16\b\2\u012c"+
		"\u0135\3\2\2\2\u012d\u012e\f\4\2\2\u012e\u012f\7H\2\2\u012f\u0134\5\16"+
		"\b\2\u0130\u0131\f\3\2\2\u0131\u0132\7J\2\2\u0132\u0134\5\16\b\2\u0133"+
		"\u012d\3\2\2\2\u0133\u0130\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\21\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139"+
		"\b\n\1\2\u0139\u013a\5\20\t\2\u013a\u0143\3\2\2\2\u013b\u013c\f\4\2\2"+
		"\u013c\u013d\7F\2\2\u013d\u0142\5\20\t\2\u013e\u013f\f\3\2\2\u013f\u0140"+
		"\7G\2\2\u0140\u0142\5\20\t\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\23\3\2\2"+
		"\2\u0145\u0143\3\2\2\2\u0146\u0147\b\13\1\2\u0147\u0148\5\22\n\2\u0148"+
		"\u0157\3\2\2\2\u0149\u014a\f\6\2\2\u014a\u014b\7B\2\2\u014b\u0156\5\22"+
		"\n\2\u014c\u014d\f\5\2\2\u014d\u014e\7D\2\2\u014e\u0156\5\22\n\2\u014f"+
		"\u0150\f\4\2\2\u0150\u0151\7C\2\2\u0151\u0156\5\22\n\2\u0152\u0153\f\3"+
		"\2\2\u0153\u0154\7E\2\2\u0154\u0156\5\22\n\2\u0155\u0149\3\2\2\2\u0155"+
		"\u014c\3\2\2\2\u0155\u014f\3\2\2\2\u0155\u0152\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\25\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015b\b\f\1\2\u015b\u015c\5\24\13\2\u015c\u0165\3\2\2\2"+
		"\u015d\u015e\f\4\2\2\u015e\u015f\7c\2\2\u015f\u0164\5\24\13\2\u0160\u0161"+
		"\f\3\2\2\u0161\u0162\7d\2\2\u0162\u0164\5\24\13\2\u0163\u015d\3\2\2\2"+
		"\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\27\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\b\r\1\2\u0169"+
		"\u016a\5\26\f\2\u016a\u0170\3\2\2\2\u016b\u016c\f\3\2\2\u016c\u016d\7"+
		"O\2\2\u016d\u016f\5\26\f\2\u016e\u016b\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\31\3\2\2\2\u0172\u0170\3\2\2"+
		"\2\u0173\u0174\b\16\1\2\u0174\u0175\5\30\r\2\u0175\u017b\3\2\2\2\u0176"+
		"\u0177\f\3\2\2\u0177\u0178\7S\2\2\u0178\u017a\5\30\r\2\u0179\u0176\3\2"+
		"\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\33\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\b\17\1\2\u017f\u0180\5\32"+
		"\16\2\u0180\u0186\3\2\2\2\u0181\u0182\f\3\2\2\u0182\u0183\7P\2\2\u0183"+
		"\u0185\5\32\16\2\u0184\u0181\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3"+
		"\2\2\2\u0186\u0187\3\2\2\2\u0187\35\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018a\b\20\1\2\u018a\u018b\5\34\17\2\u018b\u0191\3\2\2\2\u018c\u018d"+
		"\f\3\2\2\u018d\u018e\7Q\2\2\u018e\u0190\5\34\17\2\u018f\u018c\3\2\2\2"+
		"\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\37"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\b\21\1\2\u0195\u0196\5\36\20"+
		"\2\u0196\u019c\3\2\2\2\u0197\u0198\f\3\2\2\u0198\u0199\7R\2\2\u0199\u019b"+
		"\5\36\20\2\u019a\u0197\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2"+
		"\u019c\u019d\3\2\2\2\u019d!\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a5\5"+
		" \21\2\u01a0\u01a1\7V\2\2\u01a1\u01a2\5&\24\2\u01a2\u01a3\7W\2\2\u01a3"+
		"\u01a4\5\"\22\2\u01a4\u01a6\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a6\3"+
		"\2\2\2\u01a6#\3\2\2\2\u01a7\u01b0\5\"\22\2\u01a8\u01a9\7\4\2\2\u01a9\u01b0"+
		"\5\"\22\2\u01aa\u01ab\5\b\5\2\u01ab\u01ac\7Z\2\2\u01ac\u01ad\5$\23\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01b0\7j\2\2\u01af\u01a7\3\2\2\2\u01af\u01a8\3\2"+
		"\2\2\u01af\u01aa\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0%\3\2\2\2\u01b1\u01b2"+
		"\5$\23\2\u01b2\'\3\2\2\2\u01b3\u01b4\5\"\22\2\u01b4)\3\2\2\2\u01b5\u01b6"+
		"\5,\27\2\u01b6\u01b7\5\62\32\2\u01b7\u01b8\7X\2\2\u01b8\u01be\3\2\2\2"+
		"\u01b9\u01ba\5,\27\2\u01ba\u01bb\7X\2\2\u01bb\u01be\3\2\2\2\u01bc\u01be"+
		"\5\u0084C\2\u01bd\u01b5\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01bc\3\2\2"+
		"\2\u01be+\3\2\2\2\u01bf\u01c1\5\60\31\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3-\3\2\2\2\u01c4"+
		"\u01c6\5\60\31\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3"+
		"\2\2\2\u01c7\u01c8\3\2\2\2\u01c8/\3\2\2\2\u01c9\u01cf\5\66\34\2\u01ca"+
		"\u01cf\58\35\2\u01cb\u01cf\5R*\2\u01cc\u01cf\5T+\2\u01cd\u01cf\5V,\2\u01ce"+
		"\u01c9\3\2\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01ce\u01cd\3\2\2\2\u01cf\61\3\2\2\2\u01d0\u01d1\b\32\1\2\u01d1\u01d2"+
		"\5\64\33\2\u01d2\u01d8\3\2\2\2\u01d3\u01d4\f\3\2\2\u01d4\u01d5\7Y\2\2"+
		"\u01d5\u01d7\5\64\33\2\u01d6\u01d3\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\63\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01e1\5X-\2\u01dc\u01dd\5X-\2\u01dd\u01de\7Z\2\2\u01de\u01df\5z>\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01db\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e1\65\3\2\2"+
		"\2\u01e2\u01e3\t\3\2\2\u01e3\67\3\2\2\2\u01e4\u01ee\t\4\2\2\u01e5\u01e6"+
		"\7\3\2\2\u01e6\u01e7\7<\2\2\u01e7\u01e8\t\5\2\2\u01e8\u01ee\7=\2\2\u01e9"+
		"\u01ee\5P)\2\u01ea\u01ee\5:\36\2\u01eb\u01ee\5H%\2\u01ec\u01ee\5x=\2\u01ed"+
		"\u01e4\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ea\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee9\3\2\2\2\u01ef\u01f1"+
		"\5<\37\2\u01f0\u01f2\7h\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f4\7@\2\2\u01f4\u01f5\5> \2\u01f5\u01f6\7A\2\2"+
		"\u01f6\u01fb\3\2\2\2\u01f7\u01f8\5<\37\2\u01f8\u01f9\7h\2\2\u01f9\u01fb"+
		"\3\2\2\2\u01fa\u01ef\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fb;\3\2\2\2\u01fc"+
		"\u01fd\t\6\2\2\u01fd=\3\2\2\2\u01fe\u01ff\b \1\2\u01ff\u0200\5@!\2\u0200"+
		"\u0205\3\2\2\2\u0201\u0202\f\3\2\2\u0202\u0204\5@!\2\u0203\u0201\3\2\2"+
		"\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206?"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5B\"\2\u0209\u020b\5D#\2\u020a"+
		"\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7X"+
		"\2\2\u020d\u0210\3\2\2\2\u020e\u0210\5\u0084C\2\u020f\u0208\3\2\2\2\u020f"+
		"\u020e\3\2\2\2\u0210A\3\2\2\2\u0211\u0213\58\35\2\u0212\u0214\5B\"\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u021a\3\2\2\2\u0215\u0217\5R"+
		"*\2\u0216\u0218\5B\"\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a"+
		"\3\2\2\2\u0219\u0211\3\2\2\2\u0219\u0215\3\2\2\2\u021aC\3\2\2\2\u021b"+
		"\u021c\b#\1\2\u021c\u021d\5F$\2\u021d\u0223\3\2\2\2\u021e\u021f\f\3\2"+
		"\2\u021f\u0220\7Y\2\2\u0220\u0222\5F$\2\u0221\u021e\3\2\2\2\u0222\u0225"+
		"\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224E\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u022d\5X-\2\u0227\u0229\5X-\2\u0228\u0227\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7W\2\2\u022b\u022d"+
		"\5(\25\2\u022c\u0226\3\2\2\2\u022c\u0228\3\2\2\2\u022dG\3\2\2\2\u022e"+
		"\u0230\7\32\2\2\u022f\u0231\7h\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7@\2\2\u0233\u0234\5J&\2\u0234\u0235"+
		"\7A\2\2\u0235\u0242\3\2\2\2\u0236\u0238\7\32\2\2\u0237\u0239\7h\2\2\u0238"+
		"\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7@"+
		"\2\2\u023b\u023c\5J&\2\u023c\u023d\7Y\2\2\u023d\u023e\7A\2\2\u023e\u0242"+
		"\3\2\2\2\u023f\u0240\7\32\2\2\u0240\u0242\7h\2\2\u0241\u022e\3\2\2\2\u0241"+
		"\u0236\3\2\2\2\u0241\u023f\3\2\2\2\u0242I\3\2\2\2\u0243\u0244\b&\1\2\u0244"+
		"\u0245\5L\'\2\u0245\u024b\3\2\2\2\u0246\u0247\f\3\2\2\u0247\u0248\7Y\2"+
		"\2\u0248\u024a\5L\'\2\u0249\u0246\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024cK\3\2\2\2\u024d\u024b\3\2\2\2\u024e"+
		"\u0254\5N(\2\u024f\u0250\5N(\2\u0250\u0251\7Z\2\2\u0251\u0252\5(\25\2"+
		"\u0252\u0254\3\2\2\2\u0253\u024e\3\2\2\2\u0253\u024f\3\2\2\2\u0254M\3"+
		"\2\2\2\u0255\u0256\7h\2\2\u0256O\3\2\2\2\u0257\u0258\7\64\2\2\u0258\u0259"+
		"\7<\2\2\u0259\u025a\5r:\2\u025a\u025b\7=\2\2\u025bQ\3\2\2\2\u025c\u025d"+
		"\t\7\2\2\u025dS\3\2\2\2\u025e\u0265\t\b\2\2\u025f\u0265\5^\60\2\u0260"+
		"\u0261\7\13\2\2\u0261\u0262\7<\2\2\u0262\u0263\7h\2\2\u0263\u0265\7=\2"+
		"\2\u0264\u025e\3\2\2\2\u0264\u025f\3\2\2\2\u0264\u0260\3\2\2\2\u0265U"+
		"\3\2\2\2\u0266\u0267\7\62\2\2\u0267\u0268\7<\2\2\u0268\u0269\5r:\2\u0269"+
		"\u026a\7=\2\2\u026a\u0271\3\2\2\2\u026b\u026c\7\62\2\2\u026c\u026d\7<"+
		"\2\2\u026d\u026e\5(\25\2\u026e\u026f\7=\2\2\u026f\u0271\3\2\2\2\u0270"+
		"\u0266\3\2\2\2\u0270\u026b\3\2\2\2\u0271W\3\2\2\2\u0272\u0274\5f\64\2"+
		"\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0279"+
		"\5Z.\2\u0276\u0278\5\\/\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027aY\3\2\2\2\u027b\u0279\3\2\2\2"+
		"\u027c\u027d\b.\1\2\u027d\u0286\7h\2\2\u027e\u027f\7<\2\2\u027f\u0280"+
		"\5X-\2\u0280\u0281\7=\2\2\u0281\u0286\3\2\2\2\u0282\u0283\7h\2\2\u0283"+
		"\u0284\7W\2\2\u0284\u0286\7j\2\2\u0285\u027c\3\2\2\2\u0285\u027e\3\2\2"+
		"\2\u0285\u0282\3\2\2\2\u0286\u02b4\3\2\2\2\u0287\u0288\f\t\2\2\u0288\u028a"+
		"\7>\2\2\u0289\u028b\5h\65\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028d\3\2\2\2\u028c\u028e\5$\23\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f\u02b3\7?\2\2\u0290\u0291\f\b\2\2\u0291"+
		"\u0292\7>\2\2\u0292\u0294\7)\2\2\u0293\u0295\5h\65\2\u0294\u0293\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\5$\23\2\u0297\u0298"+
		"\7?\2\2\u0298\u02b3\3\2\2\2\u0299\u029a\f\7\2\2\u029a\u029b\7>\2\2\u029b"+
		"\u029c\5h\65\2\u029c\u029d\7)\2\2\u029d\u029e\5$\23\2\u029e\u029f\7?\2"+
		"\2\u029f\u02b3\3\2\2\2\u02a0\u02a1\f\6\2\2\u02a1\u02a3\7>\2\2\u02a2\u02a4"+
		"\5h\65\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\7L\2\2\u02a6\u02b3\7?\2\2\u02a7\u02a8\f\5\2\2\u02a8\u02a9\7<\2"+
		"\2\u02a9\u02aa\5j\66\2\u02aa\u02ab\7=\2\2\u02ab\u02b3\3\2\2\2\u02ac\u02ad"+
		"\f\4\2\2\u02ad\u02af\7<\2\2\u02ae\u02b0\5p9\2\u02af\u02ae\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\7=\2\2\u02b2\u0287\3\2"+
		"\2\2\u02b2\u0290\3\2\2\2\u02b2\u0299\3\2\2\2\u02b2\u02a0\3\2\2\2\u02b2"+
		"\u02a7\3\2\2\2\u02b2\u02ac\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b4\u02b5\3\2\2\2\u02b5[\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8"+
		"\7\f\2\2\u02b8\u02ba\7<\2\2\u02b9\u02bb\7k\2\2\u02ba\u02b9\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02be\u02c1\7=\2\2\u02bf\u02c1\5^\60\2\u02c0\u02b7\3\2\2\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1]\3\2\2\2\u02c2\u02c3\7\r\2\2\u02c3\u02c4\7<\2\2\u02c4"+
		"\u02c5\7<\2\2\u02c5\u02c6\5`\61\2\u02c6\u02c7\7=\2\2\u02c7\u02c8\7=\2"+
		"\2\u02c8_\3\2\2\2\u02c9\u02ce\5b\62\2\u02ca\u02cb\7Y\2\2\u02cb\u02cd\5"+
		"b\62\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d3\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\3\2"+
		"\2\2\u02d2\u02c9\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3a\3\2\2\2\u02d4\u02da"+
		"\n\t\2\2\u02d5\u02d7\7<\2\2\u02d6\u02d8\5\6\4\2\u02d7\u02d6\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\7=\2\2\u02da\u02d5\3\2"+
		"\2\2\u02da\u02db\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd"+
		"\u02d4\3\2\2\2\u02dd\u02dc\3\2\2\2\u02dec\3\2\2\2\u02df\u02e5\n\n\2\2"+
		"\u02e0\u02e1\7<\2\2\u02e1\u02e2\5d\63\2\u02e2\u02e3\7=\2\2\u02e3\u02e5"+
		"\3\2\2\2\u02e4\u02df\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7e\3\2\2\2\u02e8\u02e6\3\2\2\2"+
		"\u02e9\u02eb\7L\2\2\u02ea\u02ec\5h\65\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec"+
		"\3\2\2\2\u02ec\u02fc\3\2\2\2\u02ed\u02ef\7L\2\2\u02ee\u02f0\5h\65\2\u02ef"+
		"\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02fc\5f"+
		"\64\2\u02f2\u02f4\7S\2\2\u02f3\u02f5\5h\65\2\u02f4\u02f3\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02fc\3\2\2\2\u02f6\u02f8\7S\2\2\u02f7\u02f9\5h\65"+
		"\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc"+
		"\5f\64\2\u02fb\u02e9\3\2\2\2\u02fb\u02ed\3\2\2\2\u02fb\u02f2\3\2\2\2\u02fb"+
		"\u02f6\3\2\2\2\u02fcg\3\2\2\2\u02fd\u02fe\b\65\1\2\u02fe\u02ff\5R*\2\u02ff"+
		"\u0304\3\2\2\2\u0300\u0301\f\3\2\2\u0301\u0303\5R*\2\u0302\u0300\3\2\2"+
		"\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305i"+
		"\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u030d\5l\67\2\u0308\u0309\5l\67\2\u0309"+
		"\u030a\7Y\2\2\u030a\u030b\7g\2\2\u030b\u030d\3\2\2\2\u030c\u0307\3\2\2"+
		"\2\u030c\u0308\3\2\2\2\u030dk\3\2\2\2\u030e\u030f\b\67\1\2\u030f\u0310"+
		"\5n8\2\u0310\u0316\3\2\2\2\u0311\u0312\f\3\2\2\u0312\u0313\7Y\2\2\u0313"+
		"\u0315\5n8\2\u0314\u0311\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2"+
		"\2\u0316\u0317\3\2\2\2\u0317m\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031a"+
		"\5,\27\2\u031a\u031b\5X-\2\u031b\u0321\3\2\2\2\u031c\u031e\5.\30\2\u031d"+
		"\u031f\5t;\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3\2\2"+
		"\2\u0320\u0319\3\2\2\2\u0320\u031c\3\2\2\2\u0321o\3\2\2\2\u0322\u0323"+
		"\b9\1\2\u0323\u0324\7h\2\2\u0324\u032a\3\2\2\2\u0325\u0326\f\3\2\2\u0326"+
		"\u0327\7Y\2\2\u0327\u0329\7h\2\2\u0328\u0325\3\2\2\2\u0329\u032c\3\2\2"+
		"\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032bq\3\2\2\2\u032c\u032a"+
		"\3\2\2\2\u032d\u032f\5B\"\2\u032e\u0330\5t;\2\u032f\u032e\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330s\3\2\2\2\u0331\u033d\5f\64\2\u0332\u0334\5f\64\2"+
		"\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0339"+
		"\5v<\2\u0336\u0338\5\\/\2\u0337\u0336\3\2\2\2\u0338\u033b\3\2\2\2\u0339"+
		"\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2"+
		"\2\2\u033c\u0331\3\2\2\2\u033c\u0333\3\2\2\2\u033du\3\2\2\2\u033e\u033f"+
		"\b<\1\2\u033f\u0340\7<\2\2\u0340\u0341\5t;\2\u0341\u0345\7=\2\2\u0342"+
		"\u0344\5\\/\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2"+
		"\2\2\u0345\u0346\3\2\2\2\u0346\u036d\3\2\2\2\u0347\u0345\3\2\2\2\u0348"+
		"\u034a\7>\2\2\u0349\u034b\5h\65\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u034d\3\2\2\2\u034c\u034e\5$\23\2\u034d\u034c\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u036d\7?\2\2\u0350\u0351\7>\2"+
		"\2\u0351\u0353\7)\2\2\u0352\u0354\5h\65\2\u0353\u0352\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\5$\23\2\u0356\u0357\7?\2\2\u0357"+
		"\u036d\3\2\2\2\u0358\u0359\7>\2\2\u0359\u035a\5h\65\2\u035a\u035b\7)\2"+
		"\2\u035b\u035c\5$\23\2\u035c\u035d\7?\2\2\u035d\u036d\3\2\2\2\u035e\u035f"+
		"\7>\2\2\u035f\u0360\7L\2\2\u0360\u036d\7?\2\2\u0361\u0363\7<\2\2\u0362"+
		"\u0364\5j\66\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u0369\7=\2\2\u0366\u0368\5\\/\2\u0367\u0366\3\2\2\2\u0368\u036b"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036d\3\2\2\2\u036b"+
		"\u0369\3\2\2\2\u036c\u033e\3\2\2\2\u036c\u0348\3\2\2\2\u036c\u0350\3\2"+
		"\2\2\u036c\u0358\3\2\2\2\u036c\u035e\3\2\2\2\u036c\u0361\3\2\2\2\u036d"+
		"\u0399\3\2\2\2\u036e\u036f\f\7\2\2\u036f\u0371\7>\2\2\u0370\u0372\5h\65"+
		"\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373\u0375"+
		"\5$\23\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0398\7?\2\2\u0377\u0378\f\6\2\2\u0378\u0379\7>\2\2\u0379\u037b\7)\2"+
		"\2\u037a\u037c\5h\65\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u037e\5$\23\2\u037e\u037f\7?\2\2\u037f\u0398\3\2\2\2\u0380"+
		"\u0381\f\5\2\2\u0381\u0382\7>\2\2\u0382\u0383\5h\65\2\u0383\u0384\7)\2"+
		"\2\u0384\u0385\5$\23\2\u0385\u0386\7?\2\2\u0386\u0398\3\2\2\2\u0387\u0388"+
		"\f\4\2\2\u0388\u0389\7>\2\2\u0389\u038a\7L\2\2\u038a\u0398\7?\2\2\u038b"+
		"\u038c\f\3\2\2\u038c\u038e\7<\2\2\u038d\u038f\5j\66\2\u038e\u038d\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0394\7=\2\2\u0391"+
		"\u0393\5\\/\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0397"+
		"\u036e\3\2\2\2\u0397\u0377\3\2\2\2\u0397\u0380\3\2\2\2\u0397\u0387\3\2"+
		"\2\2\u0397\u038b\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039aw\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039d\7h\2\2\u039d"+
		"y\3\2\2\2\u039e\u03a9\5$\23\2\u039f\u03a0\7@\2\2\u03a0\u03a1\5|?\2\u03a1"+
		"\u03a2\7A\2\2\u03a2\u03a9\3\2\2\2\u03a3\u03a4\7@\2\2\u03a4\u03a5\5|?\2"+
		"\u03a5\u03a6\7Y\2\2\u03a6\u03a7\7A\2\2\u03a7\u03a9\3\2\2\2\u03a8\u039e"+
		"\3\2\2\2\u03a8\u039f\3\2\2\2\u03a8\u03a3\3\2\2\2\u03a9{\3\2\2\2\u03aa"+
		"\u03ac\b?\1\2\u03ab\u03ad\5~@\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2"+
		"\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\5z>\2\u03af\u03b8\3\2\2\2\u03b0\u03b1"+
		"\f\3\2\2\u03b1\u03b3\7Y\2\2\u03b2\u03b4\5~@\2\u03b3\u03b2\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\5z>\2\u03b6\u03b0\3\2\2"+
		"\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9}"+
		"\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03bc\5\u0080A\2\u03bc\u03bd\7Z\2\2"+
		"\u03bd\177\3\2\2\2\u03be\u03bf\bA\1\2\u03bf\u03c0\5\u0082B\2\u03c0\u03c5"+
		"\3\2\2\2\u03c1\u03c2\f\3\2\2\u03c2\u03c4\5\u0082B\2\u03c3\u03c1\3\2\2"+
		"\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u0081"+
		"\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\7>\2\2\u03c9\u03ca\5(\25\2\u03ca"+
		"\u03cb\7?\2\2\u03cb\u03cf\3\2\2\2\u03cc\u03cd\7f\2\2\u03cd\u03cf\7h\2"+
		"\2\u03ce\u03c8\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u0083\3\2\2\2\u03d0\u03d1"+
		"\7:\2\2\u03d1\u03d2\7<\2\2\u03d2\u03d3\5(\25\2\u03d3\u03d5\7Y\2\2\u03d4"+
		"\u03d6\7k\2\2\u03d5\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\7=\2\2\u03da"+
		"\u03db\7X\2\2\u03db\u0085\3\2\2\2\u03dc\u0401\5\u0088E\2\u03dd\u0401\5"+
		"\u008aF\2\u03de\u0401\5\u0090I\2\u03df\u0401\5\u0092J\2\u03e0\u0401\5"+
		"\u0094K\2\u03e1\u03e2\t\13\2\2\u03e2\u03e3\t\f\2\2\u03e3\u03ec\7<\2\2"+
		"\u03e4\u03e9\5 \21\2\u03e5\u03e6\7Y\2\2\u03e6\u03e8\5 \21\2\u03e7\u03e5"+
		"\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea"+
		"\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03e4\3\2\2\2\u03ec\u03ed\3\2"+
		"\2\2\u03ed\u03fb\3\2\2\2\u03ee\u03f7\7W\2\2\u03ef\u03f4\5 \21\2\u03f0"+
		"\u03f1\7Y\2\2\u03f1\u03f3\5 \21\2\u03f2\u03f0\3\2\2\2\u03f3\u03f6\3\2"+
		"\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f7\u03ef\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2"+
		"\2\2\u03f9\u03ee\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\7="+
		"\2\2\u03ff\u0401\7X\2\2\u0400\u03dc\3\2\2\2\u0400\u03dd\3\2\2\2\u0400"+
		"\u03de\3\2\2\2\u0400\u03df\3\2\2\2\u0400\u03e0\3\2\2\2\u0400\u03e1\3\2"+
		"\2\2\u0401\u0087\3\2\2\2\u0402\u0403\7h\2\2\u0403\u0404\7W\2\2\u0404\u040e"+
		"\5\u0086D\2\u0405\u0406\7\22\2\2\u0406\u0407\5(\25\2\u0407\u0408\7W\2"+
		"\2\u0408\u0409\5\u0086D\2\u0409\u040e\3\2\2\2\u040a\u040b\7\26\2\2\u040b"+
		"\u040c\7W\2\2\u040c\u040e\5\u0086D\2\u040d\u0402\3\2\2\2\u040d\u0405\3"+
		"\2\2\2\u040d\u040a\3\2\2\2\u040e\u0089\3\2\2\2\u040f\u0411\7@\2\2\u0410"+
		"\u0412\5\u008cG\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413"+
		"\3\2\2\2\u0413\u0414\7A\2\2\u0414\u008b\3\2\2\2\u0415\u0416\bG\1\2\u0416"+
		"\u0417\5\u008eH\2\u0417\u041c\3\2\2\2\u0418\u0419\f\3\2\2\u0419\u041b"+
		"\5\u008eH\2\u041a\u0418\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2"+
		"\2\u041c\u041d\3\2\2\2\u041d\u008d\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0422"+
		"\5*\26\2\u0420\u0422\5\u0086D\2\u0421\u041f\3\2\2\2\u0421\u0420\3\2\2"+
		"\2\u0422\u008f\3\2\2\2\u0423\u0425\5&\24\2\u0424\u0423\3\2\2\2\u0424\u0425"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\7X\2\2\u0427\u0091\3\2\2\2\u0428"+
		"\u0429\7\37\2\2\u0429\u042a\7<\2\2\u042a\u042b\5&\24\2\u042b\u042c\7="+
		"\2\2\u042c\u042f\5\u0086D\2\u042d\u042e\7\31\2\2\u042e\u0430\5\u0086D"+
		"\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0438\3\2\2\2\u0431\u0432"+
		"\7+\2\2\u0432\u0433\7<\2\2\u0433\u0434\5&\24\2\u0434\u0435\7=\2\2\u0435"+
		"\u0436\5\u0086D\2\u0436\u0438\3\2\2\2\u0437\u0428\3\2\2\2\u0437\u0431"+
		"\3\2\2\2\u0438\u0093\3\2\2\2\u0439\u043a\7\61\2\2\u043a\u043b\7<\2\2\u043b"+
		"\u043c\5&\24\2\u043c\u043d\7=\2\2\u043d\u043e\5\u0086D\2\u043e\u044e\3"+
		"\2\2\2\u043f\u0440\7\27\2\2\u0440\u0441\5\u0086D\2\u0441\u0442\7\61\2"+
		"\2\u0442\u0443\7<\2\2\u0443\u0444\5&\24\2\u0444\u0445\7=\2\2\u0445\u0446"+
		"\7X\2\2\u0446\u044e\3\2\2\2\u0447\u0448\7\35\2\2\u0448\u0449\7<\2\2\u0449"+
		"\u044a\5\u0096L\2\u044a\u044b\7=\2\2\u044b\u044c\5\u0086D\2\u044c\u044e"+
		"\3\2\2\2\u044d\u0439\3\2\2\2\u044d\u043f\3\2\2\2\u044d\u0447\3\2\2\2\u044e"+
		"\u0095\3\2\2\2\u044f\u0450\5\u0098M\2\u0450\u0452\7X\2\2\u0451\u0453\5"+
		"\u009aN\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2\2"+
		"\u0454\u0456\7X\2\2\u0455\u0457\5\u009aN\2\u0456\u0455\3\2\2\2\u0456\u0457"+
		"\3\2\2\2\u0457\u0464\3\2\2\2\u0458\u045a\5&\24\2\u0459\u0458\3\2\2\2\u0459"+
		"\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045d\7X\2\2\u045c\u045e\5\u009a"+
		"N\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"\u0461\7X\2\2\u0460\u0462\5\u009aN\2\u0461\u0460\3\2\2\2\u0461\u0462\3"+
		"\2\2\2\u0462\u0464\3\2\2\2\u0463\u044f\3\2\2\2\u0463\u0459\3\2\2\2\u0464"+
		"\u0097\3\2\2\2\u0465\u0466\5,\27\2\u0466\u0467\5\62\32\2\u0467\u046a\3"+
		"\2\2\2\u0468\u046a\5,\27\2\u0469\u0465\3\2\2\2\u0469\u0468\3\2\2\2\u046a"+
		"\u0099\3\2\2\2\u046b\u046c\bN\1\2\u046c\u046d\5$\23\2\u046d\u0473\3\2"+
		"\2\2\u046e\u046f\f\3\2\2\u046f\u0470\7Y\2\2\u0470\u0472\5$\23\2\u0471"+
		"\u046e\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u009b\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0477\7\36\2\2\u0477"+
		"\u0478\7h\2\2\u0478\u0487\7X\2\2\u0479\u047a\7\25\2\2\u047a\u0487\7X\2"+
		"\2\u047b\u047c\7\21\2\2\u047c\u0487\7X\2\2\u047d\u047f\7%\2\2\u047e\u0480"+
		"\5&\24\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0487\7X\2\2\u0482\u0483\7\36\2\2\u0483\u0484\5\b\5\2\u0484\u0485\7X"+
		"\2\2\u0485\u0487\3\2\2\2\u0486\u0476\3\2\2\2\u0486\u0479\3\2\2\2\u0486"+
		"\u047b\3\2\2\2\u0486\u047d\3\2\2\2\u0486\u0482\3\2\2\2\u0487\u009d\3\2"+
		"\2\2\u0488\u048a\5\u00a0Q\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a"+
		"\u048b\3\2\2\2\u048b\u048c\7\2\2\3\u048c\u009f\3\2\2\2\u048d\u048e\bQ"+
		"\1\2\u048e\u048f\5\u00a2R\2\u048f\u0494\3\2\2\2\u0490\u0491\f\3\2\2\u0491"+
		"\u0493\5\u00a2R\2\u0492\u0490\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u00a1\3\2\2\2\u0496\u0494\3\2\2\2\u0497"+
		"\u049c\5\u00a4S\2\u0498\u049c\5\u0086D\2\u0499\u049c\5*\26\2\u049a\u049c"+
		"\7X\2\2\u049b\u0497\3\2\2\2\u049b\u0498\3\2\2\2\u049b\u0499\3\2\2\2\u049b"+
		"\u049a\3\2\2\2\u049c\u00a3\3\2\2\2\u049d\u049f\5,\27\2\u049e\u049d\3\2"+
		"\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\5X-\2\u04a1\u04a3"+
		"\5\u00a6T\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2"+
		"\2\u04a4\u04a5\5\u008aF\2\u04a5\u00a5\3\2\2\2\u04a6\u04a7\bT\1\2\u04a7"+
		"\u04a8\5*\26\2\u04a8\u04ad\3\2\2\2\u04a9\u04aa\f\3\2\2\u04aa\u04ac\5*"+
		"\26\2\u04ab\u04a9\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u00a7\3\2\2\2\u04af\u04ad\3\2\2\2\u008a\u00ad\u00b3"+
		"\u00d7\u00e1\u00ee\u00f0\u00fb\u0106\u0117\u0125\u0127\u0133\u0135\u0141"+
		"\u0143\u0155\u0157\u0163\u0165\u0170\u017b\u0186\u0191\u019c\u01a5\u01af"+
		"\u01bd\u01c2\u01c7\u01ce\u01d8\u01e0\u01ed\u01f1\u01fa\u0205\u020a\u020f"+
		"\u0213\u0217\u0219\u0223\u0228\u022c\u0230\u0238\u0241\u024b\u0253\u0264"+
		"\u0270\u0273\u0279\u0285\u028a\u028d\u0294\u02a3\u02af\u02b2\u02b4\u02bc"+
		"\u02c0\u02ce\u02d2\u02d7\u02da\u02dd\u02e4\u02e6\u02eb\u02ef\u02f4\u02f8"+
		"\u02fb\u0304\u030c\u0316\u031e\u0320\u032a\u032f\u0333\u0339\u033c\u0345"+
		"\u034a\u034d\u0353\u0363\u0369\u036c\u0371\u0374\u037b\u038e\u0394\u0397"+
		"\u0399\u03a8\u03ac\u03b3\u03b8\u03c5\u03ce\u03d7\u03e9\u03ec\u03f4\u03f7"+
		"\u03fb\u0400\u040d\u0411\u041c\u0421\u0424\u042f\u0437\u044d\u0452\u0456"+
		"\u0459\u045d\u0461\u0463\u0469\u0473\u047f\u0486\u0489\u0494\u049b\u049e"+
		"\u04a2\u04ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}