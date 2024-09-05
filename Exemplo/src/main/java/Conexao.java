
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class Conexao {
    
    public static void main(String[] args ){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:msql://localhost/teste", "usuario", "senha");            
        } catch (ClassNotFoundExpection ex){
            System.out.println("Driver no banco de dados não localizado.");
        } catch (SQLException ex) {  
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage ());
        }
    
   
        }
    
}
        

