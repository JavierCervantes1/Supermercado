/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Liborio Castañeda - Javier Cervantes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    String ruta;

    public Principal() {
        initComponents();
        ruta = "src/datos/Productos.txt";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        mnNuevoCliente = new javax.swing.JMenuItem();
        mnNuevoProducto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnAgregarCompra = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnMercancia = new javax.swing.JMenuItem();
        mnClientes = new javax.swing.JMenuItem();
        mnFacturas = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado - Bienvenidos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portada1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 260));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 0, 0));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        jMenu1.setText("Sistema");
        jMenu1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jMenu1.add(jSeparator1);

        jMenu3.setText("Administrar");
        jMenu3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        mnNuevoCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mnNuevoCliente.setText("Agregar Cliente");
        mnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNuevoClienteActionPerformed(evt);
            }
        });
        jMenu3.add(mnNuevoCliente);

        mnNuevoProducto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mnNuevoProducto.setText("Agregar Producto");
        mnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNuevoProductoActionPerformed(evt);
            }
        });
        jMenu3.add(mnNuevoProducto);

        jMenu1.add(jMenu3);

        jMenu4.setText("Compras");
        jMenu4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        mnAgregarCompra.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mnAgregarCompra.setText("Agregar Compra");
        mnAgregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarCompraActionPerformed(evt);
            }
        });
        jMenu4.add(mnAgregarCompra);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator2);

        mnSalir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");
        jMenu2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        mnMercancia.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mnMercancia.setText("Mercancia");
        mnMercancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMercanciaActionPerformed(evt);
            }
        });
        jMenu2.add(mnMercancia);

        mnClientes.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mnClientes.setText("Clientes");
        mnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClientesActionPerformed(evt);
            }
        });
        jMenu2.add(mnClientes);

        mnFacturas.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mnFacturas.setText("Facturas");
        mnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFacturasActionPerformed(evt);
            }
        });
        jMenu2.add(mnFacturas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(476, 318));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClientesActionPerformed
        ListadoClientes lc = new ListadoClientes(this, true);
        lc.setVisible(true);
    }//GEN-LAST:event_mnClientesActionPerformed

    private void mnMercanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMercanciaActionPerformed
        ListadoMercancia m = new ListadoMercancia(this, true);
        m.setVisible(true);
    }//GEN-LAST:event_mnMercanciaActionPerformed

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSalirActionPerformed

    private void mnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNuevoProductoActionPerformed
        NuevoProducto n = new NuevoProducto(this, true);
        n.setVisible(true);
    }//GEN-LAST:event_mnNuevoProductoActionPerformed

    private void mnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNuevoClienteActionPerformed
        RegistroCliente r = new RegistroCliente(this, true);
        r.setVisible(true);
    }//GEN-LAST:event_mnNuevoClienteActionPerformed

    private void mnAgregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarCompraActionPerformed
        Compra C = new Compra(this,true);
        C.setVisible(true);
    }//GEN-LAST:event_mnAgregarCompraActionPerformed

    private void mnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFacturasActionPerformed
        Facturacion F = new Facturacion(this,true);
        F.setVisible(true);
    }//GEN-LAST:event_mnFacturasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mnAgregarCompra;
    private javax.swing.JMenuItem mnClientes;
    private javax.swing.JMenuItem mnFacturas;
    private javax.swing.JMenuItem mnMercancia;
    private javax.swing.JMenuItem mnNuevoCliente;
    private javax.swing.JMenuItem mnNuevoProducto;
    private javax.swing.JMenuItem mnSalir;
    // End of variables declaration//GEN-END:variables

}
