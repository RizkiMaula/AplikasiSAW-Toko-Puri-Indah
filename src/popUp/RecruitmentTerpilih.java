package popUp;

import config.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static views.Karyawan.namaKaryawan;
import static views.Karyawan.alamat;
import static views.Karyawan.kontakKaryawan;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rizki Maulana
 */
public class RecruitmentTerpilih extends javax.swing.JFrame {

    /**
     * Creates new form RecruitmentTerpilih
     */
    public RecruitmentTerpilih() {
        initComponents();
        daftarTerpilih();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelDaftar = new javax.swing.JTable();
        cariBarang = new javax.swing.JTextField();
        plh = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        plh1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel7.setBackground(new java.awt.Color(232, 238, 204));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 238, 204));
        jLabel7.setText("Cari");

        tabelDaftar.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tabelDaftar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Belanja", "Tanggal Belanja", "Kode Produk", "Nama Produk", "Jumlah", "Total Belanja"
            }
        ));
        tabelDaftar.setToolTipText("");
        tabelDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelDaftarMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tabelDaftar);

        plh.setText("Pilih");
        plh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plhActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(232, 238, 204));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 238, 204));
        jLabel8.setText("Daftar Recruter Terpilih");

        plh1.setText("Keluar");
        plh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(plh)
                                .addGap(16, 16, 16)
                                .addComponent(plh1)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plh)
                    .addComponent(plh1))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void daftarTerpilih() {
        DefaultTableModel daftarRec = new DefaultTableModel();
        daftarRec.addColumn("No");
        daftarRec.addColumn("Kode Kandidat");
        daftarRec.addColumn("Nama Kandidat");
        daftarRec.addColumn("Alamat");
        daftarRec.addColumn("Kontak");
        daftarRec.addColumn("Total Nilai");
        
        try {
            int no = 1;
            String sql = "SELECT bobot.kd_kan, recruitment.nama_kandidat, recruitment.alamat, recruitment.hp, bobot.vtotal "
                       + "FROM `bobot` "
                       + "INNER JOIN `recruitment` "
                       + "ON recruitment.kd_kan = bobot.kd_kan "
                       + "ORDER BY `vtotal` DESC "
                       + "LIMIT 3";
            Connection conn = (Connection)Koneksi.getKoneksi();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                daftarRec.addRow(new Object[]{
                   no++,
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                });
            }
            tabelDaftar.setModel(daftarRec);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal: " + e.getMessage());
        }
    }
    
    private void kosong() {
        namaKaryawan.setText("");
        alamat.setText("");
        kontakKaryawan.setText("");
    }
    
    private void tabelDaftarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDaftarMousePressed
        // TODO add your handling code here:
        int baris = tabelDaftar.rowAtPoint(evt.getPoint());

        String nama = tabelDaftar.getValueAt(baris, 2).toString();
        namaKaryawan.setText(nama);
        
        String aalamat = tabelDaftar.getValueAt(baris, 3).toString();
        alamat.setText(aalamat);
        
        String kontak = tabelDaftar.getValueAt(baris, 4).toString();
        kontakKaryawan.setText(kontak);
    }//GEN-LAST:event_tabelDaftarMousePressed

    private void plhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plhActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_plhActionPerformed

    private void plh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plh1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_plh1ActionPerformed

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
            java.util.logging.Logger.getLogger(RecruitmentTerpilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecruitmentTerpilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecruitmentTerpilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecruitmentTerpilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecruitmentTerpilih().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cariBarang;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton plh;
    private javax.swing.JButton plh1;
    private javax.swing.JTable tabelDaftar;
    // End of variables declaration//GEN-END:variables
}
