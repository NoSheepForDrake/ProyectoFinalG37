
package cuartelbomberos.vistas;

import cuartelbomberos.accesoADatos.BrigadaData;
import cuartelbomberos.accesoADatos.CuartelData;
import cuartelbomberos.accesoADatos.siniestroData;
import cuartelbomberos.entidades.Cuartel;
import cuartelbomberos.entidades.Siniestro;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;


public class SiniestroActivoView extends javax.swing.JInternalFrame {

    
    public SiniestroActivoView() {
        initComponents();
        setTitle("Siniestro");
        cargarComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTcod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAdetalle = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTcoordX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTcoordY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDinicio = new com.toedter.calendar.JDateChooser();
        jDfinalizo = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jTpuntuacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRsiOno = new javax.swing.JRadioButton();
        jCtipo = new javax.swing.JComboBox<>();
        jBguardar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBaniadirC = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTcuartelDispo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTcodBriga = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBlimpiarCampos = new javax.swing.JButton();
        jLdistMetros = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Siniestro");

        jLabel1.setText("Código:");

        jLabel2.setText("Tipo:");

        jTcod.setToolTipText("Solo ingresar número para buscar.");

        jLabel3.setText("Detalle:");

        jTAdetalle.setColumns(20);
        jTAdetalle.setRows(5);
        jTAdetalle.setToolTipText("Ingrese los detalles del siniestro.");
        jScrollPane1.setViewportView(jTAdetalle);

        jLabel4.setText("Ubicacion:");

        jLabel5.setText("X");

        jTcoordX.setToolTipText("Coordenada X");

        jLabel6.setText("Y");

        jTcoordY.setToolTipText("Coordenada Y");

        jLabel7.setText("Fecha Inicio:");

        jLabel8.setText("Fecha Term:");

        jDinicio.setToolTipText("Seleccione la fecha de comienzo del siniestro.");

        jDfinalizo.setToolTipText("Seleccione la fecha de finalizacion del siniestro");

        jLabel9.setText("Puntuacion:");

        jTpuntuacion.setToolTipText("Ingrese un valor númerico del 1 al 10.");
        jTpuntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpuntuacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Resuelto?:");

        jRsiOno.setText("Si/No");
        jRsiOno.setToolTipText("Seleccione para Si, no seleccione para No.");
        jRsiOno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRsiOnoActionPerformed(evt);
            }
        });

        jCtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un siniestro..." }));
        jCtipo.setToolTipText("Seleccione el tipo de siniestro.");
        jCtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCtipoActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBaniadirC.setText("Añadir cuartel");
        jBaniadirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaniadirCActionPerformed(evt);
            }
        });

        jLabel11.setText("Cuartel disponible:");

        jTcuartelDispo.setEditable(false);
        jTcuartelDispo.setToolTipText("Información del cuartel mas cercano en respuesta al siniestro");

        jLabel12.setText("codBrigada:");

        jTcodBriga.setEditable(false);
        jTcodBriga.setToolTipText("Brigada a cargo de ejecucion bajo orden del cuartel que se muesta arriba.");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBlimpiarCampos.setText("Limpiar");
        jBlimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarCamposActionPerformed(evt);
            }
        });

        jLdistMetros.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLdistMetrosPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTcod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCtipo, 0, 1, Short.MAX_VALUE)
                                .addGap(44, 44, 44))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jDfinalizo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBguardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBaniadirC)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTpuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jRsiOno)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTcuartelDispo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTcodBriga, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBlimpiarCampos)
                    .addComponent(jLdistMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jCtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLdistMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jTcoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jTcoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jTpuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jTcuartelDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jRsiOno)
                                    .addComponent(jLabel12)
                                    .addComponent(jTcodBriga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jDinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jDfinalizo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBguardar)
                        .addComponent(jBmodificar)
                        .addComponent(jBaniadirC)
                        .addComponent(jBbuscar)
                        .addComponent(jBlimpiarCampos)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTpuntuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpuntuacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpuntuacionActionPerformed

    private void jRsiOnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRsiOnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRsiOnoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        //Boton guardar /-/ Carga los datos de un siniestro a la base de datos.
        
        try {
            String tipo = String.valueOf(jCtipo.getSelectedItem());
            java.util.Date fechaI = jDinicio.getDate();
            int x = Integer.parseInt(jTcoordX.getText());
            int y = Integer.parseInt(jTcoordY.getText());
            String detalle = jTAdetalle.getText();
            java.util.Date fechaF = jDfinalizo.getDate();
            int puntuacion = Integer.parseInt(jTpuntuacion.getText());
            int brigada = Integer.parseInt(jTcodBriga.getText());
            boolean resuelto = jRsiOno.isSelected();
            boolean activo = true;
            
            Instant instant = fechaI.toInstant();
            LocalDate fechaSiniestro = instant.atZone(ZoneId.systemDefault()).toLocalDate();
            
            Instant instant2 = fechaF.toInstant();
            LocalDate fechaResol = instant2.atZone(ZoneId.systemDefault()).toLocalDate();
            
            Siniestro siniestro = new Siniestro(tipo, fechaSiniestro, x, y, detalle, fechaResol, puntuacion, brigada, resuelto, activo);
            siniestroData sis = new siniestroData();
            sis.guardarSiniestro(siniestro);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Valor nulo: " + e);
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        //Boton buscar /-/ Busca un siniestro mediante un codigo proporcionado.
        
        try {
            siniestroData cod = new siniestroData();
            int codigo = Integer.parseInt(jTcod.getText());

            jTcod.setText(String.valueOf(cod.buscarSiniestro(codigo).getCodigo()));
            jCtipo.setSelectedItem(String.valueOf(cod.buscarSiniestro(codigo).getTipo()));
            jDinicio.setDate(Date.valueOf(cod.buscarSiniestro(codigo).getFechaSiniestro()));
            jTcoordX.setText(String.valueOf(cod.buscarSiniestro(codigo).getCoord_X()));
            jTcoordY.setText(String.valueOf(cod.buscarSiniestro(codigo).getCoord_Y()));
            jTAdetalle.setText(cod.buscarSiniestro(codigo).getText());
            jDfinalizo.setDate(Date.valueOf(cod.buscarSiniestro(codigo).getFechaResol()));
            jTpuntuacion.setText(String.valueOf(cod.buscarSiniestro(codigo).getPuntuacion()));
            jTcodBriga.setText(String.valueOf(cod.buscarSiniestro(codigo).getCodBrigada()));
            jRsiOno.setSelected(cod.buscarSiniestro(codigo).getResuelto());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(null, a);
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        //Boton modificar /-/ Modifica los datos de un siniestro.
        
        try {
            int cod =Integer.parseInt(jTcod.getText());
            String tipo = String.valueOf(jCtipo.getSelectedItem());
            java.util.Date fechaI = jDinicio.getDate();
            int x = Integer.parseInt(jTcoordX.getText());
            int y = Integer.parseInt(jTcoordY.getText());
            String detalle = jTAdetalle.getText();
            java.util.Date fechaF = jDfinalizo.getDate();
            int puntuacion = Integer.parseInt(jTpuntuacion.getText());
            int brigada = Integer.parseInt(jTcodBriga.getText());
            boolean resuelto = jRsiOno.isSelected();
            boolean activo = true;
            
            Instant instant = fechaI.toInstant();
            LocalDate fechaSiniestro = instant.atZone(ZoneId.systemDefault()).toLocalDate();
            
            Instant instant2 = fechaF.toInstant();
            LocalDate fechaResol = instant2.atZone(ZoneId.systemDefault()).toLocalDate();
            
            Siniestro siniestro = new Siniestro(cod,tipo, fechaSiniestro, x, y, detalle, fechaResol, puntuacion, brigada, resuelto, activo);
            siniestroData sis = new siniestroData();
            sis.editarSiniestro(siniestro);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Valor nulo: " + e);
        }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBaniadirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaniadirCActionPerformed
        // Boton añadir cuartel /-/ Localiza el cuartel mas cercano con la brigada disponible.
        try {
            BrigadaData bri = new BrigadaData();
            CuartelData tip = new CuartelData();
            List<Cuartel> asd = tip.listarCuartel();

            if (jTcoordX.getText().isEmpty() || jTcoordY.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar las coordenadas primero para poder hacer el calculo.");
            } else {
                int corX = Integer.parseInt(jTcoordX.getText());
                int corY = Integer.parseInt(jTcoordY.getText());
                int[] cx = new int[asd.size()];
                int[] cy = new int[asd.size()];

                for (int i = 0; i < asd.size(); i++) {
                    Cuartel qwe = asd.get(i);
                    cx[i] = qwe.getCoord_X();
                    cy[i] = qwe.getCoord_Y();
                }

                int cuartelMasCercano = -1;
                double distanciaMinima = Double.MAX_VALUE;

                for (int i = 0; i < cx.length; i++) {
                    int deltaX = cx[i] - corX;
                    int deltaY = cy[i] - corY;
                    double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

                    if (distancia < distanciaMinima) {
                        distanciaMinima = distancia;
                        cuartelMasCercano = i;
                    }
                }

                if (cuartelMasCercano != -1) {

                    jTcuartelDispo.setText(tip.cuartelPorCoord(cx[cuartelMasCercano], cy[cuartelMasCercano]).getNombreCuartel());
                    int h = bri.buscarBrigadaEsp((String) jCtipo.getSelectedItem()).getCodBrigada();
                    jTcodBriga.setText(String.valueOf(h));
                    jLdistMetros.setText("Distancia: " + String.valueOf(distanciaMinima));

                } else {
                    JOptionPane.showMessageDialog(null, "No hay cuarteles o brigadas disponibles.");
                }
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Mensaje: " + e);
        }
    }//GEN-LAST:event_jBaniadirCActionPerformed

    private void jCtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCtipoActionPerformed

    }//GEN-LAST:event_jCtipoActionPerformed

    private void jLdistMetrosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLdistMetrosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLdistMetrosPropertyChange

    private void jBlimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarCamposActionPerformed
        // Boton limpiar /-/ Hace un set en blanco en todos los campos de texto.
        
        jLdistMetros.setText("");
        jRsiOno.setSelected(false);
        jTAdetalle.setText("");
        jTcod.setText("");
        jTcodBriga.setText("");
        jTcoordX.setText("");
        jTcoordY.setText("");
        jTcuartelDispo.setText("");
        jTpuntuacion.setText("");
        jCtipo.setSelectedIndex(0);
        
    }//GEN-LAST:event_jBlimpiarCamposActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaniadirC;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiarCampos;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox<String> jCtipo;
    private com.toedter.calendar.JDateChooser jDfinalizo;
    private com.toedter.calendar.JDateChooser jDinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLdistMetros;
    private javax.swing.JRadioButton jRsiOno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAdetalle;
    private javax.swing.JTextField jTcod;
    private javax.swing.JTextField jTcodBriga;
    private javax.swing.JTextField jTcoordX;
    private javax.swing.JTextField jTcoordY;
    private javax.swing.JTextField jTcuartelDispo;
    private javax.swing.JTextField jTpuntuacion;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox() {

        String tipos[] = {"Incendio", "Accidente", "Rescate", "Emergencias", "Derrumbes", "Materiales Peligrosos", "Otros..."};

        List<String> taps = Arrays.asList(tipos);

        for (String materia : taps) {
            jCtipo.addItem(materia.toString());
        }

    }

}
