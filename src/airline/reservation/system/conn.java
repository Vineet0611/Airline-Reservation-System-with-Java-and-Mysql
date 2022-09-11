/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

/**
 *
 * @author vineet mendon
 */
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///airline","root","vineet@123");
            s=c.createStatement();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
