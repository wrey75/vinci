// Generated from com\oxande\vinci\antlr4\Vinci.g4 by ANTLR 4.7
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
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpression = 4, RULE_argumentExpressionList = 5, 
		RULE_unaryExpression = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_multiplicativeExpression = 9, RULE_additiveExpression = 10, RULE_shiftExpression = 11, 
		RULE_relationalExpression = 12, RULE_equalityExpression = 13, RULE_andExpression = 14, 
		RULE_exclusiveOrExpression = 15, RULE_inclusiveOrExpression = 16, RULE_logicalAndExpression = 17, 
		RULE_logicalOrExpression = 18, RULE_conditionalExpression = 19, RULE_assignmentExpression = 20, 
		RULE_expression = 21, RULE_constantExpression = 22, RULE_declaration = 23, 
		RULE_declarationSpecifiers = 24, RULE_declarationSpecifiers2 = 25, RULE_declarationSpecifier = 26, 
		RULE_initDeclaratorList = 27, RULE_initDeclarator = 28, RULE_storageClassSpecifier = 29, 
		RULE_typeSpecifier = 30, RULE_structOrUnionSpecifier = 31, RULE_structOrUnion = 32, 
		RULE_structDeclarationList = 33, RULE_structDeclaration = 34, RULE_specifierQualifierList = 35, 
		RULE_structDeclaratorList = 36, RULE_structDeclarator = 37, RULE_enumSpecifier = 38, 
		RULE_enumeratorList = 39, RULE_enumerator = 40, RULE_enumerationConstant = 41, 
		RULE_atomicTypeSpecifier = 42, RULE_typeQualifier = 43, RULE_functionSpecifier = 44, 
		RULE_alignmentSpecifier = 45, RULE_declarator = 46, RULE_directDeclarator = 47, 
		RULE_gccDeclaratorExtension = 48, RULE_gccAttributeSpecifier = 49, RULE_gccAttributeList = 50, 
		RULE_gccAttribute = 51, RULE_nestedParenthesesBlock = 52, RULE_pointer = 53, 
		RULE_typeQualifierList = 54, RULE_parameterTypeList = 55, RULE_parameterList = 56, 
		RULE_parameterDeclaration = 57, RULE_identifierList = 58, RULE_typeName = 59, 
		RULE_abstractDeclarator = 60, RULE_directAbstractDeclarator = 61, RULE_typedefName = 62, 
		RULE_initializer = 63, RULE_initializerList = 64, RULE_designation = 65, 
		RULE_designatorList = 66, RULE_designator = 67, RULE_staticAssertDeclaration = 68, 
		RULE_statement = 69, RULE_labeledStatement = 70, RULE_compoundStatement = 71, 
		RULE_blockItemList = 72, RULE_blockItem = 73, RULE_expressionStatement = 74, 
		RULE_selectionStatement = 75, RULE_iterationStatement = 76, RULE_forCondition = 77, 
		RULE_forDeclaration = 78, RULE_forExpression = 79, RULE_jumpStatement = 80, 
		RULE_compilationUnit = 81, RULE_translationUnit = 82, RULE_externalDeclaration = 83, 
		RULE_functionDefinition = 84, RULE_declarationList = 85;
	public static final String[] ruleNames = {
		"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
		"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
		"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
		"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
		"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
		"conditionalExpression", "assignmentExpression", "expression", "constantExpression", 
		"declaration", "declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
		"initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier", 
		"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration", 
		"specifierQualifierList", "structDeclaratorList", "structDeclarator", 
		"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
		"atomicTypeSpecifier", "typeQualifier", "functionSpecifier", "alignmentSpecifier", 
		"declarator", "directDeclarator", "gccDeclaratorExtension", "gccAttributeSpecifier", 
		"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
		"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
		"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
		"typedefName", "initializer", "initializerList", "designation", "designatorList", 
		"designator", "staticAssertDeclaration", "statement", "labeledStatement", 
		"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
		"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
		"forExpression", "jumpStatement", "compilationUnit", "translationUnit", 
		"externalDeclaration", "functionDefinition", "declarationList"
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
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
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
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(175); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(174);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(LeftParen);
				setState(180);
				expression();
				setState(181);
				match(RightParen);
				}
				break;
			case Generic:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				genericSelection();
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitGenericSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitGenericSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Generic);
			setState(187);
			match(LeftParen);
			setState(188);
			assignmentExpression();
			setState(189);
			match(Comma);
			setState(190);
			genericAssocList(0);
			setState(191);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitGenericAssocList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitGenericAssocList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(196);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(197);
					match(Comma);
					setState(198);
					genericAssociation();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VinciListener ) ((VinciListener)listener).exitGenericAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VinciVisitor ) return ((VinciVisitor<? extends T>)visitor).visitGenericAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			setState(211);
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
				setState(204);
				typeName();
				setState(205);
				match(Colon);
				setState(206);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(Default);
				setState(209);
				match(Colon);
				setState(210);
				assignmentExpression();
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(214);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(215);
				match(LeftParen);
				setState(216);
				typeName();
				setState(217);
				match(RightParen);
				setState(218);
				match(LeftBrace);
				setState(219);
				initializerList(0);
				setState(220);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(222);
				match(LeftParen);
				setState(223);
				typeName();
				setState(224);
				match(RightParen);
				setState(225);
				match(LeftBrace);
				setState(226);
				initializerList(0);
				setState(227);
				match(Comma);
				setState(228);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(230);
				match(T__0);
				setState(231);
				match(LeftParen);
				setState(232);
				typeName();
				setState(233);
				match(RightParen);
				setState(234);
				match(LeftBrace);
				setState(235);
				initializerList(0);
				setState(236);
				match(RightBrace);
				}
				break;
			case 5:
				{
				setState(238);
				match(T__0);
				setState(239);
				match(LeftParen);
				setState(240);
				typeName();
				setState(241);
				match(RightParen);
				setState(242);
				match(LeftBrace);
				setState(243);
				initializerList(0);
				setState(244);
				match(Comma);
				setState(245);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(249);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(250);
						match(LeftBracket);
						setState(251);
						expression();
						setState(252);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(254);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(255);
						match(LeftParen);
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
							{
							setState(256);
							argumentExpressionList(0);
							}
						}

						setState(259);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(260);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(261);
						match(Dot);
						setState(262);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(264);
						match(Arrow);
						setState(265);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(267);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(279);
					match(Comma);
					setState(280);
					assignmentExpression();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(VinciParser.Identifier, 0); }
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
		enterRule(_localctx, 12, RULE_unaryExpression);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(PlusPlus);
				setState(288);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(MinusMinus);
				setState(290);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				unaryOperator();
				setState(292);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				match(Sizeof);
				setState(295);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(Sizeof);
				setState(297);
				match(LeftParen);
				setState(298);
				typeName();
				setState(299);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				match(AndAnd);
				setState(302);
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
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(LeftParen);
				setState(309);
				typeName();
				setState(310);
				match(RightParen);
				setState(311);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(T__0);
				setState(314);
				match(LeftParen);
				setState(315);
				typeName();
				setState(316);
				match(RightParen);
				setState(317);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(323);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(325);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(326);
						((MultiplicativeExpressionContext)_localctx).op = match(Star);
						setState(327);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(328);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(329);
						((MultiplicativeExpressionContext)_localctx).op = match(Div);
						setState(330);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(331);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(332);
						((MultiplicativeExpressionContext)_localctx).op = match(Mod);
						setState(333);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(338);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(342);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(343);
						((AdditiveExpressionContext)_localctx).op = match(Plus);
						setState(344);
						((AdditiveExpressionContext)_localctx).b = multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(345);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(346);
						((AdditiveExpressionContext)_localctx).op = match(Minus);
						setState(347);
						((AdditiveExpressionContext)_localctx).b = multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(352);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(354);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(362);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(356);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(357);
						match(LeftShift);
						setState(358);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(359);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(360);
						match(RightShift);
						setState(361);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(366);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(368);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(370);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(371);
						match(Less);
						setState(372);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(373);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(374);
						match(Greater);
						setState(375);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(377);
						match(LessEqual);
						setState(378);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(379);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(380);
						match(GreaterEqual);
						setState(381);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(386);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(390);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(391);
						((EqualityExpressionContext)_localctx).op = match(Equal);
						setState(392);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(393);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(394);
						((EqualityExpressionContext)_localctx).op = match(NotEqual);
						setState(395);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(400);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(402);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(404);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(405);
					match(And);
					setState(406);
					equalityExpression(0);
					}
					} 
				}
				setState(411);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(413);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(415);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(416);
					match(Caret);
					setState(417);
					andExpression(0);
					}
					} 
				}
				setState(422);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(424);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(426);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(427);
					match(Or);
					setState(428);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(433);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(435);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(437);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(438);
					match(AndAnd);
					setState(439);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(446);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(448);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(449);
					match(OrOr);
					setState(450);
					logicalAndExpression(0);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 38, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			logicalOrExpression(0);
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(457);
				match(Question);
				setState(458);
				expression();
				setState(459);
				match(Colon);
				setState(460);
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
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				((AssignmentExpressionContext)_localctx).op = match(T__1);
				setState(466);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				unaryExpression();
				setState(468);
				match(Assign);
				setState(469);
				assignmentExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
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
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		enterRule(_localctx, 44, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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
		enterRule(_localctx, 46, RULE_declaration);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				declarationSpecifiers();
				setState(479);
				initDeclaratorList(0);
				setState(480);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				declarationSpecifiers();
				setState(483);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
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
		enterRule(_localctx, 48, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(488);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(491); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 50, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(493);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(496); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 52, RULE_declarationSpecifier);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(506);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(508);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(509);
					match(Comma);
					setState(510);
					initDeclarator();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 56, RULE_initDeclarator);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				declarator();
				setState(518);
				match(Assign);
				setState(519);
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
		enterRule(_localctx, 58, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		enterRule(_localctx, 60, RULE_typeSpecifier);
		int _la;
		try {
			setState(534);
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
				setState(525);
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
				setState(526);
				match(T__0);
				setState(527);
				match(LeftParen);
				setState(528);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(529);
				match(RightParen);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
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
		enterRule(_localctx, 62, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				structOrUnion();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(537);
					match(Identifier);
					}
				}

				setState(540);
				match(LeftBrace);
				setState(541);
				structDeclarationList(0);
				setState(542);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				structOrUnion();
				setState(545);
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
		enterRule(_localctx, 64, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(552);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(554);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(555);
					structDeclaration();
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 68, RULE_structDeclaration);
		int _la;
		try {
			setState(568);
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
				setState(561);
				specifierQualifierList();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (Star - 58)) | (1L << (Caret - 58)) | (1L << (Colon - 58)) | (1L << (Identifier - 58)))) != 0)) {
					{
					setState(562);
					structDeclaratorList(0);
					}
				}

				setState(565);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
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
		enterRule(_localctx, 70, RULE_specifierQualifierList);
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				typeSpecifier();
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(571);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				typeQualifier();
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(575);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(581);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(583);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(584);
					match(Comma);
					setState(585);
					structDeclarator();
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 74, RULE_structDeclarator);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (Star - 58)) | (1L << (Caret - 58)) | (1L << (Identifier - 58)))) != 0)) {
					{
					setState(592);
					declarator();
					}
				}

				setState(595);
				match(Colon);
				setState(596);
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
		enterRule(_localctx, 76, RULE_enumSpecifier);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(Enum);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(600);
					match(Identifier);
					}
				}

				setState(603);
				match(LeftBrace);
				setState(604);
				enumeratorList(0);
				setState(605);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(Enum);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(608);
					match(Identifier);
					}
				}

				setState(611);
				match(LeftBrace);
				setState(612);
				enumeratorList(0);
				setState(613);
				match(Comma);
				setState(614);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				match(Enum);
				setState(617);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(621);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(623);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(624);
					match(Comma);
					setState(625);
					enumerator();
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 80, RULE_enumerator);
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				enumerationConstant();
				setState(633);
				match(Assign);
				setState(634);
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
		enterRule(_localctx, 82, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
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
		enterRule(_localctx, 84, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(Atomic);
			setState(641);
			match(LeftParen);
			setState(642);
			typeName();
			setState(643);
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
		enterRule(_localctx, 86, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
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
		enterRule(_localctx, 88, RULE_functionSpecifier);
		int _la;
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
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
				setState(648);
				gccAttributeSpecifier();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				match(T__8);
				setState(650);
				match(LeftParen);
				setState(651);
				match(Identifier);
				setState(652);
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
		enterRule(_localctx, 90, RULE_alignmentSpecifier);
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				match(Alignas);
				setState(656);
				match(LeftParen);
				setState(657);
				typeName();
				setState(658);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(Alignas);
				setState(661);
				match(LeftParen);
				setState(662);
				constantExpression();
				setState(663);
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
		enterRule(_localctx, 92, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(667);
				pointer();
				}
			}

			setState(670);
			directDeclarator(0);
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(671);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(678);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(679);
				match(LeftParen);
				setState(680);
				declarator();
				setState(681);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(683);
				match(Identifier);
				setState(684);
				match(Colon);
				setState(685);
				match(DigitSequence);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(731);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(688);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(689);
						match(LeftBracket);
						setState(691);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(690);
							typeQualifierList(0);
							}
						}

						setState(694);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
							{
							setState(693);
							assignmentExpression();
							}
						}

						setState(696);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(697);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(698);
						match(LeftBracket);
						setState(699);
						match(Static);
						setState(701);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(700);
							typeQualifierList(0);
							}
						}

						setState(703);
						assignmentExpression();
						setState(704);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(706);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(707);
						match(LeftBracket);
						setState(708);
						typeQualifierList(0);
						setState(709);
						match(Static);
						setState(710);
						assignmentExpression();
						setState(711);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(713);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(714);
						match(LeftBracket);
						setState(716);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(715);
							typeQualifierList(0);
							}
						}

						setState(718);
						match(Star);
						setState(719);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(720);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(721);
						match(LeftParen);
						setState(722);
						parameterTypeList();
						setState(723);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(725);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(726);
						match(LeftParen);
						setState(728);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(727);
							identifierList(0);
							}
						}

						setState(730);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 96, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(T__9);
				setState(737);
				match(LeftParen);
				setState(739); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(738);
					match(StringLiteral);
					}
					}
					setState(741); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(743);
				match(RightParen);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
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
		enterRule(_localctx, 98, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(T__10);
			setState(748);
			match(LeftParen);
			setState(749);
			match(LeftParen);
			setState(750);
			gccAttributeList();
			setState(751);
			match(RightParen);
			setState(752);
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
		enterRule(_localctx, 100, RULE_gccAttributeList);
		int _la;
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				gccAttribute();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(755);
					match(Comma);
					setState(756);
					gccAttribute();
					}
					}
					setState(761);
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
		enterRule(_localctx, 102, RULE_gccAttribute);
		int _la;
		try {
			setState(774);
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
				setState(765);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (RightParen - 58)) | (1L << (Comma - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(766);
					match(LeftParen);
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
						{
						setState(767);
						argumentExpressionList(0);
						}
					}

					setState(770);
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
		enterRule(_localctx, 104, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(781);
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
					setState(776);
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
					setState(777);
					match(LeftParen);
					setState(778);
					nestedParenthesesBlock();
					setState(779);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(785);
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
		enterRule(_localctx, 106, RULE_pointer);
		int _la;
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				match(Star);
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(787);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(Star);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(791);
					typeQualifierList(0);
					}
				}

				setState(794);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				match(Caret);
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(796);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(799);
				match(Caret);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(800);
					typeQualifierList(0);
					}
				}

				setState(803);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(807);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(809);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(810);
					typeQualifier();
					}
					} 
				}
				setState(815);
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
		enterRule(_localctx, 110, RULE_parameterTypeList);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				parameterList(0);
				setState(818);
				match(Comma);
				setState(819);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(824);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(826);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(827);
					match(Comma);
					setState(828);
					parameterDeclaration();
					}
					} 
				}
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 114, RULE_parameterDeclaration);
		try {
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				declarationSpecifiers();
				setState(835);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				declarationSpecifiers2();
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(838);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(844);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(846);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(847);
					match(Comma);
					setState(848);
					match(Identifier);
					}
					} 
				}
				setState(853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		enterRule(_localctx, 118, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			specifierQualifierList();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LeftParen - 58)) | (1L << (LeftBracket - 58)) | (1L << (Star - 58)) | (1L << (Caret - 58)))) != 0)) {
				{
				setState(855);
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
		enterRule(_localctx, 120, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(859);
					pointer();
					}
				}

				setState(862);
				directAbstractDeclarator(0);
				setState(866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(863);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(868);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(872);
				match(LeftParen);
				setState(873);
				abstractDeclarator();
				setState(874);
				match(RightParen);
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(875);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(880);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(881);
				match(LeftBracket);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(882);
					typeQualifierList(0);
					}
				}

				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(885);
					assignmentExpression();
					}
				}

				setState(888);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(889);
				match(LeftBracket);
				setState(890);
				match(Static);
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(891);
					typeQualifierList(0);
					}
				}

				setState(894);
				assignmentExpression();
				setState(895);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(897);
				match(LeftBracket);
				setState(898);
				typeQualifierList(0);
				setState(899);
				match(Static);
				setState(900);
				assignmentExpression();
				setState(901);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(903);
				match(LeftBracket);
				setState(904);
				match(Star);
				setState(905);
				match(RightBracket);
				}
				break;
			case 6:
				{
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
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(960);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(919);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(920);
						match(LeftBracket);
						setState(922);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(921);
							typeQualifierList(0);
							}
						}

						setState(925);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
							{
							setState(924);
							assignmentExpression();
							}
						}

						setState(927);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(928);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(929);
						match(LeftBracket);
						setState(930);
						match(Static);
						setState(932);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(931);
							typeQualifierList(0);
							}
						}

						setState(934);
						assignmentExpression();
						setState(935);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(937);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(938);
						match(LeftBracket);
						setState(939);
						typeQualifierList(0);
						setState(940);
						match(Static);
						setState(941);
						assignmentExpression();
						setState(942);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(944);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(945);
						match(LeftBracket);
						setState(946);
						match(Star);
						setState(947);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(948);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(949);
						match(LeftParen);
						setState(951);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(950);
							parameterTypeList();
							}
						}

						setState(953);
						match(RightParen);
						setState(957);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(954);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(959);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		enterRule(_localctx, 124, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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
		enterRule(_localctx, 126, RULE_initializer);
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				match(LeftBrace);
				setState(969);
				initializerList(0);
				setState(970);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
				match(LeftBrace);
				setState(973);
				initializerList(0);
				setState(974);
				match(Comma);
				setState(975);
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(980);
				designation();
				}
			}

			setState(983);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(985);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(986);
					match(Comma);
					setState(988);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(987);
						designation();
						}
					}

					setState(990);
					initializer();
					}
					} 
				}
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 130, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			designatorList(0);
			setState(997);
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1000);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1002);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1003);
					designator();
					}
					} 
				}
				setState(1008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		enterRule(_localctx, 134, RULE_designator);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(LeftBracket);
				setState(1010);
				constantExpression();
				setState(1011);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				match(Dot);
				setState(1014);
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
		enterRule(_localctx, 136, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(StaticAssert);
			setState(1018);
			match(LeftParen);
			setState(1019);
			constantExpression();
			setState(1020);
			match(Comma);
			setState(1022); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1021);
				match(StringLiteral);
				}
				}
				setState(1024); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1026);
			match(RightParen);
			setState(1027);
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
		enterRule(_localctx, 138, RULE_statement);
		int _la;
		try {
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1033);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1034);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1035);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1036);
				match(LeftParen);
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1037);
					logicalOrExpression(0);
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1038);
						match(Comma);
						setState(1039);
						logicalOrExpression(0);
						}
						}
						setState(1044);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1047);
					match(Colon);
					setState(1056);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
						{
						setState(1048);
						logicalOrExpression(0);
						setState(1053);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1049);
							match(Comma);
							setState(1050);
							logicalOrExpression(0);
							}
							}
							setState(1055);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1062);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1063);
				match(RightParen);
				setState(1064);
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
		enterRule(_localctx, 140, RULE_labeledStatement);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				match(Identifier);
				setState(1068);
				match(Colon);
				setState(1069);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(Case);
				setState(1071);
				constantExpression();
				setState(1072);
				match(Colon);
				setState(1073);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				match(Default);
				setState(1076);
				match(Colon);
				setState(1077);
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
		enterRule(_localctx, 142, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			match(LeftBrace);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Auto) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Atomic) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Semi - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(1081);
				blockItemList(0);
				}
			}

			setState(1084);
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1087);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1089);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1090);
					blockItem();
					}
					} 
				}
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
		enterRule(_localctx, 146, RULE_blockItem);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
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
		enterRule(_localctx, 148, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(1100);
				expression();
				}
			}

			setState(1103);
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
		enterRule(_localctx, 150, RULE_selectionStatement);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				match(If);
				setState(1106);
				match(LeftParen);
				setState(1107);
				expression();
				setState(1108);
				match(RightParen);
				setState(1109);
				statement();
				setState(1112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1110);
					match(Else);
					setState(1111);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(Switch);
				setState(1115);
				match(LeftParen);
				setState(1116);
				expression();
				setState(1117);
				match(RightParen);
				setState(1118);
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
		enterRule(_localctx, 152, RULE_iterationStatement);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				match(While);
				setState(1123);
				match(LeftParen);
				setState(1124);
				expression();
				setState(1125);
				match(RightParen);
				setState(1126);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				match(Do);
				setState(1129);
				statement();
				setState(1130);
				match(While);
				setState(1131);
				match(LeftParen);
				setState(1132);
				expression();
				setState(1133);
				match(RightParen);
				setState(1134);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
				match(For);
				setState(1137);
				match(LeftParen);
				setState(1138);
				forCondition();
				setState(1139);
				match(RightParen);
				setState(1140);
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
		enterRule(_localctx, 154, RULE_forCondition);
		int _la;
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				forDeclaration();
				setState(1145);
				match(Semi);
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1146);
					forExpression(0);
					}
				}

				setState(1149);
				match(Semi);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1150);
					forExpression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1153);
					expression();
					}
				}

				setState(1156);
				match(Semi);
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1157);
					forExpression(0);
					}
				}

				setState(1160);
				match(Semi);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1161);
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
		enterRule(_localctx, 156, RULE_forDeclaration);
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				declarationSpecifiers();
				setState(1167);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1173);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(1175);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1176);
					match(Comma);
					setState(1177);
					assignmentExpression();
					}
					} 
				}
				setState(1182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		enterRule(_localctx, 160, RULE_jumpStatement);
		int _la;
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				match(Goto);
				setState(1184);
				match(Identifier);
				setState(1185);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				match(Continue);
				setState(1187);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				match(Break);
				setState(1189);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1190);
				match(Return);
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Sizeof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (AndAnd - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(1191);
					expression();
					}
				}

				setState(1194);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1195);
				match(Goto);
				setState(1196);
				unaryExpression();
				setState(1197);
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
		enterRule(_localctx, 162, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Auto) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Atomic) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Plus - 70)) | (1L << (PlusPlus - 70)) | (1L << (Minus - 70)) | (1L << (MinusMinus - 70)) | (1L << (Star - 70)) | (1L << (AndAnd - 70)) | (1L << (Caret - 70)) | (1L << (Not - 70)) | (1L << (Tilde - 70)) | (1L << (Semi - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (DigitSequence - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(1201);
				translationUnit(0);
				}
			}

			setState(1204);
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
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1207);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1209);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1210);
					externalDeclaration();
					}
					} 
				}
				setState(1215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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
		enterRule(_localctx, 166, RULE_externalDeclaration);
		try {
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1219);
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
		enterRule(_localctx, 168, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1222);
				declarationSpecifiers();
				}
				break;
			}
			setState(1225);
			declarator();
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1226);
				declarationList(0);
				}
			}

			setState(1229);
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1232);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1234);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1235);
					declaration();
					}
					} 
				}
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		case 2:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 4:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 5:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 9:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 10:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 11:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 12:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 13:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 14:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 15:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 16:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 17:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 18:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 27:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 33:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 36:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 39:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 47:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 54:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 56:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 58:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 61:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 64:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 66:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 72:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 79:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 82:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 85:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 7);
		case 31:
			return precpred(_ctx, 6);
		case 32:
			return precpred(_ctx, 5);
		case 33:
			return precpred(_ctx, 4);
		case 34:
			return precpred(_ctx, 3);
		case 35:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 5);
		case 40:
			return precpred(_ctx, 4);
		case 41:
			return precpred(_ctx, 3);
		case 42:
			return precpred(_ctx, 2);
		case 43:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u04dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\6\2\u00b2\n\2\r\2\16\2\u00b3\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\u00bb\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4\u00ca\n\4\f\4\16\4\u00cd\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u00d6\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00fa\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0104\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0111\n\6\f\6\16\6\u0114"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u011c\n\7\f\7\16\7\u011f\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0132"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0143"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0151\n\13\f\13\16\13\u0154\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u015f\n\f\f\f\16\f\u0162\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u016d\n\r\f\r\16\r\u0170\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0181\n\16\f\16\16\16\u0184"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u018f\n\17\f"+
		"\17\16\17\u0192\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u019a\n\20\f"+
		"\20\16\20\u019d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01a5\n\21\f"+
		"\21\16\21\u01a8\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01b0\n\22\f"+
		"\22\16\22\u01b3\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01bb\n\23\f"+
		"\23\16\23\u01be\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01c6\n\24\f"+
		"\24\16\24\u01c9\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d1\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01db\n\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01e9\n\31\3\32\6\32"+
		"\u01ec\n\32\r\32\16\32\u01ed\3\33\6\33\u01f1\n\33\r\33\16\33\u01f2\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u01fa\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u0202\n\35\f\35\16\35\u0205\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u020c"+
		"\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0219\n \3!\3!\5!\u021d"+
		"\n!\3!\3!\3!\3!\3!\3!\3!\5!\u0226\n!\3\"\3\"\3#\3#\3#\3#\3#\7#\u022f\n"+
		"#\f#\16#\u0232\13#\3$\3$\5$\u0236\n$\3$\3$\3$\5$\u023b\n$\3%\3%\5%\u023f"+
		"\n%\3%\3%\5%\u0243\n%\5%\u0245\n%\3&\3&\3&\3&\3&\3&\7&\u024d\n&\f&\16"+
		"&\u0250\13&\3\'\3\'\5\'\u0254\n\'\3\'\3\'\5\'\u0258\n\'\3(\3(\5(\u025c"+
		"\n(\3(\3(\3(\3(\3(\3(\5(\u0264\n(\3(\3(\3(\3(\3(\3(\3(\5(\u026d\n(\3)"+
		"\3)\3)\3)\3)\3)\7)\u0275\n)\f)\16)\u0278\13)\3*\3*\3*\3*\3*\5*\u027f\n"+
		"*\3+\3+\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\5.\u0290\n.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u029c\n/\3\60\5\60\u029f\n\60\3\60\3\60\7\60\u02a3"+
		"\n\60\f\60\16\60\u02a6\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u02b1\n\61\3\61\3\61\3\61\5\61\u02b6\n\61\3\61\5\61\u02b9\n\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u02c0\n\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02cf\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02db\n\61\3\61\7\61\u02de\n\61\f"+
		"\61\16\61\u02e1\13\61\3\62\3\62\3\62\6\62\u02e6\n\62\r\62\16\62\u02e7"+
		"\3\62\3\62\5\62\u02ec\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\7\64\u02f8\n\64\f\64\16\64\u02fb\13\64\3\64\5\64\u02fe\n\64\3\65"+
		"\3\65\3\65\5\65\u0303\n\65\3\65\5\65\u0306\n\65\3\65\5\65\u0309\n\65\3"+
		"\66\3\66\3\66\3\66\3\66\7\66\u0310\n\66\f\66\16\66\u0313\13\66\3\67\3"+
		"\67\5\67\u0317\n\67\3\67\3\67\5\67\u031b\n\67\3\67\3\67\3\67\5\67\u0320"+
		"\n\67\3\67\3\67\5\67\u0324\n\67\3\67\5\67\u0327\n\67\38\38\38\38\38\7"+
		"8\u032e\n8\f8\168\u0331\138\39\39\39\39\39\59\u0338\n9\3:\3:\3:\3:\3:"+
		"\3:\7:\u0340\n:\f:\16:\u0343\13:\3;\3;\3;\3;\3;\5;\u034a\n;\5;\u034c\n"+
		";\3<\3<\3<\3<\3<\3<\7<\u0354\n<\f<\16<\u0357\13<\3=\3=\5=\u035b\n=\3>"+
		"\3>\5>\u035f\n>\3>\3>\7>\u0363\n>\f>\16>\u0366\13>\5>\u0368\n>\3?\3?\3"+
		"?\3?\3?\7?\u036f\n?\f?\16?\u0372\13?\3?\3?\5?\u0376\n?\3?\5?\u0379\n?"+
		"\3?\3?\3?\3?\5?\u037f\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?"+
		"\u038f\n?\3?\3?\7?\u0393\n?\f?\16?\u0396\13?\5?\u0398\n?\3?\3?\3?\5?\u039d"+
		"\n?\3?\5?\u03a0\n?\3?\3?\3?\3?\3?\5?\u03a7\n?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u03ba\n?\3?\3?\7?\u03be\n?\f?\16?\u03c1"+
		"\13?\7?\u03c3\n?\f?\16?\u03c6\13?\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u03d4\nA\3B\3B\5B\u03d8\nB\3B\3B\3B\3B\3B\5B\u03df\nB\3B\7B\u03e2"+
		"\nB\fB\16B\u03e5\13B\3C\3C\3C\3D\3D\3D\3D\3D\7D\u03ef\nD\fD\16D\u03f2"+
		"\13D\3E\3E\3E\3E\3E\3E\5E\u03fa\nE\3F\3F\3F\3F\3F\6F\u0401\nF\rF\16F\u0402"+
		"\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0413\nG\fG\16G\u0416\13"+
		"G\5G\u0418\nG\3G\3G\3G\3G\7G\u041e\nG\fG\16G\u0421\13G\5G\u0423\nG\7G"+
		"\u0425\nG\fG\16G\u0428\13G\3G\3G\5G\u042c\nG\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\5H\u0439\nH\3I\3I\5I\u043d\nI\3I\3I\3J\3J\3J\3J\3J\7J\u0446\n"+
		"J\fJ\16J\u0449\13J\3K\3K\5K\u044d\nK\3L\5L\u0450\nL\3L\3L\3M\3M\3M\3M"+
		"\3M\3M\3M\5M\u045b\nM\3M\3M\3M\3M\3M\3M\5M\u0463\nM\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0479\nN\3O\3O\3O\5O\u047e"+
		"\nO\3O\3O\5O\u0482\nO\3O\5O\u0485\nO\3O\3O\5O\u0489\nO\3O\3O\5O\u048d"+
		"\nO\5O\u048f\nO\3P\3P\3P\3P\5P\u0495\nP\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u049d\nQ"+
		"\fQ\16Q\u04a0\13Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04ab\nR\3R\3R\3R\3R\3"+
		"R\5R\u04b2\nR\3S\5S\u04b5\nS\3S\3S\3T\3T\3T\3T\3T\7T\u04be\nT\fT\16T\u04c1"+
		"\13T\3U\3U\3U\3U\5U\u04c7\nU\3V\5V\u04ca\nV\3V\3V\5V\u04ce\nV\3V\3V\3"+
		"W\3W\3W\3W\3W\7W\u04d7\nW\fW\16W\u04da\13W\3W\2\36\6\n\f\24\26\30\32\34"+
		"\36 \"$&8DJP`nrv|\u0082\u0086\u0092\u00a0\u00a6\u00acX\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\2\r\5\2HHJJTU\b\2\20\20\33\33##)),,;;\t\2\5\5\23\23\30\30\34\34"+
		"!\"&&//\3\2\6\b\4\2**--\6\2\24\24$$\60\60\64\64\5\2\t\n  99\4\2<=YY\3"+
		"\2<=\4\2\f\f\16\16\4\2\17\17\60\60\2\u0549\2\u00ba\3\2\2\2\4\u00bc\3\2"+
		"\2\2\6\u00c3\3\2\2\2\b\u00d5\3\2\2\2\n\u00f9\3\2\2\2\f\u0115\3\2\2\2\16"+
		"\u0131\3\2\2\2\20\u0133\3\2\2\2\22\u0142\3\2\2\2\24\u0144\3\2\2\2\26\u0155"+
		"\3\2\2\2\30\u0163\3\2\2\2\32\u0171\3\2\2\2\34\u0185\3\2\2\2\36\u0193\3"+
		"\2\2\2 \u019e\3\2\2\2\"\u01a9\3\2\2\2$\u01b4\3\2\2\2&\u01bf\3\2\2\2(\u01ca"+
		"\3\2\2\2*\u01da\3\2\2\2,\u01dc\3\2\2\2.\u01de\3\2\2\2\60\u01e8\3\2\2\2"+
		"\62\u01eb\3\2\2\2\64\u01f0\3\2\2\2\66\u01f9\3\2\2\28\u01fb\3\2\2\2:\u020b"+
		"\3\2\2\2<\u020d\3\2\2\2>\u0218\3\2\2\2@\u0225\3\2\2\2B\u0227\3\2\2\2D"+
		"\u0229\3\2\2\2F\u023a\3\2\2\2H\u0244\3\2\2\2J\u0246\3\2\2\2L\u0257\3\2"+
		"\2\2N\u026c\3\2\2\2P\u026e\3\2\2\2R\u027e\3\2\2\2T\u0280\3\2\2\2V\u0282"+
		"\3\2\2\2X\u0287\3\2\2\2Z\u028f\3\2\2\2\\\u029b\3\2\2\2^\u029e\3\2\2\2"+
		"`\u02b0\3\2\2\2b\u02eb\3\2\2\2d\u02ed\3\2\2\2f\u02fd\3\2\2\2h\u0308\3"+
		"\2\2\2j\u0311\3\2\2\2l\u0326\3\2\2\2n\u0328\3\2\2\2p\u0337\3\2\2\2r\u0339"+
		"\3\2\2\2t\u034b\3\2\2\2v\u034d\3\2\2\2x\u0358\3\2\2\2z\u0367\3\2\2\2|"+
		"\u0397\3\2\2\2~\u03c7\3\2\2\2\u0080\u03d3\3\2\2\2\u0082\u03d5\3\2\2\2"+
		"\u0084\u03e6\3\2\2\2\u0086\u03e9\3\2\2\2\u0088\u03f9\3\2\2\2\u008a\u03fb"+
		"\3\2\2\2\u008c\u042b\3\2\2\2\u008e\u0438\3\2\2\2\u0090\u043a\3\2\2\2\u0092"+
		"\u0440\3\2\2\2\u0094\u044c\3\2\2\2\u0096\u044f\3\2\2\2\u0098\u0462\3\2"+
		"\2\2\u009a\u0478\3\2\2\2\u009c\u048e\3\2\2\2\u009e\u0494\3\2\2\2\u00a0"+
		"\u0496\3\2\2\2\u00a2\u04b1\3\2\2\2\u00a4\u04b4\3\2\2\2\u00a6\u04b8\3\2"+
		"\2\2\u00a8\u04c6\3\2\2\2\u00aa\u04c9\3\2\2\2\u00ac\u04d1\3\2\2\2\u00ae"+
		"\u00bb\7h\2\2\u00af\u00bb\7i\2\2\u00b0\u00b2\7k\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00bb"+
		"\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\u00b7\5,\27\2\u00b7\u00b8\7=\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00bb\5\4\3\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2"+
		"\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\3\3\2\2\2\u00bc\u00bd\7\67\2\2\u00bd\u00be\7<\2\2\u00be\u00bf\5*\26\2"+
		"\u00bf\u00c0\7Y\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\7=\2\2\u00c2\5\3\2"+
		"\2\2\u00c3\u00c4\b\4\1\2\u00c4\u00c5\5\b\5\2\u00c5\u00cb\3\2\2\2\u00c6"+
		"\u00c7\f\3\2\2\u00c7\u00c8\7Y\2\2\u00c8\u00ca\5\b\5\2\u00c9\u00c6\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\7\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5x=\2\u00cf\u00d0\7W\2\2\u00d0"+
		"\u00d1\5*\26\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\7"+
		"W\2\2\u00d4\u00d6\5*\26\2\u00d5\u00ce\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6"+
		"\t\3\2\2\2\u00d7\u00d8\b\6\1\2\u00d8\u00fa\5\2\2\2\u00d9\u00da\7<\2\2"+
		"\u00da\u00db\5x=\2\u00db\u00dc\7=\2\2\u00dc\u00dd\7@\2\2\u00dd\u00de\5"+
		"\u0082B\2\u00de\u00df\7A\2\2\u00df\u00fa\3\2\2\2\u00e0\u00e1\7<\2\2\u00e1"+
		"\u00e2\5x=\2\u00e2\u00e3\7=\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5\5\u0082"+
		"B\2\u00e5\u00e6\7Y\2\2\u00e6\u00e7\7A\2\2\u00e7\u00fa\3\2\2\2\u00e8\u00e9"+
		"\7\3\2\2\u00e9\u00ea\7<\2\2\u00ea\u00eb\5x=\2\u00eb\u00ec\7=\2\2\u00ec"+
		"\u00ed\7@\2\2\u00ed\u00ee\5\u0082B\2\u00ee\u00ef\7A\2\2\u00ef\u00fa\3"+
		"\2\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\7<\2\2\u00f2\u00f3\5x=\2\u00f3"+
		"\u00f4\7=\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6\5\u0082B\2\u00f6\u00f7\7"+
		"Y\2\2\u00f7\u00f8\7A\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00d7\3\2\2\2\u00f9"+
		"\u00d9\3\2\2\2\u00f9\u00e0\3\2\2\2\u00f9\u00e8\3\2\2\2\u00f9\u00f0\3\2"+
		"\2\2\u00fa\u0112\3\2\2\2\u00fb\u00fc\f\f\2\2\u00fc\u00fd\7>\2\2\u00fd"+
		"\u00fe\5,\27\2\u00fe\u00ff\7?\2\2\u00ff\u0111\3\2\2\2\u0100\u0101\f\13"+
		"\2\2\u0101\u0103\7<\2\2\u0102\u0104\5\f\7\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0111\7=\2\2\u0106\u0107\f\n"+
		"\2\2\u0107\u0108\7f\2\2\u0108\u0111\7h\2\2\u0109\u010a\f\t\2\2\u010a\u010b"+
		"\7e\2\2\u010b\u0111\7h\2\2\u010c\u010d\f\b\2\2\u010d\u0111\7I\2\2\u010e"+
		"\u010f\f\7\2\2\u010f\u0111\7K\2\2\u0110\u00fb\3\2\2\2\u0110\u0100\3\2"+
		"\2\2\u0110\u0106\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010c\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\13\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\b\7\1\2\u0116\u0117"+
		"\5*\26\2\u0117\u011d\3\2\2\2\u0118\u0119\f\3\2\2\u0119\u011a\7Y\2\2\u011a"+
		"\u011c\5*\26\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\r\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0132"+
		"\5\n\6\2\u0121\u0122\7I\2\2\u0122\u0132\5\16\b\2\u0123\u0124\7K\2\2\u0124"+
		"\u0132\5\16\b\2\u0125\u0126\5\20\t\2\u0126\u0127\5\22\n\2\u0127\u0132"+
		"\3\2\2\2\u0128\u0129\7(\2\2\u0129\u0132\5\16\b\2\u012a\u012b\7(\2\2\u012b"+
		"\u012c\7<\2\2\u012c\u012d\5x=\2\u012d\u012e\7=\2\2\u012e\u0132\3\2\2\2"+
		"\u012f\u0130\7Q\2\2\u0130\u0132\7h\2\2\u0131\u0120\3\2\2\2\u0131\u0121"+
		"\3\2\2\2\u0131\u0123\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u0128\3\2\2\2\u0131"+
		"\u012a\3\2\2\2\u0131\u012f\3\2\2\2\u0132\17\3\2\2\2\u0133\u0134\t\2\2"+
		"\2\u0134\21\3\2\2\2\u0135\u0143\5\16\b\2\u0136\u0137\7<\2\2\u0137\u0138"+
		"\5x=\2\u0138\u0139\7=\2\2\u0139\u013a\5\22\n\2\u013a\u0143\3\2\2\2\u013b"+
		"\u013c\7\3\2\2\u013c\u013d\7<\2\2\u013d\u013e\5x=\2\u013e\u013f\7=\2\2"+
		"\u013f\u0140\5\22\n\2\u0140\u0143\3\2\2\2\u0141\u0143\7j\2\2\u0142\u0135"+
		"\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u013b\3\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		"\23\3\2\2\2\u0144\u0145\b\13\1\2\u0145\u0146\5\22\n\2\u0146\u0152\3\2"+
		"\2\2\u0147\u0148\f\5\2\2\u0148\u0149\7L\2\2\u0149\u0151\5\22\n\2\u014a"+
		"\u014b\f\4\2\2\u014b\u014c\7M\2\2\u014c\u0151\5\22\n\2\u014d\u014e\f\3"+
		"\2\2\u014e\u014f\7N\2\2\u014f\u0151\5\22\n\2\u0150\u0147\3\2\2\2\u0150"+
		"\u014a\3\2\2\2\u0150\u014d\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\25\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156"+
		"\b\f\1\2\u0156\u0157\5\24\13\2\u0157\u0160\3\2\2\2\u0158\u0159\f\4\2\2"+
		"\u0159\u015a\7H\2\2\u015a\u015f\5\24\13\2\u015b\u015c\f\3\2\2\u015c\u015d"+
		"\7J\2\2\u015d\u015f\5\24\13\2\u015e\u0158\3\2\2\2\u015e\u015b\3\2\2\2"+
		"\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\27"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b\r\1\2\u0164\u0165\5\26\f\2"+
		"\u0165\u016e\3\2\2\2\u0166\u0167\f\4\2\2\u0167\u0168\7F\2\2\u0168\u016d"+
		"\5\26\f\2\u0169\u016a\f\3\2\2\u016a\u016b\7G\2\2\u016b\u016d\5\26\f\2"+
		"\u016c\u0166\3\2\2\2\u016c\u0169\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\31\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0172\b\16\1\2\u0172\u0173\5\30\r\2\u0173\u0182\3\2\2\2\u0174\u0175\f"+
		"\6\2\2\u0175\u0176\7B\2\2\u0176\u0181\5\30\r\2\u0177\u0178\f\5\2\2\u0178"+
		"\u0179\7D\2\2\u0179\u0181\5\30\r\2\u017a\u017b\f\4\2\2\u017b\u017c\7C"+
		"\2\2\u017c\u0181\5\30\r\2\u017d\u017e\f\3\2\2\u017e\u017f\7E\2\2\u017f"+
		"\u0181\5\30\r\2\u0180\u0174\3\2\2\2\u0180\u0177\3\2\2\2\u0180\u017a\3"+
		"\2\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\33\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\b\17\1"+
		"\2\u0186\u0187\5\32\16\2\u0187\u0190\3\2\2\2\u0188\u0189\f\4\2\2\u0189"+
		"\u018a\7c\2\2\u018a\u018f\5\32\16\2\u018b\u018c\f\3\2\2\u018c\u018d\7"+
		"d\2\2\u018d\u018f\5\32\16\2\u018e\u0188\3\2\2\2\u018e\u018b\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\35\3\2\2"+
		"\2\u0192\u0190\3\2\2\2\u0193\u0194\b\20\1\2\u0194\u0195\5\34\17\2\u0195"+
		"\u019b\3\2\2\2\u0196\u0197\f\3\2\2\u0197\u0198\7O\2\2\u0198\u019a\5\34"+
		"\17\2\u0199\u0196\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\37\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\b\21\1"+
		"\2\u019f\u01a0\5\36\20\2\u01a0\u01a6\3\2\2\2\u01a1\u01a2\f\3\2\2\u01a2"+
		"\u01a3\7S\2\2\u01a3\u01a5\5\36\20\2\u01a4\u01a1\3\2\2\2\u01a5\u01a8\3"+
		"\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7!\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01aa\b\22\1\2\u01aa\u01ab\5 \21\2\u01ab\u01b1\3\2\2\2"+
		"\u01ac\u01ad\f\3\2\2\u01ad\u01ae\7P\2\2\u01ae\u01b0\5 \21\2\u01af\u01ac"+
		"\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"#\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\b\23\1\2\u01b5\u01b6\5\"\22"+
		"\2\u01b6\u01bc\3\2\2\2\u01b7\u01b8\f\3\2\2\u01b8\u01b9\7Q\2\2\u01b9\u01bb"+
		"\5\"\22\2\u01ba\u01b7\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2"+
		"\u01bc\u01bd\3\2\2\2\u01bd%\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\b"+
		"\24\1\2\u01c0\u01c1\5$\23\2\u01c1\u01c7\3\2\2\2\u01c2\u01c3\f\3\2\2\u01c3"+
		"\u01c4\7R\2\2\u01c4\u01c6\5$\23\2\u01c5\u01c2\3\2\2\2\u01c6\u01c9\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\'\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01ca\u01d0\5&\24\2\u01cb\u01cc\7V\2\2\u01cc\u01cd\5,\27\2\u01cd"+
		"\u01ce\7W\2\2\u01ce\u01cf\5(\25\2\u01cf\u01d1\3\2\2\2\u01d0\u01cb\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1)\3\2\2\2\u01d2\u01db\5(\25\2\u01d3\u01d4"+
		"\7\4\2\2\u01d4\u01db\5(\25\2\u01d5\u01d6\5\16\b\2\u01d6\u01d7\7Z\2\2\u01d7"+
		"\u01d8\5*\26\2\u01d8\u01db\3\2\2\2\u01d9\u01db\7j\2\2\u01da\u01d2\3\2"+
		"\2\2\u01da\u01d3\3\2\2\2\u01da\u01d5\3\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"+\3\2\2\2\u01dc\u01dd\5*\26\2\u01dd-\3\2\2\2\u01de\u01df\5(\25\2\u01df"+
		"/\3\2\2\2\u01e0\u01e1\5\62\32\2\u01e1\u01e2\58\35\2\u01e2\u01e3\7X\2\2"+
		"\u01e3\u01e9\3\2\2\2\u01e4\u01e5\5\62\32\2\u01e5\u01e6\7X\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e9\5\u008aF\2\u01e8\u01e0\3\2\2\2\u01e8\u01e4\3\2\2"+
		"\2\u01e8\u01e7\3\2\2\2\u01e9\61\3\2\2\2\u01ea\u01ec\5\66\34\2\u01eb\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\63\3\2\2\2\u01ef\u01f1\5\66\34\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\65\3\2\2\2\u01f4\u01fa"+
		"\5<\37\2\u01f5\u01fa\5> \2\u01f6\u01fa\5X-\2\u01f7\u01fa\5Z.\2\u01f8\u01fa"+
		"\5\\/\2\u01f9\u01f4\3\2\2\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\67\3\2\2\2\u01fb\u01fc\b\35\1"+
		"\2\u01fc\u01fd\5:\36\2\u01fd\u0203\3\2\2\2\u01fe\u01ff\f\3\2\2\u01ff\u0200"+
		"\7Y\2\2\u0200\u0202\5:\36\2\u0201\u01fe\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u02049\3\2\2\2\u0205\u0203\3\2\2\2"+
		"\u0206\u020c\5^\60\2\u0207\u0208\5^\60\2\u0208\u0209\7Z\2\2\u0209\u020a"+
		"\5\u0080A\2\u020a\u020c\3\2\2\2\u020b\u0206\3\2\2\2\u020b\u0207\3\2\2"+
		"\2\u020c;\3\2\2\2\u020d\u020e\t\3\2\2\u020e=\3\2\2\2\u020f\u0219\t\4\2"+
		"\2\u0210\u0211\7\3\2\2\u0211\u0212\7<\2\2\u0212\u0213\t\5\2\2\u0213\u0219"+
		"\7=\2\2\u0214\u0219\5V,\2\u0215\u0219\5@!\2\u0216\u0219\5N(\2\u0217\u0219"+
		"\5~@\2\u0218\u020f\3\2\2\2\u0218\u0210\3\2\2\2\u0218\u0214\3\2\2\2\u0218"+
		"\u0215\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219?\3\2\2\2"+
		"\u021a\u021c\5B\"\2\u021b\u021d\7h\2\2\u021c\u021b\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\7@\2\2\u021f\u0220\5D#\2\u0220"+
		"\u0221\7A\2\2\u0221\u0226\3\2\2\2\u0222\u0223\5B\"\2\u0223\u0224\7h\2"+
		"\2\u0224\u0226\3\2\2\2\u0225\u021a\3\2\2\2\u0225\u0222\3\2\2\2\u0226A"+
		"\3\2\2\2\u0227\u0228\t\6\2\2\u0228C\3\2\2\2\u0229\u022a\b#\1\2\u022a\u022b"+
		"\5F$\2\u022b\u0230\3\2\2\2\u022c\u022d\f\3\2\2\u022d\u022f\5F$\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231E\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235\5H%\2\u0234\u0236"+
		"\5J&\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0238\7X\2\2\u0238\u023b\3\2\2\2\u0239\u023b\5\u008aF\2\u023a\u0233\3"+
		"\2\2\2\u023a\u0239\3\2\2\2\u023bG\3\2\2\2\u023c\u023e\5> \2\u023d\u023f"+
		"\5H%\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0245\3\2\2\2\u0240"+
		"\u0242\5X-\2\u0241\u0243\5H%\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2"+
		"\u0243\u0245\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u0240\3\2\2\2\u0245I\3"+
		"\2\2\2\u0246\u0247\b&\1\2\u0247\u0248\5L\'\2\u0248\u024e\3\2\2\2\u0249"+
		"\u024a\f\3\2\2\u024a\u024b\7Y\2\2\u024b\u024d\5L\'\2\u024c\u0249\3\2\2"+
		"\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fK"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0258\5^\60\2\u0252\u0254\5^\60\2\u0253"+
		"\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\7W"+
		"\2\2\u0256\u0258\5.\30\2\u0257\u0251\3\2\2\2\u0257\u0253\3\2\2\2\u0258"+
		"M\3\2\2\2\u0259\u025b\7\32\2\2\u025a\u025c\7h\2\2\u025b\u025a\3\2\2\2"+
		"\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7@\2\2\u025e\u025f"+
		"\5P)\2\u025f\u0260\7A\2\2\u0260\u026d\3\2\2\2\u0261\u0263\7\32\2\2\u0262"+
		"\u0264\7h\2\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0266\7@\2\2\u0266\u0267\5P)\2\u0267\u0268\7Y\2\2\u0268\u0269"+
		"\7A\2\2\u0269\u026d\3\2\2\2\u026a\u026b\7\32\2\2\u026b\u026d\7h\2\2\u026c"+
		"\u0259\3\2\2\2\u026c\u0261\3\2\2\2\u026c\u026a\3\2\2\2\u026dO\3\2\2\2"+
		"\u026e\u026f\b)\1\2\u026f\u0270\5R*\2\u0270\u0276\3\2\2\2\u0271\u0272"+
		"\f\3\2\2\u0272\u0273\7Y\2\2\u0273\u0275\5R*\2\u0274\u0271\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277Q\3\2\2\2"+
		"\u0278\u0276\3\2\2\2\u0279\u027f\5T+\2\u027a\u027b\5T+\2\u027b\u027c\7"+
		"Z\2\2\u027c\u027d\5.\30\2\u027d\u027f\3\2\2\2\u027e\u0279\3\2\2\2\u027e"+
		"\u027a\3\2\2\2\u027fS\3\2\2\2\u0280\u0281\7h\2\2\u0281U\3\2\2\2\u0282"+
		"\u0283\7\64\2\2\u0283\u0284\7<\2\2\u0284\u0285\5x=\2\u0285\u0286\7=\2"+
		"\2\u0286W\3\2\2\2\u0287\u0288\t\7\2\2\u0288Y\3\2\2\2\u0289\u0290\t\b\2"+
		"\2\u028a\u0290\5d\63\2\u028b\u028c\7\13\2\2\u028c\u028d\7<\2\2\u028d\u028e"+
		"\7h\2\2\u028e\u0290\7=\2\2\u028f\u0289\3\2\2\2\u028f\u028a\3\2\2\2\u028f"+
		"\u028b\3\2\2\2\u0290[\3\2\2\2\u0291\u0292\7\62\2\2\u0292\u0293\7<\2\2"+
		"\u0293\u0294\5x=\2\u0294\u0295\7=\2\2\u0295\u029c\3\2\2\2\u0296\u0297"+
		"\7\62\2\2\u0297\u0298\7<\2\2\u0298\u0299\5.\30\2\u0299\u029a\7=\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u0291\3\2\2\2\u029b\u0296\3\2\2\2\u029c]\3\2\2\2"+
		"\u029d\u029f\5l\67\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0"+
		"\3\2\2\2\u02a0\u02a4\5`\61\2\u02a1\u02a3\5b\62\2\u02a2\u02a1\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5_\3\2\2\2"+
		"\u02a6\u02a4\3\2\2\2\u02a7\u02a8\b\61\1\2\u02a8\u02b1\7h\2\2\u02a9\u02aa"+
		"\7<\2\2\u02aa\u02ab\5^\60\2\u02ab\u02ac\7=\2\2\u02ac\u02b1\3\2\2\2\u02ad"+
		"\u02ae\7h\2\2\u02ae\u02af\7W\2\2\u02af\u02b1\7j\2\2\u02b0\u02a7\3\2\2"+
		"\2\u02b0\u02a9\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b1\u02df\3\2\2\2\u02b2\u02b3"+
		"\f\t\2\2\u02b3\u02b5\7>\2\2\u02b4\u02b6\5n8\2\u02b5\u02b4\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b9\5*\26\2\u02b8\u02b7\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02de\7?\2\2\u02bb"+
		"\u02bc\f\b\2\2\u02bc\u02bd\7>\2\2\u02bd\u02bf\7)\2\2\u02be\u02c0\5n8\2"+
		"\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2"+
		"\5*\26\2\u02c2\u02c3\7?\2\2\u02c3\u02de\3\2\2\2\u02c4\u02c5\f\7\2\2\u02c5"+
		"\u02c6\7>\2\2\u02c6\u02c7\5n8\2\u02c7\u02c8\7)\2\2\u02c8\u02c9\5*\26\2"+
		"\u02c9\u02ca\7?\2\2\u02ca\u02de\3\2\2\2\u02cb\u02cc\f\6\2\2\u02cc\u02ce"+
		"\7>\2\2\u02cd\u02cf\5n8\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02d1\7L\2\2\u02d1\u02de\7?\2\2\u02d2\u02d3\f\5\2"+
		"\2\u02d3\u02d4\7<\2\2\u02d4\u02d5\5p9\2\u02d5\u02d6\7=\2\2\u02d6\u02de"+
		"\3\2\2\2\u02d7\u02d8\f\4\2\2\u02d8\u02da\7<\2\2\u02d9\u02db\5v<\2\u02da"+
		"\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\7="+
		"\2\2\u02dd\u02b2\3\2\2\2\u02dd\u02bb\3\2\2\2\u02dd\u02c4\3\2\2\2\u02dd"+
		"\u02cb\3\2\2\2\u02dd\u02d2\3\2\2\2\u02dd\u02d7\3\2\2\2\u02de\u02e1\3\2"+
		"\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0a\3\2\2\2\u02e1\u02df"+
		"\3\2\2\2\u02e2\u02e3\7\f\2\2\u02e3\u02e5\7<\2\2\u02e4\u02e6\7k\2\2\u02e5"+
		"\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ec\7=\2\2\u02ea\u02ec\5d\63\2\u02eb"+
		"\u02e2\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ecc\3\2\2\2\u02ed\u02ee\7\r\2\2"+
		"\u02ee\u02ef\7<\2\2\u02ef\u02f0\7<\2\2\u02f0\u02f1\5f\64\2\u02f1\u02f2"+
		"\7=\2\2\u02f2\u02f3\7=\2\2\u02f3e\3\2\2\2\u02f4\u02f9\5h\65\2\u02f5\u02f6"+
		"\7Y\2\2\u02f6\u02f8\5h\65\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fe\3\2\2\2\u02fb\u02f9\3\2"+
		"\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02f4\3\2\2\2\u02fd\u02fc\3\2\2\2\u02fe"+
		"g\3\2\2\2\u02ff\u0305\n\t\2\2\u0300\u0302\7<\2\2\u0301\u0303\5\f\7\2\u0302"+
		"\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\7="+
		"\2\2\u0305\u0300\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0309\3\2\2\2\u0307"+
		"\u0309\3\2\2\2\u0308\u02ff\3\2\2\2\u0308\u0307\3\2\2\2\u0309i\3\2\2\2"+
		"\u030a\u0310\n\n\2\2\u030b\u030c\7<\2\2\u030c\u030d\5j\66\2\u030d\u030e"+
		"\7=\2\2\u030e\u0310\3\2\2\2\u030f\u030a\3\2\2\2\u030f\u030b\3\2\2\2\u0310"+
		"\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312k\3\2\2\2"+
		"\u0313\u0311\3\2\2\2\u0314\u0316\7L\2\2\u0315\u0317\5n8\2\u0316\u0315"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0327\3\2\2\2\u0318\u031a\7L\2\2\u0319"+
		"\u031b\5n8\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2"+
		"\2\u031c\u0327\5l\67\2\u031d\u031f\7S\2\2\u031e\u0320\5n8\2\u031f\u031e"+
		"\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0327\3\2\2\2\u0321\u0323\7S\2\2\u0322"+
		"\u0324\5n8\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2"+
		"\2\u0325\u0327\5l\67\2\u0326\u0314\3\2\2\2\u0326\u0318\3\2\2\2\u0326\u031d"+
		"\3\2\2\2\u0326\u0321\3\2\2\2\u0327m\3\2\2\2\u0328\u0329\b8\1\2\u0329\u032a"+
		"\5X-\2\u032a\u032f\3\2\2\2\u032b\u032c\f\3\2\2\u032c\u032e\5X-\2\u032d"+
		"\u032b\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330o\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0338\5r:\2\u0333\u0334"+
		"\5r:\2\u0334\u0335\7Y\2\2\u0335\u0336\7g\2\2\u0336\u0338\3\2\2\2\u0337"+
		"\u0332\3\2\2\2\u0337\u0333\3\2\2\2\u0338q\3\2\2\2\u0339\u033a\b:\1\2\u033a"+
		"\u033b\5t;\2\u033b\u0341\3\2\2\2\u033c\u033d\f\3\2\2\u033d\u033e\7Y\2"+
		"\2\u033e\u0340\5t;\2\u033f\u033c\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342s\3\2\2\2\u0343\u0341\3\2\2\2\u0344"+
		"\u0345\5\62\32\2\u0345\u0346\5^\60\2\u0346\u034c\3\2\2\2\u0347\u0349\5"+
		"\64\33\2\u0348\u034a\5z>\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034c\3\2\2\2\u034b\u0344\3\2\2\2\u034b\u0347\3\2\2\2\u034cu\3\2\2\2"+
		"\u034d\u034e\b<\1\2\u034e\u034f\7h\2\2\u034f\u0355\3\2\2\2\u0350\u0351"+
		"\f\3\2\2\u0351\u0352\7Y\2\2\u0352\u0354\7h\2\2\u0353\u0350\3\2\2\2\u0354"+
		"\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356w\3\2\2\2"+
		"\u0357\u0355\3\2\2\2\u0358\u035a\5H%\2\u0359\u035b\5z>\2\u035a\u0359\3"+
		"\2\2\2\u035a\u035b\3\2\2\2\u035by\3\2\2\2\u035c\u0368\5l\67\2\u035d\u035f"+
		"\5l\67\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0364\5|?\2\u0361\u0363\5b\62\2\u0362\u0361\3\2\2\2\u0363\u0366\3\2\2"+
		"\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364"+
		"\3\2\2\2\u0367\u035c\3\2\2\2\u0367\u035e\3\2\2\2\u0368{\3\2\2\2\u0369"+
		"\u036a\b?\1\2\u036a\u036b\7<\2\2\u036b\u036c\5z>\2\u036c\u0370\7=\2\2"+
		"\u036d\u036f\5b\62\2\u036e\u036d\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0398\3\2\2\2\u0372\u0370\3\2\2\2\u0373"+
		"\u0375\7>\2\2\u0374\u0376\5n8\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2"+
		"\2\u0376\u0378\3\2\2\2\u0377\u0379\5*\26\2\u0378\u0377\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0398\7?\2\2\u037b\u037c\7>\2\2\u037c"+
		"\u037e\7)\2\2\u037d\u037f\5n8\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2"+
		"\2\u037f\u0380\3\2\2\2\u0380\u0381\5*\26\2\u0381\u0382\7?\2\2\u0382\u0398"+
		"\3\2\2\2\u0383\u0384\7>\2\2\u0384\u0385\5n8\2\u0385\u0386\7)\2\2\u0386"+
		"\u0387\5*\26\2\u0387\u0388\7?\2\2\u0388\u0398\3\2\2\2\u0389\u038a\7>\2"+
		"\2\u038a\u038b\7L\2\2\u038b\u0398\7?\2\2\u038c\u038e\7<\2\2\u038d\u038f"+
		"\5p9\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0394\7=\2\2\u0391\u0393\5b\62\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0398\3\2\2\2\u0396"+
		"\u0394\3\2\2\2\u0397\u0369\3\2\2\2\u0397\u0373\3\2\2\2\u0397\u037b\3\2"+
		"\2\2\u0397\u0383\3\2\2\2\u0397\u0389\3\2\2\2\u0397\u038c\3\2\2\2\u0398"+
		"\u03c4\3\2\2\2\u0399\u039a\f\7\2\2\u039a\u039c\7>\2\2\u039b\u039d\5n8"+
		"\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u03a0"+
		"\5*\26\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03c3\7?\2\2\u03a2\u03a3\f\6\2\2\u03a3\u03a4\7>\2\2\u03a4\u03a6\7)\2"+
		"\2\u03a5\u03a7\5n8\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8"+
		"\3\2\2\2\u03a8\u03a9\5*\26\2\u03a9\u03aa\7?\2\2\u03aa\u03c3\3\2\2\2\u03ab"+
		"\u03ac\f\5\2\2\u03ac\u03ad\7>\2\2\u03ad\u03ae\5n8\2\u03ae\u03af\7)\2\2"+
		"\u03af\u03b0\5*\26\2\u03b0\u03b1\7?\2\2\u03b1\u03c3\3\2\2\2\u03b2\u03b3"+
		"\f\4\2\2\u03b3\u03b4\7>\2\2\u03b4\u03b5\7L\2\2\u03b5\u03c3\7?\2\2\u03b6"+
		"\u03b7\f\3\2\2\u03b7\u03b9\7<\2\2\u03b8\u03ba\5p9\2\u03b9\u03b8\3\2\2"+
		"\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bf\7=\2\2\u03bc\u03be"+
		"\5b\62\2\u03bd\u03bc\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u0399\3\2"+
		"\2\2\u03c2\u03a2\3\2\2\2\u03c2\u03ab\3\2\2\2\u03c2\u03b2\3\2\2\2\u03c2"+
		"\u03b6\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5}\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03c8\7h\2\2\u03c8\177\3"+
		"\2\2\2\u03c9\u03d4\5*\26\2\u03ca\u03cb\7@\2\2\u03cb\u03cc\5\u0082B\2\u03cc"+
		"\u03cd\7A\2\2\u03cd\u03d4\3\2\2\2\u03ce\u03cf\7@\2\2\u03cf\u03d0\5\u0082"+
		"B\2\u03d0\u03d1\7Y\2\2\u03d1\u03d2\7A\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03c9"+
		"\3\2\2\2\u03d3\u03ca\3\2\2\2\u03d3\u03ce\3\2\2\2\u03d4\u0081\3\2\2\2\u03d5"+
		"\u03d7\bB\1\2\u03d6\u03d8\5\u0084C\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3"+
		"\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\5\u0080A\2\u03da\u03e3\3\2\2\2"+
		"\u03db\u03dc\f\3\2\2\u03dc\u03de\7Y\2\2\u03dd\u03df\5\u0084C\2\u03de\u03dd"+
		"\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\5\u0080A"+
		"\2\u03e1\u03db\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4"+
		"\3\2\2\2\u03e4\u0083\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e7\5\u0086D"+
		"\2\u03e7\u03e8\7Z\2\2\u03e8\u0085\3\2\2\2\u03e9\u03ea\bD\1\2\u03ea\u03eb"+
		"\5\u0088E\2\u03eb\u03f0\3\2\2\2\u03ec\u03ed\f\3\2\2\u03ed\u03ef\5\u0088"+
		"E\2\u03ee\u03ec\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u0087\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\7>"+
		"\2\2\u03f4\u03f5\5.\30\2\u03f5\u03f6\7?\2\2\u03f6\u03fa\3\2\2\2\u03f7"+
		"\u03f8\7f\2\2\u03f8\u03fa\7h\2\2\u03f9\u03f3\3\2\2\2\u03f9\u03f7\3\2\2"+
		"\2\u03fa\u0089\3\2\2\2\u03fb\u03fc\7:\2\2\u03fc\u03fd\7<\2\2\u03fd\u03fe"+
		"\5.\30\2\u03fe\u0400\7Y\2\2\u03ff\u0401\7k\2\2\u0400\u03ff\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2"+
		"\2\2\u0404\u0405\7=\2\2\u0405\u0406\7X\2\2\u0406\u008b\3\2\2\2\u0407\u042c"+
		"\5\u008eH\2\u0408\u042c\5\u0090I\2\u0409\u042c\5\u0096L\2\u040a\u042c"+
		"\5\u0098M\2\u040b\u042c\5\u009aN\2\u040c\u040d\t\13\2\2\u040d\u040e\t"+
		"\f\2\2\u040e\u0417\7<\2\2\u040f\u0414\5&\24\2\u0410\u0411\7Y\2\2\u0411"+
		"\u0413\5&\24\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2"+
		"\2\2\u0414\u0415\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u040f\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0426\3\2\2\2\u0419\u0422\7W"+
		"\2\2\u041a\u041f\5&\24\2\u041b\u041c\7Y\2\2\u041c\u041e\5&\24\2\u041d"+
		"\u041b\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2"+
		"\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u041a\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0425\3\2\2\2\u0424\u0419\3\2\2\2\u0425\u0428\3\2"+
		"\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428"+
		"\u0426\3\2\2\2\u0429\u042a\7=\2\2\u042a\u042c\7X\2\2\u042b\u0407\3\2\2"+
		"\2\u042b\u0408\3\2\2\2\u042b\u0409\3\2\2\2\u042b\u040a\3\2\2\2\u042b\u040b"+
		"\3\2\2\2\u042b\u040c\3\2\2\2\u042c\u008d\3\2\2\2\u042d\u042e\7h\2\2\u042e"+
		"\u042f\7W\2\2\u042f\u0439\5\u008cG\2\u0430\u0431\7\22\2\2\u0431\u0432"+
		"\5.\30\2\u0432\u0433\7W\2\2\u0433\u0434\5\u008cG\2\u0434\u0439\3\2\2\2"+
		"\u0435\u0436\7\26\2\2\u0436\u0437\7W\2\2\u0437\u0439\5\u008cG\2\u0438"+
		"\u042d\3\2\2\2\u0438\u0430\3\2\2\2\u0438\u0435\3\2\2\2\u0439\u008f\3\2"+
		"\2\2\u043a\u043c\7@\2\2\u043b\u043d\5\u0092J\2\u043c\u043b\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\7A\2\2\u043f\u0091\3\2"+
		"\2\2\u0440\u0441\bJ\1\2\u0441\u0442\5\u0094K\2\u0442\u0447\3\2\2\2\u0443"+
		"\u0444\f\3\2\2\u0444\u0446\5\u0094K\2\u0445\u0443\3\2\2\2\u0446\u0449"+
		"\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0093\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u044a\u044d\5\60\31\2\u044b\u044d\5\u008cG\2\u044c\u044a"+
		"\3\2\2\2\u044c\u044b\3\2\2\2\u044d\u0095\3\2\2\2\u044e\u0450\5,\27\2\u044f"+
		"\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\7X"+
		"\2\2\u0452\u0097\3\2\2\2\u0453\u0454\7\37\2\2\u0454\u0455\7<\2\2\u0455"+
		"\u0456\5,\27\2\u0456\u0457\7=\2\2\u0457\u045a\5\u008cG\2\u0458\u0459\7"+
		"\31\2\2\u0459\u045b\5\u008cG\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2\2\2"+
		"\u045b\u0463\3\2\2\2\u045c\u045d\7+\2\2\u045d\u045e\7<\2\2\u045e\u045f"+
		"\5,\27\2\u045f\u0460\7=\2\2\u0460\u0461\5\u008cG\2\u0461\u0463\3\2\2\2"+
		"\u0462\u0453\3\2\2\2\u0462\u045c\3\2\2\2\u0463\u0099\3\2\2\2\u0464\u0465"+
		"\7\61\2\2\u0465\u0466\7<\2\2\u0466\u0467\5,\27\2\u0467\u0468\7=\2\2\u0468"+
		"\u0469\5\u008cG\2\u0469\u0479\3\2\2\2\u046a\u046b\7\27\2\2\u046b\u046c"+
		"\5\u008cG\2\u046c\u046d\7\61\2\2\u046d\u046e\7<\2\2\u046e\u046f\5,\27"+
		"\2\u046f\u0470\7=\2\2\u0470\u0471\7X\2\2\u0471\u0479\3\2\2\2\u0472\u0473"+
		"\7\35\2\2\u0473\u0474\7<\2\2\u0474\u0475\5\u009cO\2\u0475\u0476\7=\2\2"+
		"\u0476\u0477\5\u008cG\2\u0477\u0479\3\2\2\2\u0478\u0464\3\2\2\2\u0478"+
		"\u046a\3\2\2\2\u0478\u0472\3\2\2\2\u0479\u009b\3\2\2\2\u047a\u047b\5\u009e"+
		"P\2\u047b\u047d\7X\2\2\u047c\u047e\5\u00a0Q\2\u047d\u047c\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\7X\2\2\u0480\u0482\5\u00a0"+
		"Q\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u048f\3\2\2\2\u0483"+
		"\u0485\5,\27\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u0488\7X\2\2\u0487\u0489\5\u00a0Q\2\u0488\u0487\3\2\2\2\u0488"+
		"\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c\7X\2\2\u048b\u048d\5\u00a0"+
		"Q\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\3\2\2\2\u048e"+
		"\u047a\3\2\2\2\u048e\u0484\3\2\2\2\u048f\u009d\3\2\2\2\u0490\u0491\5\62"+
		"\32\2\u0491\u0492\58\35\2\u0492\u0495\3\2\2\2\u0493\u0495\5\62\32\2\u0494"+
		"\u0490\3\2\2\2\u0494\u0493\3\2\2\2\u0495\u009f\3\2\2\2\u0496\u0497\bQ"+
		"\1\2\u0497\u0498\5*\26\2\u0498\u049e\3\2\2\2\u0499\u049a\f\3\2\2\u049a"+
		"\u049b\7Y\2\2\u049b\u049d\5*\26\2\u049c\u0499\3\2\2\2\u049d\u04a0\3\2"+
		"\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u00a1\3\2\2\2\u04a0"+
		"\u049e\3\2\2\2\u04a1\u04a2\7\36\2\2\u04a2\u04a3\7h\2\2\u04a3\u04b2\7X"+
		"\2\2\u04a4\u04a5\7\25\2\2\u04a5\u04b2\7X\2\2\u04a6\u04a7\7\21\2\2\u04a7"+
		"\u04b2\7X\2\2\u04a8\u04aa\7%\2\2\u04a9\u04ab\5,\27\2\u04aa\u04a9\3\2\2"+
		"\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04b2\7X\2\2\u04ad\u04ae"+
		"\7\36\2\2\u04ae\u04af\5\16\b\2\u04af\u04b0\7X\2\2\u04b0\u04b2\3\2\2\2"+
		"\u04b1\u04a1\3\2\2\2\u04b1\u04a4\3\2\2\2\u04b1\u04a6\3\2\2\2\u04b1\u04a8"+
		"\3\2\2\2\u04b1\u04ad\3\2\2\2\u04b2\u00a3\3\2\2\2\u04b3\u04b5\5\u00a6T"+
		"\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7"+
		"\7\2\2\3\u04b7\u00a5\3\2\2\2\u04b8\u04b9\bT\1\2\u04b9\u04ba\5\u00a8U\2"+
		"\u04ba\u04bf\3\2\2\2\u04bb\u04bc\f\3\2\2\u04bc\u04be\5\u00a8U\2\u04bd"+
		"\u04bb\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2"+
		"\2\2\u04c0\u00a7\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c7\5\u00aaV\2\u04c3"+
		"\u04c7\5\u008cG\2\u04c4\u04c7\5\60\31\2\u04c5\u04c7\7X\2\2\u04c6\u04c2"+
		"\3\2\2\2\u04c6\u04c3\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c5\3\2\2\2\u04c7"+
		"\u00a9\3\2\2\2\u04c8\u04ca\5\62\32\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3"+
		"\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\5^\60\2\u04cc\u04ce\5\u00acW\2"+
		"\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0"+
		"\5\u0090I\2\u04d0\u00ab\3\2\2\2\u04d1\u04d2\bW\1\2\u04d2\u04d3\5\60\31"+
		"\2\u04d3\u04d8\3\2\2\2\u04d4\u04d5\f\3\2\2\u04d5\u04d7\5\60\31\2\u04d6"+
		"\u04d4\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2"+
		"\2\2\u04d9\u00ad\3\2\2\2\u04da\u04d8\3\2\2\2\u008c\u00b3\u00ba\u00cb\u00d5"+
		"\u00f9\u0103\u0110\u0112\u011d\u0131\u0142\u0150\u0152\u015e\u0160\u016c"+
		"\u016e\u0180\u0182\u018e\u0190\u019b\u01a6\u01b1\u01bc\u01c7\u01d0\u01da"+
		"\u01e8\u01ed\u01f2\u01f9\u0203\u020b\u0218\u021c\u0225\u0230\u0235\u023a"+
		"\u023e\u0242\u0244\u024e\u0253\u0257\u025b\u0263\u026c\u0276\u027e\u028f"+
		"\u029b\u029e\u02a4\u02b0\u02b5\u02b8\u02bf\u02ce\u02da\u02dd\u02df\u02e7"+
		"\u02eb\u02f9\u02fd\u0302\u0305\u0308\u030f\u0311\u0316\u031a\u031f\u0323"+
		"\u0326\u032f\u0337\u0341\u0349\u034b\u0355\u035a\u035e\u0364\u0367\u0370"+
		"\u0375\u0378\u037e\u038e\u0394\u0397\u039c\u039f\u03a6\u03b9\u03bf\u03c2"+
		"\u03c4\u03d3\u03d7\u03de\u03e3\u03f0\u03f9\u0402\u0414\u0417\u041f\u0422"+
		"\u0426\u042b\u0438\u043c\u0447\u044c\u044f\u045a\u0462\u0478\u047d\u0481"+
		"\u0484\u0488\u048c\u048e\u0494\u049e\u04aa\u04b1\u04b4\u04bf\u04c6\u04c9"+
		"\u04cd\u04d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}