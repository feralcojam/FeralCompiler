package sintactico;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneradorDeSintaxis {
    
    public static void main(String[] args) {
        
        String[] arregloRuta = {
            "-destdir", "C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/sintactico",
            "-parser", "Sintactico",
            "C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/sintactico/Sintactico.cup"
        };
        generarSintactico(arregloRuta);
        
    }
    
    public static void generarSintactico(String[] arregloRuta) {
        
        try {
            java_cup.Main.main(arregloRuta);
            /*java.nio.file.Path rutaSym = java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/sintactico/sym.java");
            if (java.nio.file.Files.exists(rutaSym)) {
                java.nio.file.Files.delete(rutaSym);
            }
            java.nio.file.Files.move(
                    java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/sym.java"),
                    java.nio.file.Paths.get("C:/Users/FeralcoJam/Documents/NetBeansProjects/FeralCompiler/src/sintactico/sym.java")
            );*/
            System.out.println("Generación exitosa de cup");
        } catch (IOException ex) {
            Logger.getLogger(GeneradorDeSintaxis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GeneradorDeSintaxis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
