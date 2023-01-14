
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Batuhan Aksoy
 */
public class _Grup_21_Admin_Randvu_islemleri extends javax.swing.JFrame {

    /**
     * Creates new form _Grup_21_Randvu_islemleri
     */
    public _Grup_21_Admin_Randvu_islemleri() {
        initComponents();
        jTextField1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton4.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);

        jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton5.setVisible(false);
        jLabel5.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        
        
        jComboBox1.addItem("Lütfen Seçiniz");
        jComboBox1.setSelectedIndex(0);
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        try {
            Statement stat = baglan.createStatement();
              String sql ="SELECT * FROM _grup_21_kan_bagis_randevu";
              ResultSet rs = stat.executeQuery(sql);
              while(rs.next())
              {
               jComboBox1.addItem(rs.getString("id")+" "+ rs.getString("TCno") + " "+rs.getString("kan_turu") +" "+rs.getString("bagis_yeri")+" "+rs.getString("bagis_tarih"));
              }
        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_Admin_Bagisnoktalari_islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Randevu İşlemleri");

        jButton1.setText("Seçili Randevuyu Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Randevu Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Seçili Randevuyu Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("TC");

        jLabel2.setText("kan türü");

        jLabel3.setText("Bağış Yeri");

        jLabel4.setText("Tarih");

        jButton4.setText("Ekle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tarih");

        jButton5.setText("Güncelle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("kan türü");

        jLabel8.setText("Bağış Yeri");

        jButton6.setText("Geri");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox2, 0, 129, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(35, 35, 35)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        _Grup_21_Admin_Anasayfa anasayfa = new _Grup_21_Admin_Anasayfa();
        anasayfa.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().toString().equals("Lütfen Seçiniz")==false)
        {
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        String randevuid=jComboBox1.getSelectedItem().toString();
        randevuid=randevuid.substring(0,2);
        randevuid=randevuid.trim();
        int sonuc;
        try {
            Statement stat = baglan.createStatement();
            String sql ="DELETE FROM _grup_21_kan_bagis_randevu WHERE id='"+randevuid+"'";
            sonuc = stat.executeUpdate(sql);
            if(sonuc==1)
            {
                 JOptionPane.showMessageDialog(null, "Randevu silme işlemi başarılı ");
                  this.setVisible(false);
                  _Grup_21_Admin_Anasayfa anasayfa = new _Grup_21_Admin_Anasayfa();
                  anasayfa.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Randevu silme işlemi başarısız ");        
        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_Admin_Bagisnoktalari_islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
                JOptionPane.showMessageDialog(null, "Boş Geçilemez ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
        jDateChooser1.setVisible(true);
        jButton4.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        try {
            Statement stat2 =baglan.createStatement();
            Statement stat3 =baglan.createStatement();
            String sql2="SELECT * FROM _grup_21_kan_turu";
            ResultSet rs2 = stat2.executeQuery(sql2);
            String sql3="SELECT * FROM _grup_21_bagis_noktalari";
            ResultSet rs3 = stat3.executeQuery(sql3);
            while(rs2.next())
            {
              jComboBox2.addItem(rs2.getString("kan_turu"));
            }
            while(rs3.next())
            {
              jComboBox3.addItem(rs3.getString("adres"));
            }
        }catch (SQLException ex) {
            Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String tc=jTextField1.getText();
        String kan_tur=jComboBox2.getSelectedItem().toString();
        String bagis_yer = jComboBox3.getSelectedItem().toString();
        String tarih ="";
        if(jDateChooser1.getDate()!=null)
            tarih= jDateChooser1.getDate().toString();
            
        if(tc.equals("")==false && kan_tur.equals("")==false && bagis_yer.equals("")==false && tarih.equals("")==false)
        {

        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        String randevuid=jComboBox1.getSelectedItem().toString();
        randevuid=randevuid.trim();
        int sonuc=0;
        try {
            Statement stat = baglan.createStatement();
            String sql ="INSERT INTO _grup_21_kan_bagis_randevu (TCno,kan_turu,bagis_yeri,bagis_tarih) VALUES ('"+tc+"','"+kan_tur+"','"+bagis_yer+"','"+tarih+"')";
            String sql2 = "SELECT * FROM _grup_21_kullanicilar WHERE TCno='"+tc+"'";
            ResultSet rs = stat.executeQuery(sql2);
            while(rs.next())
            {
                if(rs.getString("TCno").equals("")==true)
                    sonuc=0;
                else
                    sonuc=1;
            }
            if(sonuc==1)
            {
                 stat.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "Randevu Ekleme işlemi başarılı ");
                  this.setVisible(false);
                  _Grup_21_Admin_Anasayfa anasayfa = new _Grup_21_Admin_Anasayfa();
                  anasayfa.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Kullanıcı Olmayan Tc için Randevu Alınamaz ");
         
                    
        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_Admin_Bagisnoktalari_islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
             JOptionPane.showMessageDialog(null, "Bilgiler boş geçilemez ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().toString().equals("Lütfen Seçiniz")==false)
        {
        jComboBox4.setVisible(true);
        jComboBox5.setVisible(true);
        jDateChooser2.setVisible(true);
        jButton5.setVisible(true);
        jLabel5.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        try {
            Statement stat2 =baglan.createStatement();
            String sql2="SELECT * FROM _grup_21_kan_turu";
            ResultSet rs2 = stat2.executeQuery(sql2);
           
            while(rs2.next())
            {
              jComboBox4.addItem(rs2.getString("kan_turu"));
            } 
            String sql3="SELECT * FROM _grup_21_bagis_noktalari";
            ResultSet rs3 = stat2.executeQuery(sql3);
            while(rs3.next())
            {
              jComboBox5.addItem(rs3.getString("adres"));
            }
        }catch (SQLException ex) {
            Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String randevuid=jComboBox1.getSelectedItem().toString();
        randevuid=randevuid.substring(0,2);
        randevuid=randevuid.trim();
        try {
            Statement stat = baglan.createStatement();
            String sql ="SELECT * FROM _grup_21_kan_bagis_randevu WHERE id ='"+randevuid+"'";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next())
            {
             jComboBox4.setSelectedItem(rs.getString("kan_turu"));
             jComboBox5.setSelectedItem(rs.getString("bagis_yeri"));
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(_Grup_21_Admin_Bagisnoktalari_islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
            JOptionPane.showMessageDialog(null, "Boş Geçilemez");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String kan_tur=jComboBox4.getSelectedItem().toString();
        String bagis_yer = jComboBox5.getSelectedItem().toString();
        String tarih="";
        if(jDateChooser2.getDate()!=null)
             tarih= jDateChooser2.getDate().toString();
        if(kan_tur.equals("")==false && bagis_yer.equals("")==false && tarih.equals("")==false)
        {
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        String randevuid=jComboBox1.getSelectedItem().toString();
        randevuid=randevuid.substring(0,2);
        randevuid=randevuid.trim();
        int sonuc;
        try {
            Statement stat = baglan.createStatement();
            String sql ="UPDATE _grup_21_kan_bagis_randevu SET kan_turu='"+kan_tur+"',bagis_yeri='"+bagis_yer+"', bagis_tarih='"+tarih+"' WHERE id = '"+randevuid+"' ";
            sonuc = stat.executeUpdate(sql);
            if(sonuc==1)
            {
                 JOptionPane.showMessageDialog(null, "Randevu Güncelleme işlemi başarılı ");
                  this.setVisible(false);
                  _Grup_21_Admin_Anasayfa anasayfa = new _Grup_21_Admin_Anasayfa();
                  anasayfa.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Randevu Güncelleme işlemi başarısız ");        
        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_Admin_Bagisnoktalari_islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
             JOptionPane.showMessageDialog(null, "Bilgiler boş geçilemez ");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Randvu_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Randvu_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Randvu_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Randvu_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_21_Admin_Randvu_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}