/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utils.DBConnection;

/**
 *
 * @author Shilpi
 */
public class Testing {
    public static void main(String args[]) throws ClassNotFoundException {
        try {
            DBConnection connect = new DBConnection();
            Connection conn = connect.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select BID, brand_name, drug from Brand");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } 
        catch (SQLException e) {
            System.err.println(e);
        }
    }
}
