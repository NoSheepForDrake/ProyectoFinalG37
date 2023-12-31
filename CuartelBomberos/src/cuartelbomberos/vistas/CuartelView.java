package cuartelbomberos.vistas;

import cuartelbomberos.accesoADatos.BrigadaData;
import cuartelbomberos.accesoADatos.CuartelData;
import cuartelbomberos.entidades.Brigada;
import cuartelbomberos.entidades.Cuartel;
import java.awt.Color;

import java.util.List;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;

public class CuartelView extends javax.swing.JInternalFrame {

    DefaultListModel modelo = new DefaultListModel();

    public CuartelView() {
        initComponents();
        setTitle("Cuartel");
        cargarComboBox();
        jlBrigadas.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcCuarteles = new javax.swing.JComboBox<>();
        jtDireccion = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlBrigadas = new javax.swing.JList<>();
        jbLimpiar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jlEstado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtX = new javax.swing.JTextField();
        jtY = new javax.swing.JTextField();
        jtID = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccione el Cuartel");

        jcCuarteles.setBackground(new java.awt.Color(0, 0, 0));
        jcCuarteles.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jcCuarteles.setForeground(new java.awt.Color(255, 255, 255));
        jcCuarteles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar cuartel" }));
        jcCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCuartelesActionPerformed(evt);
            }
        });

        jtDireccion.setBackground(new java.awt.Color(0, 0, 0));
        jtDireccion.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtDireccion.setForeground(new java.awt.Color(255, 255, 255));

        jtTelefono.setBackground(new java.awt.Color(0, 0, 0));
        jtTelefono.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jtCorreo.setBackground(new java.awt.Color(0, 0, 0));
        jtCorreo.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtCorreo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo");

        jLabel9.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Brigadas");

        jlBrigadas.setBackground(new java.awt.Color(0, 0, 0));
        jlBrigadas.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jlBrigadas.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jlBrigadas);

        jbLimpiar.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbEditar.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del cuartel");

        jtNombre.setBackground(new java.awt.Color(0, 0, 0));
        jtNombre.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coordenadas");

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("X");

        jLabel4.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Y");

        jLabel10.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado");

        jrbEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEstadoStateChanged(evt);
            }
        });
        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo");

        jtX.setBackground(new java.awt.Color(0, 0, 0));
        jtX.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtX.setForeground(new java.awt.Color(255, 255, 255));
        jtX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtXKeyTyped(evt);
            }
        });

        jtY.setBackground(new java.awt.Color(0, 0, 0));
        jtY.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtY.setForeground(new java.awt.Color(255, 255, 255));
        jtY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtYKeyTyped(evt);
            }
        });

        jtID.setEditable(false);
        jtID.setBackground(new java.awt.Color(0, 0, 0));
        jtID.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtID.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalir))
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtX, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtY, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jrbEstado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jrbEstado))
                    .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLimpiar)
                            .addComponent(jbNuevo)
                            .addComponent(jbEditar)
                            .addComponent(jbSalir)))
                    .addComponent(jLabel9))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jcCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCuartelesActionPerformed
        try {
            //obtengo el cuartel seleccionado en el combo box
            String cuartelSelec = (String) jcCuarteles.getSelectedItem();
            CuartelData cua = new CuartelData();
            //me aseguro que se seleccione un cuetel
            if ("Buscar cuartel".equals(cuartelSelec)) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un cuartel");
                return;
            }
            //obtengo los datos de direccion, tel y correo de a cuerdo con el nombre del cuartel seleccionado
            Cuartel c = cua.buscarCuartelNombre(cuartelSelec);
            jtDireccion.setText(c.getDireccion());
            jtTelefono.setText(c.getTelefono());
            jtCorreo.setText(c.getCorreo());
            jtNombre.setText(cuartelSelec);
            jtX.setText(String.valueOf(c.getCoord_X()));
            jtY.setText(String.valueOf(c.getCoord_Y()));
            jrbEstado.setSelected(c.isEstado());
            jtID.setText(String.valueOf(c.getCodCuartel()));
            borrarJList();
            cargarJList();
        } catch (NullPointerException e) {
            //JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jcCuartelesActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        String dire = jtDireccion.getText();
        String tel = jtTelefono.getText();
        String cor = jtCorreo.getText();
        String nom = jtNombre.getText();
        String coordX = jtX.getText();
        String coordY = jtY.getText();
        String iden = jtID.getText();

        if (dire.isEmpty() || tel.isEmpty() || cor.isEmpty() || nom.isEmpty()
                || coordX.isEmpty() || coordY.isEmpty() || iden.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacíos");
            return;
        }

        int x = Integer.parseInt(jtX.getText());
        int y = Integer.parseInt(jtY.getText());
        int id = Integer.parseInt(jtID.getText());
        boolean est = jrbEstado.isSelected();

        CuartelData c = new CuartelData();
        
        String nombreAnterior = (String) jcCuarteles.getSelectedItem();
        Cuartel cuartel = new Cuartel(id, nom, dire, x, y, tel, cor, est);
        c.editarCuartel(cuartel);

        //cargarComboBox();

        jcCuarteles.removeItem(nombreAnterior);
        jcCuarteles.addItem(nom);
       jcCuarteles.repaint();
        limpiar();

    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        CuartelData c = new CuartelData();
        //obtengo lo ingresado por la persona
        String dire = jtDireccion.getText();
        String tel = jtTelefono.getText();
        String cor = jtCorreo.getText();
        String nom = jtNombre.getText();
        String coordX = jtX.getText();
        String coordY = jtY.getText();
        
        boolean est = jrbEstado.isSelected();

        if (dire.isEmpty() || tel.isEmpty() || cor.isEmpty()
                || nom.isEmpty() || coordX.isEmpty() || coordY.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacíos");
            return;
        }

        int x = Integer.parseInt(jtX.getText());
        int y = Integer.parseInt(jtY.getText());
        Cuartel cuartel = new Cuartel(nom, dire, x, y, tel, cor, est);
        boolean existe = c.existeCuartel(dire);
        //JOptionPane.showMessageDialog(null,existe);
        if (existe) {
            JOptionPane.showMessageDialog(null, "Existe un cuartel con la direccion ingresada");
        } else {
            c.guardarCuartel(cuartel);
        }
        cargarComboBox();

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jrbEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEstadoStateChanged
        if (jrbEstado.isSelected()) {
            jlEstado.setForeground(Color.YELLOW);
            jlEstado.setText("Activo");
        } else {
            jlEstado.setForeground(Color.YELLOW);
            jlEstado.setText("Inactivo");
        }
    }//GEN-LAST:event_jrbEstadoStateChanged

    private void jtXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtXKeyTyped
        //este metodo hace que solo permita escribir numeros y de no ser asi no lo escribe
        int key = evt.getKeyChar(); //obtengo la tecla que se preciono
        boolean numero = key >= 48 && key <= 57; //esto significa que recorro los numeros del 0 al 9, xq alt48=0
        if (!numero) {
            evt.consume();//evita que se coloque letras o caracteres
        }
    }//GEN-LAST:event_jtXKeyTyped

    private void jtYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtYKeyTyped
        //este metodo hace que solo permita escribir numeros y de no ser asi no lo escribe
        int key = evt.getKeyChar(); //obtengo la tecla que se preciono
        boolean numero = key >= 48 && key <= 57; //esto significa que recorro los numeros del 0 al 9, xq alt48=0
        if (!numero) {
            evt.consume();//evita que se coloque letras o caracteres
        }
    }//GEN-LAST:event_jtYKeyTyped
    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {
        //este metodo hace que solo permita escribir numeros y de no ser asi no lo escribe
        int key = evt.getKeyChar(); //obtengo la tecla que se preciono
        boolean numero = key >= 48 && key <= 57; //esto significa que recorro los numeros del 0 al 9, xq alt48=0
        if (!numero) {
            evt.consume();//evita que se coloque letras o caracteres
        }
        //trim remueve los espacios, length es longitud
        if (jtTelefono.getText().trim().length() == 10) {
            evt.consume();// si ya se coloco 10 numeros no me deja escribir mas 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcCuarteles;
    private javax.swing.JList<String> jlBrigadas;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtX;
    private javax.swing.JTextField jtY;
    // End of variables declaration//GEN-END:variables
    
    public void cargarComboBox() {
        CuartelData cuar = new CuartelData();
        List<Cuartel> listaCuartel = cuar.listarCuartel();
        for (Cuartel cuartel : listaCuartel) {
            jcCuarteles.addItem(cuartel.getNombreCuartel());
        }
    }

    public void cargarJList() {
        BrigadaData bd = new BrigadaData();
        int id = Integer.parseInt(jtID.getText());
        List<Brigada> brigadas = bd.buscarBrigadaXCuartel(id);
        jlBrigadas.setModel(modelo);
        for (int i = 0; i < brigadas.size(); i++) {
            modelo.addElement(brigadas.get(i).getNombreBriga() + " - " + brigadas.get(i).getEspecialidad());
        }
    }

    public void borrarJList() {
        jlBrigadas.setModel(modelo);
        for (int i = 0; i < 50; i++) {
            modelo.clear();
        }
    }

    public void limpiar() {
        jtCorreo.setText("");
        jtDireccion.setText("");
        jtTelefono.setText("");
        jtNombre.setText("");
        jtX.setText("");
        jtY.setText("");
        jtID.setText("");
        jrbEstado.setSelected(false);
        borrarJList();
//        jcCuarteles.setSelectedIndex(0);
    }

}
