package otros;

import modelos.Token;
import static modelos.Token.*;

%%
%class Lexer
%type Token

Letra = [a-zA-Z_]+
Digito = [0-9]+
ContenidoString = \"([^\\\"]|\\\\[\"ntbrf])*\"
espacio = [ , \t, \r]+

%{
    public String lexema;
%}

%%

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"\n" {lexema = yytext(); return SaltoLinea;}

byte {lexema = yytext(); return Byte;}
short {lexema = yytext(); return Short;}
int {lexema = yytext(); return Int;}
long {lexema = yytext(); return Long;}
float {lexema = yytext(); return Float;}
double {lexema = yytext(); return Double;}
boolean {lexema = yytext(); return Boolean;}
char {lexema = yytext(); return Char;}
String {lexema = yytext(); return String;}

"+" {lexema = yytext(); return Suma;}
"-" {lexema = yytext(); return Resta;}
"*" {lexema = yytext(); return Multiplicacion;}
"/" {lexema = yytext(); return Division;}
"%" {lexema = yytext(); return Modulo;}
"++" {lexema = yytext(); return Incremento;}
"--" {lexema = yytext(); return Decremento;}

"=" {lexema = yytext(); return Igual;}
"+=" {lexema = yytext(); return Adicion;}
"-=" {lexema = yytext(); return Substraccion;}

"==" {lexema = yytext(); return IgualA;}
"!=" {lexema = yytext(); return DiferenteDe;}
">" {lexema = yytext(); return MayorQue;}
"<" {lexema = yytext(); return MenorQue;}
">=" {lexema = yytext(); return MayorIgual;}
"<=" {lexema = yytext(); return MenorIgual;}

"&&" {lexema = yytext(); return OperadorAND;}
"||" {lexema = yytext(); return OperadorOR;}
"!" {lexema = yytext(); return OperadorNOT;}

"(" {lexema = yytext(); return ParentesisAbierto;}
")" {lexema = yytext(); return ParentesisCerrado;}
"[" {lexema = yytext(); return CorcheteAbierto;}
"]" {lexema = yytext(); return CorcheteCerrado;}
"{" {lexema = yytext(); return LlaveAbierta;}
"}" {lexema = yytext(); return LlaveCerrada;}

";" {lexema = yytext(); return PuntoYComa;}
"," {lexema = yytext(); return Coma;}
"." {lexema = yytext(); return Punto;}
":" {lexema = yytext(); return DosPuntos;}

Math.max {lexema = yytext(); return MetodoMax;}
Math.min {lexema = yytext(); return MetodoMin;}
Math.sqrt {lexema = yytext(); return MetodoSqrt;}
Math.abs {lexema = yytext(); return MetodoAbs;}
Math.random {lexema = yytext(); return MetodoRandom;}

if {lexema = yytext(); return If;}
else {lexema = yytext(); return Else;}
"else if" {lexema = yytext(); return ElseIf;}
switch {lexema = yytext(); return Switch;}
case {lexema = yytext(); return Case;}
break {lexema = yytext(); return Break;}
default {lexema = yytext(); return Default;}

while {lexema = yytext(); return While;}
do {lexema = yytext(); return Do;}
for {lexema = yytext(); return For;}

byte\[\] | byte\s*\[\] {lexema = yytext(); return ArregloByte;}
short\[\] | short\s*\[\] {lexema = yytext(); return ArregloShort;}
int\[\] | int\s*\[\] {lexema = yytext(); return ArregloInt;}
long\[\] | long\s*\[\] {lexema = yytext(); return ArregloLong;}
float\[\] | float\s*\[\] {lexema = yytext(); return ArregloFloat;}
double\[\] | double\s*\[\] {lexema = yytext(); return ArregloDouble;}
boolean\[\] | boolean\s*\[\] {lexema = yytext(); return ArregloBoolean;}
char\[\] | char\s*\[\] {lexema = yytext(); return ArregloChar;}
String\[\] | String\s*\[\] {lexema = yytext(); return ArregloString;}

byte\[\]\[\] | byte\s*\[\]\[\] {lexema = yytext(); return ArregloMultByte;}
short\[\]\[\] | short\s*\[\]\[\] {lexema = yytext(); return ArregloMultShort;}
int\[\]\[\] | int\s*\[\]\[\] {lexema = yytext(); return ArregloMultInt;}
long\[\]\[\] | long\s*\[\]\[\] {lexema = yytext(); return ArregloMultLong;}
float\[\]\[\] | float\s*\[\]\[\] {lexema = yytext(); return ArregloMultFloat;}
double\[\]\[\] | double\s*\[\]\[\] {lexema = yytext(); return ArregloMultDouble;}
boolean\[\]\[\] | boolean\s*\[\]\[\] {lexema = yytext(); return ArregloMultBoolean;}
char\[\]\[\] | char\s*\[\]\[\] {lexema = yytext(); return ArregloMultChar;}
String\[\]\[\] | String\s*\[\]\[\] {lexema = yytext(); return ArregloMultString;}

public {lexema = yytext(); return Public;}
private {lexema = yytext(); return Private;}
protected {lexema = yytext(); return Protected;}
final {lexema = yytext(); return Final;}
abstract {lexema = yytext(); return Abstract;}
static {lexema = yytext(); return Static;}
transient {lexema = yytext(); return Transient;}
syncronized {lexema = yytext(); return Syncronized;}
volatile {lexema = yytext(); return Volatile;}
import {lexema = yytext(); return Import;}
void {lexema = yytext(); return Void;}
return {lexema = yytext(); return Return;}
class {lexema = yytext(); return Class;}
interface {lexema = yytext(); return Interface;}
enum {lexema = yytext(); return Enum;}
extends {lexema = yytext(); return Extends;}
package {lexema = yytext(); return Package;}

try {lexema = yytext(); return Try;}
catch {lexema = yytext(); return Catch;}
finally {lexema = yytext(); return Finally;}
new {lexema = yytext(); return New;}
this {lexema = yytext(); return This;} 
super {lexema = yytext(); return Super;}
null {lexema = yytext(); return Null;}

{Letra}({Letra} | {Digito})* {lexema = yytext(); return Identificador;}
("(-"{Digito}+")") | {Digito}+ {lexema = yytext(); return Numero;}
{ContenidoString} {lexema = yytext(); return ContenidoDeString;}
 . {return ERROR;}