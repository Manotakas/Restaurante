/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import restaurante.Restaurante;

/**
 *
 * @author CAMARGO
 */
public class Cadastros {
    
    public class CadastroCliente {
        String insert = "INSERT INTO Clientes (CPF, Nome, Sexo, Idade, Endereco, Email, Telefone, Data_cadastro) VALUES (?, ?, ?, ?, ?, ?, ?);";
        
        try (
            Restaurante Connection = new Restaurante.conexao;
            PreparedStatement stmt = Connection.preparedStatement(insert)
        ) {
            stmt.setString(1, CPF);
            stmt.setString(1, Nome);
            stmt.setString(1, Sexo);
            stmt.setString(1, Idade);
            stmt.setString(1, Endereço);
            stmt.setString(1, Email);
            stmt.setString(1, Telefone);
            stmt.setString(1, Data_cadastro);
        }
        
    }
    
}
