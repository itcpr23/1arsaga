
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
 * @author user
 */
public class product_class {
    public int add(String product_name,int quantity, String price){
        int rom = 0;
        String sql= "insert into products values(null,?,?,?);";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/register?", "root", "");
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, product_name);
            pstmt.setInt(2, quantity);
            pstmt.setString(3, price);
            
            rom=pstmt.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rom;
    }
    public int addquntity(int id,Object quantity){
        int a = 0; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection conn=(Connection )DriverManager.getConnection("jdbc:mysql://localhost/register?","root","");
        PreparedStatement pstmt= conn.prepareStatement("update products set QUANTITY= (QUANTITY+? )where id = ?");
        pstmt.setObject(1, quantity);
        pstmt.setInt(2, id);
        a= pstmt.executeUpdate();
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
}
