// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/lexico/Lexico.flex

package lexico;
import java_cup.runtime.Symbol;
import sintactico.sym;


@SuppressWarnings("fallthrough")
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\4"+
    "\1\5\1\6\2\0\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\12\22\1\23"+
    "\1\24\1\25\1\26\1\27\2\0\4\30\1\31\15\30"+
    "\1\32\7\30\1\33\1\34\1\35\1\0\1\30\1\0"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\2\30\1\47\1\30\1\50\1\51\2\30\1\52"+
    "\1\53\1\54\1\55\3\30\1\56\1\30\1\57\1\60"+
    "\1\61\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\1\1\4\2\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\2\23\1\24\1\25"+
    "\10\23\1\26\1\1\1\27\1\30\1\0\1\31\1\32"+
    "\1\0\1\33\1\34\1\35\1\36\1\0\1\37\1\40"+
    "\1\41\12\23\1\42\1\43\1\44\7\23\1\45\2\23"+
    "\1\0\2\23\1\46\1\47\3\23\1\0\1\50\1\23"+
    "\1\0\1\51\2\23\2\0\1\23\1\0\1\52\1\53"+
    "\1\0\1\54\1\55\1\23\1\56\1\57\1\60\2\0"+
    "\1\61\1\62\2\0\1\63\1\64\1\65\1\0\1\66"+
    "\1\67\1\70\1\71\1\72\1\0\1\73\1\74\1\75"+
    "\1\76\1\77\1\100\1\101";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
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
    "\0\0\0\62\0\62\0\144\0\226\0\310\0\62\0\372"+
    "\0\u012c\0\62\0\62\0\62\0\u015e\0\62\0\u0190\0\62"+
    "\0\62\0\u01c2\0\62\0\62\0\u01f4\0\u0226\0\u0258\0\u028a"+
    "\0\u02bc\0\62\0\62\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6"+
    "\0\u03e8\0\u041a\0\u044c\0\62\0\u047e\0\62\0\62\0\310"+
    "\0\62\0\62\0\u04b0\0\62\0\62\0\62\0\62\0\u04e2"+
    "\0\62\0\62\0\62\0\u0514\0\u0546\0\u0578\0\u05aa\0\u05dc"+
    "\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\62\0\62\0\u0708"+
    "\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898"+
    "\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28"+
    "\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b54\0\u0b86"+
    "\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16"+
    "\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\u0e74\0\u0ea6"+
    "\0\u0ce4\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0dde\0\u0e10\0\u0fa0"+
    "\0\62\0\u0fd2\0\u0ed8\0\u1004\0\u1036\0\u1068\0\u109a\0\u0fd2"+
    "\0\u1004\0\u1036\0\u10cc\0\u109a\0\u10cc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\3\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\2\30"+
    "\1\31\1\32\1\2\1\33\1\30\1\34\1\35\1\36"+
    "\1\37\1\40\2\30\1\41\1\42\3\30\1\43\3\30"+
    "\1\44\1\45\1\46\64\0\1\3\105\0\1\47\33\0"+
    "\6\50\1\51\53\50\10\0\1\52\51\0\11\53\1\0"+
    "\50\53\15\0\1\54\10\0\1\55\52\0\1\56\6\0"+
    "\1\57\53\0\1\60\1\0\1\22\65\0\1\61\61\0"+
    "\1\62\61\0\1\63\55\0\1\30\5\0\3\30\3\0"+
    "\21\30\25\0\1\30\5\0\3\30\3\0\16\30\1\64"+
    "\2\30\25\0\1\30\5\0\3\30\3\0\13\30\1\65"+
    "\4\30\1\66\25\0\1\30\5\0\3\30\3\0\7\30"+
    "\1\67\11\30\25\0\1\30\5\0\3\30\3\0\13\30"+
    "\1\70\5\30\25\0\1\30\5\0\3\30\3\0\11\30"+
    "\1\71\7\30\25\0\1\30\5\0\3\30\3\0\11\30"+
    "\1\72\7\30\25\0\1\30\5\0\3\30\3\0\12\30"+
    "\1\73\6\30\25\0\1\30\5\0\3\30\3\0\13\30"+
    "\1\74\5\30\25\0\1\30\5\0\3\30\3\0\7\30"+
    "\1\75\11\30\63\0\1\76\12\0\1\77\72\0\1\100"+
    "\61\0\1\30\5\0\3\30\3\0\14\30\1\101\4\30"+
    "\25\0\1\30\5\0\3\30\3\0\13\30\1\102\5\30"+
    "\25\0\1\30\5\0\3\30\3\0\16\30\1\103\2\30"+
    "\25\0\1\30\5\0\3\30\3\0\1\104\20\30\25\0"+
    "\1\30\5\0\3\30\3\0\17\30\1\105\1\30\25\0"+
    "\1\30\5\0\3\30\3\0\15\30\1\106\3\30\25\0"+
    "\1\30\5\0\3\30\3\0\13\30\1\107\5\30\25\0"+
    "\1\30\5\0\3\30\3\0\16\30\1\110\2\30\25\0"+
    "\1\30\5\0\3\30\3\0\12\30\1\111\6\30\25\0"+
    "\1\30\5\0\3\30\3\0\13\30\1\112\5\30\25\0"+
    "\1\100\6\0\1\113\10\0\1\113\41\0\1\30\5\0"+
    "\3\30\3\0\10\30\1\114\10\30\25\0\1\30\5\0"+
    "\3\30\3\0\11\30\1\115\7\30\25\0\1\30\5\0"+
    "\3\30\3\0\4\30\1\116\14\30\25\0\1\30\5\0"+
    "\3\30\3\0\14\30\1\117\4\30\25\0\1\30\5\0"+
    "\3\30\3\0\1\30\1\120\17\30\25\0\1\30\5\0"+
    "\3\30\3\0\4\30\1\121\14\30\25\0\1\30\5\0"+
    "\3\30\3\0\1\122\20\30\25\0\1\30\5\0\3\30"+
    "\1\0\1\123\1\0\21\30\25\0\1\30\5\0\3\30"+
    "\3\0\6\30\1\124\12\30\25\0\1\30\5\0\3\30"+
    "\3\0\14\30\1\125\4\30\20\0\1\126\1\0\1\126"+
    "\2\0\1\127\61\0\1\30\5\0\3\30\3\0\12\30"+
    "\1\130\6\30\25\0\1\30\5\0\3\30\3\0\4\30"+
    "\1\131\14\30\25\0\1\30\5\0\3\30\1\0\1\132"+
    "\1\0\21\30\25\0\1\30\5\0\3\30\1\0\1\133"+
    "\1\0\21\30\25\0\1\30\5\0\3\30\3\0\11\30"+
    "\1\134\7\30\7\0\1\135\15\0\1\30\5\0\3\30"+
    "\3\0\21\30\25\0\1\30\5\0\3\30\3\0\16\30"+
    "\1\136\2\30\37\0\1\137\47\0\1\30\5\0\3\30"+
    "\1\0\1\140\1\0\21\30\25\0\1\30\5\0\3\30"+
    "\3\0\16\30\1\141\2\30\25\0\1\127\61\0\1\30"+
    "\5\0\3\30\3\0\6\30\1\142\12\30\25\0\1\30"+
    "\5\0\3\30\3\0\1\143\20\30\37\0\1\144\61\0"+
    "\1\145\47\0\1\30\5\0\3\30\3\0\4\30\1\146"+
    "\14\30\51\0\1\147\35\0\1\30\5\0\3\30\1\0"+
    "\1\150\1\0\21\30\37\0\1\151\61\0\1\152\47\0"+
    "\1\30\5\0\3\30\1\0\1\153\1\0\21\30\25\0"+
    "\1\30\5\0\3\30\1\0\1\154\1\0\21\30\25\0"+
    "\1\30\5\0\3\30\3\0\12\30\1\155\6\30\37\0"+
    "\1\156\61\0\1\157\47\0\1\30\5\0\3\30\1\0"+
    "\1\160\1\0\21\30\46\0\1\161\52\0\1\162\61\0"+
    "\1\163\61\0\1\164\61\0\1\165\47\0\1\30\5\0"+
    "\3\30\1\0\1\166\1\0\21\30\37\0\1\167\61\0"+
    "\1\170\61\0\1\171\61\0\1\172\61\0\1\173\61\0"+
    "\1\174\61\0\1\175\25\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4350];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\11\2\1\3\11\1\1\1\11"+
    "\1\1\2\11\1\1\2\11\5\1\2\11\10\1\1\11"+
    "\1\1\2\11\1\0\2\11\1\0\4\11\1\0\3\11"+
    "\12\1\2\11\13\1\1\0\7\1\1\0\2\1\1\0"+
    "\3\1\2\0\1\1\1\0\2\1\1\0\6\1\2\0"+
    "\2\1\2\0\3\1\1\0\1\11\4\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private java.util.ArrayList<String> tokens = new java.util.ArrayList<>();
    public java.util.List<String> obtenerTokens() { return tokens; }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new RuntimeException("Caracter desconocido: " + yytext());
            }
          // fall through
          case 66: break;
          case 2:
            { 
            }
          // fall through
          case 67: break;
          case 3:
            { tokens.add("OPERADOR_NOT: " + yytext()); 
        return new Symbol(sym.OPERADOR_NOT, yyline, yycolumn, yytext());
            }
          // fall through
          case 68: break;
          case 4:
            { tokens.add("OPERADOR_MODULO: " + yytext()); 
        return new Symbol(sym.OPERADOR_MODULO, yyline, yycolumn, yytext());
            }
          // fall through
          case 69: break;
          case 5:
            { tokens.add("PARENTESIS_ABIERTO: " + yytext()); 
        return new Symbol(sym.PARENTESIS_ABIERTO, yyline, yycolumn, yytext());
            }
          // fall through
          case 70: break;
          case 6:
            { tokens.add("PARENTESIS_CERRADO: " + yytext()); 
        return new Symbol(sym.PARENTESIS_CERRADO, yyline, yycolumn, yytext());
            }
          // fall through
          case 71: break;
          case 7:
            { tokens.add("OPERADOR_POR: " + yytext()); 
        return new Symbol(sym.OPERADOR_POR, yyline, yycolumn, yytext());
            }
          // fall through
          case 72: break;
          case 8:
            { tokens.add("OPERADOR_MAS: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAS, yyline, yycolumn, yytext());
            }
          // fall through
          case 73: break;
          case 9:
            { tokens.add("SIGNO_COMA: " + yytext()); 
        return new Symbol(sym.SIGNO_COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 74: break;
          case 10:
            { tokens.add("OPERADOR_MENOS: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 75: break;
          case 11:
            { tokens.add("SIGNO_PUNTO: " + yytext()); 
        return new Symbol(sym.SIGNO_PUNTO, yyline, yycolumn, yytext());
            }
          // fall through
          case 76: break;
          case 12:
            { tokens.add("OPERADOR_ENTRE: " + yytext()); 
        return new Symbol(sym.OPERADOR_ENTRE, yyline, yycolumn, yytext());
            }
          // fall through
          case 77: break;
          case 13:
            { tokens.add("NUMERO: " + yytext()); 
        return new Symbol(sym.NUMERO, yyline, yycolumn, Integer.parseInt(yytext()));
            }
          // fall through
          case 78: break;
          case 14:
            { tokens.add("SIGNO_DOS_PUNTOS: " + yytext()); 
        return new Symbol(sym.SIGNO_DOS_PUNTOS, yyline, yycolumn, yytext());
            }
          // fall through
          case 79: break;
          case 15:
            { tokens.add("SIGNO_PUNTO_Y_COMA: " + yytext()); 
        return new Symbol(sym.SIGNO_PUNTO_Y_COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 80: break;
          case 16:
            { tokens.add("OPERADOR_MENOR_QUE: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOR_QUE, yyline, yycolumn, yytext());
            }
          // fall through
          case 81: break;
          case 17:
            { tokens.add("OPERADOR_DE_ASIGNACION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_ASIGNACION, yyline, yycolumn, yytext());
            }
          // fall through
          case 82: break;
          case 18:
            { tokens.add("OPERADOR_MAYOR_QUE: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAYOR_QUE, yyline, yycolumn, yytext());
            }
          // fall through
          case 83: break;
          case 19:
            { tokens.add("IDENTIFICADOR: " + yytext()); 
        return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 84: break;
          case 20:
            { tokens.add("CORCHETE_ABIERTO: " + yytext()); 
        return new Symbol(sym.CORCHETE_ABIERTO, yyline, yycolumn, yytext());
            }
          // fall through
          case 85: break;
          case 21:
            { tokens.add("CORCHETE_CERRADO: " + yytext()); 
        return new Symbol(sym.CORCHETE_CERRADO, yyline, yycolumn, yytext());
            }
          // fall through
          case 86: break;
          case 22:
            { tokens.add("LLAVE_ABIERTA: " + yytext()); 
        return new Symbol(sym.LLAVE_ABIERTA, yyline, yycolumn, yytext());
            }
          // fall through
          case 87: break;
          case 23:
            { tokens.add("LLAVE_CERRADA: " + yytext()); 
        return new Symbol(sym.LLAVE_CERRADA, yyline, yycolumn, yytext());
            }
          // fall through
          case 88: break;
          case 24:
            { tokens.add("OPERADOR_DIFERENTE_DE: " + yytext()); 
        return new Symbol(sym.OPERADOR_DIFERENTE_DE, yyline, yycolumn, yytext());
            }
          // fall through
          case 89: break;
          case 25:
            { tokens.add("CADENA: " + yytext());
        return new Symbol(sym.CADENA, yyline, yycolumn, yytext().substring(1, yytext().length() - 1));
            }
          // fall through
          case 90: break;
          case 26:
            { tokens.add("OPERADOR_AND: " + yytext()); 
        return new Symbol(sym.OPERADOR_AND, yyline, yycolumn, yytext());
            }
          // fall through
          case 91: break;
          case 27:
            { tokens.add("OPERADOR_INCREMENTO: " + yytext()); 
        return new Symbol(sym.OPERADOR_INCREMENTO, yyline, yycolumn, yytext());
            }
          // fall through
          case 92: break;
          case 28:
            { tokens.add("OPERADOR_DE_ADICION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_ADICION, yyline, yycolumn, yytext());
            }
          // fall through
          case 93: break;
          case 29:
            { tokens.add("OPERADOR_DECREMENTO: " + yytext()); 
        return new Symbol(sym.OPERADOR_DECREMENTO, yyline, yycolumn, yytext());
            }
          // fall through
          case 94: break;
          case 30:
            { tokens.add("OPERADOR_DE_SUSTRACCION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_SUSTRACCION, yyline, yycolumn, yytext());
            }
          // fall through
          case 95: break;
          case 31:
            { tokens.add("OPERADOR_MENOR_IGUAL: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOR_IGUAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 96: break;
          case 32:
            { tokens.add("OPERADOR_IGUAL_A: " + yytext()); 
        return new Symbol(sym.OPERADOR_IGUAL_A, yyline, yycolumn, yytext());
            }
          // fall through
          case 97: break;
          case 33:
            { tokens.add("OPERADOR_MAYOR_IGUAL: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAYOR_IGUAL, yyline, yycolumn, yytext());
            }
          // fall through
          case 98: break;
          case 34:
            { tokens.add("OPERADOR_OR: " + yytext()); 
        return new Symbol(sym.OPERADOR_OR, yyline, yycolumn, yytext());
            }
          // fall through
          case 99: break;
          case 35:
            { tokens.add("VALOR_CARACTER: " + yytext());
        return new Symbol(sym.VALOR_CARACTER, yyline, yycolumn, yytext().charAt(1));
            }
          // fall through
          case 100: break;
          case 36:
            { tokens.add("NUMERO_FLOTANTE: " + yytext()); 
        return new Symbol(sym.NUMERO_FLOTANTE, yyline, yycolumn, Float.parseFloat(yytext()));
            }
          // fall through
          case 101: break;
          case 37:
            { tokens.add("INT: " + yytext()); 
        return new Symbol(sym.INT, yyline, yycolumn);
            }
          // fall through
          case 102: break;
          case 38:
            { tokens.add("BYTE: " + yytext()); 
        return new Symbol(sym.BYTE, yyline, yycolumn);
            }
          // fall through
          case 103: break;
          case 39:
            { tokens.add("CARACTER: " + yytext()); 
        return new Symbol(sym.CARACTER, yyline, yycolumn);
            }
          // fall through
          case 104: break;
          case 40:
            { tokens.add("LONG: " + yytext()); 
        return new Symbol(sym.LONG, yyline, yycolumn);
            }
          // fall through
          case 105: break;
          case 41:
            { tokens.add("NUMERO_DOUBLE: " + yytext()); 
        return new Symbol(sym.NUMERO_DOUBLE, yyline, yycolumn, Double.parseDouble(yytext()));
            }
          // fall through
          case 106: break;
          case 42:
            { tokens.add("FLOAT: " + yytext()); 
        return new Symbol(sym.FLOAT, yyline, yycolumn);
            }
          // fall through
          case 107: break;
          case 43:
            { tokens.add("ARREGLO_INT: " + yytext());
    return new Symbol(sym.ARREGLO_INT, yyline, yycolumn, yytext());
            }
          // fall through
          case 108: break;
          case 44:
            { tokens.add("SHORT: " + yytext()); 
        return new Symbol(sym.SHORT, yyline, yycolumn);
            }
          // fall through
          case 109: break;
          case 45:
            { tokens.add("STRING: " + yytext()); 
        return new Symbol(sym.STRING, yyline, yycolumn);
            }
          // fall through
          case 110: break;
          case 46:
            { tokens.add("ARREGLO_BYTE: " + yytext());
    return new Symbol(sym.ARREGLO_BYTE, yyline, yycolumn, yytext());
            }
          // fall through
          case 111: break;
          case 47:
            { tokens.add("ARREGLO_CARACTER: " + yytext());
    return new Symbol(sym.ARREGLO_CARACTER, yyline, yycolumn, yytext());
            }
          // fall through
          case 112: break;
          case 48:
            { tokens.add("DOUBLE: " + yytext()); 
        return new Symbol(sym.DOUBLE, yyline, yycolumn);
            }
          // fall through
          case 113: break;
          case 49:
            { tokens.add("MATRIZ_INT: " + yytext());
    return new Symbol(sym.MATRIZ_INT, yyline, yycolumn, yytext());
            }
          // fall through
          case 114: break;
          case 50:
            { tokens.add("ARREGLO_LONG: " + yytext());
    return new Symbol(sym.ARREGLO_LONG, yyline, yycolumn, yytext());
            }
          // fall through
          case 115: break;
          case 51:
            { tokens.add("BOOLEANO: " + yytext()); 
        return new Symbol(sym.BOOLEANO, yyline, yycolumn);
            }
          // fall through
          case 116: break;
          case 52:
            { tokens.add("MATRIZ_BYTE: " + yytext());
    return new Symbol(sym.MATRIZ_BYTE, yyline, yycolumn, yytext());
            }
          // fall through
          case 117: break;
          case 53:
            { tokens.add("MATRIZ_CARACTER: " + yytext());
    return new Symbol(sym.MATRIZ_CARACTER, yyline, yycolumn, yytext());
            }
          // fall through
          case 118: break;
          case 54:
            { tokens.add("SENTENCIA_ELSE_IF: " + yytext()); 
        return new Symbol(sym.SENTENCIA_ELSE_IF, yyline, yycolumn, yytext());
            }
          // fall through
          case 119: break;
          case 55:
            { tokens.add("ARREGLO_FLOAT: " + yytext());
    return new Symbol(sym.ARREGLO_FLOAT, yyline, yycolumn, yytext());
            }
          // fall through
          case 120: break;
          case 56:
            { tokens.add("MATRIZ_LONG: " + yytext());
    return new Symbol(sym.MATRIZ_LONG, yyline, yycolumn, yytext());
            }
          // fall through
          case 121: break;
          case 57:
            { tokens.add("ARREGLO_SHORT: " + yytext());
    return new Symbol(sym.ARREGLO_SHORT, yyline, yycolumn, yytext());
            }
          // fall through
          case 122: break;
          case 58:
            { tokens.add("ARREGLO_STRING: " + yytext());
    return new Symbol(sym.ARREGLO_STRING, yyline, yycolumn, yytext());
            }
          // fall through
          case 123: break;
          case 59:
            { tokens.add("ARREGLO_DOUBLE: " + yytext());
    return new Symbol(sym.ARREGLO_DOUBLE, yyline, yycolumn, yytext());
            }
          // fall through
          case 124: break;
          case 60:
            { tokens.add("MATRIZ_FLOAT: " + yytext());
    return new Symbol(sym.MATRIZ_FLOAT, yyline, yycolumn, yytext());
            }
          // fall through
          case 125: break;
          case 61:
            { tokens.add("MATRIZ_SHORT: " + yytext());
    return new Symbol(sym.MATRIZ_SHORT, yyline, yycolumn, yytext());
            }
          // fall through
          case 126: break;
          case 62:
            { tokens.add("MATRIZ_STRING: " + yytext());
    return new Symbol(sym.MATRIZ_STRING, yyline, yycolumn, yytext());
            }
          // fall through
          case 127: break;
          case 63:
            { tokens.add("ARREGLO_BOOLEANO: " + yytext());
    return new Symbol(sym.ARREGLO_BOOLEANO, yyline, yycolumn, yytext());
            }
          // fall through
          case 128: break;
          case 64:
            { tokens.add("MATRIZ_DOUBLE: " + yytext());
    return new Symbol(sym.MATRIZ_DOUBLE, yyline, yycolumn, yytext());
            }
          // fall through
          case 129: break;
          case 65:
            { tokens.add("MATRIZ_BOOLEANO: " + yytext());
    return new Symbol(sym.MATRIZ_BOOLEANO, yyline, yycolumn, yytext());
            }
          // fall through
          case 130: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
