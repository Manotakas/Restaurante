/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseCliente {

    private Connection connection;

    public DatabaseCliente() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/restaurante", "root", "senha"); // Ajuste sua senha e banco
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> readAll(int id) {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes WHERE id = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setDataCadastro(rs.getString("data_cadastro"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return clientes;
    }
}
