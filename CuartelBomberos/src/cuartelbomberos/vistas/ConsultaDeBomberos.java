/*
Listar los bomberos activos
 */
package cuartelbomberos.vistas;

import cuartelbomberos.accesoADatos.BomberoData;
import cuartelbomberos.entidades.Bombero;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ConsultaDeBomberos extends javax.swing.JInternalFrame {
private DefaultTableModel tabla = new DefaultTableModel(){
         public boolean isCellEditable(int f, int c){
        return false;
        }
   
};
   
    public ConsultaDeBomberos() {
       
        initComponents();
        setTitle("Lista Bomberos activos");
        cargarCabecera();
        llenarTabla();
  

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtbuscar = new javax.swing.JTextField();
        jbsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        jtbuscar.setBackground(new java.awt.Color(0, 0, 0));
        jtbuscar.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        jtbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbuscarKeyReleased(evt);
            }
        });

        jbsalir.setFont(new java.awt.Font("FreeMono", 1, 12)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(0, 0, 0));
        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        Tabla.setBackground(new java.awt.Color(0, 0, 0));
        Tabla.setFont(new java.awt.Font("FreeMono", 0, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tabla.setSelectionForeground(new java.awt.Color(255, 255, 0));
        Tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbsalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);  //Cerrar ventana
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbuscarKeyReleased
        // TODO add your handling code here:
        String textoBusqueda = jtbuscar.getText().toLowerCase(); // Texto de búsqueda en minúsculas

        // Limpiar la tabla antes de aplicar el filtro
        borrarFilas();

        // Obtener la lista de bomberos activos desde BomberoData
        BomberoData bd = new BomberoData();
        List<Bombero> bomberosActivos = bd.listarBombero();

        // Filtrar y actualizar la tabla en tiempo real
        for (Bombero bombero : bomberosActivos) {
            String nombreApellido = bombero.getNombreApellido().toLowerCase();
            String dni = bombero.getDni().toLowerCase();
            String brigada = bombero.getBrigada().getNombreBriga().toLowerCase();

            // Filtra los bomberos cuyo nombre, DNI o brigada contengan el texto de búsqueda
            if (nombreApellido.contains(textoBusqueda)
                    || dni.contains(textoBusqueda)
                    || brigada.contains(textoBusqueda)) {
                tabla.addRow(new Object[]{bombero.getNombreApellido(), bombero.getDni(), bombero.getBrigada().getNombreBriga()});
            }
        }
    }//GEN-LAST:event_jtbuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbsalir;
    private javax.swing.JTextField jtbuscar;
    // End of variables declaration//GEN-END:variables


  private void cargarCabecera(){
        tabla.addColumn("Nombre y Apellido");
        tabla.addColumn("DNI");
        tabla.addColumn("Brigada Asignada");
        Tabla.setModel(tabla);
  }
    
    
  
  private void llenarTabla() {
            
// Limpiar la tabla
        tabla.setRowCount(0);
      
        // Obtener la lista de bomberos activos desde BomberoData
   BomberoData bd = new BomberoData();
    List<Bombero> bomberosActivos = bd.listarBombero();

        // Llenar la tabla con los bomberos activos
        for (Bombero bombero : bomberosActivos) {
//             JOptionPane.showMessageDialog(null, bombero.getNombreApellido());
//             JOptionPane.showMessageDialog(null, bombero.getDni());
//             JOptionPane.showMessageDialog(null, bombero.getBrigada().getNombreBriga());
            tabla.addRow(new Object[]{bombero.getNombreApellido(),bombero.getDni(),bombero.getBrigada().getNombreBriga()});
        }
    }
  
  private void borrarFilas(){
    
        int f = Tabla.getRowCount()-1;
        for(;f>=0;f--){
        tabla.removeRow(f);
        }
    }

}
