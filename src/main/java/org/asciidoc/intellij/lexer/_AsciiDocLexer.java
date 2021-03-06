/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.asciidoc.intellij.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>asciidoc.flex</tt>
 */
class _AsciiDocLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INSIDE_LINE = 2;
  public static final int HEADING = 4;
  public static final int LISTING_BLOCK = 6;
  public static final int INSIDE_LISTING_BLOCK_LINE = 8;
  public static final int COMMENT_BLOCK = 10;
  public static final int INSIDE_COMMENT_BLOCK_LINE = 12;
  public static final int EXAMPLE_BLOCK = 14;
  public static final int INSIDE_EXAMPLE_BLOCK_LINE = 16;
  public static final int PASSTRHOUGH_BLOCK = 18;
  public static final int INSIDE_PASSTRHOUGH_BLOCK_LINE = 20;
  public static final int SIDEBAR_BLOCK = 22;
  public static final int INSIDE_SIDEBAR_BLOCK_LINE = 24;
  public static final int QUOTE_BLOCK = 26;
  public static final int INSIDE_QUOTE_BLOCK_LINE = 28;
  public static final int BLOCK_MACRO = 30;
  public static final int BLOCK_MACRO_ATTRS = 32;
  public static final int TITLE = 34;
  public static final int BLOCK_ATTRS = 36;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 
    16, 16, 17, 17, 18, 18
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\12\1\2\3\13\22\0\1\1\11\0\1\7\1\4\1\0\1\5\1\17\1\3\12\15\1\16\2\0"+
    "\1\6\3\0\32\15\1\11\1\0\1\20\1\14\1\10\1\0\32\15\3\0\1\14\6\0\1\13\242\0\2"+
    "\13\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\23\0\1\1\1\2\6\1\1\3\3\1\1\4\1\5"+
    "\1\6\1\7\1\10\1\7\1\11\1\12\1\11\1\13"+
    "\1\14\1\13\1\15\1\16\1\15\1\17\1\20\1\17"+
    "\1\21\1\22\1\21\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\2\0\1\31\10\0\1\32\7\0\3\31\2\0"+
    "\3\33\13\0\1\34\1\31\5\0\2\35\6\0\1\31"+
    "\1\36\1\0\1\37\1\0\1\40\1\0\1\41\2\0"+
    "\1\42\1\0\1\43\1\0\1\44\1\0\1\45\1\0"+
    "\1\46\1\0\1\47\1\0\1\50\1\0\1\51\1\33"+
    "\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\21\0\42\0\63\0\104\0\125\0\146\0\167"+
    "\0\210\0\231\0\252\0\273\0\314\0\335\0\356\0\377"+
    "\0\u0110\0\u0121\0\u0132\0\u0143\0\u0154\0\u0165\0\u0176\0\u0187"+
    "\0\u0198\0\u01a9\0\u01ba\0\u0154\0\u0154\0\u01cb\0\u01dc\0\u0154"+
    "\0\u0154\0\u0154\0\u0154\0\u0154\0\u01ed\0\u0154\0\u0154\0\u01fe"+
    "\0\u0154\0\u0154\0\u020f\0\u0154\0\u0154\0\u0220\0\u0154\0\u0154"+
    "\0\u0231\0\u0154\0\u0154\0\u0242\0\u0154\0\u0154\0\u0154\0\u0154"+
    "\0\u0154\0\u0154\0\u0143\0\u0253\0\u0264\0\u0275\0\u0286\0\u0297"+
    "\0\u02a8\0\u02b9\0\u02ca\0\u01cb\0\u02db\0\u0154\0\u02ec\0\u02fd"+
    "\0\u030e\0\u031f\0\u0330\0\u0341\0\u0352\0\u0363\0\u0374\0\u0385"+
    "\0\u0396\0\u03a7\0\u0143\0\u0297\0\u0154\0\u03b8\0\u03c9\0\u03da"+
    "\0\u03eb\0\u03fc\0\u040d\0\u041e\0\u042f\0\u0440\0\u0451\0\u0462"+
    "\0\u0154\0\u0473\0\u0484\0\u0495\0\u04a6\0\u04b7\0\u04c8\0\u0143"+
    "\0\u0154\0\u04d9\0\u04ea\0\u04fb\0\u050c\0\u051d\0\u052e\0\u053f"+
    "\0\u0253\0\u0550\0\u0253\0\u0561\0\u0253\0\u0572\0\u0253\0\u0583"+
    "\0\u0594\0\u0253\0\u05a5\0\u0253\0\u05b6\0\u0154\0\u05c7\0\u0154"+
    "\0\u05d8\0\u0154\0\u05e9\0\u0154\0\u05fa\0\u0154\0\u060b\0\u0154"+
    "\0\u0572\0\u061c\0\u062d\0\u063e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\2\24\1\36\1\24\1\37\1\24\2\40"+
    "\1\41\16\40\2\42\1\41\16\42\2\43\1\44\2\43"+
    "\1\45\15\43\1\44\16\43\2\46\1\47\1\50\17\46"+
    "\1\47\16\46\2\51\1\52\3\51\1\53\14\51\1\52"+
    "\16\51\2\54\1\55\1\54\1\56\16\54\1\55\16\54"+
    "\2\57\1\60\4\57\1\61\13\57\1\60\16\57\2\62"+
    "\1\63\5\62\1\64\12\62\1\63\16\62\2\65\1\41"+
    "\6\65\1\66\7\65\2\67\1\41\16\67\2\70\1\41"+
    "\16\70\2\71\1\41\15\71\1\72\2\73\1\74\10\73"+
    "\1\0\5\73\21\0\2\73\1\74\1\75\7\73\1\0"+
    "\7\73\1\74\1\73\1\76\6\73\1\0\7\73\1\74"+
    "\2\73\1\77\5\73\1\0\6\73\1\100\1\74\3\73"+
    "\1\101\3\73\1\100\1\0\7\73\1\74\4\73\1\102"+
    "\3\73\1\0\7\73\1\74\5\73\1\103\2\73\1\0"+
    "\1\73\1\104\1\105\4\73\1\74\5\73\1\104\2\73"+
    "\1\0\1\73\1\104\1\105\2\73\1\106\1\0\15\106"+
    "\1\0\1\106\5\0\1\107\16\0\1\110\23\0\1\111"+
    "\16\0\1\112\23\0\1\113\21\0\1\114\14\0\3\115"+
    "\5\0\1\115\4\0\2\116\1\74\1\117\7\116\1\120"+
    "\5\116\2\73\1\74\1\73\1\121\6\73\1\0\7\73"+
    "\1\74\2\73\1\122\5\73\1\0\5\73\1\123\1\124"+
    "\1\74\7\123\1\124\1\125\5\123\1\73\1\100\1\74"+
    "\3\73\1\126\3\73\1\100\1\0\7\73\1\74\4\73"+
    "\1\127\3\73\1\0\7\73\1\74\5\73\1\130\2\73"+
    "\1\0\1\73\1\104\1\105\4\73\1\74\10\73\1\0"+
    "\2\73\1\131\2\73\5\0\1\132\16\0\1\133\23\0"+
    "\1\134\16\0\1\135\23\0\1\136\21\0\1\137\11\0"+
    "\1\140\1\141\1\0\3\115\3\0\1\140\1\0\1\115"+
    "\4\0\2\116\1\74\10\116\1\120\7\116\1\74\1\142"+
    "\7\116\1\120\5\116\2\120\1\0\16\120\2\73\1\74"+
    "\1\73\1\143\6\73\1\0\7\73\1\74\2\73\1\144"+
    "\5\73\1\0\6\73\1\100\1\74\3\73\1\145\3\73"+
    "\1\100\1\0\7\73\1\74\4\73\1\146\3\73\1\0"+
    "\7\73\1\74\5\73\1\147\2\73\1\0\1\73\1\104"+
    "\1\105\2\73\2\150\1\74\10\150\1\151\5\150\5\0"+
    "\1\152\16\0\1\153\23\0\1\154\16\0\1\155\23\0"+
    "\1\156\21\0\1\157\11\0\1\140\1\141\7\0\1\140"+
    "\6\0\1\116\1\160\1\161\1\142\6\116\1\160\1\120"+
    "\5\116\1\73\1\162\1\163\1\73\1\143\5\73\1\162"+
    "\1\0\6\73\1\164\1\165\2\73\1\144\4\73\1\164"+
    "\1\0\6\73\1\166\1\167\3\73\1\170\3\73\1\166"+
    "\1\0\6\73\1\171\1\172\4\73\1\146\2\73\1\171"+
    "\1\0\6\73\1\173\1\174\5\73\1\147\1\73\1\173"+
    "\1\0\1\73\1\104\1\105\2\73\1\0\1\175\1\176"+
    "\2\0\1\152\4\0\1\175\7\0\1\177\1\200\1\153"+
    "\6\0\1\177\7\0\1\201\1\202\3\0\1\154\3\0"+
    "\1\201\7\0\1\203\1\204\1\0\1\155\5\0\1\203"+
    "\7\0\1\205\1\206\4\0\1\156\2\0\1\205\7\0"+
    "\1\207\1\210\5\0\1\157\1\0\1\207\6\0\1\116"+
    "\1\160\1\161\7\116\1\160\1\120\5\116\1\73\1\162"+
    "\1\163\7\73\1\162\1\0\6\73\1\164\1\165\7\73"+
    "\1\164\1\0\5\73\1\123\1\211\1\167\7\123\1\211"+
    "\1\125\5\123\1\73\1\166\1\167\3\73\1\212\3\73"+
    "\1\166\1\0\6\73\1\171\1\172\7\73\1\171\1\0"+
    "\6\73\1\173\1\174\7\73\1\173\1\0\5\73\1\0"+
    "\1\175\1\176\7\0\1\175\7\0\1\177\1\200\7\0"+
    "\1\177\7\0\1\201\1\202\7\0\1\201\7\0\1\203"+
    "\1\204\7\0\1\203\7\0\1\205\1\206\7\0\1\205"+
    "\7\0\1\207\1\210\7\0\1\207\6\0\1\73\1\166"+
    "\1\167\3\73\1\213\3\73\1\166\1\0\6\73\1\214"+
    "\1\167\3\73\1\213\3\73\1\214\1\0\6\73\1\214"+
    "\1\167\7\73\1\214\1\0\5\73";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1615];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\23\0\1\1\1\11\6\1\2\11\2\1\5\11\1\1"+
    "\2\11\1\1\2\11\1\1\2\11\1\1\2\11\1\1"+
    "\2\11\1\1\6\11\2\0\1\1\10\0\1\11\7\0"+
    "\3\1\2\0\2\1\1\11\13\0\1\11\1\1\5\0"+
    "\1\1\1\11\6\0\2\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\2\0\1\1\1\0\1\1\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\1\1\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
 int blockDelimiterLength;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _AsciiDocLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(INSIDE_LINE); return AsciiDocTokenTypes.TEXT;
            }
          case 42: break;
          case 2: 
            { return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 43: break;
          case 3: 
            { yybegin(BLOCK_ATTRS); return AsciiDocTokenTypes.BLOCK_ATTRS_START;
            }
          case 44: break;
          case 4: 
            { return AsciiDocTokenTypes.TEXT;
            }
          case 45: break;
          case 5: 
            { yybegin(YYINITIAL); return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 46: break;
          case 6: 
            { return AsciiDocTokenTypes.HEADING;
            }
          case 47: break;
          case 7: 
            { yybegin(INSIDE_LISTING_BLOCK_LINE); return AsciiDocTokenTypes.LISTING_TEXT;
            }
          case 48: break;
          case 8: 
            { yybegin(LISTING_BLOCK); return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 49: break;
          case 9: 
            { yybegin(INSIDE_COMMENT_BLOCK_LINE); return AsciiDocTokenTypes.BLOCK_COMMENT;
            }
          case 50: break;
          case 10: 
            { yybegin(COMMENT_BLOCK); return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 51: break;
          case 11: 
            { yybegin(INSIDE_EXAMPLE_BLOCK_LINE); return AsciiDocTokenTypes.EXAMPLE_BLOCK;
            }
          case 52: break;
          case 12: 
            { yybegin(EXAMPLE_BLOCK); return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 53: break;
          case 13: 
            { yybegin(INSIDE_PASSTRHOUGH_BLOCK_LINE); return AsciiDocTokenTypes.PASSTRHOUGH_BLOCK;
            }
          case 54: break;
          case 14: 
            { yybegin(PASSTRHOUGH_BLOCK); return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 55: break;
          case 15: 
            { yybegin(INSIDE_SIDEBAR_BLOCK_LINE); return AsciiDocTokenTypes.SIDEBAR_BLOCK;
            }
          case 56: break;
          case 16: 
            { yybegin(SIDEBAR_BLOCK); return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 57: break;
          case 17: 
            { yybegin(INSIDE_QUOTE_BLOCK_LINE); return AsciiDocTokenTypes.QUOTE_BLOCK;
            }
          case 58: break;
          case 18: 
            { yybegin(QUOTE_BLOCK); return AsciiDocTokenTypes.LINE_BREAK;
            }
          case 59: break;
          case 19: 
            { return AsciiDocTokenTypes.BLOCK_MACRO_BODY;
            }
          case 60: break;
          case 20: 
            { yybegin(BLOCK_MACRO_ATTRS); return AsciiDocTokenTypes.BLOCK_MACRO_ATTRIBUTES;
            }
          case 61: break;
          case 21: 
            { return AsciiDocTokenTypes.BLOCK_MACRO_ATTRIBUTES;
            }
          case 62: break;
          case 22: 
            { return AsciiDocTokenTypes.TITLE;
            }
          case 63: break;
          case 23: 
            { return AsciiDocTokenTypes.BLOCK_ATTR_NAME;
            }
          case 64: break;
          case 24: 
            { yybegin(YYINITIAL); return AsciiDocTokenTypes.BLOCK_ATTRS_END;
            }
          case 65: break;
          case 25: 
            { return AsciiDocTokenTypes.LINE_COMMENT;
            }
          case 66: break;
          case 26: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 1);
            { yybegin(TITLE); return AsciiDocTokenTypes.TITLE;
            }
          case 67: break;
          case 27: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(HEADING); return AsciiDocTokenTypes.HEADING;
            }
          case 68: break;
          case 28: 
            { String[] part = yytext().toString().split("\n");
      // remove all trailing white space
      String heading = part[0].replaceAll("[ \t]*$","");
      String underlining = part[1].replaceAll("[ \t]*$","");
      boolean sameCharactersInSecondLine = true;
      // must be same character all of second line
      for(int i = 0; i < underlining.length(); ++i) {
        if(underlining.charAt(0) != underlining.charAt(i)) {
          sameCharactersInSecondLine = false;
          break;
        }
      }
      // must be same length plus/minus one character
      if(heading.length() >= underlining.length() -1
         && heading.length() <= underlining.length() +1
         && sameCharactersInSecondLine) {
        return AsciiDocTokenTypes.HEADING;
      } else {
        yypushback(yylength()-1); // heading.length() + 1
        yybegin(INSIDE_LINE);
        return AsciiDocTokenTypes.TEXT;
      }
            }
          case 69: break;
          case 29: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(BLOCK_MACRO); return AsciiDocTokenTypes.BLOCK_MACRO_ID;
            }
          case 70: break;
          case 30: 
            { yybegin(COMMENT_BLOCK); blockDelimiterLength = yytext().toString().trim().length(); return AsciiDocTokenTypes.BLOCK_COMMENT;
            }
          case 71: break;
          case 31: 
            { yybegin(PASSTRHOUGH_BLOCK); blockDelimiterLength = yytext().toString().trim().length(); return AsciiDocTokenTypes.PASSTRHOUGH_BLOCK_DELIMITER;
            }
          case 72: break;
          case 32: 
            { yybegin(LISTING_BLOCK); blockDelimiterLength = yytext().toString().trim().length(); return AsciiDocTokenTypes.LISTING_BLOCK_DELIMITER;
            }
          case 73: break;
          case 33: 
            { yybegin(EXAMPLE_BLOCK); blockDelimiterLength = yytext().toString().trim().length(); return AsciiDocTokenTypes.EXAMPLE_BLOCK_DELIMITER;
            }
          case 74: break;
          case 34: 
            { yybegin(SIDEBAR_BLOCK); blockDelimiterLength = yytext().toString().trim().length(); return AsciiDocTokenTypes.SIDEBAR_BLOCK_DELIMITER;
            }
          case 75: break;
          case 35: 
            { yybegin(QUOTE_BLOCK); blockDelimiterLength = yytext().toString().trim().length(); return AsciiDocTokenTypes.QUOTE_BLOCK_DELIMITER;
            }
          case 76: break;
          case 36: 
            { if (yytext().toString().trim().length() == blockDelimiterLength) {
      yybegin(YYINITIAL);
      return AsciiDocTokenTypes.LISTING_BLOCK_DELIMITER;
    } else {
      return AsciiDocTokenTypes.LISTING_TEXT;
    }
            }
          case 77: break;
          case 37: 
            { if (yytext().toString().trim().length() == blockDelimiterLength) {
      yybegin(YYINITIAL);
      return AsciiDocTokenTypes.BLOCK_COMMENT;
    } else {
      return AsciiDocTokenTypes.BLOCK_COMMENT;
    }
            }
          case 78: break;
          case 38: 
            { if (yytext().toString().trim().length() == blockDelimiterLength) {
      yybegin(YYINITIAL);
      return AsciiDocTokenTypes.EXAMPLE_BLOCK_DELIMITER;
    } else {
      return AsciiDocTokenTypes.EXAMPLE_BLOCK;
    }
            }
          case 79: break;
          case 39: 
            { if (yytext().toString().trim().length() == blockDelimiterLength) {
      yybegin(YYINITIAL);
      return AsciiDocTokenTypes.PASSTRHOUGH_BLOCK_DELIMITER;
    } else {
      return AsciiDocTokenTypes.PASSTRHOUGH_BLOCK;
    }
            }
          case 80: break;
          case 40: 
            { if (yytext().toString().trim().length() == blockDelimiterLength) {
      yybegin(YYINITIAL);
      return AsciiDocTokenTypes.SIDEBAR_BLOCK_DELIMITER;
    } else {
      return AsciiDocTokenTypes.SIDEBAR_BLOCK;
    }
            }
          case 81: break;
          case 41: 
            { if (yytext().toString().trim().length() == blockDelimiterLength) {
      yybegin(YYINITIAL);
      return AsciiDocTokenTypes.QUOTE_BLOCK_DELIMITER;
    } else {
      return AsciiDocTokenTypes.QUOTE_BLOCK;
    }
            }
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
