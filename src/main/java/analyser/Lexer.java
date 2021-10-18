// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: minijava.jflex

//JFlex is free software, and since version 1.5 published under the terms of a permissive BSD-style licnense (see below).

//There is absolutely NO WARRANTY for JFlex, its code and its documentation. Use at your own risk.

//The code generated by JFlex inherits the copyright of the specification it was produced from. If it was your specification, you may use the generated code without restriction.

//JFlex License
//Copyright © Gerwin Klein, Steve Rowe, Regis Decamp. All rights reserved.

//Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

//Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
//Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
//Neither the names of the authors nor the names of JFlex contributors may be used to endorse or promote products derived from this software without specific prior written permission.
//THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS “AS IS�? AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

// I did not modify JFlex




// I partially used and I adapted the code provided by: Technische Universitaet Muenchen Fakultaet fuer Informatik,  Michael Petter at http://www2.cs.tum.edu/projects/cup/examples.php


package analyser;
import model.types.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexer implements java_cup.runtime.Scanner, sym {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

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
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\5\1\6\1\0\1\7\1\0\1\10\1\0\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\0\1\17\1\20"+
    "\11\21\1\0\1\22\1\23\1\24\1\25\2\0\32\7"+
    "\1\0\1\26\2\0\1\27\1\0\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\7\1\41"+
    "\1\42\1\7\1\43\1\44\1\45\1\7\1\46\1\47"+
    "\1\50\1\51\1\7\1\52\1\7\1\53\1\7\1\54"+
    "\1\55\1\56\7\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
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
    "\2\0\1\1\2\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\2\15\1\16"+
    "\1\17\1\20\1\21\15\5\1\22\1\1\1\23\1\24"+
    "\1\25\1\26\1\0\1\27\1\30\1\31\1\32\1\33"+
    "\12\5\1\34\10\5\1\35\1\36\1\37\1\40\1\41"+
    "\7\5\1\42\2\5\1\43\13\5\1\44\2\5\1\45"+
    "\1\43\4\5\1\46\11\5\1\47\1\0\2\5\1\50"+
    "\1\51\7\5\1\52\1\5\1\53\1\5\1\54\25\5"+
    "\1\55\1\56\2\5\1\57\3\5\1\60\1\5\1\61"+
    "\1\62\3\5\1\63\10\5\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[176];
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
    "\0\0\0\57\0\136\0\136\0\215\0\274\0\136\0\353"+
    "\0\u011a\0\136\0\136\0\136\0\136\0\136\0\136\0\136"+
    "\0\136\0\u0149\0\136\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234"+
    "\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac"+
    "\0\u03db\0\u040a\0\u0439\0\136\0\u0468\0\136\0\u0497\0\136"+
    "\0\u04c6\0\u04f5\0\136\0\136\0\136\0\136\0\136\0\u0524"+
    "\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c"+
    "\0\u06cb\0\353\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5"+
    "\0\u0814\0\u0843\0\136\0\136\0\136\0\136\0\136\0\u0872"+
    "\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\353\0\u09bb"+
    "\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33"+
    "\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\353\0\u0c4d\0\u0c7c"+
    "\0\353\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\353\0\u0d96"+
    "\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e"+
    "\0\353\0\u0f3d\0\u0f6c\0\u0f9b\0\353\0\u0fca\0\u0ff9\0\u1028"+
    "\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u1113\0\136\0\u1142\0\353"+
    "\0\u1171\0\353\0\u11a0\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b"+
    "\0\u12ba\0\u12e9\0\u1318\0\u1347\0\u1376\0\u13a5\0\u13d4\0\u1403"+
    "\0\u1432\0\u1461\0\u1490\0\u14bf\0\u14ee\0\u151d\0\u154c\0\353"+
    "\0\353\0\u157b\0\u15aa\0\353\0\u15d9\0\u1608\0\u1637\0\353"+
    "\0\u1666\0\353\0\353\0\u1695\0\u16c4\0\u16f3\0\353\0\u1722"+
    "\0\u1751\0\u1780\0\u17af\0\u17de\0\u180d\0\u183c\0\u186b\0\353";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[176];
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
    "\1\3\2\4\1\0\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\3\2\10\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\10\1\35\3\10"+
    "\1\36\1\37\1\40\1\41\1\42\1\10\1\43\1\10"+
    "\1\44\1\45\1\46\2\47\1\3\1\47\1\0\1\47"+
    "\1\50\17\47\1\51\30\47\61\0\1\52\100\0\1\53"+
    "\41\0\1\10\10\0\2\10\5\0\25\10\13\0\1\54"+
    "\66\0\2\22\61\0\1\55\56\0\1\56\56\0\1\57"+
    "\41\0\1\10\10\0\2\10\5\0\15\10\1\60\7\10"+
    "\12\0\1\10\10\0\2\10\5\0\10\10\1\61\2\10"+
    "\1\62\11\10\12\0\1\10\10\0\2\10\5\0\5\10"+
    "\1\63\17\10\12\0\1\10\10\0\2\10\5\0\13\10"+
    "\1\64\1\65\10\10\12\0\1\10\10\0\2\10\5\0"+
    "\1\10\1\66\13\10\1\67\7\10\12\0\1\10\10\0"+
    "\2\10\5\0\5\10\1\70\7\10\1\71\7\10\12\0"+
    "\1\10\10\0\2\10\5\0\6\10\1\72\5\10\1\73"+
    "\10\10\12\0\1\10\10\0\2\10\5\0\16\10\1\74"+
    "\6\10\12\0\1\10\10\0\2\10\5\0\17\10\1\75"+
    "\5\10\12\0\1\10\10\0\2\10\5\0\5\10\1\76"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\21\10\1\77"+
    "\3\10\12\0\1\10\10\0\2\10\5\0\17\10\1\100"+
    "\5\10\12\0\1\10\10\0\2\10\5\0\10\10\1\101"+
    "\6\10\1\102\5\10\60\0\1\103\1\0\2\47\1\0"+
    "\1\47\1\0\1\47\1\0\17\47\1\0\30\47\6\0"+
    "\1\104\34\0\1\105\2\0\1\106\1\0\1\107\30\0"+
    "\1\4\43\0\1\10\10\0\2\10\5\0\15\10\1\110"+
    "\7\10\12\0\1\10\10\0\2\10\5\0\1\10\1\111"+
    "\23\10\12\0\1\10\10\0\2\10\5\0\15\10\1\112"+
    "\7\10\12\0\1\10\10\0\2\10\5\0\3\10\1\113"+
    "\21\10\12\0\1\10\10\0\2\10\5\0\20\10\1\114"+
    "\4\10\12\0\1\10\10\0\2\10\5\0\3\10\1\115"+
    "\21\10\12\0\1\10\10\0\2\10\5\0\13\10\1\116"+
    "\11\10\12\0\1\10\10\0\2\10\5\0\17\10\1\117"+
    "\5\10\12\0\1\10\10\0\2\10\5\0\14\10\1\120"+
    "\10\10\12\0\1\10\10\0\2\10\5\0\21\10\1\121"+
    "\3\10\12\0\1\10\10\0\2\10\5\0\21\10\1\122"+
    "\3\10\12\0\1\10\10\0\2\10\5\0\5\10\1\123"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\11\10\1\124"+
    "\13\10\12\0\1\10\10\0\2\10\5\0\1\10\1\125"+
    "\23\10\12\0\1\10\10\0\2\10\5\0\17\10\1\126"+
    "\5\10\12\0\1\10\10\0\2\10\5\0\22\10\1\127"+
    "\2\10\12\0\1\10\10\0\2\10\5\0\11\10\1\130"+
    "\13\10\12\0\1\10\10\0\2\10\5\0\11\10\1\131"+
    "\13\10\12\0\1\10\10\0\2\10\5\0\13\10\1\132"+
    "\11\10\12\0\1\10\10\0\2\10\5\0\14\10\1\133"+
    "\10\10\12\0\1\10\10\0\2\10\5\0\20\10\1\134"+
    "\4\10\12\0\1\10\10\0\2\10\5\0\17\10\1\135"+
    "\5\10\12\0\1\10\10\0\2\10\5\0\5\10\1\136"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\17\10\1\137"+
    "\5\10\12\0\1\10\10\0\2\10\5\0\20\10\1\127"+
    "\4\10\12\0\1\10\10\0\2\10\5\0\5\10\1\140"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\15\10\1\141"+
    "\7\10\12\0\1\10\3\0\1\142\4\0\2\10\5\0"+
    "\25\10\12\0\1\10\10\0\2\10\5\0\14\10\1\143"+
    "\10\10\12\0\1\10\10\0\2\10\5\0\14\10\1\144"+
    "\10\10\12\0\1\10\10\0\2\10\5\0\4\10\1\145"+
    "\20\10\12\0\1\10\10\0\2\10\5\0\11\10\1\146"+
    "\13\10\12\0\1\10\10\0\2\10\5\0\5\10\1\147"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\13\10\1\150"+
    "\11\10\12\0\1\10\10\0\2\10\5\0\21\10\1\151"+
    "\3\10\12\0\1\10\10\0\2\10\5\0\5\10\1\152"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\7\10\1\153"+
    "\15\10\12\0\1\10\10\0\2\10\5\0\5\10\1\154"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\24\10\1\155"+
    "\12\0\1\10\10\0\2\10\5\0\24\10\1\156\12\0"+
    "\1\10\10\0\2\10\5\0\17\10\1\157\5\10\16\0"+
    "\1\142\52\0\1\10\10\0\2\10\5\0\1\160\24\10"+
    "\12\0\1\10\10\0\2\10\5\0\21\10\1\161\3\10"+
    "\12\0\1\10\1\0\1\162\6\0\2\10\5\0\1\163"+
    "\24\10\12\0\1\10\10\0\2\10\5\0\14\10\1\164"+
    "\10\10\12\0\1\10\10\0\2\10\5\0\5\10\1\165"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\5\10\1\166"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\1\10\1\167"+
    "\23\10\12\0\1\10\10\0\2\10\5\0\5\10\1\170"+
    "\17\10\12\0\1\10\10\0\2\10\5\0\1\171\24\10"+
    "\12\0\1\10\10\0\2\10\5\0\16\10\1\172\6\10"+
    "\12\0\1\10\10\0\2\10\5\0\16\10\1\173\6\10"+
    "\12\0\1\10\10\0\2\10\5\0\1\10\1\174\23\10"+
    "\12\0\1\10\10\0\2\10\5\0\6\10\1\175\16\10"+
    "\15\0\1\176\53\0\1\10\10\0\2\10\5\0\6\10"+
    "\1\177\16\10\12\0\1\10\10\0\2\10\5\0\7\10"+
    "\1\200\15\10\12\0\1\10\10\0\2\10\5\0\1\201"+
    "\24\10\12\0\1\10\10\0\2\10\5\0\14\10\1\202"+
    "\10\10\12\0\1\10\10\0\2\10\5\0\1\203\24\10"+
    "\12\0\1\10\10\0\2\10\5\0\6\10\1\204\16\10"+
    "\12\0\1\10\10\0\2\10\5\0\21\10\1\205\3\10"+
    "\12\0\1\10\10\0\2\10\5\0\21\10\1\206\3\10"+
    "\12\0\1\10\10\0\2\10\5\0\21\10\1\207\3\10"+
    "\12\0\1\10\10\0\2\10\5\0\11\10\1\210\13\10"+
    "\12\0\1\10\10\0\2\10\5\0\11\10\1\211\13\10"+
    "\12\0\1\10\10\0\2\10\5\0\6\10\1\212\16\10"+
    "\12\0\1\10\10\0\2\10\5\0\20\10\1\213\4\10"+
    "\12\0\1\10\10\0\2\10\5\0\11\10\1\214\13\10"+
    "\12\0\1\10\10\0\2\10\5\0\1\215\24\10\12\0"+
    "\1\10\10\0\2\10\5\0\1\216\24\10\12\0\1\10"+
    "\10\0\2\10\5\0\5\10\1\217\17\10\12\0\1\10"+
    "\10\0\2\10\5\0\13\10\1\220\11\10\12\0\1\10"+
    "\10\0\2\10\5\0\13\10\1\221\11\10\12\0\1\10"+
    "\10\0\2\10\5\0\11\10\1\222\13\10\12\0\1\10"+
    "\10\0\2\10\5\0\21\10\1\223\3\10\12\0\1\10"+
    "\10\0\2\10\5\0\13\10\1\224\11\10\12\0\1\10"+
    "\10\0\2\10\5\0\17\10\1\225\5\10\12\0\1\10"+
    "\10\0\2\10\5\0\17\10\1\226\5\10\12\0\1\10"+
    "\10\0\2\10\5\0\1\227\24\10\12\0\1\10\10\0"+
    "\2\10\5\0\5\10\1\230\17\10\12\0\1\10\10\0"+
    "\2\10\5\0\5\10\1\231\17\10\12\0\1\10\10\0"+
    "\2\10\5\0\13\10\1\232\11\10\12\0\1\10\10\0"+
    "\2\10\5\0\1\10\1\233\23\10\12\0\1\10\10\0"+
    "\2\10\5\0\5\10\1\234\17\10\12\0\1\10\10\0"+
    "\2\10\5\0\20\10\1\235\4\10\12\0\1\10\10\0"+
    "\2\10\5\0\20\10\1\236\4\10\12\0\1\10\10\0"+
    "\2\10\5\0\17\10\1\237\5\10\12\0\1\10\10\0"+
    "\2\10\5\0\5\10\1\240\17\10\12\0\1\10\10\0"+
    "\2\10\5\0\21\10\1\241\3\10\12\0\1\10\10\0"+
    "\2\10\5\0\1\10\1\242\23\10\12\0\1\10\10\0"+
    "\2\10\5\0\1\10\1\243\23\10\12\0\1\10\10\0"+
    "\2\10\5\0\20\10\1\244\4\10\12\0\1\10\10\0"+
    "\2\10\5\0\22\10\1\245\2\10\12\0\1\10\10\0"+
    "\2\10\5\0\1\10\1\246\23\10\12\0\1\10\10\0"+
    "\2\10\5\0\20\10\1\247\4\10\12\0\1\10\10\0"+
    "\2\10\5\0\1\250\24\10\12\0\1\10\10\0\2\10"+
    "\5\0\12\10\1\251\12\10\12\0\1\10\10\0\2\10"+
    "\5\0\5\10\1\252\17\10\12\0\1\10\10\0\2\10"+
    "\5\0\24\10\1\253\12\0\1\10\10\0\2\10\5\0"+
    "\1\254\24\10\12\0\1\10\10\0\2\10\5\0\16\10"+
    "\1\255\6\10\12\0\1\10\10\0\2\10\5\0\1\10"+
    "\1\256\23\10\12\0\1\10\10\0\2\10\5\0\11\10"+
    "\1\257\13\10\12\0\1\10\10\0\2\10\5\0\17\10"+
    "\1\260\5\10\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6298];
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
    "\2\0\2\11\2\1\1\11\2\1\10\11\1\1\1\11"+
    "\20\1\1\11\1\1\1\11\1\1\1\11\1\1\1\0"+
    "\5\11\23\1\5\11\52\1\1\0\13\1\1\11\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[176];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

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
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    StringBuffer string = new StringBuffer();
    public Lexer(java.io.Reader in, ComplexSymbolFactory sf){
	this(in);
	symbolFactory = sf;
    }
    ComplexSymbolFactory symbolFactory;

  private Symbol symbol(String name, int sym) {
        return symbolFactory.newSymbol(name, sym, new Location(yyline+1,yycolumn+1,(int)yychar), new Location(yyline+1,yycolumn+yylength(),(int)(yychar+yylength())));
    }

    private Symbol symbol(String name, int sym, Object val) {
        Location left = new Location(yyline+1,yycolumn+1,(int)yychar);
        Location right= new Location(yyline+1,yycolumn+yylength(), (int)(yychar+yylength()));
        return symbolFactory.newSymbol(name, sym, left, right,val);
    }
    private Symbol symbol(String name, int sym, Object val,int buflength) {
        Location left = new Location(yyline+1,yycolumn+yylength()-buflength,(int)(yychar+yylength()-buflength));
        Location right= new Location(yyline+1,yycolumn+yylength(), (int)(yychar+yylength()));
        return symbolFactory.newSymbol(name, sym, left, right,val);
    }
    private void error(String message) {
      System.out.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
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
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

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
          {     return symbolFactory.newSymbol("EOF", EOF, new Location(yyline+1,yycolumn+1,(int)yychar), new Location(yyline+1,yycolumn+1,(int)(yychar+1)));
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* throw new Error("Illegal character <"+ yytext()+">");*/
		    error("Illegal character <"+ yytext()+">");
            }
            // fall through
          case 53: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 54: break;
          case 3:
            { return symbol("not",BUNOP,"NOT");
            }
            // fall through
          case 55: break;
          case 4:
            { string.setLength(0); yybegin(STRING);
            }
            // fall through
          case 56: break;
          case 5:
            { return symbol("Identifier",IDENT, yytext());
            }
            // fall through
          case 57: break;
          case 6:
            { return symbol("(",LPAR);
            }
            // fall through
          case 58: break;
          case 7:
            { return symbol(")",RPAR);
            }
            // fall through
          case 59: break;
          case 8:
            { return symbol("mul",BINOPPRIORITY1, '*'  );
            }
            // fall through
          case 60: break;
          case 9:
            { return symbol("plus",BINOPPRIORITY2,'+'  );
            }
            // fall through
          case 61: break;
          case 10:
            { return symbol("comma",COMMA);
            }
            // fall through
          case 62: break;
          case 11:
            { return symbol("minus",BINOPPRIORITY2, '-'  );
            }
            // fall through
          case 63: break;
          case 12:
            { return symbol("div",BINOPPRIORITY1, '/'  );
            }
            // fall through
          case 64: break;
          case 13:
            { return symbol("Intconst",INTCONST, new Integer(Integer.parseInt(yytext())));
            }
            // fall through
          case 65: break;
          case 14:
            { return symbol("semicolon",SEMICOLON);
            }
            // fall through
          case 66: break;
          case 15:
            { return symbol("less",COMP,  "<"   );
            }
            // fall through
          case 67: break;
          case 16:
            { return symbol("=",ASSIGN);
            }
            // fall through
          case 68: break;
          case 17:
            { return symbol("gt",COMP,  ">"   );
            }
            // fall through
          case 69: break;
          case 18:
            { return symbol("{",BEGIN);
            }
            // fall through
          case 70: break;
          case 19:
            { return symbol("}",END);
            }
            // fall through
          case 71: break;
          case 20:
            { string.append( yytext() );
            }
            // fall through
          case 72: break;
          case 21:
            { yybegin(YYINITIAL); 
      return symbol("StringConst",STRINGCONST,string.toString(),string.length());
            }
            // fall through
          case 73: break;
          case 22:
            { string.append('\\');
            }
            // fall through
          case 74: break;
          case 23:
            { return symbol("neq",COMP,  "!="  );
            }
            // fall through
          case 75: break;
          case 24:
            { return symbol("and",BBINOP,"and"  );
            }
            // fall through
          case 76: break;
          case 25:
            { return symbol("leq",COMP,  "<="  );
            }
            // fall through
          case 77: break;
          case 26:
            { return symbol("eq",COMP,  "=="   );
            }
            // fall through
          case 78: break;
          case 27:
            { return symbol("geq",COMP,  ">="  );
            }
            // fall through
          case 79: break;
          case 28:
            { return symbol("if",IF);
            }
            // fall through
          case 80: break;
          case 29:
            { return symbol("or",BBINOP,"or"   );
            }
            // fall through
          case 81: break;
          case 30:
            { string.append('\"');
            }
            // fall through
          case 82: break;
          case 31:
            { string.append('\n');
            }
            // fall through
          case 83: break;
          case 32:
            { string.append('\r');
            }
            // fall through
          case 84: break;
          case 33:
            { string.append('\t');
            }
            // fall through
          case 85: break;
          case 34:
            { return symbol("for",FOR);
            }
            // fall through
          case 86: break;
          case 35:
            { //System.out.println("yytext().length()"+yytext().length());
                        Type type = new IntType();

                        for(int i=0; i<yytext().length()-3;i++){
                            type = new RefType(type);
                        }
                        return symbol("int",TYPE, type );
            }
            // fall through
          case 87: break;
          case 36:
            { return symbol("else",ELSE);
            }
            // fall through
          case 88: break;
          case 37:
            { return symbol("goto",GOTO);
            }
            // fall through
          case 89: break;
          case 38:
            { return symbol("Boolconst",BOOLCONST, new Boolean(yytext()));
            }
            // fall through
          case 90: break;
          case 39:
            { return symbol("print",PRINT);
            }
            // fall through
          case 91: break;
          case 40:
            { return symbol("while",WHILE);
            }
            // fall through
          case 92: break;
          case 41:
            { return symbol("write",WRITE);
            }
            // fall through
          case 93: break;
          case 42:
            { return symbol("read",READ);
            }
            // fall through
          case 94: break;
          case 43:
            { return symbol("string",TYPE, new StringType() );
            }
            // fall through
          case 95: break;
          case 44:
            { return symbol("boolean",TYPE, new BoolType() );
            }
            // fall through
          case 96: break;
          case 45:
            { return symbol("open_file",OPEN_FILE);
            }
            // fall through
          case 97: break;
          case 46:
            { return symbol("read_file",READ_FILE);
            }
            // fall through
          case 98: break;
          case 47:
            { return symbol("close_file",CLOSE_FILE);
            }
            // fall through
          case 99: break;
          case 48:
            { return symbol("write_file",WRITE_FILE);
            }
            // fall through
          case 100: break;
          case 49:
            { return symbol("decrypt_rsa",DECRYPT_RSA);
            }
            // fall through
          case 101: break;
          case 50:
            { return symbol("encrypt_rsa",ENCRYPT_RSA);
            }
            // fall through
          case 102: break;
          case 51:
            { return symbol("change_status",CHANGE_STATUS);
            }
            // fall through
          case 103: break;
          case 52:
            { return symbol("generate_rsa_key_pair",GENERATE_RSA_KEY_PAIR);
            }
            // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}