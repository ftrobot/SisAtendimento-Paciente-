/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.dal;

import com.clinica.model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 1161169412
 */
public class FuncionarioDAL {

    public void add(Funcionario f) throws SQLException {

        try {

            String sql = "insert into Funcionarios (cpf, nome, rg, data_nasc, email, sexo, tipo, carteira_trabalho, pis) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stm = (PreparedStatement) Conexao.getConexao().prepareStatement(sql);

            stm.setInt(1, f.getCpf());
            stm.setString(2, f.getNome());
            stm.setInt(3, f.getRg());
            stm.setString(4, f.getData_nasc());
            stm.setString(5, f.getEmail());
            stm.setString(6, f.getSexo());
            stm.setString(7, f.getTipo());
            stm.setInt(8, f.getCarteiraTrabalho());
            stm.setInt(9, f.getPis());

            Conexao.getConexao();
            stm.execute();

        } catch (SQLException e) {
            e.getStackTrace();
            Conexao.getConexao().rollback();
        } finally {
            Conexao.getConexao().close();
            System.out.println("Desconectado");
        }
    }

}
