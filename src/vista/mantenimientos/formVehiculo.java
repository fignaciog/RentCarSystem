
package vista.mantenimientos;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.mantenimiento.mVehiculo;
import modelo.mantenimiento.mGama;
import controlador.modificar;
import java.awt.event.KeyEvent;

/**
 *
 * @author Ignacio
 */
public class formVehiculo extends javax.swing.JFrame {

    String linea_A, linea_B;
    
    mVehiculo mv;
    modificar editor;
    mGama mg;
    
    private String Matricula = "";
    private String Marca = "";
    private String Modelo = "";
    private int tipo_Vehiculo;
    private int tipo_Motor;
    private int Gama;
    private String Descripcion_Veh = "";
    private Boolean techo_electrico;
    private Boolean Aire_Acondicionado;
    private Boolean Interior_Cuero;
    private String Color_Veh = "";
    private Boolean Cambio_Auto;
    private Boolean Status_Veh;
    
    /**
     * Creates new form vistaVehiculo
     */
    public formVehiculo() {
        initComponents();
        setTitle("Vehiculo");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Formulario = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sTipoTrans = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        sEstado = new javax.swing.JComboBox<>();
        sAire = new javax.swing.JComboBox<>();
        sTecho = new javax.swing.JComboBox<>();
        sInterior = new javax.swing.JComboBox<>();
        sTipoVehiculo = new javax.swing.JComboBox<>();
        sTipoMotor = new javax.swing.JComboBox<>();
        txtColor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        gamaDescr = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        gamaPrecio = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        estados = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cars.png"))); // NOI18N
        jLabel1.setText("  Vehiculo");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Matricula");

        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Marca");

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
        });

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModeloKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Modelo");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Vehiculo");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Motor");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Gama");

        txtGama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGamaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGamaKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Descripcion");

        txtDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Techo Electrico");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Aire acondiconado");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Interior Cuero");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Color");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Cambio Automatico");

        sTipoTrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Estado");

        sEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Rentado" }));

        sAire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        sTecho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        sInterior.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        sTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Turistico", "Normal" }));

        sTipoMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Diesel", "Gasolina" }));

        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtColorKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Descripcion");

        gamaDescr.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Precio");

        gamaPrecio.setEnabled(false);

        Formulario.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(txtMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(txtMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(txtModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(txtGama, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(txtDescrip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(sTipoTrans, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(sEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(sAire, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(sTecho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(sInterior, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(sTipoVehiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(sTipoMotor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(txtColor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(gamaDescr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Formulario.setLayer(gamaPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(sTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(sTipoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sTipoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addComponent(txtDescrip)
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sTecho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sAire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormularioLayout.createSequentialGroup()
                                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(12, 12, 12))
                                    .addGroup(FormularioLayout.createSequentialGroup()
                                        .addComponent(gamaDescr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(gamaPrecio))))))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel16))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gamaDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gamaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sTipoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sTipoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sTecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sAire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnguardar.setText("  Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/forward.png"))); // NOI18N
        btnCerrar.setText("  Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        estados.setForeground(new java.awt.Color(255, 51, 51));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New folder/rentcar64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estados, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        mv = new mVehiculo();
        Marca = txtMarca.getText();
        Modelo = txtModelo.getText();
        Cambio_Auto = sTipoTrans.getSelectedIndex() == 1;
        techo_electrico = sTecho.getSelectedIndex() == 1;
        Aire_Acondicionado = sAire.getSelectedIndex() == 1;
        Interior_Cuero = sInterior.getSelectedIndex() == 1;
        Status_Veh = sEstado.getSelectedIndex() == 0;
        Descripcion_Veh = txtDescrip.getText();
        tipo_Vehiculo = sTipoVehiculo.getSelectedIndex();
        tipo_Motor = sTipoMotor.getSelectedIndex();
        Color_Veh = txtColor.getText();
        
        if(verifyData())
        {
            if(msg.getText().equals("Modificando"))
            {
                
                linea_B = Matricula+"_"+Marca+"_"+Modelo+"_"+Gama+"_"+
                tipo_Vehiculo+"_"+tipo_Motor+"_"+Cambio_Auto+"_"+Descripcion_Veh+"_"+
                techo_electrico+"_"+Aire_Acondicionado+"_"+Color_Veh+"_"+
                Interior_Cuero+"_"+Status_Veh;

                   editor = new modificar(Matricula, linea_B, mv.path);
                   editor.editar();
                   if(editor.reenombrar())
                   {
                       msg.setForeground(Color.blue);
                       msg.setText("Datos Modificados");
                       clear();
                   }else{
                       msg.setForeground(Color.red);
                       msg.setText("Datos No modificados");
                       clear();
                   }
            }else if(msg.getText().equals("Creando")){
                        
                        linea_A = Matricula+"_"+Marca+"_"+Modelo+"_"+Gama+"_"+
                        tipo_Vehiculo+"_"+tipo_Motor+"_"+Cambio_Auto+"_"+Descripcion_Veh+"_"+
                        techo_electrico+"_"+Aire_Acondicionado+"_"+Color_Veh+"_"+
                        Interior_Cuero+"_"+Status_Veh;

                        if(mv.add(linea_A))
                        {
                            msg.setForeground(Color.blue);
                            msg.setText("Datos Guardados");
                            clear();
                        }else{
                            msg.setForeground(Color.red);
                            msg.setText("Datos No guardados");
                            clear();
                        }
            }
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtGamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGamaKeyReleased
        // TODO add your handling code here:
        checkGama();
    }//GEN-LAST:event_txtGamaKeyReleased

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Matricula = txtMatricula.getText();
            mv = new mVehiculo();
            if(mv.verify(Matricula))
            {
                msg.setForeground(Color.red);
                msg.setText("Modificando");
                checkGama();
                
            }else{
                msg.setForeground(Color.blue);
                msg.setText("Creando");
                clear();
            }
            txtMatricula.transferFocus();
        }
    }//GEN-LAST:event_txtMatriculaKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(!txtMatricula.getText().equals(""))
            {
                txtMarca.transferFocus();
            }
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void txtModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(!txtModelo.getText().equals(""))
            {
                txtModelo.transferFocus();
            }
        }
    }//GEN-LAST:event_txtModeloKeyPressed

    private void txtGamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGamaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
           checkGama(); 
           if(!txtGama.getText().equals(""))
           {
               txtGama.transferFocus();
           }
        }
    }//GEN-LAST:event_txtGamaKeyPressed

    private void txtDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(!txtDescrip.getText().equals(""))
            {
                txtDescrip.transferFocus();
            }
        }
    }//GEN-LAST:event_txtDescripKeyPressed

    private void txtColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(!txtColor.getText().equals(""))
            {
                
            }
        }
    }//GEN-LAST:event_txtColorKeyPressed
    
    void checkGama()
    {
        mg = new mGama();
        try{
            if(!String.valueOf(Gama).equals(""))
            {
                Gama = Integer.valueOf(txtGama.getText());
                if(!mg.externVerify(String.valueOf(Gama)))
                {
                    estados.setText("El ID de la Gama no Existe");
                    gamaDescr.setText("");
                    gamaPrecio.setText("");
                }else{
                    estados.setText("");
                }
            }else{
                gamaDescr.setText("");
                gamaPrecio.setText("");
                estados.setText("");
            }
            
        }catch(NumberFormatException e)
        {
            estados.setText("No ingrese letras en tipo de Gama");
        }
    }
    
    void clear()
    {
        //txtMatricula.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtGama.setText("");
        sTipoVehiculo.setSelectedIndex(0);
        sTipoMotor.setSelectedIndex(0);
        sTipoTrans.setSelectedIndex(0);
        txtDescrip.setText("");
        sTecho.setSelectedIndex(0);
        sAire.setSelectedIndex(0);
        txtColor.setText("");
        sInterior.setSelectedIndex(0);
        sEstado.setSelectedIndex(0);
        linea_A = "";
        linea_B = "";
    }
    
    boolean verifyData()
    {
        boolean its = true;
        
        if(Matricula.equals(""))
        {
            txtMatricula.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe ingresar la Matricula", 
                    "Campo Oblogatorio", JOptionPane.ERROR_MESSAGE);
            txtMatricula.setBackground(Color.white);
            its = false;
        }else if(txtMarca.getText().equals("")){
            txtMarca.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe ingresar la Marca", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtMarca.setBackground(Color.white);
            its = false;
        }else if(txtModelo.getText().equals(""))
        {
            txtModelo.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe Ingresar el Modelo", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtModelo.setBackground(Color.white);
            its = false;
        }else if(txtGama.getText().equals(""))
        {
            txtGama.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe Ingresar la Gama", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtGama.setBackground(Color.white);
            its = false;   
        }else if(sTipoVehiculo.getSelectedIndex() == 0)
        {
            sTipoVehiculo.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Tipo de Vehiculo", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            sTipoVehiculo.setBackground(Color.white);
            its = false;
        }else if(sTipoMotor.getSelectedIndex() == 0)
        {
            sTipoMotor.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Tipo de Motor", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            sTipoMotor.setBackground(Color.white);
            its = false;
        }else if(sTipoTrans.getSelectedIndex() == 0)
        {
            sTipoTrans.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Tipo de Transmision", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            sTipoTrans.setBackground(Color.white);
            its = false;
        }else if(txtDescrip.getText().equals(""))
        {
            txtDescrip.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe Ingresar una Descripcion", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtDescrip.setBackground(Color.white);
            its = false;
        }else if(sTecho.getSelectedIndex() == 0)
        {
            sTecho.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Tipo de Techo", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            sTecho.setBackground(Color.white);
            its = false;
        }else if(sAire.getSelectedIndex() == 0)
        {
            sAire.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe seleccionar el Estado del Aire Acondicionado", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            sAire.setBackground(Color.white);
            its = false;
        }else if(txtColor.getText().equals(""))
        {
            txtColor.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe ingresar un Color", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            txtColor.setBackground(Color.white);
            its = false;
        }else if(sInterior.getSelectedIndex() == 0)
        {
            sInterior.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Tipo de Interior del Vehiculo", 
                    "Campo Obligatorio", JOptionPane.ERROR_MESSAGE);
            sInterior.setBackground(Color.white);
            its = false;
        }
        return its;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Formulario;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnguardar;
    public static javax.swing.JLabel estados;
    public static javax.swing.JTextField gamaDescr;
    public static javax.swing.JTextField gamaPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel msg;
    public static javax.swing.JComboBox<String> sAire;
    public static javax.swing.JComboBox<String> sEstado;
    public static javax.swing.JComboBox<String> sInterior;
    public static javax.swing.JComboBox<String> sTecho;
    public static javax.swing.JComboBox<String> sTipoMotor;
    public static javax.swing.JComboBox<String> sTipoTrans;
    public static javax.swing.JComboBox<String> sTipoVehiculo;
    public static javax.swing.JTextField txtColor;
    public static javax.swing.JTextField txtDescrip;
    public static javax.swing.JTextField txtGama;
    public static javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    public static javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
