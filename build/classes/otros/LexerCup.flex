package otros;

import java_cup.runtime.Symbol;

%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

Letra = [a-zA-Z_]+
Digito = [0-9]+
ContenidoString = \"([^\\\"]|\\\\[\"ntbrf])*\"
espacio = [ , \t, \r, \n]+

%{
    private Symbol simbolo(int tipo, Object valor) {
        return new Symbol(tipo, yyline, yycolumn, valor);
    }
    private Symbol simbolo(int tipo) {
            return new Symbol(tipo, yyline, yycolumn);
        }
%}

%%

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

byte {return new Symbol(sym.Byte, yychar, yyline, yytext());}
short {return new Symbol(sym.Short, yychar, yyline, yytext());}
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
long {return new Symbol(sym.Long, yychar, yyline, yytext());}
float {return new Symbol(sym.Float, yychar, yyline, yytext());}
double {return new Symbol(sym.Double, yychar, yyline, yytext());}
boolean {return new Symbol(sym.Boolean, yychar, yyline, yytext());}
char {return new Symbol(sym.Char, yychar, yyline, yytext());}
String {return new Symbol(sym.String, yychar, yyline, yytext());}

"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
"%" {return new Symbol(sym.Modulo, yychar, yyline, yytext());}
"++" {return new Symbol(sym.Incremento, yychar, yyline, yytext());}
"--" {return new Symbol(sym.Decremento, yychar, yyline, yytext());}

"=" {return new Symbol(sym.Igual, yychar, yyline, yytext());}
"+=" {return new Symbol(sym.Adicion, yychar, yyline, yytext());}
"-=" {return new Symbol(sym.Substraccion, yychar, yyline, yytext());}

"==" {return new Symbol(sym.IgualA, yychar, yyline, yytext());}
"!=" {return new Symbol(sym.DiferenteDe, yychar, yyline, yytext());}
">" {return new Symbol(sym.MayorQue, yychar, yyline, yytext());}
"<" {return new Symbol(sym.MenorQue, yychar, yyline, yytext());}
">=" {return new Symbol(sym.MayorIgual, yychar, yyline, yytext());}
"<=" {return new Symbol(sym.MenorIgual, yychar, yyline, yytext());}

"&&" {return new Symbol(sym.OperadorAND, yychar, yyline, yytext());}
"||" {return new Symbol(sym.OperadorOR, yychar, yyline, yytext());}
"!" {return new Symbol(sym.OperadorNOT, yychar, yyline, yytext());}

"(" {return new Symbol(sym.ParentesisAbierto, yychar, yyline, yytext());}
")" {return new Symbol(sym.ParentesisCerrado, yychar, yyline, yytext());}
"[" {return new Symbol(sym.CorcheteAbierto, yychar, yyline, yytext());}
"]" {return new Symbol(sym.CorcheteCerrado, yychar, yyline, yytext());}
"{" {return new Symbol(sym.LlaveAbierta, yychar, yyline, yytext());}
"}" {return new Symbol(sym.LlaveCerrada, yychar, yyline, yytext());}

";" {return new Symbol(sym.PuntoYComa, yychar, yyline, yytext());}
"," {return new Symbol(sym.Coma, yychar, yyline, yytext());}
"." {return new Symbol(sym.Punto, yychar, yyline, yytext());}
":" {return new Symbol(sym.DosPuntos, yychar, yyline, yytext());}

Math.max {return new Symbol(sym.MetodoMax, yychar, yyline, yytext());}
Math.min {return new Symbol(sym.MetodoMin, yychar, yyline, yytext());}
Math.sqrt {return new Symbol(sym.MetodoSqrt, yychar, yyline, yytext());}
Math.abs {return new Symbol(sym.MetodoAbs, yychar, yyline, yytext());}
Math.random {return new Symbol(sym.MetodoRandom, yychar, yyline, yytext());}

if {return new Symbol(sym.If, yychar, yyline, yytext());}
else {return new Symbol(sym.Else, yychar, yyline, yytext());}
"else if" {return new Symbol(sym.ElseIf, yychar, yyline, yytext());}
switch {return new Symbol(sym.Switch, yychar, yyline, yytext());}
case {return new Symbol(sym.Case, yychar, yyline, yytext());}
break {return new Symbol(sym.Break, yychar, yyline, yytext());}
default {return new Symbol(sym.Default, yychar, yyline, yytext());}

while {return new Symbol(sym.While, yychar, yyline, yytext());}
do {return new Symbol(sym.Do, yychar, yyline, yytext());}
for {return new Symbol(sym.For, yychar, yyline, yytext());}

byte\[\] | byte\s*\[\] {return new Symbol(sym.ArregloByte, yychar, yyline, yytext());}
short\[\] | short\s*\[\] {return new Symbol(sym.ArregloShort, yychar, yyline, yytext());}
int\[\] | int\s*\[\] {return new Symbol(sym.ArregloInt, yychar, yyline, yytext());}
long\[\] | long\s*\[\] {return new Symbol(sym.ArregloLong, yychar, yyline, yytext());}
float\[\] | float\s*\[\] {return new Symbol(sym.ArregloFloat, yychar, yyline, yytext());}
double\[\] | double\s*\[\] {return new Symbol(sym.ArregloDouble, yychar, yyline, yytext());}
boolean\[\] | boolean\s*\[\] {return new Symbol(sym.ArregloBoolean, yychar, yyline, yytext());}
char\[\] | char\s*\[\] {return new Symbol(sym.ArregloChar, yychar, yyline, yytext());}
String\[\] | String\s*\[\] {return new Symbol(sym.ArregloString, yychar, yyline, yytext());}

byte\[\]\[\] | byte\s*\[\]\[\] {return new Symbol(sym.ArregloMultByte, yychar, yyline, yytext());}
short\[\]\[\] | short\s*\[\]\[\] {return new Symbol(sym.ArregloMultShort, yychar, yyline, yytext());}
int\[\]\[\] | int\s*\[\]\[\] {return new Symbol(sym.ArregloMultInt, yychar, yyline, yytext());}
long\[\]\[\] | long\s*\[\]\[\] {return new Symbol(sym.ArregloMultLong, yychar, yyline, yytext());}
float\[\]\[\] | float\s*\[\]\[\] {return new Symbol(sym.ArregloMultFloat, yychar, yyline, yytext());}
double\[\]\[\] | double\s*\[\]\[\] {return new Symbol(sym.ArregloMultDouble, yychar, yyline, yytext());}
boolean\[\]\[\] | boolean\s*\[\]\[\] {return new Symbol(sym.ArregloMultBoolean, yychar, yyline, yytext());}
char\[\]\[\] | char\s*\[\]\[\] {return new Symbol(sym.ArregloMultChar, yychar, yyline, yytext());}
String\[\]\[\] | String\s*\[\]\[\] {return new Symbol(sym.ArregloMultString, yychar, yyline, yytext());}

public {return new Symbol(sym.Public, yychar, yyline, yytext());}
private {return new Symbol(sym.Private, yychar, yyline, yytext());}
protected {return new Symbol(Protected.For, yychar, yyline, yytext());}
final {return new Symbol(sym.Final, yychar, yyline, yytext());}
abstract {return new Symbol(sym.Abstract, yychar, yyline, yytext());}
static {return new Symbol(sym.Static, yychar, yyline, yytext());}
transient {return new Symbol(sym.Transient, yychar, yyline, yytext());}
syncronized {return new Symbol(sym.Syncronized, yychar, yyline, yytext());}
volatile {return new Symbol(sym.Volatile, yychar, yyline, yytext());}
import {return new Symbol(sym.Import, yychar, yyline, yytext());}
void {return new Symbol(sym.Void, yychar, yyline, yytext());}
return {return new Symbol(sym.Return, yychar, yyline, yytext());}
class {return new Symbol(sym.Class, yychar, yyline, yytext());}
interface {return new Symbol(sym.Interface, yychar, yyline, yytext());}
enum {return new Symbol(sym.Enum, yychar, yyline, yytext());}
extends {return new Symbol(sym.Extends, yychar, yyline, yytext());}
package {return new Symbol(sym.Package, yychar, yyline, yytext());}

try {return new Symbol(sym.Try, yychar, yyline, yytext());}
catch {return new Symbol(sym.Catch, yychar, yyline, yytext());}
finally {return new Symbol(sym.Finally, yychar, yyline, yytext());}
new {return new Symbol(sym.New, yychar, yyline, yytext());}
this {return new Symbol(sym.This, yychar, yyline, yytext());}
super {return new Symbol(sym.Super, yychar, yyline, yytext());}
null {return new Symbol(sym.Null, yychar, yyline, yytext());}

{Letra}({Letra}|{Digito})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("(-"{Digito}+")")|{Digito}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
{ContenidoString} {return new Symbol(sym.ContenidoDeString, yychar, yyline, yytext());}
 . {return ERROR;}