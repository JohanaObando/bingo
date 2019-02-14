package Vistas;


public class MenuPrincipal extends javax.swing.JFrame {/*extends: es una característica de 
    la herencia, extends permite definir o llamar a los elementos de una clase tomando 
    como base otra clase existente clase. javax.swing.JFrame: 
    JFrame es una clase utilizada en Swing (biblioteca gráfica) 
    para generar ventanas sobre las cuales añadir distintos
    objetos con los que podrá interactuar o no el usuario. 
    A diferencia de JPanel, JFrame posee algunas nociones típicas 
    de una ventana como minimizar, cerrar, maximizar y poder moverla.*/

    //constructor
    public MenuPrincipal() {
        initComponents();
        ocultarTodosLosElementos();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        tituloLbl = new javax.swing.JLabel();
        nJugadoresLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nJugadoresTxt = new javax.swing.JTextField();
        labelMsg1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreJugadoresLbl = new javax.swing.JLabel();
        jugador1Txt = new javax.swing.JTextField();
        jugador1Lbl = new javax.swing.JLabel();
        jugador2Txt = new javax.swing.JTextField();
        jugador2Lbl = new javax.swing.JLabel();
        jugador3Txt = new javax.swing.JTextField();
        jugador3Lbl = new javax.swing.JLabel();
        jugador4Txt = new javax.swing.JTextField();
        jugador4Lbl = new javax.swing.JLabel();
        iniciarBtn = new javax.swing.JButton();
        automarcarCheck = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuOp1 = new javax.swing.JMenuItem();
        menuOp2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloLbl.setText("titulo");

        nJugadoresLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nJugadoresLbl.setText("Número de Jugadores");

        nJugadoresTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nJugadoresTxtKeyReleased(evt);
            }
        });

        labelMsg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelMsg1.setText("máx 4 jugadores");

        nombreJugadoresLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreJugadoresLbl.setText("Nombre de Jugadores");

        jugador1Txt.setText("Jugador 1");
        jugador1Txt.setToolTipText("");

        jugador1Lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jugador1Lbl.setText("Jugador 1");

        jugador2Txt.setText("Jugador 2");

        jugador2Lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jugador2Lbl.setText("Jugador 2");

        jugador3Txt.setText("Jugador 3");
        jugador3Txt.setToolTipText("");

        jugador3Lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jugador3Lbl.setText("Jugador 3");

        jugador4Txt.setText("Jugador 4");

        jugador4Lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jugador4Lbl.setText("Jugador 4");

        iniciarBtn.setBackground(new java.awt.Color(204, 0, 0));
        iniciarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        iniciarBtn.setText("Comprar");
        iniciarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.yellow, java.awt.Color.green, new java.awt.Color(255, 255, 0), java.awt.Color.green));
        iniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBtnActionPerformed(evt);
            }
        });

        automarcarCheck.setSelected(true);
        automarcarCheck.setText("Auto marcar");

        jMenu1.setText("Inicio");

        menuOp1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOp1.setActionCommand("Jugador-Máquina");
        menuOp1.setLabel("Jugador-Máquina");
        menuOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOp1ActionPerformed(evt);
            }
        });
        jMenu1.add(menuOp1);

        menuOp2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOp2.setText("Multi-Jugador");
        menuOp2.setToolTipText("");
        menuOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOp2ActionPerformed(evt);
            }
        });
        jMenu1.add(menuOp2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Información");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacion(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iniciarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(nJugadoresLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nJugadoresTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelMsg1))
                                    .addComponent(tituloLbl))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jugador1Lbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(automarcarCheck)
                                    .addComponent(jugador1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(nombreJugadoresLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jugador2Lbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jugador2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jugador3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jugador3Lbl)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jugador4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jugador4Lbl)))))
                        .addGap(0, 291, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(tituloLbl)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nJugadoresLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nJugadoresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMsg1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(nombreJugadoresLbl)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jugador2Lbl)
                            .addComponent(jugador1Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jugador2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugador1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jugador3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jugador3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jugador4Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jugador4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(automarcarCheck))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*actionPerformed() es un método de ActionListener. nos referimos al evento que se 
    produce al hacer click en un componente o al pulsar Enter   
   Todo este código es de Interfaz Gráfica */
    private void menuOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOp1ActionPerformed
        nJugadoresTxt.setText("");
        mostrarTodosLosElementos();
        tituloLbl.setText("Bingo Jugador-Máquina");//Lbl es label uno de los componentes de interfaz gráfica
        nJugadoresTxt.setText("2");
        nJugadoresTxt.setEnabled(false); // habilitarlo o no...false lo deshabilita
        ocultarElementosNombreJugadores();
        mostrarElementosNombreJugadores(2);
        jugador2Txt.setText("Máquina");
    }//GEN-LAST:event_menuOp1ActionPerformed
// Todo este código es de Interfaz Gráfica */
    private void menuOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOp2ActionPerformed
        nJugadoresTxt.setText("");//Un método set tiene un tipo de retorno "void" y toma un parámetro del tipo adecuado para asignar a la variable miembro asociada.
        mostrarTodosLosElementos();
        tituloLbl.setText("Bingo Multi-Jugador");////Lbl es label uno de los componentes de interfaz gráfica
        labelMsg1.setVisible(true);
        nJugadoresTxt.setEnabled(true);
        ocultarElementosNombreJugadores();
        jugador2Txt.setText("Jugador 2");
    }//GEN-LAST:event_menuOp2ActionPerformed

    private void nJugadoresTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nJugadoresTxtKeyReleased
        String valor = nJugadoresTxt.getText();//get devuelve el valor de una propiedad de un objeto. Un método get tiene un tipo de retorno que se relaciona con el tipo de variable miembro asociada.
        ocultarElementosNombreJugadores();
        if (valor != null && !valor.equals("")) {
            Integer valorNumerico = Integer.valueOf(valor); // parseo, pasar una variable dde un tipo a otro tipo(mediante .valueOf o .parseInt
            if (valorNumerico < 1 || valorNumerico > 4) {
                nJugadoresTxt.setText("");
                ocultarElementosNombreJugadores();
            } else {
                mostrarElementosNombreJugadores(valorNumerico);
            }
        }
    }//GEN-LAST:event_nJugadoresTxtKeyReleased
 /*Todo este código es de Interfaz Gráfica 
    private es un modificador de acceso como public, protected, 
    El modificador private especifica que sólo se puede acceder al miembro 
    en su propia clase.
    */
    
    private void iniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBtnActionPerformed
        String[] nombres = new String[4];//boton comprar
        nombres[0] = jugador1Txt.getText();
        nombres[1] = jugador2Txt.getText();
        nombres[2] = jugador3Txt.getText();
        nombres[3] = jugador4Txt.getText();

        String valor = nJugadoresTxt.getText();
        if (valor != null && !valor.equals("")) {
            Integer valorNumerico = Integer.valueOf(valor); // parseo
            Cartones cs = new Cartones(valorNumerico, nombres, automarcarCheck.isSelected());//Estoy creando objetos pertenecientes a la class Cartones, esta ine permite pasar a class cartonesstancia 
            cs.setVisible(true);
        }

    }//GEN-LAST:event_iniciarBtnActionPerformed
//Todo este código es de Interfaz Gráfica 
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//Todo este código es de Interfaz Gráfica
    private void informacion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacion

    }//GEN-LAST:event_informacion
//Todo este código es de Interfaz Gráfica
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Infornacion i = new Infornacion();
        i.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private String obtenerNombre(int numeroJugador) {
        if (numeroJugador == 1) {
            return jugador1Txt.getText();//return: La sentencia return se emplea para salir de la secuencia de ejecución de las sentencias de un método y, opcionalmente, devolver un valor. Tras la salida del método se vuelve a la secuencia de ejecución del programa al lugar de llamada de dicho método.
        }
        if (numeroJugador == 2) {
            return jugador2Txt.getText();
        }
        if (numeroJugador == 3) {
            return jugador3Txt.getText();
        }
        if (numeroJugador == 4) {
            return jugador4Txt.getText();
        } else {
            return "";
        }
    }

    private void mostrarTodosLosElementos() {
        tituloLbl.setVisible(true);
        jSeparator1.setVisible(true);
        nJugadoresLbl.setVisible(true);
        nJugadoresTxt.setVisible(true);
    }

    private void mostrarElementosNombreJugadores(int cantidaMostrar) {
        nombreJugadoresLbl.setVisible(true);
        jSeparator2.setVisible(true);
        if (cantidaMostrar > 0 && cantidaMostrar < 5) {
            jugador1Lbl.setVisible(true);
            jugador1Txt.setVisible(true);
            iniciarBtn.setVisible(true);//boton iniciar es el boton comprar
            automarcarCheck.setVisible(true);
        }

        if (cantidaMostrar > 1 && cantidaMostrar < 5) {
            jugador2Lbl.setVisible(true);
            jugador2Txt.setVisible(true);
        }

        if (cantidaMostrar > 2 && cantidaMostrar < 5) {
            jugador3Lbl.setVisible(true);
            jugador3Txt.setVisible(true);
        }

        if (cantidaMostrar > 3 && cantidaMostrar < 5) {
            jugador4Lbl.setVisible(true);
            jugador4Txt.setVisible(true);
        }
    }
// Todo este código es de Interfaz Gráfica 
    private void ocultarElementosNombreJugadores() {
        jSeparator2.setVisible(false);
        jugador1Lbl.setVisible(false);
        jugador1Txt.setVisible(false);
        jugador2Lbl.setVisible(false);
        jugador2Txt.setVisible(false);
        jugador3Lbl.setVisible(false);
        jugador3Txt.setVisible(false);
        jugador4Lbl.setVisible(false);
        jugador4Txt.setVisible(false);
        nombreJugadoresLbl.setVisible(false);
        iniciarBtn.setVisible(false);
    }
// Todo este código es de Interfaz Gráfica 
    private void ocultarTodosLosElementos() {
        nombreJugadoresLbl.setVisible(false);
        tituloLbl.setVisible(false);
        jSeparator1.setVisible(false);
        nJugadoresLbl.setVisible(false);
        nJugadoresTxt.setVisible(false);
        labelMsg1.setVisible(false);
        jSeparator2.setVisible(false);
        jugador1Lbl.setVisible(false);
        jugador1Txt.setVisible(false);
        jugador2Lbl.setVisible(false);
        jugador2Txt.setVisible(false);
        jugador3Lbl.setVisible(false);
        jugador3Txt.setVisible(false);
        jugador4Lbl.setVisible(false);
        jugador4Txt.setVisible(false);
        iniciarBtn.setVisible(false);
        automarcarCheck.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
// Todo este código es de Interfaz Gráfica, Código autogenerado
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox automarcarCheck;
    private javax.swing.JButton iniciarBtn;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jugador1Lbl;
    private javax.swing.JTextField jugador1Txt;
    private javax.swing.JLabel jugador2Lbl;
    private javax.swing.JTextField jugador2Txt;
    private javax.swing.JLabel jugador3Lbl;
    private javax.swing.JTextField jugador3Txt;
    private javax.swing.JLabel jugador4Lbl;
    private javax.swing.JTextField jugador4Txt;
    private javax.swing.JLabel labelMsg1;
    private javax.swing.JMenuItem menuOp1;
    private javax.swing.JMenuItem menuOp2;
    private javax.swing.JLabel nJugadoresLbl;
    private javax.swing.JTextField nJugadoresTxt;
    private javax.swing.JLabel nombreJugadoresLbl;
    private javax.swing.JLabel tituloLbl;
    // End of variables declaration//GEN-END:variables
}
