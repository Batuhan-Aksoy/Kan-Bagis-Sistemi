/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Batuhan Aksoy
 */
public class _Grup_21_Kullanici_Anasayfa extends javax.swing.JFrame {

    /**
     * Creates new form _Grup_21_Kullanici_Anasayfa
     */
    _Grup_21_Kullanici_Girisi gelenveri = new _Grup_21_Kullanici_Girisi();
    public String gelenTC = gelenveri.TC;
    public String gelenAD = gelenveri.AD;
    public String gelenSOYAD = gelenveri.SOYAD;

    public _Grup_21_Kullanici_Anasayfa() {
        initComponents();

        jLabel5.setText(gelenTC);
        jLabel6.setText(gelenAD);
        jLabel7.setText(gelenSOYAD);
        Connection baglan;
        _Grup_21_Mysql_Baglanti baglanti = new _Grup_21_Mysql_Baglanti();
        baglan = baglanti.baglan();
        DefaultListModel liste = new DefaultListModel();
        int deger = 0;
        liste.addElement("    TC" + "                      " + "Kan Türü" + "            " + "Bağış Yeri" + "                                " + "Tarih");
        try {
            Statement stat = baglan.createStatement();
            String sql = "SELECT * FROM _grup_21_kan_bagis_randevu WHERE (TCno = '"+gelenTC+"')";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {               
                    deger += 1;
                    liste.addElement(deger + "  " + rs.getString("TCno") + "            " + rs.getString("kan_turu") + "              " + rs.getString("bagis_yeri") + "            " + rs.getString("bagis_tarih"));
                    jList2.setModel(liste);
            }

        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_Kullanici_Girisi.class.getName()).log(Level.SEVERE, null, ex);
        }

        int deger2 = 0;
        DefaultListModel liste2 = new DefaultListModel();
        try {
            Statement stat1 = baglan.createStatement();
            String sql1 = "SELECT * FROM _grup_21_bagis_noktalari";
            ResultSet rs1 = stat1.executeQuery(sql1);
            while (rs1.next()) {
                deger2 += 1;
                liste2.addElement(deger2 + "  " + rs1.getString("adres"));
                jList3.setModel(liste2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(_Grup_21_Kullanici_Girisi.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultListModel liste3 = new DefaultListModel();
        ArrayList<Integer> bagis_sayisi_sort = new ArrayList<Integer>();
        int onemli_bagiscilar[] = new int[10];
        int uzunluk = 0;
        int uzunluk2=0;
        String tc;
        String ad = "";
        String soyad = "";
        String bagis_sayisi = "";
        try {
            Statement stat2 = baglan.createStatement();
            Statement stat3 = baglan.createStatement();
            String sql2 = "SELECT * FROM _grup_21_onemli_bagiscilar";
            String sql3 = "SELECT * FROM _grup_21_kullanicilar";
            ResultSet rs2 = stat2.executeQuery(sql2);
            ResultSet rs3 = stat3.executeQuery(sql3);
            while (rs2.next()) {

                bagis_sayisi = rs2.getString("bagis_sayisi");
                if(bagis_sayisi!=null)
                {
                bagis_sayisi_sort.add(Integer.parseInt(bagis_sayisi));
                uzunluk += 1;
                }
                
            }
            uzunluk2=uzunluk;
            Collections.sort(bagis_sayisi_sort);
            if(uzunluk2!=0){
            for (int i = 0; i < 10; i++) {
                
                   
                if(bagis_sayisi_sort.get(uzunluk2-1)!=null)
                {
                onemli_bagiscilar[i] = bagis_sayisi_sort.get(uzunluk2-1);
                uzunluk2 -= 1;
                if(uzunluk2==0)
                {
                  break;
                }
                
                }
                
            }}
              Statement stat4= baglan.createStatement();
              Statement stat5= baglan.createStatement();
              
            for(int i =0; i<uzunluk; i++)
            { 
              ResultSet rs4 = stat4.executeQuery(sql2);
              ResultSet rs5 = stat5.executeQuery(sql3); 
              while (rs4.next()) {
                  if(String.valueOf(onemli_bagiscilar[i]).equals(rs4.getString("bagis_sayisi"))==true)
                  {    
                      while (rs5.next()) {
                            if (rs4.getString("TCno").equals(rs5.getString("TCno")) == true) {
                                ad = rs5.getString("Ad");
                                soyad = rs5.getString("Soyad");
                                liste3.addElement(onemli_bagiscilar[i] + "  " + ad + "  " + soyad);
                                jList1.setModel(liste3);
                                break;
                            }
                      }
                  }   
              }
            }
        } catch (SQLException ex) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Anasayfa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kan Bağış Sistemi Kullanıcı Anasayfasına Hoşgeldiniz");

        jLabel2.setText("Önemli Kan Bağışçıları");

        jScrollPane1.setViewportView(jList1);

        jLabel3.setText("Kan Bağış Randevularım");

        jScrollPane2.setViewportView(jList2);

        jLabel4.setText("Kan Bağış Noktaları");

        jScrollPane3.setViewportView(jList3);

        jButton1.setText("Kan Bağışı İçin Randevu Al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jButton2.setText("Randevu Güncelle ya da İptal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Kullanıcı İşlemleri");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        _Grup_21_KanBagis_Randevu randevu = new _Grup_21_KanBagis_Randevu();
        randevu.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        _Grup_21_Kullanici_islemleri randevu = new _Grup_21_Kullanici_islemleri();
        randevu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        _Grup_21_KanBagis_Randevuİptal randevu = new _Grup_21_KanBagis_Randevuİptal();
        randevu.setVisible(true);
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
            java.util.logging.Logger.getLogger(_Grup_21_Kullanici_Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Kullanici_Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Kullanici_Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Grup_21_Kullanici_Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_21_Kullanici_Anasayfa().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
