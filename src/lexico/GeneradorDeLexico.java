package lexico;

import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.exceptions.SilentExit;

public class GeneradorDeLexico {

    public static void main(String[] args) {
        
        String ruta = "C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/lexico/Lexico.flex";
        generarLexico(ruta);
        
    }
    
    public static void generarLexico(String ruta) {
        
        try {
            String[] archivo = { ruta };
            jflex.Main.generate(archivo);
            System.out.println("Lexer.java generada con éxito.");
        } catch (SilentExit ex) {
            Logger.getLogger(GeneradorDeLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
