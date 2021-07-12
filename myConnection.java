/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirevehicle;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
class myConnection {
    private static final String conn = ("jdbc:mysql://localhost:3306/price/root");
    public static connection getconnection()throws SQLException{
        return DriverManager.getConnection(conn);
    }

   
}
