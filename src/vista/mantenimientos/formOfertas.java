
package vista.mantenimientos;

import java.awt.Color;
import javax.swing.JFrame;
import modelo.mantenimiento.mOferta;
import controlador.modificar;

/**
 *
 * @author Ignacio
 */
public class formOfertas extends javax.swing.JFrame {

    private String linea_A, linea_B;
    
    mOferta mo = new mOferta();
    modificar editor;
    
    /**
     * Creates new form vistaOferta
     */
    public formOfertas() {
        initComponents();
        setTitle("Oferta");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coins.png"))); // NOI18N
        jLabel1.setText(" Oferta");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        msg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg.setToolTipText("");
        msg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("ID Oferta");

        txtID.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });

        txtMatricula.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatriculaMouseClicked(evt);
            }
        });
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("ID Matricula");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Descripcion");

        txtDescrip.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtDescrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDescripMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Precio");

        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDescrip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("  Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/forward.png"))); // NOI18N
        btnCerrar.setText("  Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
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
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        // inicializar el objeto siempre es impresindible
        mo  = new mOferta();
        
        // deposito mi confianza en que el mesaje va a guiar el sistema XD
        if(msg.getText().equals("Modificando"))
        {
            // verifico que no hay celdas vacias
            if(verificar())
            {
                // almaceno la nueva linea en una variable
                linea_B = txtID.getText()+","+txtMatricula.getText()
                                 +","+txtDescrip.getText()+","+txtPrecio.getText();
                
                // inicializo el objeto de mi clase modificar
                editor = new modificar(linea_A, linea_B, mo.path);
                
                // ejecuto mi segundo paso de la clase
                editor.editar();
                
                // finalizo comprovabando que el archivo de almacenamiento fue modificado 
                if(editor.reenombrar())
                {
                    msg.setForeground(Color.blue);
                    msg.setText("Datos Modificados");
                    clear();
                    txtID.setText("");
                }
                
            }
            
        }else
        {
            // verifico que no hay celdas vacias
            if(verificar())
            {
                // almaceno la nueva linea en una variable
                linea_A = txtID.getText()+","+txtMatricula.getText()
                                 +","+txtDescrip.getText()+","+txtPrecio.getText();
                
                // finalizo verificando que los datos se guardaron en el archivo
                // correctamente.
                if(mo.crear(linea_A))
                {
                    msg.setText("Datos Guardados");
                    clear();
                    txtID.setText("");
                }

            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        // TODO add your handling code here:
        
        txtID.setBackground(Color.white);
        txtID.setForeground(Color.black);
        
        // Inicializo el objeto para una verificacion diferente
        mo = new mOferta();
        
        // Limpio las celdas cuando el ID esta vacio
        if(!txtID.getText().equals(""))
        {
            // Verifico si existe 
            if(!mo.verificar(txtID.getText()))
            {
                msg.setForeground(Color.blue);
                msg.setText("Creando");
                clear();
            }else{
                
                msg.setForeground(Color.red);
                msg.setText("Modificando");
                
                // si existe capturo los datos en una variable
                linea_A = txtID.getText()+","+txtMatricula.getText()
                                     +","+txtDescrip.getText()+","+txtPrecio.getText();
                
            }
        }else{
            clear();
            msg.setText("");
        }
        
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyReleased
        // TODO add your handling code here:
        txtMatricula.setBackground(Color.white);
        txtMatricula.setForeground(Color.black);
    }//GEN-LAST:event_txtMatriculaKeyReleased

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
        msg.setText("");
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatriculaMouseClicked
        // TODO add your handling code here:
        txtMatricula.setBackground(Color.white);
        txtMatricula.setForeground(Color.black);
        
    }//GEN-LAST:event_txtMatriculaMouseClicked

    private void txtDescripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripMouseClicked
        // TODO add your handling code here:
        txtDescrip.setBackground(Color.white);
        txtDescrip.setForeground(Color.black);
        txtDescrip.setText("");
    }//GEN-LAST:event_txtDescripMouseClicked

    private void txtPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMouseClicked
        // TODO add your handling code here:
        txtPrecio.setBackground(Color.white);
        txtPrecio.setForeground(Color.black);
        txtPrecio.setText("");
    }//GEN-LAST:event_txtPrecioMouseClicked

    boolean verificar()
    {
        boolean v = true;
        if(txtID.getText().equals(""))
        {
            txtID.setBackground(Color.red);
            msg.setText("Ingresa el ID");
            v = false;
        }else if(txtMatricula.getText().equals(""))
        {
            txtMatricula.setBackground(Color.red);
            msg.setText("Ingresa la Matricula");
            v = false;
        }else if(txtDescrip.getText().equals(""))
        {
            txtDescrip.setBackground(Color.red);
            txtDescrip.setForeground(Color.white);
            txtDescrip.setText("Obligatorio");
            v = false;
        }else if(txtPrecio.getText().equals(""))
        {
            txtPrecio.setBackground(Color.red);
            txtPrecio.setForeground(Color.white);
            txtPrecio.setText("Obligatorio");
            v = false;
        }
        
        return v;
    }
    
    void clear()
    {
        //txtID.setText("");
        txtMatricula.setText("");
        txtDescrip.setText("");
        txtPrecio.setText("");
        linea_A = "";
        linea_B = "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel msg;
    public static javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtMatricula;
    public static javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
