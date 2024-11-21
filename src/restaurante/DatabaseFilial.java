/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFilial {

    private Connection connection;

    public DatabaseFilial() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/restaurante", "root", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Filial> readAll(int id) {
        List<Filial> filiais = new ArrayList<>();
        String query = "SELECT * FROM filiais WHERE id = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Filial filial = new Filial();
                filial.setId(rs.getInt("id"));
                filial.setEndereco(rs.getString("endereco"));
                filial.setEmail(rs.getString("email"));
                filial.setTelefone(rs.getString("telefone"));
                filial.setQuantMesas(rs.getInt("quant_mesas"));
                filial.setAvaliacao(rs.getDouble("avaliacao"));
                filiais.add(filial);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return filiais;
    }
}
