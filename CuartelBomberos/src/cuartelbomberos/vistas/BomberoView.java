/*El Boton guardar va a tener doble funcionalidad, va a corroborar que el bombero no se encuentre en la base
de datos(a traves del DNI), de encontrarse se van a modificar los datos, caso contrario se va a guardar 
como un bombero nuevo*/
package cuartelbomberos.vistas;

import cuartelbomberos.accesoADatos.BomberoData;
import cuartelbomberos.accesoADatos.BrigadaData;
import cuartelbomberos.entidades.Bombero;
import cuartelbomberos.entidades.Brigada;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;

public class BomberoView extends javax.swing.JInternalFrame {

    public BomberoView() {
        initComponents();
        setTitle("Bombero");
        cargarComboBox();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        jtnomyapell = new javax.swing.JTextField();
        jtcelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbbrigada = new javax.swing.JComboBox<>();
        jbsalir = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();
        jbbuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtgSang = new javax.swing.JTextField();
        jdcfechaNac = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("DNI: ");

        jLabel2.setText("Nombre y Apellido: ");

        jLabel3.setText("Fecha Nacimiento: ");

        jLabel4.setText("Celular: ");

        jtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdniActionPerformed(evt);
            }
        });

        jLabel5.setText("Asignar a Brigada");

        jcbbrigada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una brigada" }));
        jcbbrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbrigadaActionPerformed(evt);
            }
        });

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jblimpiar.setText("Limpiar");
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Grupo Sanguineo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jblimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtnomyapell, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbbuscar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtcelular, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jdcfechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbbrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtgSang, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtnomyapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbbrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtgSang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalir)
                    .addComponent(jbeliminar)
                    .addComponent(jbguardar)
                    .addComponent(jblimpiar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbbrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbrigadaActionPerformed
        // TODO add your handling code here               
    }//GEN-LAST:event_jcbbrigadaActionPerformed

    private void jtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdniActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        // TODO add your handling code here:
        String dni = jtdni.getText();
        BomberoData bd = new BomberoData();

        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe escribir un DNI a buscar");
            return;
        }

        // Valida que el DNI contenga solo números antes de buscar en la base de datos
        if (contieneSoloNumeros(dni)) {
            Bombero bombero = bd.buscarBombero(dni); // Buscamos en la BD el DNI

            if (bombero != null) {
                jtnomyapell.setText(bombero.getNombreApellido());
                jtcelular.setText(bombero.getCelular());
                jtgSang.setText(bombero.getgSanguineo());
                if (bombero.getFechaNac() != null) {
                    jdcfechaNac.setDate(Date.valueOf(bombero.getFechaNac()));
                } else {
                    jdcfechaNac.setDate(null); // Para borrar la fecha si no hay fecha de nacimiento
                }
                // Faltaria corroborar si esta o no en una brigada
                Brigada brigadaDelBombero = bombero.getBrigada();
                jcbbrigada.setSelectedItem(brigadaDelBombero.getNombreBriga() + " - " + brigadaDelBombero.getEspecialidad());

            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no se encuentra en la Base de Datos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El DNI debe contener solo números.");

        }
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        // TODO add your handling code here:
        limpiarPlanilla();
    }//GEN-LAST:event_jblimpiarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        // TODO add your handling code here:
 // Obtener los valores de los campos
    String dni = jtdni.getText();
    String nombreApellido = jtnomyapell.getText();
    String celular = jtcelular.getText();
    // Obtener la fecha de nacimiento en formato Date
    java.util.Date utilDate = jdcfechaNac.getDate();
    String gSanguineo = jtgSang.getText();

    // Validar que el DNI contenga solo números
    if (!contieneSoloNumeros(dni)) {
        JOptionPane.showMessageDialog(null, "El DNI debe contener solo números.");
        return;
    }

    // Capturamos el nombre de la Brigada
    String brigadaSelec = (String) jcbbrigada.getSelectedItem();
    if (brigadaSelec != null) {
        // Dividir el elemento seleccionado en nombre y especialidad
        String[] partes = brigadaSelec.split(" - ");
        if (partes.length > 0) {
            String nombreBrigada = partes[0].trim();
            BomberoData bdata = new BomberoData();
            BrigadaData bd = new BrigadaData();

            // Buscamos la brigada por el nombre
            Brigada brigada = bd.buscarBrigadaXNombre(nombreBrigada);

            // Verificar que los campos obligatorios no estén vacíos
            if (jtdni.getText().isEmpty() || nombreApellido.isEmpty() || celular.isEmpty()
                    || gSanguineo.isEmpty() || jcbbrigada.getSelectedItem().equals("Seleccione una brigada")
                    || jdcfechaNac.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                return;
            }

            // Convertir la fecha de util.Date a LocalDate
            Instant instant = utilDate.toInstant();
            LocalDate fechaNac = instant.atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaActual = LocalDate.now();

            // Comparar la fecha de nacimiento con la fecha actual
            if (fechaNac.isAfter(fechaActual)) {
                JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser una fecha futura.");
                return;
            }

            int codBrigada = brigada.getCodBrigada();

            // Si el bombero ya existe, modifica su información
            Bombero existente = bdata.buscarBombero(dni);
            if (existente != null) {
                // Verifica si el bombero está siendo asignado a otra brigada
                if (existente.getBrigada().getCodBrigada() != codBrigada) {
                    int numeroBomberosEnBrigada = bdata.contarBomberosEnBrigadaExcluyendoBombero(codBrigada, existente.getDni());
                    if (numeroBomberosEnBrigada >= 5) {
                        JOptionPane.showMessageDialog(null, "La brigada seleccionada ya tiene el cupo máximo de bomberos. Elige otra brigada.");
                        return;
                    }
                }
                existente.setNombreApellido(nombreApellido);
                existente.setFechaNac(fechaNac);
                existente.setCelular(celular);
                existente.setBrigada(brigada);
                existente.setgSanguineo(gSanguineo);
                bdata.editarBombero(existente);
                
            } else {
                Bombero bombero = new Bombero(dni, nombreApellido, fechaNac, celular, brigada, gSanguineo, true);
                bdata.guardarBombero(bombero);
               
            }
        }
    }
    }//GEN-LAST:event_jbguardarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
         // Obtener los valores de los campos
        String dni = jtdni.getText();
        
        //creamos una instancia de bomberodata
        BomberoData bd = new BomberoData();
        
        //Creamos una instancia de bombero
        Bombero bom = bd.buscarBombero(dni);
        JOptionPane.showMessageDialog(null,"DNI del bombero: "+ bom.getDni());
        JOptionPane.showMessageDialog(null,"Estado del bombero: "+ bom.isEstado());
        //verificamos si el estado del bombero es true o false
        if(bom.isEstado()==false){
        JOptionPane.showMessageDialog(null, "El bombero no se puede eliminar, no hay registros del mismo");
        }else{
        bd.eliminarBombero(bom.getDni());
        }
        
        
    }//GEN-LAST:event_jbeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbbrigada;
    private com.toedter.calendar.JDateChooser jdcfechaNac;
    private javax.swing.JTextField jtcelular;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtgSang;
    private javax.swing.JTextField jtnomyapell;
    // End of variables declaration//GEN-END:variables

    public void limpiarPlanilla() {
        jtdni.setText(""); // Limpia los campos
        jtnomyapell.setText("");
        jtcelular.setText("");
        jtgSang.setText("");
        jdcfechaNac.setDate(null);
        jcbbrigada.setSelectedIndex(0);
    }

    public void cargarComboBox() {
        BrigadaData bd = new BrigadaData();
        List<Brigada> listaBrigada = bd.listarBrigadas();

        for (Brigada brigada : listaBrigada) {

            jcbbrigada.addItem(brigada.getNombreBriga() + " - " + brigada.getEspecialidad());
        }

    }

    public boolean contieneSoloNumeros(String cadena) {
        // Utiliza una expresión regular para verificar si la cadena contiene solo números
        return cadena.matches("[0-9]+");
    }

}
