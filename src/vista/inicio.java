
package vista;
import vista.movimiento.vistaReservaClientes;
import vista.movimiento.vistaRecepcionVehiculo;
import vista.mantenimientos.vistaCliente;
import vista.mantenimientos.vistaVehiculo;
import vista.mantenimientos.vistaGama;
import vista.mantenimientos.vistaOferta;
import vista.mantenimientos.vistaUsuario;
import principal.login;
import vista.*;
import modelo.mantenimiento.modeloUsuario;

/**
 *
 * @author Ignacio
 */
public class inicio extends javax.swing.JFrame {
    
    modeloUsuario ml = new modeloUsuario();
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
        
        if("0".equals(ml.verificarAcceso(u, p)))
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
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mCerrarS = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sedan.png"))); // NOI18N

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

        jMenuItem16.setText("Clientes");
        jMenu5.add(jMenuItem16);

        jMenuItem12.setText("Por ID");
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Por Rango ID");
        jMenu5.add(jMenuItem13);

        jMenu3.add(jMenu5);

        jMenu6.setText("Vehiculos");

        jMenuItem15.setText("Vehiculos");
        jMenu6.add(jMenuItem15);

        jMenuItem8.setText("Por Matricula");
        jMenu6.add(jMenuItem8);

        jMenu3.add(jMenu6);

        jMenu7.setText("Reservas");

        jMenuItem19.setText("Por Fecha");
        jMenu7.add(jMenuItem19);

        jMenuItem20.setText("Por Dias");
        jMenu7.add(jMenuItem20);

        jMenu3.add(jMenu7);

        jMenu8.setText("Resepcion");

        jMenuItem21.setText("Por Fecha");
        jMenu8.add(jMenuItem21);

        jMenu3.add(jMenu8);

        jMenuItem18.setText("Ofertas");
        jMenu3.add(jMenuItem18);

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        vistaUsuario vu = new vistaUsuario();
    }//GEN-LAST:event_mUsuarioActionPerformed

    private void mVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVehiculoActionPerformed
        // TODO add your handling code here:
        vistaVehiculo vv = new vistaVehiculo();
    }//GEN-LAST:event_mVehiculoActionPerformed

    private void mGamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGamaActionPerformed
        // TODO add your handling code here:
        vistaGama vg = new vistaGama();
    }//GEN-LAST:event_mGamaActionPerformed

    private void mClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClienteActionPerformed
        // TODO add your handling code here:
        vistaCliente vc = new vistaCliente();
    }//GEN-LAST:event_mClienteActionPerformed

    private void mOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOfertasActionPerformed
        // TODO add your handling code here:
        vistaOferta vo = new vistaOferta();
    }//GEN-LAST:event_mOfertasActionPerformed

    private void mReservaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReservaClienteActionPerformed
        // TODO add your handling code here:
        vistaReservaClientes vrc = new vistaReservaClientes();
    }//GEN-LAST:event_mReservaClienteActionPerformed

    private void mRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRecepcionVehiculoActionPerformed
        // TODO add your handling code here:
        vistaRecepcionVehiculo vrv = new vistaRecepcionVehiculo();
    }//GEN-LAST:event_mRecepcionVehiculoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu clickMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem8;
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
    // End of variables declaration//GEN-END:variables
}
