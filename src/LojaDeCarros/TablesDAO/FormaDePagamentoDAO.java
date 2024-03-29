package LojaDeCarros.TablesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import LojaDeCarros.Conexao;
import LojaDeCarros.Tables.FormaDePagamento; 

public class FormaDePagamentoDAO { 

    public FormaDePagamento create(FormaDePagamento formaDePagamento) throws SQLException { 
        String sql = """
        INSERT INTO forma_pagamento (nome)
        VALUES (?);
        """;
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, formaDePagamento.getNome());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                formaDePagamento.setId(rs.getInt(1));
            }

            rs.close();

            return formaDePagamento;
        }
    }

    public FormaDePagamento update(FormaDePagamento formaDePagamento) throws SQLException { 
        String sql = """
        UPDATE forma_pagamento
        SET nome = ?
        WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setString(1, formaDePagamento.getNome());
            statement.setInt(2, formaDePagamento.getId());
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return formaDePagamento;
            }
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) { 
        String sql = "DELETE FROM forma_pagamento WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    public void delete(FormaDePagamento formaDePagamento) { 
        delete(formaDePagamento.getId());
    }
    */

    public FormaDePagamento findByNome(String nome) { 
        String sql = "SELECT * FROM forma_pagamento WHERE nome = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, nome);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToFormaDePagamento(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    private FormaDePagamento resultSetToFormaDePagamento(ResultSet rs) throws SQLException { 
        return new FormaDePagamento(
            rs.getInt("id"),
            rs.getString("nome")
        );
    }
}
