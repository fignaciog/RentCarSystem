
package vista;
import vista.movimiento.*;
import vista.mantenimientos.*;
import vista.consultas.vehiculo.*;
import vista.consultas.reserva.vcReserva;
import vista.consultas.recepcion.vcRecepcion;
import principal.login;
import modelo.mantenimiento.mUsuario;
import vista.consultas.cliente.*;
import vista.consultas.vcOfertas;

/**
 *
 * @author Ignacio
 */
public class inicio extends javax.swing.JFrame {
    
    mUsuario ml = new mUsuario();
    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        setTitle("Inicio | RentCarSystem");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public inicio(String u, String p) {
        
        initComponents();
        setTitle("Inicio | RentCarSystem");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        
        if("0".equals(ml.verify_Acceso(u, p)))
        {
            mUsuario.setEnabled(true);
            lmVehiculo.setEnabled(true);
            mOfertas.setEnabled(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clickMenu = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mUsuario = new javax.swing.JMenuItem();
        lmVehiculo = new javax.swing.JMenu();
        mVehiculo = new javax.swing.JMenuItem();
        mGama = new javax.swing.JMenuItem();
        mCliente = new javax.swing.JMenuItem();
        mOfertas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mReservaCliente = new javax.swing.JMenuItem();
        mRecepcionVehiculo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mcCliente = new javax.swing.JMenuItem();
        mcClienteID = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        vccVehiculo = new javax.swing.JMenuItem();
        btnMatricula = new javax.swing.JMenuItem();
        btnReservas = new javax.swing.JMenuItem();
        btnRecepcion = new javax.swing.JMenuItem();
        btnOfertas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mCerrarS = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Magneto", 2, 68)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New folder/rental.png"))); // NOI18N
        jLabel1.setText("RentCar System  ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuBar1.setComponentPopupMenu(clickMenu);

        jMenu1.setText("Mantenimientos");

        mUsuario.setText("Usuario");
        mUsuario.setEnabled(false);
        mUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mUsuario);

        lmVehiculo.setText("Vehiculo");
        lmVehiculo.setEnabled(false);

        mVehiculo.setText("Vehiculos");
        mVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVehiculoActionPerformed(evt);
            }
        });
        lmVehiculo.add(mVehiculo);

        mGama.setText("Gama");
        mGama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGamaActionPerformed(evt);
            }
        });
        lmVehiculo.add(mGama);

        jMenu1.add(lmVehiculo);

        mCliente.setText("Cliente");
        mCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mCliente);

        mOfertas.setText("Oferta");
        mOfertas.setEnabled(false);
        mOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOfertasActionPerformed(evt);
            }
        });
        jMenu1.add(mOfertas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimiento");

        mReservaCliente.setText("Reserva de Clientes");
        mReservaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReservaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mReservaCliente);

        mRecepcionVehiculo.setText("Recepcion de Vehiculos");
        mRecepcionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRecepcionVehiculoActionPerformed(evt);
            }
        });
        jMenu2.add(mRecepcionVehiculo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        jMenu5.setText("Clientes");

        mcCliente.setText("Clientes");
        mcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcClienteActionPerformed(evt);
            }
        });
        jMenu5.add(mcCliente);

        mcClienteID.setText("Por ID");
        mcClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcClienteIDActionPerformed(evt);
            }
        });
        jMenu5.add(mcClienteID);

        jMenu3.add(jMenu5);

        jMenu6.setText("Vehiculos");

        vccVehiculo.setText("Vehiculos");
        vccVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vccVehiculoActionPerformed(evt);
            }
        });
        jMenu6.add(vccVehiculo);

        btnMatricula.setText("Por Matricula");
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });
        jMenu6.add(btnMatricula);

        jMenu3.add(jMenu6);

        btnReservas.setText("Reservas");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        jMenu3.add(btnReservas);

        btnRecepcion.setText("Recepcion");
        btnRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionActionPerformed(evt);
            }
        });
        jMenu3.add(btnRecepcion);

        btnOfertas.setText("Ofertas");
        btnOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasActionPerformed(evt);
            }
        });
        jMenu3.add(btnOfertas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");

        mCerrarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.CTRL_MASK));
        mCerrarS.setText("Cerrar Seccion");
        mCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCerrarSActionPerformed(evt);
            }
        });
        jMenu4.add(mCerrarS);

        mSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.CTRL_MASK));
        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenu4.add(mSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCerrarSActionPerformed
        // TODO add your handling code here:
        this.dispose();
        login l = new login();
    }//GEN-LAST:event_mCerrarSActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void mUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsuarioActionPerformed
        // TODO add your handling code here:
        formUsuario vu = new formUsuario();
    }//GEN-LAST:event_mUsuarioActionPerformed

    private void mVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVehiculoActionPerformed
        // TODO add your handling code here:
        formVehiculo vv = new formVehiculo();
    }//GEN-LAST:event_mVehiculoActionPerformed

    private void mGamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGamaActionPerformed
        // TODO add your handling code here:
        formGama vg = new formGama();
    }//GEN-LAST:event_mGamaActionPerformed

    private void mClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClienteActionPerformed
        // TODO add your handling code here:
        formCliente vc = new formCliente();
    }//GEN-LAST:event_mClienteActionPerformed

    private void mOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOfertasActionPerformed
        // TODO add your handling code here:
        formOfertas vo = new formOfertas();
    }//GEN-LAST:event_mOfertasActionPerformed

    private void mReservaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReservaClienteActionPerformed
        // TODO add your handling code here:
        formReservaCliente vrc = new formReservaCliente();
    }//GEN-LAST:event_mReservaClienteActionPerformed

    private void mRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRecepcionVehiculoActionPerformed
        // TODO add your handling code here:
        formRecepcionVehiculo vrv = new formRecepcionVehiculo();
    }//GEN-LAST:event_mRecepcionVehiculoActionPerformed

    private void mcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcClienteActionPerformed
        // TODO add your handling code here:
        vcCliente cC = new vcCliente();
    }//GEN-LAST:event_mcClienteActionPerformed

    private void mcClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcClienteIDActionPerformed
        // TODO add your handling code here:
        vcID cID = new vcID();
    }//GEN-LAST:event_mcClienteIDActionPerformed

    private void vccVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vccVehiculoActionPerformed
        // TODO add your handling code here:
        vcVehiculo vccV = new vcVehiculo();
    }//GEN-LAST:event_vccVehiculoActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        // TODO add your handling code here:
        vcMatricula vccM = new vcMatricula();
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        // TODO add your handling code here:
        vcReserva vcr = new vcReserva();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionActionPerformed
        // TODO add your handling code here:
        vcRecepcion vcre = new vcRecepcion();
    }//GEN-LAST:event_btnRecepcionActionPerformed

    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        // TODO add your handling code here:
        vcOfertas vco = new vcOfertas();
    }//GEN-LAST:event_btnOfertasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnMatricula;
    private javax.swing.JMenuItem btnOfertas;
    private javax.swing.JMenuItem btnRecepcion;
    private javax.swing.JMenuItem btnReservas;
    private javax.swing.JPopupMenu clickMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu lmVehiculo;
    private javax.swing.JMenuItem mCerrarS;
    private javax.swing.JMenuItem mCliente;
    private javax.swing.JMenuItem mGama;
    private javax.swing.JMenuItem mOfertas;
    private javax.swing.JMenuItem mRecepcionVehiculo;
    private javax.swing.JMenuItem mReservaCliente;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenuItem mUsuario;
    private javax.swing.JMenuItem mVehiculo;
    private javax.swing.JMenuItem mcCliente;
    private javax.swing.JMenuItem mcClienteID;
    private javax.swing.JMenuItem vccVehiculo;
    // End of variables declaration//GEN-END:variables
}
