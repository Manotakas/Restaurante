/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package restaurante;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author CAMARGO
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
   public static String status = "Não conectou...";
       
       	public Restaurante() {     }
        
        public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;    //atributo do tipo Connection
        return connection;
        
        
        String driverName = "Banco_Finalizado";                  
try {
	Class.forName(driverName);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
        }
        
        
}





