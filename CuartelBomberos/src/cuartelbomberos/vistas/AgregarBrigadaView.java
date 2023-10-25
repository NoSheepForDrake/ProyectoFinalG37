package cuartelbomberos.vistas;

import cuartelbomberos.accesoADatos.BrigadaData;
import cuartelbomberos.accesoADatos.CuartelData;
import cuartelbomberos.entidades.Brigada;
import cuartelbomberos.entidades.Cuartel;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class AgregarBrigadaView extends javax.swing.JInternalFrame {

    public AgregarBrigadaView() {
        initComponents();
        setTitle("Brigadas");
        cargarComboBox();
        cargarCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel = new javax.swing.JPanel();
        jtBrigada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbEspecialidad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcbCuartel = new javax.swing.JComboBox<>();
        Salir = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtEstado = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtEspecialidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtCuartel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        jtBrigada.setBackground(new java.awt.Color(0, 0, 0));
        jtBrigada.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtBrigada.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de Brigada");

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Especialidad");

        jcbEspecialidad.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jcbEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        jcbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialidad..." }));
        jcbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEspecialidadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado");

        jrbEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEstadoStateChanged(evt);
            }
        });
        jrbEstado.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jrbEstadoVetoableChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar por Nombre");

        jtNombre.setBackground(new java.awt.Color(0, 0, 0));
        jtNombre.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(255, 255, 255));

        buscar.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 0, 0));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asignarle un cuartel");

        jcbCuartel.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jcbCuartel.setForeground(new java.awt.Color(255, 255, 255));
        jcbCuartel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar cuartel" }));

        Salir.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Guardar.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Editar.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        Editar.setForeground(new java.awt.Color(0, 0, 0));
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(0, 0, 0));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Asignar Especialidad");

        jtEspecialidad.setEditable(false);
        jtEspecialidad.setBackground(new java.awt.Color(0, 0, 0));
        jtEspecialidad.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtEspecialidad.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cuartel");

        jtCuartel.setEditable(false);
        jtCuartel.setBackground(new java.awt.Color(0, 0, 0));
        jtCuartel.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtCuartel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo Brigada");

        jtID.setEditable(false);
        jtID.setBackground(new java.awt.Color(0, 0, 0));
        jtID.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtID.setForeground(new java.awt.Color(255, 255, 255));
        jtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Editar)
                .addGap(18, 18, 18)
                .addComponent(Guardar)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addGap(39, 39, 39))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jrbEstado)
                                .addGap(18, 18, 18)
                                .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(buscar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(106, 106, 106)
                                .addComponent(jtCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcbCuartel, 0, 197, Short.MAX_VALUE)
                            .addComponent(jcbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEstado)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar)
                    .addComponent(Guardar)
                    .addComponent(Salir)
                    .addComponent(Limpiar))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEspecialidadActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_SalirActionPerformed

    private void jrbEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEstadoStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jrbEstadoStateChanged

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        BrigadaData bd = new BrigadaData();
        String brigada = jtNombre.getText();
        if (brigada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe escribir el nombre de la brigada para buscar");
            return;
        }
        Brigada briga = bd.buscarBrigadaXNombre(brigada);
        if (briga != null) {
            jtBrigada.setText(briga.getNombreBriga());
            jtEspecialidad.setText(briga.getEspecialidad());
            jtCuartel.setText(briga.getCuartel().getNombreCuartel());
            jrbEstado.setSelected(briga.isLibre());
            jtID.setText(String.valueOf(briga.getCodBrigada()));
        } else {
            JOptionPane.showMessageDialog(null, "No existe una brigada con el nombre ingresado");
            limpiar();
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        BrigadaData bd = new BrigadaData();
        String nombre = jtBrigada.getText();
        boolean est = jrbEstado.isSelected();

        if (nombre.isEmpty() || jtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return;
        }
        String especialidadSelec = (String) jcbEspecialidad.getSelectedItem();
        if ("Especialidad".equals(especialidadSelec)) {
            String especialidad = jtEspecialidad.getText();

        } else {
            jtEspecialidad.setText(especialidadSelec);
        }
        String especialidad = jtEspecialidad.getText();
        //JOptionPane.showMessageDialog(null,especialidad);
        String cuartelSelec = (String) jcbCuartel.getSelectedItem();

        int id = Integer.parseInt(jtID.getText());
        if ("Buscar cuartel".equals(cuartelSelec)) {
            String cuartelSele = jtCuartel.getText();
            CuartelData cd = new CuartelData();
            Cuartel cuartel = cd.buscarCuartelNombre(cuartelSele);
            //JOptionPane.showMessageDialog(null,cuartel.getCodCuartel());
            Brigada b = new Brigada(id, nombre, especialidad, est, cuartel);
            bd.editarBrigada(b);

        } else if (cuartelSelec != null) {
            // Dividir el elemento seleccionado 
            String[] partes = cuartelSelec.split(" - ");
            if (partes.length > 0) {
                String nombrecuartel = partes[0].trim();
                CuartelData cd = new CuartelData();
                Cuartel cuartel = cd.buscarCuartelNombre(nombrecuartel);
                Brigada b = new Brigada(id, nombre, especialidad, est, cuartel);
                //JOptionPane.showMessageDialog(null, nombre + "," + especialidad + "," + cuartel);
                bd.editarBrigada(b);
            }
        }

    }//GEN-LAST:event_EditarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        try {
            BrigadaData bd = new BrigadaData();
            String nombre = jtBrigada.getText();
            boolean est = jrbEstado.isSelected();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                return;
            }
            Brigada existe = bd.buscarBrigadaXNombre(nombre);
            if (existe != null) {
                JOptionPane.showMessageDialog(null, "Existe una brigada con el nombre ingresado");
            } else {
                String especialidadSelec = (String) jcbEspecialidad.getSelectedItem();
                if ("Especialidad...".equals(especialidadSelec)) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una especialidad");
                    return;
                }
                jtEspecialidad.setText(especialidadSelec);

                String cuartelSelec = (String) jcbCuartel.getSelectedItem();
                if ("Buscar cuartel".equals(cuartelSelec)) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un cuartel");
                    return;
                }
                jtCuartel.setText(cuartelSelec);

                if (cuartelSelec != null) {

                    // Dividir el elemento seleccionado 
                    String[] partes = cuartelSelec.split(" - ");
                    if (partes.length > 0) {
                        String nombrecuartel = partes[0].trim();
                        CuartelData cd = new CuartelData();
                        Cuartel cuartel = cd.buscarCuartelNombre(nombrecuartel);
                        Brigada b = new Brigada(nombre, especialidadSelec, est, cuartel);
                        
                        bd.guardarBrigada(b);
                    }
                }
            }

        } catch (NullPointerException e) {
            //JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_GuardarActionPerformed

    private void jrbEstadoVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jrbEstadoVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoVetoableChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jcbCuartel;
    private javax.swing.JComboBox<String> jcbEspecialidad;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtBrigada;
    private javax.swing.JTextField jtCuartel;
    private javax.swing.JTextField jtEspecialidad;
    private javax.swing.JLabel jtEstado;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
private void cargarComboBox() {

        String tipos[] = {"Incendio", "Accidente", "Rescate", "Emergencias", "Derrumbes", "Materiales Peligrosos", "Otros..."};

        List<String> taps = Arrays.asList(tipos);

        for (String especialidad : taps) {
            jcbEspecialidad.addItem(especialidad.toString());
        }

    }

    public void cargarCombobox() {
        CuartelData cuar = new CuartelData();
        List<Cuartel> listaCuartel = cuar.listarCuartel();
        for (Cuartel cuartel : listaCuartel) {
            jcbCuartel.addItem(cuartel.getNombreCuartel());
        }
    }

    public void limpiar() {
        jtNombre.setText("");
        jtBrigada.setText("");
        jtCuartel.setText("");
        jtEspecialidad.setText("");
        jcbCuartel.setSelectedIndex(0);
        jcbEspecialidad.setSelectedIndex(0);
        jrbEstado.setSelected(false);
        jtID.setText("");
    }
}
