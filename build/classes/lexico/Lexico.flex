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
numeroFlotante = {numero}+(\.{numero}+)?([eE][+-]?{numero}+)?[fF]
numeroDouble = {numero}+(\.{numero}+)?([eE][+-]?{numero}+)?
valor_booleano = true|false
caracter = \'[^']\'
cadena = \"[^\"]*\"
ARREGLO_BYTE = "byte"\\[\\]
MATRIZ_BYTE = "byte"\\[\\]+
ARREGLO_SHORT = "short"\\[\\]
MATRIZ_SHORT = "short"\\[\\]
ARREGLO_INT = "int"\\[\\]
MATRIZ_INT = "int"\\[\\]+
ARREGLO_LONG = "long"\\[\\]
MATRIZ_LONG = "long"\\[\\]+
ARREGLO_FLOAT = "float"\\[\\]
MATRIZ_FLOAT = "float"\\[\\]+
ARREGLO_DOUBLE = "double"\\[\\]
MATRIZ_DOUBLE = "double"\\[\\]+
ARREGLO_BOOLEANO = "boolean"\\[\\]
MATRIZ_BOOLEANO = "boolean"\\[\\]+
ARREGLO_CARACTER = "char"\\[\\]
MATRIZ_CARACTER = "char"\\[\\]+
ARREGLO_STRING = "String"\\[\\]
MATRIZ_STRING = "String"\\[\\]+

%%

{espacioEnBlanco} { }

/* Tipos de dato */
"byte"   
    { 
        tokens.add("BYTE: " + yytext()); 
        return new Symbol(sym.BYTE, yyline + 1, yycolumn + 1); 
    }
"short"    
    { 
        tokens.add("SHORT: " + yytext()); 
        return new Symbol(sym.SHORT, yyline + 1, yycolumn + 1); 
    }
"int"    
    { 
        tokens.add("INT: " + yytext()); 
        return new Symbol(sym.INT, yyline + 1, yycolumn + 1); 
    }
"long"    
    { 
        tokens.add("LONG: " + yytext()); 
        return new Symbol(sym.LONG, yyline + 1, yycolumn + 1); 
    }
"float"    
    { 
        tokens.add("FLOAT: " + yytext()); 
        return new Symbol(sym.FLOAT, yyline + 1, yycolumn + 1); 
    }
"double"    
    { 
        tokens.add("DOUBLE: " + yytext()); 
        return new Symbol(sym.DOUBLE, yyline + 1, yycolumn + 1); 
    }
"boolean"    
    { 
        tokens.add("BOOLEANO: " + yytext()); 
        return new Symbol(sym.BOOLEANO, yyline + 1, yycolumn + 1); 
    }
"char"    
    { 
        tokens.add("CARACTER: " + yytext()); 
        return new Symbol(sym.CARACTER, yyline + 1, yycolumn + 1); 
    }
"String"    
    { 
        tokens.add("STRING: " + yytext()); 
        return new Symbol(sym.STRING, yyline + 1, yycolumn + 1); 
    }

/* Valores de tipos */
{numero}    
    { 
        tokens.add("NUMERO: " + yytext()); 
        return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1, Integer.parseInt(yytext())); 
    }
{numeroFlotante} 
    { 
        tokens.add("NUMERO_FLOTANTE: " + yytext()); 
        return new Symbol(sym.NUMERO_FLOTANTE, yyline + 1, yycolumn + 1, Float.parseFloat(yytext())); 
    }
{numeroDouble} 
    { 
        tokens.add("NUMERO_DOUBLE: " + yytext()); 
        return new Symbol(sym.NUMERO_DOUBLE, yyline + 1, yycolumn + 1, Double.parseDouble(yytext())); 
    }
{valor_booleano} 
    {
        tokens.add("VALOR_BOOLEANO: " + yytext());
        return new Symbol(sym.VALOR_BOOLEANO, yyline + 1, yycolumn + 1, Boolean.parseBoolean(yytext()));
    }
{caracter}
    {
        tokens.add("VALOR_CARACTER: " + yytext());
        return new Symbol(sym.VALOR_CARACTER, yyline + 1, yycolumn + 1, yytext().charAt(1));
    }
{cadena} 
    {
        tokens.add("CADENA: " + yytext());
        return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1, yytext().substring(1, yytext().length() - 1));
    }

/* Arreglo y Matriz de tipos de dato */
"byte[]" | "byte []"
{
    tokens.add("ARREGLO_BYTE: " + yytext());
    return new Symbol(sym.ARREGLO_BYTE, yyline + 1, yycolumn + 1, yytext());
}
"byte[][]" | "byte [][]"
{
    tokens.add("MATRIZ_BYTE: " + yytext());
    return new Symbol(sym.MATRIZ_BYTE, yyline + 1, yycolumn + 1, yytext());
}
"short[]" | "short []"
{
    tokens.add("ARREGLO_SHORT: " + yytext());
    return new Symbol(sym.ARREGLO_SHORT, yyline + 1, yycolumn + 1, yytext());
}
"short[][]" | "short [][]"
{
    tokens.add("MATRIZ_SHORT: " + yytext());
    return new Symbol(sym.MATRIZ_SHORT, yyline + 1, yycolumn + 1, yytext());
}
"int[]" | "int []"
{
    tokens.add("ARREGLO_INT: " + yytext());
    return new Symbol(sym.ARREGLO_INT, yyline + 1, yycolumn + 1, yytext());
}
"int[][]" | "int [][]"
{
    tokens.add("MATRIZ_INT: " + yytext());
    return new Symbol(sym.MATRIZ_INT, yyline + 1, yycolumn + 1, yytext());
}
"long[]" | "long []"
{
    tokens.add("ARREGLO_LONG: " + yytext());
    return new Symbol(sym.ARREGLO_LONG, yyline + 1, yycolumn + 1, yytext());
}
"long[][]" | "long [][]"
{
    tokens.add("MATRIZ_LONG: " + yytext());
    return new Symbol(sym.MATRIZ_LONG, yyline + 1, yycolumn + 1, yytext());
}
"float[]" | "float []"
{
    tokens.add("ARREGLO_FLOAT: " + yytext());
    return new Symbol(sym.ARREGLO_FLOAT, yyline + 1, yycolumn + 1, yytext());
}
"float[][]" | "float [][]"
{
    tokens.add("MATRIZ_FLOAT: " + yytext());
    return new Symbol(sym.MATRIZ_FLOAT, yyline + 1, yycolumn + 1, yytext());
}
"double[]" | "double []"
{
    tokens.add("ARREGLO_DOUBLE: " + yytext());
    return new Symbol(sym.ARREGLO_DOUBLE, yyline + 1, yycolumn + 1, yytext());
}
"double[][]" | "double [][]"
{
    tokens.add("MATRIZ_DOUBLE: " + yytext());
    return new Symbol(sym.MATRIZ_DOUBLE, yyline + 1, yycolumn + 1, yytext());
}
"boolean[]" | "boolean []"
{
    tokens.add("ARREGLO_BOOLEANO: " + yytext());
    return new Symbol(sym.ARREGLO_BOOLEANO, yyline + 1, yycolumn + 1, yytext());
}
"boolean[][]" | "boolean [][]"
{
    tokens.add("MATRIZ_BOOLEANO: " + yytext());
    return new Symbol(sym.MATRIZ_BOOLEANO, yyline + 1, yycolumn + 1, yytext());
}
"char[]" | "char []"
{
    tokens.add("ARREGLO_CARACTER: " + yytext());
    return new Symbol(sym.ARREGLO_CARACTER, yyline + 1, yycolumn + 1, yytext());
}
"char[][]" | "char [][]"
{
    tokens.add("MATRIZ_CARACTER: " + yytext());
    return new Symbol(sym.MATRIZ_CARACTER, yyline + 1, yycolumn + 1, yytext());
}
"String[]" | "String []"
{
    tokens.add("ARREGLO_STRING: " + yytext());
    return new Symbol(sym.ARREGLO_STRING, yyline + 1, yycolumn + 1, yytext());
}
"String[][]" | "String [][]"
{
    tokens.add("MATRIZ_STRING: " + yytext());
    return new Symbol(sym.MATRIZ_STRING, yyline + 1, yycolumn + 1, yytext());
}

/* Operadores */
"+"
    {
        tokens.add("OPERADOR_MAS: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAS, yyline + 1, yycolumn + 1, yytext()); 
    }
"-"  
    {
        tokens.add("OPERADOR_MENOS: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOS, yyline + 1, yycolumn + 1, yytext()); 
    }
"*"  
    {
        tokens.add("OPERADOR_POR: " + yytext()); 
        return new Symbol(sym.OPERADOR_POR, yyline + 1, yycolumn + 1, yytext()); 
    }
"/"  
    {
        tokens.add("OPERADOR_ENTRE: " + yytext()); 
        return new Symbol(sym.OPERADOR_ENTRE, yyline + 1, yycolumn + 1, yytext()); 
    }
"%"  
    {
        tokens.add("OPERADOR_MODULO: " + yytext()); 
        return new Symbol(sym.OPERADOR_MODULO, yyline + 1, yycolumn + 1, yytext()); 
    }
"++" 
    {
        tokens.add("OPERADOR_INCREMENTO: " + yytext()); 
        return new Symbol(sym.OPERADOR_INCREMENTO, yyline + 1, yycolumn + 1, yytext()); 
    }
"--" 
    {
        tokens.add("OPERADOR_DECREMENTO: " + yytext()); 
        return new Symbol(sym.OPERADOR_DECREMENTO, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Operadores de asignacion */
"=" 
    {
        tokens.add("OPERADOR_DE_ASIGNACION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_ASIGNACION, yyline + 1, yycolumn + 1, yytext()); 
    }
"+=" 
    {
        tokens.add("OPERADOR_DE_ADICION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_ADICION, yyline + 1, yycolumn + 1, yytext()); 
    }
"-=" 
    {
        tokens.add("OPERADOR_DE_SUSTRACCION: " + yytext()); 
        return new Symbol(sym.OPERADOR_DE_SUSTRACCION, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Operadores de comparacion */
"==" 
    {
        tokens.add("OPERADOR_IGUAL_A: " + yytext()); 
        return new Symbol(sym.OPERADOR_IGUAL_A, yyline + 1, yycolumn + 1, yytext()); 
    }
"!=" 
    {
        tokens.add("OPERADOR_DIFERENTE_DE: " + yytext()); 
        return new Symbol(sym.OPERADOR_DIFERENTE_DE, yyline + 1, yycolumn + 1, yytext()); 
    }
">" 
    {
        tokens.add("OPERADOR_MAYOR_QUE: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAYOR_QUE, yyline + 1, yycolumn + 1, yytext()); 
    }
"<" 
    {
        tokens.add("OPERADOR_MENOR_QUE: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOR_QUE, yyline + 1, yycolumn + 1, yytext()); 
    }
">=" 
    {
        tokens.add("OPERADOR_MAYOR_IGUAL: " + yytext()); 
        return new Symbol(sym.OPERADOR_MAYOR_IGUAL, yyline + 1, yycolumn + 1, yytext()); 
    }
"<=" 
    {
        tokens.add("OPERADOR_MENOR_IGUAL: " + yytext()); 
        return new Symbol(sym.OPERADOR_MENOR_IGUAL, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Operadores logicos */
"&&" 
    {
        tokens.add("OPERADOR_AND: " + yytext()); 
        return new Symbol(sym.OPERADOR_AND, yyline + 1, yycolumn + 1, yytext()); 
    }
"||" 
    {
        tokens.add("OPERADOR_OR: " + yytext()); 
        return new Symbol(sym.OPERADOR_OR, yyline + 1, yycolumn + 1, yytext()); 
    }
"!" 
    {
        tokens.add("OPERADOR_NOT: " + yytext()); 
        return new Symbol(sym.OPERADOR_NOT, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Sentencias */
"else if" 
    {
        tokens.add("SENTENCIA_ELSE_IF: " + yytext()); 
        return new Symbol(sym.SENTENCIA_ELSE_IF, yyline + 1, yycolumn + 1, yytext()); 
    }
"if" 
    {
        tokens.add("SENTENCIA_IF: " + yytext()); 
        return new Symbol(sym.SENTENCIA_IF, yyline + 1, yycolumn + 1, yytext()); 
    }
"else" 
    {
        tokens.add("SENTENCIA_ELSE: " + yytext()); 
        return new Symbol(sym.SENTENCIA_ELSE, yyline + 1, yycolumn + 1, yytext()); 
    }
"switch" 
    {
        tokens.add("SENTENCIA_SWITCH: " + yytext()); 
        return new Symbol(sym.SENTENCIA_SWITCH, yyline + 1, yycolumn + 1, yytext()); 
    }
"case" 
    {
        tokens.add("SENTENCIA_CASE: " + yytext()); 
        return new Symbol(sym.SENTENCIA_CASE, yyline + 1, yycolumn + 1, yytext()); 
    }
"break" 
    {
        tokens.add("SENTENCIA_BREAK: " + yytext()); 
        return new Symbol(sym.SENTENCIA_BREAK, yyline + 1, yycolumn + 1, yytext()); 
    }
"continue" 
    {
        tokens.add("SENTENCIA_CONTINUE: " + yytext()); 
        return new Symbol(sym.SENTENCIA_CONTINUE, yyline + 1, yycolumn + 1, yytext()); 
    }
"default" 
    {
        tokens.add("SENTENCIA_DEFAULT: " + yytext()); 
        return new Symbol(sym.SENTENCIA_DEFAULT, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Ciclos */
"while" 
    {
        tokens.add("CICLO_WHILE: " + yytext()); 
        return new Symbol(sym.CICLO_WHILE, yyline + 1, yycolumn + 1, yytext()); 
    }
"do" 
    {
        tokens.add("CICLO_DO: " + yytext()); 
        return new Symbol(sym.CICLO_DO, yyline + 1, yycolumn + 1, yytext()); 
    }
"for" 
    {
        tokens.add("CICLO_FOR: " + yytext()); 
        return new Symbol(sym.CICLO_FOR, yyline + 1, yycolumn + 1, yytext()); 
    }

/*  Palabras reservadas */
"public"
    {
        tokens.add("RESERVADA_PUBLIC: " + yytext()); 
        return new Symbol(sym.RESERVADA_PUBLIC, yyline + 1, yycolumn + 1, yytext()); 
    }
"private"
    {
        tokens.add("RESERVADA_PRIVATE: " + yytext()); 
        return new Symbol(sym.RESERVADA_PRIVATE, yyline + 1, yycolumn + 1, yytext()); 
    }
"protected"
    {
        tokens.add("RESERVADA_PROTECTED: " + yytext()); 
        return new Symbol(sym.RESERVADA_PROTECTED, yyline + 1, yycolumn + 1, yytext()); 
    }
"final"
    {
        tokens.add("RESERVADA_FINAL: " + yytext()); 
        return new Symbol(sym.RESERVADA_FINAL, yyline + 1, yycolumn + 1, yytext()); 
    }
"static"
    {
        tokens.add("RESERVADA_STATIC: " + yytext()); 
        return new Symbol(sym.RESERVADA_STATIC, yyline + 1, yycolumn + 1, yytext()); 
    }
"class"
    {
        tokens.add("RESERVADA_CLASS: " + yytext()); 
        return new Symbol(sym.RESERVADA_CLASS, yyline + 1, yycolumn + 1, yytext()); 
    }
"void"
    {
        tokens.add("RESERVADA_VOID: " + yytext()); 
        return new Symbol(sym.RESERVADA_VOID, yyline + 1, yycolumn + 1, yytext()); 
    }
"return"
    {
        tokens.add("RESERVADA_RETURN: " + yytext()); 
        return new Symbol(sym.RESERVADA_RETURN, yyline + 1, yycolumn + 1, yytext()); 
    }
"package"
    {
        tokens.add("RESERVADA_IMPORT: " + yytext()); 
        return new Symbol(sym.RESERVADA_IMPORT, yyline + 1, yycolumn + 1, yytext()); 
    }
"import"
    {
        tokens.add("RESERVADA_IMPORT: " + yytext()); 
        return new Symbol(sym.RESERVADA_IMPORT, yyline + 1, yycolumn + 1, yytext()); 
    }
"new"
    {
        tokens.add("RESERVADA_NEW: " + yytext()); 
        return new Symbol(sym.RESERVADA_NEW, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Signos de puntuacion */
"."
    {
        tokens.add("SIGNO_PUNTO: " + yytext()); 
        return new Symbol(sym.SIGNO_PUNTO, yyline + 1, yycolumn + 1, yytext()); 
    }
","
    {
        tokens.add("SIGNO_COMA: " + yytext()); 
        return new Symbol(sym.SIGNO_COMA, yyline + 1, yycolumn + 1, yytext()); 
    }
";"
    {
        tokens.add("SIGNO_PUNTO_Y_COMA: " + yytext()); 
        return new Symbol(sym.SIGNO_PUNTO_Y_COMA, yyline + 1, yycolumn + 1, yytext()); 
    }
":"
    {
        tokens.add("SIGNO_DOS_PUNTOS: " + yytext()); 
        return new Symbol(sym.SIGNO_DOS_PUNTOS, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Signos de agrupacion */
"("
    {
        tokens.add("PARENTESIS_ABIERTO: " + yytext()); 
        return new Symbol(sym.PARENTESIS_ABIERTO, yyline + 1, yycolumn + 1, yytext()); 
    }
")"
    {
        tokens.add("PARENTESIS_CERRADO: " + yytext()); 
        return new Symbol(sym.PARENTESIS_CERRADO, yyline + 1, yycolumn + 1, yytext()); 
    }
"["
    {
        tokens.add("CORCHETE_ABIERTO: " + yytext()); 
        return new Symbol(sym.CORCHETE_ABIERTO, yyline + 1, yycolumn + 1, yytext()); 
    }
"]"
    {
        tokens.add("CORCHETE_CERRADO: " + yytext()); 
        return new Symbol(sym.CORCHETE_CERRADO, yyline + 1, yycolumn + 1, yytext()); 
    }
"{"
    {
        tokens.add("LLAVE_ABIERTA: " + yytext()); 
        return new Symbol(sym.LLAVE_ABIERTA, yyline + 1, yycolumn + 1, yytext()); 
    }
"}"
    {
        tokens.add("LLAVE_CERRADA: " + yytext()); 
        return new Symbol(sym.LLAVE_CERRADA, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Identificador */
{identificador}    
    { 
        tokens.add("IDENTIFICADOR: " + yytext()); 
        return new Symbol(sym.IDENTIFICADOR, yyline + 1, yycolumn + 1, yytext()); 
    }

/* Error */
[^\r\n] 
{
    throw new RuntimeException("Caracter desconocido: " + yytext());
}
