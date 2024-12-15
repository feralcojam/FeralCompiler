package controladores;

import vistas.FeralCompiler;

public class FeralMain {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeralCompiler().setVisible(true);
            }
        });
    }
    
}
