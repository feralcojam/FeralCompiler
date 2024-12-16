package vistas;

import java.awt.FontFormatException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FeralCompiler extends javax.swing.JFrame {

    private static java.awt.Color dark28 = new java.awt.Color(28, 28, 28);
    private static java.awt.Color darkGray = new java.awt.Color(34, 34, 34);
    private static java.awt.Color darkJet = new java.awt.Color(54, 54, 54);
    private static java.awt.Color gray = new java.awt.Color(117, 117, 117);
    private static java.awt.Color whitePlatinum = new java.awt.Color(224, 224, 224);
    private static java.awt.Color blueAzure = new java.awt.Color(0, 123, 255);
    private static java.awt.Color orangeFeral = new java.awt.Color(255, 165, 0);
    
    private boolean maximizada = false;
    
    private javax.swing.JTextPane numeroDeLinea;
    
    public FeralCompiler() {
        initComponents();
        personalizarBarraDeNavegacion();
        personalizarComponentes();
    }

    private void cerrarVentana() {
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                botonCerrar.setBackground(java.awt.Color.red);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonCerrar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                botonCerrar.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonCerrar.setCursor(cursorPuntero);
            }
        });
    }
    
    private void maximizarVentana() {
        botonMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (!maximizada) {
                    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                    maximizada = true;
                } else {
                    setExtendedState(javax.swing.JFrame.NORMAL);
                    maximizada = false;
                }
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                botonMaximizar.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonMaximizar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                botonMaximizar.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonMaximizar.setCursor(cursorPuntero);
            }
        });
    }
    
    private void minimizarVentana() {
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                setState(javax.swing.JFrame.ICONIFIED);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                botonMinimizar.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonMinimizar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                botonMinimizar.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonMinimizar.setCursor(cursorPuntero);
            }
        });
    }
    
    private void importarIconosBarraDeNavegacion() {
        javax.swing.ImageIcon iconoCerrar = new javax.swing.ImageIcon(getClass().getResource("/recursos/x-solid.png"));
        java.awt.Image imagenCerrar = iconoCerrar.getImage();
        java.awt.Image imagenCerrarEscalada = imagenCerrar.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon iconoCerrarEscalado = new javax.swing.ImageIcon(imagenCerrarEscalada);
        
        javax.swing.ImageIcon iconoMaximizar = new javax.swing.ImageIcon(getClass().getResource("/recursos/maximize-solid.png"));
        java.awt.Image imagenMaximizar = iconoMaximizar.getImage();
        java.awt.Image imagenMaximizarEscalada = imagenMaximizar.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon iconoMaximizarEscalado = new javax.swing.ImageIcon(imagenMaximizarEscalada);
        
        javax.swing.ImageIcon iconoMinimizar = new javax.swing.ImageIcon(getClass().getResource("/recursos/minus-solid.png"));
        java.awt.Image imagenMinizar = iconoMinimizar.getImage();
        java.awt.Image imagenMinimizarEscalada = imagenMinizar.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon iconoMinimizarEscalado = new javax.swing.ImageIcon(imagenMinimizarEscalada);
        
        botonCerrar.setIcon(iconoCerrarEscalado);
        botonMaximizar.setIcon(iconoMaximizarEscalado);
        botonMinimizar.setIcon(iconoMinimizarEscalado);
    }
    
    private void colorearBarraDeNavegacion() {
        botonCerrar.setBackground(darkGray);
        botonMaximizar.setBackground(darkGray);
        botonMinimizar.setBackground(darkGray);
    }
    
    private void personalizarBarraDeNavegacion() {
        cerrarVentana();
        maximizarVentana();
        minimizarVentana();
        importarIconosBarraDeNavegacion();
        colorearBarraDeNavegacion();
    }
    
    private void colorearSeparadores() {
        separadorLineal1.setBackground(darkGray);
        separadorLineal2.setBackground(darkGray);
        
        separadorLineal1.setForeground(gray);
        separadorLineal2.setForeground(gray);
    }
    
    private void colorearAreasDeTexto() {
        escritorCodigo.setBackground(darkGray);
        salidaLexico.setBackground(darkGray);
        salidaSintactico.setBackground(darkGray);
        salidaConsola.setBackground(darkGray);
        
        escritorCodigo.setForeground(whitePlatinum);
        salidaLexico.setForeground(whitePlatinum);
        salidaSintactico.setForeground(whitePlatinum);
        salidaConsola.setForeground(whitePlatinum);
        
        escritorCodigo.setCaretColor(whitePlatinum);
    }
    
    private void colorearEtiquetas() {
        tituloEtiqueta1.setForeground(blueAzure);
        tituloEtiqueta2.setForeground(orangeFeral);
    }
    
    private void colorearBotones() {
        botonAbrir.setBackground(darkGray);
        botonGuardar.setBackground(darkGray);
        botonGuardarComo.setBackground(darkGray);
        botonEliminar.setBackground(darkGray);
        botonLimpiar.setBackground(darkGray);
        botonAnalizar.setBackground(darkGray);
        botonCompilar.setBackground(darkGray);
        
        botonAbrir.setForeground(whitePlatinum);
        botonGuardar.setForeground(whitePlatinum);
        botonGuardarComo.setForeground(whitePlatinum);
        botonEliminar.setForeground(whitePlatinum);
        botonLimpiar.setForeground(whitePlatinum);
        botonAnalizar.setForeground(whitePlatinum);
        botonCompilar.setForeground(whitePlatinum);
    }
    
    private void configurarMargenesAAreasDeTexto() {
        escritorCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(10,10,10,10));
        salidaLexico.setBorder(javax.swing.BorderFactory.createEmptyBorder(10,10,10,10));
        salidaSintactico.setBorder(javax.swing.BorderFactory.createEmptyBorder(10,10,10,10));
        salidaConsola.setBorder(javax.swing.BorderFactory.createEmptyBorder(10,10,10,10));
    }
    
    private void importarFuentesABotones() {
        try {
            java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
            java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
            
            botonAbrir.setFont(mr14);
            botonGuardar.setFont(mr14);
            botonGuardarComo.setFont(mr14);
            botonEliminar.setFont(mr14);
            botonLimpiar.setFont(mr14);
            botonAnalizar.setFont(mr14);
            botonCompilar.setFont(mr14);
            
        } catch (FontFormatException ex) {
            Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void importarFuentesAEtiquetas() {
        try {
            java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
            java.awt.Font mr12 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(12f);
            java.awt.Font mr10 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(10f);
            java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
            java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
            
            versionEtiqueta.setFont(mr10);
            
            mensajeTexto1.setFont(mr12);
            mensajeTexto2.setFont(mr12);
            
            tituloEtiqueta1.setFont(mb14);
            tituloEtiqueta2.setFont(mb14);
            lexicoEtiqueta.setFont(mb14);
            sintacticoEtiqueta.setFont(mb14);
            consolaEtiqueta.setFont(mb14);
            
        } catch (FontFormatException ex) {
            Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void importarFuentesAAreasDeTexto() {
        try {
            java.io.File courierRegular = new java.io.File("src/recursos/fuentes/courier/CourierPrime-Regular.ttf");
            java.awt.Font cr12 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, courierRegular).deriveFont(12f);
            java.awt.Font cr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, courierRegular).deriveFont(14f);
            
            escritorCodigo.setFont(cr14);
            salidaLexico.setFont(cr12);
            salidaSintactico.setFont(cr12);
            salidaConsola.setFont(cr12);
            
        } catch (FontFormatException ex) {
            Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void accionarBotonesPanel() {
        botonAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // accion de abrir
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                botonAbrir.setBackground(dark28);
                botonAbrir.setForeground(blueAzure);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
                    java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
                    
                    botonAbrir.setFont(mb14);
                    botonAbrir.setForeground(orangeFeral);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonAbrir.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonAbrir.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
                    java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
                    
                    botonAbrir.setFont(mr14);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonAbrir.setBackground(darkGray);
                botonAbrir.setForeground(whitePlatinum);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonAbrir.setCursor(cursorPuntero);
            }
        });
        
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // accion de crear
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                botonGuardar.setBackground(dark28);
                botonGuardar.setForeground(blueAzure);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
                    java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
                    
                    botonGuardar.setFont(mb14);
                    botonGuardar.setForeground(orangeFeral);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonGuardar.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonGuardar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
                    java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
                    
                    botonGuardar.setFont(mr14);
                    botonGuardar.setForeground(whitePlatinum);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonGuardar.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonGuardar.setCursor(cursorPuntero);
            }
        });
        
        botonGuardarComo.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // accion de guardar
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                botonGuardarComo.setBackground(dark28);
                botonGuardarComo.setForeground(blueAzure);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
                    java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
                    
                    botonGuardarComo.setFont(mb14);
                    botonGuardarComo.setForeground(orangeFeral);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonGuardarComo.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonGuardarComo.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
                    java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
                    
                    botonGuardarComo.setFont(mr14);
                    botonGuardarComo.setForeground(whitePlatinum);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonGuardarComo.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonGuardarComo.setCursor(cursorPuntero);
            }
        });
        
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // accion de eliminar
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                botonEliminar.setBackground(dark28);
                botonEliminar.setForeground(blueAzure);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
                    java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
                    
                    botonEliminar.setFont(mb14);
                    botonEliminar.setForeground(orangeFeral);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonEliminar.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonEliminar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
                    java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
                    
                    botonEliminar.setFont(mr14);
                    botonEliminar.setForeground(whitePlatinum);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonEliminar.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonEliminar.setCursor(cursorPuntero);
            }
        });
        
        botonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // accion de limpiar
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                botonLimpiar.setBackground(dark28);
                botonLimpiar.setForeground(blueAzure);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
                    java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
                    
                    botonLimpiar.setFont(mb14);
                    botonLimpiar.setForeground(orangeFeral);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonLimpiar.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonLimpiar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
                    java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
                    
                    botonLimpiar.setFont(mr14);
                    botonLimpiar.setForeground(whitePlatinum);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonLimpiar.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonLimpiar.setCursor(cursorPuntero);
            }
        });
        
        botonAnalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // accion de analizar
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                botonAnalizar.setBackground(dark28);
                botonAnalizar.setForeground(blueAzure);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
                    java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
                    
                    botonAnalizar.setFont(mb14);
                    botonAnalizar.setForeground(orangeFeral);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonAnalizar.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonAnalizar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
                    java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
                    
                    botonAnalizar.setFont(mr14);
                    botonAnalizar.setForeground(whitePlatinum);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonAnalizar.setBackground(darkGray);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonAnalizar.setCursor(cursorPuntero);
            }
        });
        
        botonCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // accion de compilar
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                botonCompilar.setBackground(dark28);
                botonCompilar.setForeground(blueAzure);
            }
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratNegrita = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Bold.ttf");
                    java.awt.Font mb14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratNegrita).deriveFont(14f);
                    
                    botonCompilar.setFont(mb14);
                    botonCompilar.setForeground(orangeFeral);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonCompilar.setBackground(darkJet);
                java.awt.Cursor cursorMano = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
                botonCompilar.setCursor(cursorMano);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                try {
                    java.io.File montserratRegular = new java.io.File("src/recursos/fuentes/montserrat/Montserrat-Regular.ttf");
                    java.awt.Font mr14 = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, montserratRegular).deriveFont(14f);
                    
                    botonCompilar.setFont(mr14);
                } catch (FontFormatException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FeralCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonCompilar.setBackground(darkGray);
                botonCompilar.setForeground(whitePlatinum);
                java.awt.Cursor cursorPuntero = new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR);
                botonCompilar.setCursor(cursorPuntero);
            }
        });
    }
    
    private void personalizarComponentes() {
        colorearSeparadores();
        colorearAreasDeTexto();
        colorearEtiquetas();
        colorearBotones();
        accionarBotonesPanel();
        importarFuentesABotones();
        importarFuentesAEtiquetas();
        importarFuentesAAreasDeTexto();
        configurarMargenesAAreasDeTexto();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        barraNavegacion = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        botonMaximizar = new javax.swing.JLabel();
        divisorPaneles = new javax.swing.JSplitPane();
        botonesPanel = new javax.swing.JPanel();
        tituloPanel = new javax.swing.JPanel();
        tituloEtiqueta1 = new javax.swing.JLabel();
        tituloEtiqueta2 = new javax.swing.JLabel();
        versionEtiqueta = new javax.swing.JLabel();
        mensajeTexto1 = new javax.swing.JLabel();
        mensajeTexto2 = new javax.swing.JLabel();
        separadorLineal1 = new javax.swing.JSeparator();
        botonAbrir = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JLabel();
        botonGuardarComo = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JLabel();
        separadorLineal2 = new javax.swing.JSeparator();
        botonLimpiar = new javax.swing.JLabel();
        botonAnalizar = new javax.swing.JLabel();
        botonCompilar = new javax.swing.JLabel();
        divisorCodigo = new javax.swing.JScrollPane();
        escritorCodigo = new javax.swing.JTextArea();
        lexicoEtiqueta = new javax.swing.JLabel();
        divisorLexico = new javax.swing.JScrollPane();
        salidaLexico = new javax.swing.JTextArea();
        sintacticoEtiqueta = new javax.swing.JLabel();
        divisorSintactico = new javax.swing.JScrollPane();
        salidaSintactico = new javax.swing.JTextArea();
        consolaEtiqueta = new javax.swing.JLabel();
        divisorSintactico1 = new javax.swing.JScrollPane();
        salidaConsola = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FeralCompiler");
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(51, 51, 51));

        barraNavegacion.setBackground(new java.awt.Color(34, 34, 34));

        botonCerrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(240, 240, 240));
        botonCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCerrar.setOpaque(true);

        botonMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        botonMinimizar.setForeground(new java.awt.Color(240, 240, 240));
        botonMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonMinimizar.setOpaque(true);

        botonMaximizar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        botonMaximizar.setForeground(new java.awt.Color(240, 240, 240));
        botonMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonMaximizar.setOpaque(true);

        javax.swing.GroupLayout barraNavegacionLayout = new javax.swing.GroupLayout(barraNavegacion);
        barraNavegacion.setLayout(barraNavegacionLayout);
        barraNavegacionLayout.setHorizontalGroup(
            barraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraNavegacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraNavegacionLayout.setVerticalGroup(
            barraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botonMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        divisorPaneles.setDividerLocation(200);
        divisorPaneles.setDividerSize(0);

        botonesPanel.setBackground(new java.awt.Color(34, 34, 34));

        tituloPanel.setBackground(new java.awt.Color(34, 34, 34));
        tituloPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloEtiqueta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloEtiqueta1.setForeground(new java.awt.Color(240, 240, 240));
        tituloEtiqueta1.setText("Feral");
        tituloPanel.add(tituloEtiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        tituloEtiqueta2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloEtiqueta2.setForeground(new java.awt.Color(240, 240, 240));
        tituloEtiqueta2.setText("Compiler");
        tituloPanel.add(tituloEtiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 6, -1, -1));

        versionEtiqueta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        versionEtiqueta.setForeground(new java.awt.Color(240, 240, 240));
        versionEtiqueta.setText("Versión 1.0");
        tituloPanel.add(versionEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 11, -1, -1));

        mensajeTexto1.setForeground(new java.awt.Color(240, 240, 240));
        mensajeTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeTexto1.setText("¿Qué vas hacer el día");
        tituloPanel.add(mensajeTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 176, -1));

        mensajeTexto2.setForeground(new java.awt.Color(240, 240, 240));
        mensajeTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeTexto2.setText("de hoy?");
        tituloPanel.add(mensajeTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 176, -1));

        separadorLineal1.setOpaque(true);

        botonAbrir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAbrir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAbrir.setText("Abrir archivo");
        botonAbrir.setOpaque(true);

        botonGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonGuardar.setText("Guardar archivo");
        botonGuardar.setOpaque(true);

        botonGuardarComo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonGuardarComo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonGuardarComo.setText("Guardar como");
        botonGuardarComo.setOpaque(true);

        botonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonEliminar.setText("Eliminar archivo");
        botonEliminar.setOpaque(true);

        separadorLineal2.setOpaque(true);

        botonLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonLimpiar.setText("Limpiar");
        botonLimpiar.setOpaque(true);

        botonAnalizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAnalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonAnalizar.setText("Analizar");
        botonAnalizar.setOpaque(true);

        botonCompilar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonCompilar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCompilar.setText("Compilar");
        botonCompilar.setOpaque(true);

        javax.swing.GroupLayout botonesPanelLayout = new javax.swing.GroupLayout(botonesPanel);
        botonesPanel.setLayout(botonesPanelLayout);
        botonesPanelLayout.setHorizontalGroup(
            botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(botonGuardarComo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonCompilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(botonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorLineal2)
                    .addComponent(separadorLineal1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        botonesPanelLayout.setVerticalGroup(
            botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(separadorLineal1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(separadorLineal2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        divisorPaneles.setLeftComponent(botonesPanel);

        escritorCodigo.setColumns(20);
        escritorCodigo.setRows(5);
        escritorCodigo.setTabSize(4);
        divisorCodigo.setViewportView(escritorCodigo);

        divisorPaneles.setRightComponent(divisorCodigo);

        lexicoEtiqueta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lexicoEtiqueta.setForeground(new java.awt.Color(240, 240, 240));
        lexicoEtiqueta.setText("Análisis Léxico");

        salidaLexico.setEditable(false);
        salidaLexico.setColumns(20);
        salidaLexico.setRows(5);
        divisorLexico.setViewportView(salidaLexico);

        sintacticoEtiqueta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sintacticoEtiqueta.setForeground(new java.awt.Color(240, 240, 240));
        sintacticoEtiqueta.setText("Análisis Sintáctico");

        salidaSintactico.setEditable(false);
        salidaSintactico.setColumns(20);
        salidaSintactico.setRows(5);
        divisorSintactico.setViewportView(salidaSintactico);

        consolaEtiqueta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consolaEtiqueta.setForeground(new java.awt.Color(240, 240, 240));
        consolaEtiqueta.setText("Consola");

        salidaConsola.setEditable(false);
        salidaConsola.setColumns(20);
        salidaConsola.setRows(5);
        divisorSintactico1.setViewportView(salidaConsola);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(divisorPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divisorLexico)
                    .addComponent(divisorSintactico)
                    .addComponent(divisorSintactico1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consolaEtiqueta)
                            .addComponent(lexicoEtiqueta)
                            .addComponent(sintacticoEtiqueta))
                        .addGap(181, 181, 181)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(barraNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisorPaneles)
                        .addContainerGap())
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lexicoEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisorLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sintacticoEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisorSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consolaEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisorSintactico1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraNavegacion;
    private javax.swing.JLabel botonAbrir;
    private javax.swing.JLabel botonAnalizar;
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonCompilar;
    private javax.swing.JLabel botonEliminar;
    private javax.swing.JLabel botonGuardar;
    private javax.swing.JLabel botonGuardarComo;
    private javax.swing.JLabel botonLimpiar;
    private javax.swing.JLabel botonMaximizar;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JLabel consolaEtiqueta;
    private javax.swing.JScrollPane divisorCodigo;
    private javax.swing.JScrollPane divisorLexico;
    private javax.swing.JSplitPane divisorPaneles;
    private javax.swing.JScrollPane divisorSintactico;
    private javax.swing.JScrollPane divisorSintactico1;
    private javax.swing.JTextArea escritorCodigo;
    private javax.swing.JLabel lexicoEtiqueta;
    private javax.swing.JLabel mensajeTexto1;
    private javax.swing.JLabel mensajeTexto2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextArea salidaConsola;
    private javax.swing.JTextArea salidaLexico;
    private javax.swing.JTextArea salidaSintactico;
    private javax.swing.JSeparator separadorLineal1;
    private javax.swing.JSeparator separadorLineal2;
    private javax.swing.JLabel sintacticoEtiqueta;
    private javax.swing.JLabel tituloEtiqueta1;
    private javax.swing.JLabel tituloEtiqueta2;
    private javax.swing.JPanel tituloPanel;
    private javax.swing.JLabel versionEtiqueta;
    // End of variables declaration//GEN-END:variables
}
