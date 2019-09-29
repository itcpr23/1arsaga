
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class registration {
    
    
     public int register(String firstname,String lastname,String username, String password){
        int r = 0;
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/register?" , "root", "");
             
              String sql = "insert into reg values(?,?,?,?)";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            
            pstmt.setString(1, username);
             pstmt.setString(2, password);
             pstmt.setString(3, lastname);
              pstmt.setString(4, firstname);
              
               r = pstmt.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    return r;
     }}
     

