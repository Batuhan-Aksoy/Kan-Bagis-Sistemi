


import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Batuhan Aksoy
 */
public class _Grup_21_Mysql_Baglanti {
    
        private final String DB_URL="jdbc:mysql://localhost/_grup_21";
        private final String DB_Username ="root";
        private final String DB_Pass="1234";
        Connection baglanti ;
    public Connection baglan(){
          
          try {
            baglanti = DriverManager.getConnection(DB_URL,DB_Username,DB_Pass);
              
        } catch (Exception e) {
            e.printStackTrace();
        }

    return baglanti;
    }
    
}
