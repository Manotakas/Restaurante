/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package restaurante;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author CAMARGO
 */
public class Restaurante {

        private String url = "jdbc:mysql://localhost:3306/Restaurante";
        private String user = "root";
        private String password = "";
        
        public Connection conexao(){
            try{
               return DriverManager.getConnection(url,user,password);
                
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
        
    }





