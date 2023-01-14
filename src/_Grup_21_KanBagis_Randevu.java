/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Batuhan Aksoy
 */
public class _Grup_21_KanBagis_Randevu extends javax.swing.JFrame {

    /**
     * Creates new form _Grup_21_KanBagis_Randevu
     */
    _Grup_21_Kullanici_Girisi tc = new _Grup_21_Kullanici_Girisi();
    public String gelentc = tc.TC;
    public _Grup_21_KanBagis_Randevu() {
        initComponents();
        jTextField1.setText(gelentc);
        jComboBox2.addItem("Lütfen Seçiniz");
        jComboBox2.setSelectedIndex(0);
        Connection baglan;
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        baglan = baglanti.baglan();
        try {
            Statement stat2 =baglan.createStatement();
            String sql2="SELECT * FROM _grup_21_kan_turu";
            ResultSet rs2 = stat2.executeQuery(sql2);
            while(rs2.next())
            {
              jComboBox2.addItem(rs2.getString("kan_turu"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jComboBox1.addItem("Lütfen Seçiniz");
        jComboBox1.setSelectedIndex(0);
        
        int deger=0;
        try {
                Statement stat = baglan.createStatement();
                String sql = "SELECT * FROM _grup_21_bagis_noktalari";
                ResultSet rs = stat.executeQuery(sql);
                while (rs.next()) {
                       deger+=1;
                       jComboBox1.addItem(deger + " " +rs.getString("adres"));      
                }
                
        }catch(SQLException ex) {
                Logger.getLogger(_Grup_21_Kullanici_Girisi.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kan Bağışı Randevu Alanı");

        jLabel1.setText("Bağış yeri");

        jLabel2.setText("Kan Türü");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kan Bağışı Randevu Alanı");

        jLabel4.setText("TC No");

        jButton1.setText("Randevuyu Onayla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Randevu Tarihi");

        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tc_no= jTextField1.getText();
        String kan_turu=jComboBox2.getSelectedItem().toString();
        String bagis_yeri= jComboBox1.getSelectedItem().toString();
        bagis_yeri=bagis_yeri.substring(1,bagis_yeri.length());
        String tarih="";
        if(jDateChooser1.getDate() !=null)
             tarih= jDateChooser1.getDate().toString();
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        Connection baglan;
        baglan=baglanti.baglan();
        Statement stat;
        Statement stat2;
        boolean flag=false;
        int sonuc;
        int bagis_sayisi = 0;
        if(tc_no != null && kan_turu.equals("Lütfen Seçiniz")==false && bagis_yeri.equals("Lütfen Seçiniz")==false && tarih !=null)
        {
            
        try {
            stat = baglan.createStatement();
            String sql = "INSERT INTO _grup_21_kan_bagis_randevu (TCno,kan_turu, Bagis_yeri,bagis_tarih) VALUES ('" + tc_no + "','"+kan_turu+"','"+bagis_yeri+"','"+tarih+"')";
            sonuc = stat.executeUpdate(sql);
            if(sonuc==1)
                flag=true;

        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(flag==true)
        {
          JOptionPane.showMessageDialog(null, "Randevunuz Onaylanmıştır");
          this.setVisible(false);
          _Grup_21_Kullanici_Anasayfa kanasayfa = new _Grup_21_Kullanici_Anasayfa();
          kanasayfa.setVisible(true);
          
        }
        
       }
        else
            JOptionPane.showMessageDialog(null, "Seçenekler Boş Bırakılamaz");
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        _Grup_21_Kullanici_Anasayfa kanasayfa = new _Grup_21_Kullanici_Anasayfa();
        kanasayfa.setVisible(true);
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
            java.util.logging.Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_KanBagis_Randevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_21_KanBagis_Randevu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
