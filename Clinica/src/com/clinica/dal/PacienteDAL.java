/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.dal;

import com.clinica.model.Paciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class PacienteDAL {
    
    public void add(Paciente p) throws SQLException{
        
        try {
           
            String sql = "insert into Pacientes (cpf, nome, rg, data_nasc, plano_saude, email, sexo) values (?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stm = (PreparedStatement) Conexao.getConexao().prepareStatement(sql);
            
            stm.setInt(1, p.getCpf());
            stm.setString(2, p.getNome());
            stm.setInt(3, p.getRg());
            stm.setString(4, p.getData_nasc());
            stm.setString(5, p.getpSaude());
            stm.setString(6, p.getEmail());
            stm.setString(7, p.getSexo());
            
            Conexao.getConexao();
            stm.execute();
            
        } catch (SQLException e) {
            e.getStackTrace();
            Conexao.getConexao().rollback();
        } finally{
            Conexao.getConexao().close();
            System.out.println("Desconectado");
        }
        
    }
    
    
}
