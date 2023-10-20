
package cuartelbomberos.vistas;

import cuartelbomberos.accesoADatos.BrigadaData;
import cuartelbomberos.accesoADatos.CuartelData;
import cuartelbomberos.accesoADatos.siniestroData;
import cuartelbomberos.entidades.Brigada;
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
        jLnumerodi = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Siniestro");

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Tipo:");

        jTcod.setBackground(new java.awt.Color(0, 0, 0));
        jTcod.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jTcod.setForeground(new java.awt.Color(255, 255, 255));
        jTcod.setToolTipText("Solo ingresar número para buscar.");

        jLabel3.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Detalle:");

        jTAdetalle.setBackground(new java.awt.Color(0, 0, 0));
        jTAdetalle.setColumns(20);
        jTAdetalle.setFont(new java.awt.Font("FreeMono", 0, 14)); // NOI18N
        jTAdetalle.setForeground(new java.awt.Color(255, 255, 255));
        jTAdetalle.setRows(5);
        jTAdetalle.setToolTipText("Ingrese los detalles del siniestro.");
        jScrollPane1.setViewportView(jTAdetalle);

        jLabel4.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Ubicacion:");

        jLabel5.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("X");

        jTcoordX.setBackground(new java.awt.Color(0, 0, 0));
        jTcoordX.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jTcoordX.setForeground(new java.awt.Color(255, 255, 255));
        jTcoordX.setToolTipText("Coordenada X");

        jLabel6.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Y");

        jTcoordY.setBackground(new java.awt.Color(0, 0, 0));
        jTcoordY.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jTcoordY.setForeground(new java.awt.Color(255, 255, 255));
        jTcoordY.setToolTipText("Coordenada Y");

        jLabel7.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Fecha Inicio:");

        jLabel8.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Fecha Term:");

        jDinicio.setToolTipText("Seleccione la fecha de comienzo del siniestro.");

        jDfinalizo.setToolTipText("Seleccione la fecha de finalizacion del siniestro");

        jLabel9.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Puntuacion:");

        jTpuntuacion.setBackground(new java.awt.Color(0, 0, 0));
        jTpuntuacion.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jTpuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        jTpuntuacion.setToolTipText("Ingrese un valor númerico del 1 al 10.");
        jTpuntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpuntuacionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Resuelto?:");

        jRsiOno.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jRsiOno.setForeground(new java.awt.Color(102, 102, 255));
        jRsiOno.setText("Si/No");
        jRsiOno.setToolTipText("Marque para Si, desmarque para No.");
        jRsiOno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRsiOnoActionPerformed(evt);
            }
        });

        jCtipo.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jCtipo.setForeground(new java.awt.Color(204, 204, 255));
        jCtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un siniestro..." }));
        jCtipo.setToolTipText("Seleccione el tipo de siniestro.");
        jCtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCtipoActionPerformed(evt);
            }
        });

        jBguardar.setFont(new java.awt.Font("FreeMono", 0, 12)); // NOI18N
        jBguardar.setForeground(new java.awt.Color(0, 0, 0));
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBmodificar.setFont(new java.awt.Font("FreeMono", 0, 12)); // NOI18N
        jBmodificar.setForeground(new java.awt.Color(0, 0, 0));
        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBaniadirC.setFont(new java.awt.Font("FreeMono", 0, 14)); // NOI18N
        jBaniadirC.setForeground(new java.awt.Color(0, 0, 0));
        jBaniadirC.setText("Añadir cuartel");
        jBaniadirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaniadirCActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Cuartel disponible:");

        jTcuartelDispo.setEditable(false);
        jTcuartelDispo.setBackground(new java.awt.Color(0, 0, 0));
        jTcuartelDispo.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jTcuartelDispo.setForeground(new java.awt.Color(255, 255, 255));
        jTcuartelDispo.setToolTipText("Información del cuartel mas cercano en respuesta al siniestro");
        jTcuartelDispo.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("codBrigada:");

        jTcodBriga.setEditable(false);
        jTcodBriga.setBackground(new java.awt.Color(0, 0, 0));
        jTcodBriga.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jTcodBriga.setForeground(new java.awt.Color(255, 255, 255));
        jTcodBriga.setToolTipText("Brigada a cargo de ejecucion bajo orden del cuartel que se muesta arriba.");
        jTcodBriga.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jBbuscar.setFont(new java.awt.Font("FreeMono", 0, 14)); // NOI18N
        jBbuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBlimpiarCampos.setFont(new java.awt.Font("FreeMono", 0, 14)); // NOI18N
        jBlimpiarCampos.setForeground(new java.awt.Color(0, 0, 0));
        jBlimpiarCampos.setText("Limpiar");
        jBlimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarCamposActionPerformed(evt);
            }
        });

        jLdistMetros.setFont(new java.awt.Font("FreeMono", 0, 14)); // NOI18N
        jLdistMetros.setForeground(new java.awt.Color(0, 0, 0));
        jLdistMetros.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLdistMetrosPropertyChange(evt);
            }
        });

        jLnumerodi.setFont(new java.awt.Font("FreeMono", 0, 14)); // NOI18N
        jLnumerodi.setForeground(new java.awt.Color(0, 0, 0));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTcod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jDfinalizo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBaniadirC)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jBlimpiarCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTpuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jRsiOno)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTcodBriga, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jTcuartelDispo))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnumerodi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLdistMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(53, Short.MAX_VALUE))
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jTcoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jTcoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTpuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jTcuartelDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLdistMetros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jTcodBriga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLnumerodi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jDinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jDfinalizo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBaniadirC)
                        .addComponent(jBbuscar)
                        .addComponent(jBlimpiarCampos)))
                .addContainerGap(19, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "Los valores no pueden ser nulos");
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Puntuacion o Coordenadas Vacias / No hay brigada disponible.");
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

            //Aca revisamos primero que los campos de las coordenadas no esten vacios.
            if (jTcoordX.getText().isEmpty() || jTcoordY.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar las coordenadas primero.");
            } else {
                //primero tomamos las coordenadas ingresadas por el usuario y creamos 2 arrays para los cuarteles.
                int corX = Integer.parseInt(jTcoordX.getText());
                int corY = Integer.parseInt(jTcoordY.getText());
                int[] cx = new int[asd.size()];
                int[] cy = new int[asd.size()];
                //en este bucle for, almacenamos las coordenadas de los cuarteles.
                for (int i = 0; i < asd.size(); i++) {
                    Cuartel qwe = asd.get(i);
                    cx[i] = qwe.getCoord_X();
                    cy[i] = qwe.getCoord_Y();
                }

                //Aca hacemos el primer calculo de distancia utilizando el teorema de pitagoras para distancia.
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

                //Establecemos los parametros para el bucle.
                boolean brigadaEncontrada = false;
                int cuartelIndex = cuartelMasCercano;

                //Este bucle while lo que hace es revisar cuartel por cuartel cual es la brigada disponible
                //en este caso, mientras no se encuentre una brigada y el indice de cuartel sea menor al tamaño
                //de la lista de cuarteles, buscará y de encontrarlo, rompe el bucle con un break.
                while (!brigadaEncontrada && cuartelIndex < asd.size()) {

                    //op es el valor del codigo del cuartel encontrado mas cercano en base a la distancia del actual siniestro seleccionado.
                    int op = tip.cuartelPorCoord(cx[cuartelIndex], cy[cuartelIndex]).getCodCuartel();

                    String tipoSiniestro = (String) jCtipo.getSelectedItem();

                    //Se hace una lista de brigadas y se revisa cual es la disponible al revisar el cuartel
                    List<Brigada> abc = bri.listarBrigadas();

                    for (Brigada brigada : abc) {
                        if (brigada.getCuartel().getCodCuartel() == op && brigada.getEspecialidad().equals(tipoSiniestro)) {
                            jTcodBriga.setText(String.valueOf(brigada.getCodBrigada()));
                            brigadaEncontrada = true;
                            break;
                        }
                    }

                    cuartelIndex++;
                }
                //Si no hay ninguna brigada disponible en ningun cuartel, setea todos los campos en blanco
                //Si hay, mostrara la ubicación, el nombre del cuartel y la distancia.

                if (!brigadaEncontrada) {
                    JOptionPane.showMessageDialog(null, "No hay brigadas disponibles en los cuarteles mas cercanos.");
                    jTcodBriga.setText("");
                    jTcuartelDispo.setText("");
                    jLdistMetros.setText("");
                } else {
                    //Aca en el else volvemos a agregar el calculo para reescribir los valores del cuartel que sigue.
                    distanciaMinima = Math.sqrt(Math.pow(cx[cuartelIndex - 1] - corX, 2) + Math.pow(cy[cuartelIndex - 1] - corY, 2));
                    jTcuartelDispo.setText(tip.cuartelPorCoord(cx[cuartelIndex - 1], cy[cuartelIndex - 1]).getNombreCuartel());
                    jLdistMetros.setText("Distancia:");
                    jLnumerodi.setText(String.valueOf(distanciaMinima));
                }
            }
            //Luego de cada excepcion lanzada, limpiamos los campos para que el usuario pueda volver a ingresarlos correctamente.
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese coordenadas válidas.");
            jTcodBriga.setText("");
            jTcuartelDispo.setText("");
            jLdistMetros.setText("");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No hay brigadas disponibles en esos cuarteles cercanos.");
            jTcodBriga.setText("");
            jTcuartelDispo.setText("");
            jLdistMetros.setText("");
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
    private javax.swing.JLabel jLnumerodi;
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
