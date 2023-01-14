
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Batuhan Aksoy
 */
public class _Grup_21_Admin_Kullanici_islemleri extends javax.swing.JFrame {

    /**
     * Creates new form _Grup_21_Admin_Kullanici_islemleri
     */
    public _Grup_21_Admin_Kullanici_islemleri() {
        initComponents();
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        int sonuc;
        jComboBox1.addItem("Lütfen Seçiniz");
        jComboBox1.setSelectedIndex(0);
            Statement stat;
        try {
            stat = baglan.createStatement();
              String sql ="SELECT * FROM _grup_21_kullanicilar";
              ResultSet rs = stat.executeQuery(sql);
              while(rs.next())
              {
              jComboBox1.addItem(rs.getString("TCno") + " " + rs.getString("Ad") +" "+rs.getString("Soyad"));
              }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Kullanici İşlemleri");

        jLabel1.setText("Tc");

        jLabel2.setText("Ad");

        jLabel3.setText("Soyad");

        jLabel4.setText("Şifre");

        jLabel5.setText("Tel no");

        jLabel6.setText("E-mail");

        jButton1.setText("Kullanıcı Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seçilen kullanıcıyı sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Geri");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jPasswordField1)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        _Grup_21_Admin_Anasayfa anasayfa = new _Grup_21_Admin_Anasayfa();
        anasayfa.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tc = jTextField1.getText();
        String ad = jTextField2.getText();
        String soyad = jTextField3.getText();
        String sifre =jPasswordField1.getText();
        String tel =jTextField4.getText();
        String mail = jTextField5.getText();
        if(tc.length()==11 && ad !=null && soyad !=null && sifre.length()>=8 && tel!=null && mail !=null )
        {
         _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        int sonuc;
       
              Statement stat;
            try {
                stat = baglan.createStatement();
                String sql ="INSERT INTO _grup_21_kullanicilar (TCno,Ad,Soyad,sifre,Telno,Mail) VALUES ('"+tc+"','"+ad+"','"+soyad+"','"+sifre+"','"+tel+"','"+mail+"')";
              sonuc = stat.executeUpdate(sql);
              if(sonuc==1)
              {
                  JOptionPane.showMessageDialog(null, "Kullanıcı Ekleme başarılı ");
                  this.setVisible(false);
                  _Grup_21_Admin_Anasayfa anasayfa = new _Grup_21_Admin_Anasayfa();
                  anasayfa.setVisible(true);
              }
              else
                   JOptionPane.showMessageDialog(null, "Kullanıcı Ekleme başarısız");
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(_Grup_21_Admin_Kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
              
        
        
        }
        else
                    JOptionPane.showMessageDialog(null, "Boş Geçilemez TC 11 şifre en az 8 karakter olmalıdır");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().toString().equals("Lütfen Seçiniz")==false)
        {
            String tc = jComboBox1.getSelectedItem().toString();
            tc=tc.substring(0,11);
         _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan = baglanti.baglan();
        int sonuc;
       
              Statement stat;
            try {
                stat = baglan.createStatement();
                String sql ="DELETE FROM _grup_21_kullanicilar WHERE TCno ='"+tc+"'";
                sonuc = stat.executeUpdate(sql);
                if(sonuc==1)
                {
                    JOptionPane.showMessageDialog(null, "Silme İşlemi Başarılı");
                    this.setVisible(false);
                  _Grup_21_Admin_Anasayfa anasayfa = new _Grup_21_Admin_Anasayfa();
                  anasayfa.setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(null, "Silme İşlemi Başarısız");
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(_Grup_21_Admin_Kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
                
        }
        else
                    JOptionPane.showMessageDialog(null, "Boş Geçilemez");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Admin_Kullanici_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_21_Admin_Kullanici_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}