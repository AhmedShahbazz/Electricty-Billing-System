/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dell Laptop
 */
public class Admin_Settings extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Settings
     */
    public Admin_Settings() {
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

        cp_oldpass = new javax.swing.JPasswordField();
        cp_newpass = new javax.swing.JPasswordField();
        cp_conpass = new javax.swing.JPasswordField();
        cp_user = new javax.swing.JTextField();
        lblconpass = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbloldpass = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(295, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1090, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(cp_oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 290, -1));
        getContentPane().add(cp_newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 290, -1));
        getContentPane().add(cp_conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 290, -1));
        getContentPane().add(cp_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 290, -1));

        lblconpass.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblconpass.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblconpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        lbluser.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel9.setText("Change Your Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        lbloldpass.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lbloldpass.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbloldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setText("Confirm Passsword:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setText("New Passsword:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel5.setText("Username:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setText("Old Passsword:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        btn_update.setBackground(new java.awt.Color(78, 115, 239));
        btn_update.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 110, -1));

        btn_close.setBackground(new java.awt.Color(255, 51, 51));
        btn_close.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 110, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panel design.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_update;
    private javax.swing.JPasswordField cp_conpass;
    private javax.swing.JPasswordField cp_newpass;
    private javax.swing.JPasswordField cp_oldpass;
    private javax.swing.JTextField cp_user;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblconpass;
    private javax.swing.JLabel lbloldpass;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables
}
