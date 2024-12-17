package lexico;
import java_cup.runtime.Symbol;
import sintactico.sym;

%%

%public
%class Lexico
%unicode
%cup
%line
%column

%{
    private java.util.ArrayList<String> tokens = new java.util.ArrayList<>();
    public java.util.List<String> obtenerTokens() { return tokens; }
%}

saltoDeLinea = \r|\n|\r\n
espacioEnBlanco = {saltoDeLinea} | [ \t\f]
identificador = [a-zA-Z_][a-zA-Z_0-9]*
numero = [0-9]+
tipoDato = "byte" | "short" | "int" | "long" | "float" | "double" | "boolean" | "char" | "String"

%%

{espacioEnBlanco} { }

/* Tipos de dato */
"byte"   
    { 
        tokens.add("ENTERO: " + yytext()); 
        return new Symbol(sym.ENTERO, yyline, yycolumn); 
    }
"short"    
    { 
        tokens.add("ENTERO: " + yytext()); 
        return new Symbol(sym.ENTERO, yyline, yycolumn); 
    }
"int"    
    { 
        tokens.add("ENTERO: " + yytext()); 
        return new Symbol(sym.ENTERO, yyline, yycolumn); 
    }
"long"    
    { 
        tokens.add("ENTERO: " + yytext()); 
        return new Symbol(sym.ENTERO, yyline, yycolumn); 
    }
"float"    
    { 
        tokens.add("FLOTANTE: " + yytext()); 
        return new Symbol(sym.FLOTANTE, yyline, yycolumn); 
    }
"double"    
    { 
        tokens.add("FLOTANTE: " + yytext()); 
        return new Symbol(sym.FLOTANTE, yyline, yycolumn); 
    }
"boolean"    
    { 
        tokens.add("BOOLEANO: " + yytext()); 
        return new Symbol(sym.BOOLEANO, yyline, yycolumn); 
    }
"char"    
    { 
        tokens.add("CARACTER: " + yytext()); 
        return new Symbol(sym.CARACTER, yyline, yycolumn); 
    }
"String"    
    { 
        tokens.add("CADENA: " + yytext()); 
        return new Symbol(sym.CADENA, yyline, yycolumn); 
    }

/* Valores de tipos */
{identificador}    
    { 
        tokens.add("IDENTIFICADOR: " + yytext()); 
        return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext()); 
    }
{numero}    
    { 
        tokens.add("NUMERO: " + yytext()); 
        return new Symbol(sym.NUMERO, yyline, yycolumn, Integer.parseInt(yytext())); 
    }
[0-9]+\.[0-9]+ 
    { 
        tokens.add("NUMERO_FLOTANTE: " + yytext()); 
        return new Symbol(sym.NUMERO_FLOTANTE, yyline, yycolumn, Float.parseFloat(yytext())); 
    }
true|false 
    {
        tokens.add("VALOR_BOOLEANO: " + yytext());
        return new Symbol(sym.VALOR_BOOLEANO, yyline, yycolumn, Boolean.parseBoolean(yytext()));
    }
\'[^']\' 
    {
        tokens.add("VALOR_CARACTER: " + yytext());
        return new Symbol(sym.VALOR_CARACTER, yyline, yycolumn, yytext().charAt(1));
    }
\"[^\"]*\" 
    {
        tokens.add("VALOR_CADENA: " + yytext());
        return new Symbol(sym.VALOR_CADENA, yyline, yycolumn, yytext().substring(1, yytext().length() - 1));
    }

/* Arreglo y Matriz de tipos de dato */
{tipoDato}\\[\\]
{
    tokens.add("ARREGLO: " + yytext());
    return new Symbol(sym.ARREGLO, yyline, yycolumn, yytext());
}
{tipoDato}\\[\\]+
{
    tokens.add("MATRIZ: " + yytext());
    return new Symbol(sym.MATRIZ, yyline, yycolumn, yytext());
}

/* Operadores */
"+"
    {
        tokens.add("OPERADOR: " + yytext()); 
        return new Symbol(sym.OPERADOR, yyline, yycolumn, yytext()); 
    }
"-"  
    {
        tokens.add("OPERADOR: " + yytext()); 
        return new Symbol(sym.OPERADOR, yyline, yycolumn, yytext()); 
    }
"*"  
    {
        tokens.add("OPERADOR: " + yytext()); 
        return new Symbol(sym.OPERADOR, yyline, yycolumn, yytext()); 
    }
"/"  
    {
        tokens.add("OPERADOR: " + yytext()); 
        return new Symbol(sym.OPERADOR, yyline, yycolumn, yytext()); 
    }
"%"  
    {
        tokens.add("OPERADOR: " + yytext()); 
        return new Symbol(sym.OPERADOR, yyline, yycolumn, yytext()); 
    }
"++" 
    {
        tokens.add("OPERADOR_INCREMENTO: " + yytext()); 
        return new Symbol(sym.OPERADOR_INCREMENTO, yyline, yycolumn, yytext()); 
    }
"--" 
    {
        tokens.add("OPERADOR_DECREMENTO: " + yytext()); 
        return new Symbol(sym.OPERADOR_DECREMENTO, yyline, yycolumn, yytext()); 
    }

/* Operadores de asignacion */
"=" 
    {
        tokens.add("OPERADOR_DE_ASIGNACION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_ASIGNACION, yyline, yycolumn, yytext()); 
    }
"+=" 
    {
        tokens.add("OPERADOR_DE_ADICION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_ADICION, yyline, yycolumn, yytext()); 
    }
"-=" 
    {
        tokens.add("OPERADOR_DE_SUSTRACCION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_SUSTRACCION, yyline, yycolumn, yytext()); 
    }

/* Operadores de comparacion */
"==" 
    {
        tokens.add("OPERADOR_IGUAL_A: " + yytext()); 
        return new Symbol(sym.OPERADOR_IGUAL_A, yyline, yycolumn, yytext()); 
    }
"!=" 
    {
        tokens.add("OPERADOR_DIFERENTE_DE: " + yytext()); 
        return new Symbol(sym.OPERADOR_DIFERENTE_DE, yyline, yycolumn, yytext()); 
    }
">" 
    {
        tokens.add("OPERADOR_MAYOR_QUE: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAYOR_QUE, yyline, yycolumn, yytext()); 
    }
"<" 
    {
        tokens.add("OPERADOR_MENOR_QUE: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOR_QUE, yyline, yycolumn, yytext()); 
    }
">=" 
    {
        tokens.add("OPERADOR_MAYOR_IGUAL: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAYOR_IGUAL, yyline, yycolumn, yytext()); 
    }
"<=" 
    {
        tokens.add("OPERADOR_MENOR_IGUAL: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOR_IGUAL, yyline, yycolumn, yytext()); 
    }

/* Operadores logicos */
"&&" 
    {
        tokens.add("OPERADOR_AND: " + yytext()); 
        return new Symbol(sym.OPERADOR_AND, yyline, yycolumn, yytext()); 
    }
"||" 
    {
        tokens.add("OPERADOR_OR: " + yytext()); 
        return new Symbol(sym.OPERADOR_OR, yyline, yycolumn, yytext()); 
    }
"!" 
    {
        tokens.add("OPERADOR_NOT: " + yytext()); 
        return new Symbol(sym.OPERADOR_NOT, yyline, yycolumn, yytext()); 
    }

/* Sentencias */
"else if" 
    {
        tokens.add("SENTENCIA_ELSE_IF: " + yytext()); 
        return new Symbol(sym.SENTENCIA_ELSE_IF, yyline, yycolumn, yytext()); 
    }
"if" 
    {
        tokens.add("SENTENCIA_IF: " + yytext()); 
        return new Symbol(sym.SENTENCIA_IF, yyline, yycolumn, yytext()); 
    }
"else" 
    {
        tokens.add("SENTENCIA_ELSE: " + yytext()); 
        return new Symbol(sym.SENTENCIA_ELSE, yyline, yycolumn, yytext()); 
    }
"switch" 
    {
        tokens.add("SENTENCIA_SWITCH: " + yytext()); 
        return new Symbol(sym.SENTENCIA_SWITCH, yyline, yycolumn, yytext()); 
    }
"case" 
    {
        tokens.add("SENTENCIA_CASE: " + yytext()); 
        return new Symbol(sym.SENTENCIA_CASE, yyline, yycolumn, yytext()); 
    }
"break" 
    {
        tokens.add("SENTENCIA_BREAK: " + yytext()); 
        return new Symbol(sym.SENTENCIA_BREAK, yyline, yycolumn, yytext()); 
    }
"continue" 
    {
        tokens.add("SENTENCIA_CONTINUE: " + yytext()); 
        return new Symbol(sym.SENTENCIA_CONTINUE, yyline, yycolumn, yytext()); 
    }
"default" 
    {
        tokens.add("SENTENCIA_DEFAULT: " + yytext()); 
        return new Symbol(sym.SENTENCIA_DEFAULT, yyline, yycolumn, yytext()); 
    }

/* Ciclos */
"while" 
    {
        tokens.add("CICLO_WHILE: " + yytext()); 
        return new Symbol(sym.CICLO_WHILE, yyline, yycolumn, yytext()); 
    }
"do" 
    {
        tokens.add("CICLO_DO: " + yytext()); 
        return new Symbol(sym.CICLO_DO, yyline, yycolumn, yytext()); 
    }
"for" 
    {
        tokens.add("CICLO_FOR: " + yytext()); 
        return new Symbol(sym.CICLO_FOR, yyline, yycolumn, yytext()); 
    }

/*  Palabras reservadas */
"public"
    {
        tokens.add("RESERVADA_PUBLIC: " + yytext()); 
        return new Symbol(sym.RESERVADA_PUBLIC, yyline, yycolumn, yytext()); 
    }
"private"
    {
        tokens.add("RESERVADA_PRIVATE: " + yytext()); 
        return new Symbol(sym.RESERVADA_PRIVATE, yyline, yycolumn, yytext()); 
    }
"protected"
    {
        tokens.add("RESERVADA_PROTECTED: " + yytext()); 
        return new Symbol(sym.RESERVADA_PROTECTED, yyline, yycolumn, yytext()); 
    }
"final"
    {
        tokens.add("RESERVADA_FINAL: " + yytext()); 
        return new Symbol(sym.RESERVADA_FINAL, yyline, yycolumn, yytext()); 
    }
"static"
    {
        tokens.add("RESERVADA_STATIC: " + yytext()); 
        return new Symbol(sym.RESERVADA_STATIC, yyline, yycolumn, yytext()); 
    }
"class"
    {
        tokens.add("RESERVADA_CLASS: " + yytext()); 
        return new Symbol(sym.RESERVADA_CLASS, yyline, yycolumn, yytext()); 
    }
"void"
    {
        tokens.add("RESERVADA_VOID: " + yytext()); 
        return new Symbol(sym.RESERVADA_VOID, yyline, yycolumn, yytext()); 
    }
"return"
    {
        tokens.add("RESERVADA_RETURN: " + yytext()); 
        return new Symbol(sym.RESERVADA_RETURN, yyline, yycolumn, yytext()); 
    }
"package"
    {
        tokens.add("RESERVADA_IMPORT: " + yytext()); 
        return new Symbol(sym.RESERVADA_IMPORT, yyline, yycolumn, yytext()); 
    }
"import"
    {
        tokens.add("RESERVADA_IMPORT: " + yytext()); 
        return new Symbol(sym.RESERVADA_IMPORT, yyline, yycolumn, yytext()); 
    }

/* Signos de puntuacion */
"."
    {
        tokens.add("SIGNO_PUNTO: " + yytext()); 
        return new Symbol(sym.SIGNO_PUNTO, yyline, yycolumn, yytext()); 
    }
","
    {
        tokens.add("SIGNO_COMA: " + yytext()); 
        return new Symbol(sym.SIGNO_COMA, yyline, yycolumn, yytext()); 
    }
";"
    {
        tokens.add("SIGNO_PUNTO_Y_COMA: " + yytext()); 
        return new Symbol(sym.SIGNO_PUNTO_Y_COMA, yyline, yycolumn, yytext()); 
    }
":"
    {
        tokens.add("SIGNO_DOS_PUNTOS: " + yytext()); 
        return new Symbol(sym.SIGNO_DOS_PUNTOS, yyline, yycolumn, yytext()); 
    }

/* Signos de agrupacion */
"("
    {
        tokens.add("PARENTESIS_ABIERTO: " + yytext()); 
        return new Symbol(sym.PARENTESIS_ABIERTO, yyline, yycolumn, yytext()); 
    }
")"
    {
        tokens.add("PARENTESIS_CERRADO: " + yytext()); 
        return new Symbol(sym.PARENTESIS_CERRADO, yyline, yycolumn, yytext()); 
    }
"["
    {
        tokens.add("CORCHETE_ABIERTO: " + yytext()); 
        return new Symbol(sym.CORCHETE_ABIERTO, yyline, yycolumn, yytext()); 
    }
"]"
    {
        tokens.add("CORCHETE_CERRADO: " + yytext()); 
        return new Symbol(sym.CORCHETE_CERRADO, yyline, yycolumn, yytext()); 
    }
"{"
    {
        tokens.add("LLAVE_ABIERTA: " + yytext()); 
        return new Symbol(sym.LLAVE_ABIERTA, yyline, yycolumn, yytext()); 
    }
"}"
    {
        tokens.add("LLAVE_CERRADA: " + yytext()); 
        return new Symbol(sym.LLAVE_CERRADA, yyline, yycolumn, yytext()); 
    }

/* Error */
[^\r\n] 
{
    throw new RuntimeException("Caracter desconocido: " + yytext());
}
