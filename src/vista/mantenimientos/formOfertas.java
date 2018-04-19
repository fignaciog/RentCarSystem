
package vista.mantenimientos;

import java.awt.Color;
import javax.swing.JFrame;
import modelo.mantenimiento.mOferta;
import modelo.mantenimiento.mVehiculo;
import controlador.modificar;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Ignacio
 */
public class formOfertas extends javax.swing.JFrame {

    private String linea_A, linea_B;
    
    mOferta mo = new mOferta();
    mVehiculo mv;
    modificar editor;
    
    private int id_Oferta;
    private String id_Matricula;
    private String Descripcion_Oferta;
    private Double Precio_Oferta;
    public Double Precio_Gama;
    
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
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        limite = new javax.swing.JLabel();
        txtPorciento = new javax.swing.JTextField();
        estados = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PcO = new javax.swing.JLabel();
        marcaVeh = new javax.swing.JLabel();
        modeloVeh = new javax.swing.JLabel();
        descVeh = new javax.swing.JLabel();
        precioGama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coins.png"))); // NOI18N
        jLabel1.setText(" Oferta");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        msg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg.setToolTipText("");
        msg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ID Oferta");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });

        txtMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatriculaFocusGained(evt);
            }
        });
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("ID Matricula");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Porciento");

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New folder/rentcar64.png"))); // NOI18N

        jLabel11.setText("Resultado");

        limite.setBackground(new java.awt.Color(0, 0, 0));
        limite.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limite.setForeground(new java.awt.Color(0, 176, 90));

        txtPorciento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcientoKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDescrip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(limite, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtPorciento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
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
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(limite, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
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
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limite)
                    .addComponent(txtPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        estados.setForeground(new java.awt.Color(255, 0, 51));
        estados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Modelo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Descripcion");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Precio Gama");

        jLabel12.setText("Informacion de la Matricula");

        jLabel13.setText("Precio con Oferta Aplicada");

        PcO.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        PcO.setForeground(new java.awt.Color(0, 0, 255));

        marcaVeh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marcaVeh.setForeground(new java.awt.Color(102, 102, 102));
        marcaVeh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        modeloVeh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modeloVeh.setForeground(new java.awt.Color(102, 102, 102));
        modeloVeh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        descVeh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descVeh.setForeground(new java.awt.Color(102, 102, 102));
        descVeh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        precioGama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precioGama.setForeground(new java.awt.Color(102, 102, 102));
        precioGama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(PcO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(marcaVeh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(modeloVeh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(descVeh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(precioGama, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PcO)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioGama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modeloVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcaVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaVeh)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modeloVeh)
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descVeh)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioGama)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PcO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane2)
                        .addGap(21, 21, 21))))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLayeredPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        // inicializar el objeto siempre es impresindible
        mo  = new mOferta();
        
        if(!precioGama.getText().equals(""))
        {
            try{
            Precio_Gama = Double.valueOf(precioGama.getText());
            }catch(NumberFormatException n)
            {
                estados.setText("No ingrese letras en el Precio");
            }
        }
        
        if(verificar())
        {
            // deposito mi confianza en que el mesaje va a guiar el sistema XD
            if(msg.getText().equals("Modificando"))
            {
                // almaceno la nueva linea en una variable
                linea_B = txtID.getText()+"_"+txtMatricula.getText()
                                 +"_"+txtDescrip.getText()+"_"+txtPorciento.getText()+"_"+PcO.getText();

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
                    infoVehiculo();
                    
                    txtID.setText("");
                }

            }else if(msg.getText().equals("Creando"))
            {
                // almaceno la nueva linea en una variable
                linea_A = txtID.getText()+"_"+txtMatricula.getText()
                                 +"_"+txtDescrip.getText()+"_"+txtPorciento.getText()+"_"+PcO.getText();

                // finalizo verificando que los datos se guardaron en el archivo
                // correctamente.
                if(mo.add(linea_A))
                {
                    msg.setText("Datos Guardados");
                    clear();
                    infoVehiculo();
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
        
        // Inicializo el objeto para una verificacion diferente
        mo = new mOferta();
        
        // Limpio las celdas cuando el ID esta vacio
        if(!txtID.getText().equals(""))
        {
            try{
                id_Oferta = Integer.valueOf(txtID.getText());
                // Verifico si existe 
                if(!mo.verify(String.valueOf(id_Oferta)))
                {
                    msg.setForeground(Color.blue);
                    msg.setText("Creando");
                    clear();
                    infoVehiculo();
                }else{

                    msg.setForeground(Color.red);
                    msg.setText("Modificando");
                    vehiculo();
                    porciento();
                    if(!matricula())
                    {
                        infoVehiculo();
                    }
                    // si existe capturo los datos en una variable
                    linea_A = String.valueOf(id_Oferta);

                }
                
                
            }catch(NumberFormatException e){
                estados.setText("No ingrese letras en el ID");
            }
            
        }else{
            clear();
            infoVehiculo();
            msg.setText("");
        }
        
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            txtID.transferFocus();
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtMatriculaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatriculaFocusGained
        // TODO add your handling code here:
            mv = new mVehiculo();
            if(!txtMatricula.getText().equals(""))
            {
                if(!mv.verify_Oferta(txtMatricula.getText()))
                {
                    estados.setText("La Matricula no existe");
                    infoVehiculo();
                }else{
                    estados.setText("");
                }
            }else{
                infoVehiculo();
            }
    }//GEN-LAST:event_txtMatriculaFocusGained

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!txtMatricula.getText().equals("")){
                if(matricula()){
                    
                }else{
                    infoVehiculo();
                    estados.setText("La Matricula insertada no existe!");
                }
            }else{ infoVehiculo(); }
        }
    }//GEN-LAST:event_txtMatriculaKeyPressed

    private void txtMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyReleased
        // TODO add your handling code here:
         if(!txtMatricula.getText().equals("")){
             if(!txtMatricula.getText().equals("")){
                if(matricula()){
                    estados.setText("");
                    porciento();
                }else{
                    infoVehiculo();
                    estados.setText("La Matricula insertada no existe!");
                }
            }else{ infoVehiculo(); }
        }else{ infoVehiculo(); }
    }//GEN-LAST:event_txtMatriculaKeyReleased

    private void txtPorcientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcientoKeyReleased
        // TODO add your handling code here:
        if(!txtPorciento.getText().equals("")){
            try{
                if(!(Double.valueOf(txtPorciento.getText()) <= 0)){
                    estados.setText("");
                    if(Double.valueOf(txtPorciento.getText()) < 15){
                        estados.setText("");
                        Precio_Oferta = Double.valueOf(txtPorciento.getText());
                        verLimite(Precio_Oferta);
                        limite.setText("RD$ "+String.valueOf(setPorciento(Precio_Oferta)));
                        Double vPcO = Double.valueOf(precioGama.getText()) - setPorciento(Precio_Oferta);
                        PcO.setText(String.valueOf(vPcO));
                    }else{
                        estados.setText("Has pasado el limite de una oferta. Consultalo con tu superior");
                    }
                }else{
                    estados.setText("La oferta no puede ser Menor o Igual a CERO");
                }
            }catch(NumberFormatException n){
                estados.setText("No ingrese letras en el precio");
            }
        }else{
            limite.setText("");
            PcO.setText("");
        }
    }//GEN-LAST:event_txtPorcientoKeyReleased

    boolean verificar()
    {
        boolean v = true;
        if(txtID.getText().equals(""))
        {
            txtID.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Ingrese el ID", "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtID.setBackground(Color.white);
            v = false;
        }else if(txtMatricula.getText().equals(""))
        {
            txtMatricula.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Ingrese la Matricula", "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtMatricula.setBackground(Color.white);
            v = false;
        }else if(estados.getText().equals("La Matricula no existe"))
        {
            txtMatricula.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "La Matricula no existe", "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtMatricula.setBackground(Color.white);
            v = false;
        }else if(txtDescrip.getText().equals(""))
        {
            txtDescrip.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Ingrese una Descripcion", "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtDescrip.setBackground(Color.white);
            v = false;
        }else if(txtPorciento.getText().equals(""))
        {
            txtPorciento.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Ingrese el Precio", "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtPorciento.setBackground(Color.white);
            v = false;
        }
        
        return v;
    }
    
    void clear()
    {
        //txtID.setText("");
        txtMatricula.setText("");
        txtDescrip.setText("");
        txtPorciento.setText("");
        linea_A = "";
        linea_B = "";
        estados.setText("");
        PcO.setText("");
    }
    
    boolean matricula()
    {
        mv = new mVehiculo();
        return mv.verify_Oferta(txtMatricula.getText());
    }
    
    void infoVehiculo()
    {
        marcaVeh.setText("");
        modeloVeh.setText("");
        descVeh.setText("");
        precioGama.setText("");
        limite.setText("");
        PcO.setText("");
    }
    
    Double setPorciento(Double po){
        Double pg = Double.valueOf(precioGama.getText());
        return ((pg * po) / 100);
    }
    
    void verLimite(Double x){
        if(x < 5)
        {
            limite.setForeground(Color.black);
        }else if(x > 5 && x < 10){
            limite.setForeground(Color.orange);
        }else{
            limite.setForeground(Color.red);
        }
    }
    
    void porciento(){
        if(!txtPorciento.getText().equals("")){
            if(!(Double.valueOf(txtPorciento.getText()) <= 0)){
                estados.setText("");
                if(Double.valueOf(txtPorciento.getText()) < 15){
                    estados.setText("");
                    Precio_Oferta = Double.valueOf(txtPorciento.getText());
                    verLimite(Precio_Oferta);
                    limite.setText("RD$ "+String.valueOf(setPorciento(Precio_Oferta)));
                    Double vPcO = Double.valueOf(precioGama.getText()) - setPorciento(Precio_Oferta);
                    PcO.setText(String.valueOf(vPcO));
                }else{
                    estados.setText("Has pasado el limite de una oferta. Consultalo con tu superior");
                }
            }else{
                estados.setText("La oferta no puede ser Menor o Igual a CERO");
            }
        }
    }
    
    void vehiculo(){
        if(!txtMatricula.getText().equals("")){
            if(matricula()){

            }else{
                infoVehiculo();
                estados.setText("La Matricula insertada no existe!");
            }
        }else{ infoVehiculo(); }
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PcO;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JLabel descVeh;
    public static javax.swing.JLabel estados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel limite;
    public static javax.swing.JLabel marcaVeh;
    public static javax.swing.JLabel modeloVeh;
    private javax.swing.JLabel msg;
    public static javax.swing.JLabel precioGama;
    public static javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtMatricula;
    public static javax.swing.JTextField txtPorciento;
    // End of variables declaration//GEN-END:variables
}
