package views;

import javax.swing.JOptionPane;

/**
 *
 * @author Rizki Maulana
 */
public class PanelAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public PanelAdmin() {
           initComponents();
           Karyawan db = new Karyawan();
           mainPane.add(db).setVisible(true);
    }
    public PanelAdmin(String Uname) {
           initComponents();Karyawan db = new Karyawan();
           mainPane.add(db).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        judul = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();
        recruitment = new javax.swing.JButton();
        karyawan = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        mainPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setPreferredSize(new java.awt.Dimension(1300, 1000));

        sidePanel.setBackground(new java.awt.Color(124, 185, 235));
        sidePanel.setPreferredSize(new java.awt.Dimension(232, 700));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Data Master");
        sidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        sidePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 80, 165, -1));

        judul.setBackground(new java.awt.Color(153, 153, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(245, 255, 255));
        jLabel15.setText("Toko Puri Indah");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rsz_add_a_heading.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(245, 255, 255));
        jLabel16.setText("(Admin)");

        javax.swing.GroupLayout judulLayout = new javax.swing.GroupLayout(judul);
        judul.setLayout(judulLayout);
        judulLayout.setHorizontalGroup(
            judulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulLayout.createSequentialGroup()
                .addGroup(judulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(judulLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(judulLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        judulLayout.setVerticalGroup(
            judulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(judulLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addGap(11, 11, 11)
                .addComponent(jLabel16))
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("");

        sidePanel.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 231, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        sidePanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 316, 231, -1));

        btnExit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnExit.setText("Keluar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        sidePanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 329, 231, -1));

        recruitment.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        recruitment.setText("Recruitment");
        recruitment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recruitmentActionPerformed(evt);
            }
        });
        sidePanel.add(recruitment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 231, -1));

        karyawan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        karyawan.setText("Karyawan");
        karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanActionPerformed(evt);
            }
        });
        sidePanel.add(karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 231, -1));

        mainPanel.setPreferredSize(new java.awt.Dimension(1124, 700));
        mainPanel.setLayout(new java.awt.CardLayout());

        mainPane.setPreferredSize(new java.awt.Dimension(1124, 700));

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        mainPanel.add(mainPane, "card2");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin mau keluar?", "Konfirmasi Keluar",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
            new Login().setVisible(true);
            JOptionPane.showMessageDialog(null, "Berhasil Keluar");
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void recruitmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recruitmentActionPerformed
        // TODO add your handling code here:
        mainPane.removeAll();
        Recruitment lbyd = new Recruitment();
        mainPane.add(lbyd).setVisible(true); 
    }//GEN-LAST:event_recruitmentActionPerformed

    private void karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanActionPerformed
        // TODO add your handling code here:
        mainPane.removeAll();
        Karyawan lbyd = new Karyawan();
        mainPane.add(lbyd).setVisible(true);
    }//GEN-LAST:event_karyawanActionPerformed

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
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel judul;
    private javax.swing.JButton karyawan;
    private javax.swing.JDesktopPane mainPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton recruitment;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
