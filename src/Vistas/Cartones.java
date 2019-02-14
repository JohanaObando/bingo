/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import logic.Tombola;

/**
 *
 * @author yogap
 */
public class Cartones extends javax.swing.JFrame {

    Tombola tombola = new Tombola(90);//Creo un objeto llamado tombola perteneciente a la class Tombola
    int numeroJugadores;
    String[] nombres;
    int carton1Contador = 0;
    int carton2Contador = 0;
    int carton3Contador = 0;
    int carton4Contador = 0;
    boolean autoMarcar = false;
    
    public Cartones(int numeroJugadores, String[] nombres, boolean automarcar) {//Método Cartones
        this.numeroJugadores = numeroJugadores;//El this es una palabra reservada de Java y sirve para hacer referencia a un método o propiedad del objeto actual.
        this.nombres = nombres;
        this.autoMarcar = automarcar;
        initComponents();
        //para q no sean editables
        inciarCartones();//método
        mostarTablas(numeroJugadores);
        llenarCarton(carton1);
        llenarCarton(carton2);
        llenarCarton(carton3);
        llenarCarton(carton4);
        agregarNombres(nombres);
        ganadorLbl.setVisible(false);//Para que no visualize el ganador (LBl es un elemento de interfaz)
    }

    private void agregarNombres(String[] nombres) {
        jugador1Nombre.setText(nombres[0]);
        jugador2Nombre.setText(nombres[1]);
        jugador3Nombre.setText(nombres[2]);
        jugador4Nombre.setText(nombres[3]);
    }

    private void inciarCartones() {
        carton1.setEnabled(false); //setEnabled:utilizado para activar o desactivar el objeto o grupo de objetos especificado por objeto en el formulario actual. 
        carton2.setEnabled(false);
        carton3.setEnabled(false);
        carton4.setEnabled(false);
        carton1.setVisible(false);
        carton2.setVisible(false);
        carton3.setVisible(false);
        carton4.setVisible(false);
        iniciarJuegoBtn.setVisible(false);
        pedirNumeroBtn.setEnabled(true);
    }

    private void mostarTablas(int numeroJugadores) {//CARTONES
        if (numeroJugadores > 0 && numeroJugadores < 5) {
            carton1.setVisible(true);
        }

        if (numeroJugadores > 1 && numeroJugadores < 5) {
            carton2.setVisible(true);
        }

        if (numeroJugadores > 2 && numeroJugadores < 5) {
            carton3.setVisible(true);
        }

        if (numeroJugadores > 3 && numeroJugadores < 5) {
            carton4.setVisible(true);
        }
    }

    private void llenarCarton(JTable table) {
        TableModel model = table.getModel();//Table asi es la forma en qe se setea los valores a la tabla
        List<Integer> numerosEnCarton = new ArrayList<>(); //para verificar y evitar que se repitan

        String valor = "";//Lo vamos a usar en Menu Principal tambien, está como String para poder luego ponerle las "x"
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                // setValueAt: primer argumento es el valor, segundo la fila, tercero columna
                valor = "" + (obtenerNoRepetido(numerosEnCarton));
                model.setValueAt(valor, i, j);//otra forma de setear en este caso valores
            }
        }
    }

    private int obtenerNoRepetido(List<Integer> numerosEnCarton) {//list es una forma mas completa de crear un arreglo, y me permite tener func como contains o add
        Random r = new Random();
        int numero = r.nextInt(89) + 1;
        while (numerosEnCarton.contains(numero)) {//contains: una funcion que me permite ver si ya algo esta contenido en este caso número
            numero = r.nextInt(89) + 1;
        }
        numerosEnCarton.add(numero);//agregar números al carton
        return numero;//este return va arriba osea retorna a la linea 91.obtenernorepetido
    }

    private int[] verificarNumerosCarton(JTable table, Integer numeroBuscar) {
        TableModel model = table.getModel();
        int[] posiciones = new int[2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (model.getValueAt(i, j).toString().equals(numeroBuscar.toString())) {//encontro coincidencia con los numeros sacados en tombola
                    posiciones[0] = i;
                    posiciones[1] = j;
                    return posiciones;
                }
            }
        }
        return null;//si no encontro ningún número
    }

    private void marcarNumeroCarton(int numeroSacado) {
        int[] tieneNumero;//arreglo
        String nuevoValor;

        tieneNumero = verificarNumerosCarton(carton1, numeroSacado);//
        if (tieneNumero != null) {
            carton1Contador++;//va avanzando según los números verificados que salgan y sean coincidentes
            nuevoValor = carton1.getModel().getValueAt(tieneNumero[0], tieneNumero[1]) + "";
            carton1.getModel().setValueAt("X " + nuevoValor + " X", tieneNumero[0], tieneNumero[1]);
        }
        tieneNumero = verificarNumerosCarton(carton2, numeroSacado);
        if (tieneNumero != null) {
            carton2Contador++;
            nuevoValor = carton2.getModel().getValueAt(tieneNumero[0], tieneNumero[1]) + "";
            carton2.getModel().setValueAt("X " + nuevoValor + " X", tieneNumero[0], tieneNumero[1]);
        }
        tieneNumero = verificarNumerosCarton(carton3, numeroSacado);
        if (tieneNumero != null) {
            carton3Contador++;
            nuevoValor = carton3.getModel().getValueAt(tieneNumero[0], tieneNumero[1]) + "";
            carton3.getModel().setValueAt("X " + nuevoValor + " X", tieneNumero[0], tieneNumero[1]);
        }
        tieneNumero = verificarNumerosCarton(carton4, numeroSacado);
        if (tieneNumero != null) {
            carton4Contador++;
            nuevoValor = carton4.getModel().getValueAt(tieneNumero[0], tieneNumero[1]) + "";
            carton4.getModel().setValueAt("X " + nuevoValor + " X", tieneNumero[0], tieneNumero[1]);
        }
        moverCartones();//método, el que va teniendo más números concidentes va moviéndose
        anunciarGanador();//método
    }

    private void moverCartones() {//es un método q me permite ir  intercambiando los cartones conforme se vayan llenando los cartones.model1 model2
        if (carton1Contador > carton2Contador && carton1Contador > carton3Contador && carton1Contador > carton4Contador) {

        }
        if (carton2Contador > carton1Contador && carton2Contador > carton3Contador && carton2Contador > carton4Contador) {
            TableModel model1 = carton1.getModel();
            TableModel model2 = carton2.getModel();
            carton1.setModel(model2);
            carton2.setModel(model1);

            String nombre1 = jugador1Nombre.getText();
            String nombre2 = jugador2Nombre.getText();
            jugador1Nombre.setText(nombre2);
            jugador2Nombre.setText(nombre1);

            int temp1 = carton1Contador;
            int temp2 = carton2Contador;
            carton1Contador = temp2;
            carton2Contador = temp1;
        }
        if (carton3Contador > carton1Contador && carton3Contador > carton2Contador && carton3Contador > carton4Contador) {
            TableModel model1 = carton1.getModel();
            TableModel model3 = carton3.getModel();
            carton1.setModel(model3);
            carton3.setModel(model1);

            String nombre1 = jugador1Nombre.getText();
            String nombre3 = jugador3Nombre.getText();
            jugador1Nombre.setText(nombre3);
            jugador3Nombre.setText(nombre1);

            int temp1 = carton1Contador;
            int temp3 = carton3Contador;
            carton1Contador = temp3;
            carton3Contador = temp1;
        }
        if (carton4Contador > carton1Contador && carton4Contador > carton3Contador && carton4Contador > carton2Contador) {
            TableModel model1 = carton1.getModel();
            TableModel model4 = carton4.getModel();
            carton1.setModel(model4);
            carton4.setModel(model1);

            String nombre1 = jugador1Nombre.getText();
            String nombre4 = jugador4Nombre.getText();
            jugador1Nombre.setText(nombre4);
            jugador4Nombre.setText(nombre1);

            int temp1 = carton1Contador;
            int temp4 = carton4Contador;
            carton1Contador = temp4;
            carton4Contador = temp1;
        }
    }

    private void anunciarGanador() { // si lo hay
        if (carton1Contador >= 15) {
            ganadorLbl.setVisible(true);
            ganadorLbl.setText("¡¡¡BINGO!!!..... Ganador: " + jugador1Nombre.getText());
            carton1.setBackground(Color.cyan);
            pedirNumeroBtn.setEnabled(false);
            iniciarJuegoBtn.setVisible(true);
        }
        if (carton1Contador == 14) {//permite q a falta de un número se cambie de color
            carton1.setBackground(Color.green);
        }
        if (carton2Contador == 14) {
            carton2.setBackground(Color.green);
        }
        if (carton3Contador == 14) {
            carton3.setBackground(Color.green);
        }
        if (carton4Contador == 14) {
            carton4.setBackground(Color.green);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        carton1 = new javax.swing.JTable();
        jugador1Nombre = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        carton2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        carton3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        carton4 = new javax.swing.JTable();
        jugador2Nombre = new javax.swing.JLabel();
        jugador3Nombre = new javax.swing.JLabel();
        jugador4Nombre = new javax.swing.JLabel();
        numeroLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pedirNumeroBtn = new javax.swing.JButton();
        numerosSacadosTxt = new javax.swing.JTextField();
        ganadorLbl = new javax.swing.JLabel();
        iniciarJuegoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bingo");
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        carton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carton1.setForeground(new java.awt.Color(0, 0, 153));
        carton1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        carton1.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(carton1);

        jugador1Nombre.setText("jLabel1");

        carton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carton2.setForeground(new java.awt.Color(0, 0, 153));
        carton2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(carton2);

        carton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carton3.setForeground(new java.awt.Color(0, 0, 153));
        carton3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(carton3);

        carton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carton4.setForeground(new java.awt.Color(0, 0, 153));
        carton4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(carton4);

        jugador2Nombre.setText("jLabel1");

        jugador3Nombre.setText("jLabel2");

        jugador4Nombre.setText("jLabel3");

        numeroLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("TOMBOLA");

        pedirNumeroBtn.setBackground(new java.awt.Color(255, 255, 51));
        pedirNumeroBtn.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        pedirNumeroBtn.setText("Número");
        pedirNumeroBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 102, 0))); // NOI18N
        pedirNumeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirNumeroBtnActionPerformed(evt);
            }
        });

        numerosSacadosTxt.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        numerosSacadosTxt.setForeground(new java.awt.Color(0, 102, 0));

        ganadorLbl.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        ganadorLbl.setForeground(new java.awt.Color(255, 0, 0));
        ganadorLbl.setText("jLabel1");

        iniciarJuegoBtn.setBackground(new java.awt.Color(51, 204, 0));
        iniciarJuegoBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        iniciarJuegoBtn.setText("Iniciar Otro Juego");
        iniciarJuegoBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 255)));
        iniciarJuegoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJuegoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jugador1Nombre)
                                .addGap(313, 313, 313)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jugador2Nombre)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jugador3Nombre)
                                .addGap(313, 313, 313))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jugador4Nombre)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(numeroLbl)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(iniciarJuegoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pedirNumeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(179, 179, 179))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(numerosSacadosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(ganadorLbl)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1Nombre)
                    .addComponent(jugador2Nombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(numeroLbl)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jugador3Nombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jugador4Nombre)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedirNumeroBtn)
                        .addGap(41, 41, 41)
                        .addComponent(iniciarJuegoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(53, 53, 53)
                .addComponent(ganadorLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(numerosSacadosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedirNumeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirNumeroBtnActionPerformed
        if (tombola.numerosSacados.size() < 90) {
            Integer n = tombola.obtenerNumero(); //n: número que va saliendo
            numeroLbl.setText("" + n);
            numerosSacadosTxt.setText(numerosSacadosTxt.getText() + n + ", ");
            if (autoMarcar) {
                marcarNumeroCarton(n);
            }
        } else {
            System.err.println("SALIERON TODOS LOS NUMEROS YA!!!!");
        }
    }//GEN-LAST:event_pedirNumeroBtnActionPerformed

    private void iniciarJuegoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJuegoBtnActionPerformed

        //para q no sean editables
        inciarCartones();
        mostarTablas(this.numeroJugadores);
        llenarCarton(carton1);
        llenarCarton(carton2);
        llenarCarton(carton3);
        llenarCarton(carton4);
        agregarNombres(this.nombres);
        ganadorLbl.setVisible(false);   
        carton1.setBackground(Color.white);
        carton2.setBackground(Color.white);
        carton3.setBackground(Color.white);
        carton4.setBackground(Color.white);
        tombola.numerosSacados = new ArrayList<>();
        numerosSacadosTxt.setText("");
        carton1Contador=0;
        carton2Contador=0;
        carton3Contador=0;
        carton4Contador=0;
    }//GEN-LAST:event_iniciarJuegoBtnActionPerformed
// Todo este código es de Interfaz Gráfica, Código autogenerado
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carton1;
    private javax.swing.JTable carton2;
    private javax.swing.JTable carton3;
    private javax.swing.JTable carton4;
    private javax.swing.JLabel ganadorLbl;
    private javax.swing.JButton iniciarJuegoBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jugador1Nombre;
    private javax.swing.JLabel jugador2Nombre;
    private javax.swing.JLabel jugador3Nombre;
    private javax.swing.JLabel jugador4Nombre;
    private javax.swing.JLabel numeroLbl;
    private javax.swing.JTextField numerosSacadosTxt;
    private javax.swing.JButton pedirNumeroBtn;
    // End of variables declaration//GEN-END:variables
}
