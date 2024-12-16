package controladores;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws Exception {
        String rutaLexico = "C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/otros/Lexer.flex";
        String rutaSintactico = "C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/otros/LexerCup.flex";
        String[] arregloRutas = {"-parser", "Sintaxis", "C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/otros/Sintaxis.cup"};
        generarAnalizadores(rutaLexico, rutaSintactico, arregloRutas);
    }
    
    public static void generarAnalizadores(String rutaLexico, String rutaSintactico, String[] arregloRutas) throws IOException, Exception {
        java.io.File archivo;
        archivo = new java.io.File(rutaLexico);
        JFlex.Main.generate(archivo);
        
        archivo = new java.io.File(rutaSintactico);
        JFlex.Main.generate(archivo);
        /*
        java.io.File archivoLexico = new java.io.File(rutaLexico);
        JFlex.Main.generate(archivoLexico);
        
        java.io.File archivoSintactico = new java.io.File(rutaSintactico);
        JFlex.Main.generate(archivoSintactico);
        */
        java_cup.Main.main(arregloRutas);
        
        java.nio.file.Path rutaSym = java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/otros/sym.java");
        if (java.nio.file.Files.exists(rutaSym)) {
            java.nio.file.Files.delete(rutaSym);
        }
        java.nio.file.Files.move(
                java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/sym.java"), 
                java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/otros/sym.java")
        );
        
        java.nio.file.Path rutaSintax = java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/otros/Sintaxis.java");
        if (java.nio.file.Files.exists(rutaSintax)) {
            java.nio.file.Files.delete(rutaSintax);
        }
        java.nio.file.Files.move(
                java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/Sintaxis.java"), 
                java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/otros/Sintaxis.java")
        );
    }
}
