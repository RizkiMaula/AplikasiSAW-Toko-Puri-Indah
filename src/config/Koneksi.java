/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rizki Maulana
 */
public class Koneksi {
private final static String URL = "jdbc:mysql://localhost/project_skripsi";
    private final static String USER = "root";
    private final static String PASS = "";
    public static Connection conn = null;
    
public static void main (String [] args) {
    try {
        System.out.println("Koneksi ke database "+getKoneksi().getCatalog()+" Berhasil");
    } catch (SQLException e){
        System.out.println(e);
    }
}
    
//  koneksi ke database
public static Connection getKoneksi() {
    try{
        conn = DriverManager.getConnection(URL, USER, PASS);
    } catch (SQLException e) {
        System.out.println(e);
    }
        return conn;
    }
}