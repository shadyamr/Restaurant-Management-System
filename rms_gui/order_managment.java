
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seif
 */
public class order_managment extends javax.swing.JFrame {

    /**
     * Creates new form order_managment
     */
    public order_managment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        win_exit = new javax.swing.JLabel();
        last_recipt = new java.awt.TextField();
        edit_order = new com.k33ptoo.components.KButton();
        checkout = new com.k33ptoo.components.KButton();
        cancel_order = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setBackground(new Color(0,0,0,0));
        kGradientPanel1.setkEndColor(new java.awt.Color(52, 152, 219));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(46, 204, 113));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        win_exit.setBackground(new java.awt.Color(0, 153, 204));
        win_exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        win_exit.setForeground(new java.awt.Color(255, 255, 255));
        win_exit.setText("X");
        win_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                win_exitMouseClicked(evt);
            }
        });
        kGradientPanel1.add(win_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, -10, 30, 90));

        last_recipt.setText("recipt");
        kGradientPanel1.add(last_recipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 390));

        edit_order.setText("Edit");
        edit_order.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        edit_order.setkBorderRadius(40);
        edit_order.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        edit_order.setkPressedColor(new java.awt.Color(52, 152, 219));
        edit_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_orderActionPerformed(evt);
            }
        });
        kGradientPanel1.add(edit_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 130, 40));

        checkout.setText("CheckOut");
        checkout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        checkout.setkBorderRadius(40);
        checkout.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        checkout.setkPressedColor(new java.awt.Color(52, 152, 219));
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        kGradientPanel1.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 40));

        cancel_order.setText("Cancel");
        cancel_order.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cancel_order.setkBorderRadius(40);
        cancel_order.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        cancel_order.setkPressedColor(new java.awt.Color(52, 152, 219));
        cancel_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_orderActionPerformed(evt);
            }
        });
        kGradientPanel1.add(cancel_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 130, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Checkout");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void win_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_win_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_win_exitMouseClicked

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void edit_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_orderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_orderActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutActionPerformed

    private void cancel_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_orderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_orderActionPerformed

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
            java.util.logging.Logger.getLogger(order_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order_managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order_managment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton cancel_order;
    private com.k33ptoo.components.KButton checkout;
    private com.k33ptoo.components.KButton edit_order;
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private java.awt.TextField last_recipt;
    private javax.swing.JLabel win_exit;
    // End of variables declaration//GEN-END:variables
}
