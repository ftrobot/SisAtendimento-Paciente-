/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.dal.FuncionarioDAL;
import com.clinica.model.Funcionario;
import java.sql.SQLException;

/**
 *
 * @author 1161169412
 */
public class FuncionarioCTRL {
    
    private Funcionario f;
    private FuncionarioDAL fd;
    
    public void add(String nome, int rg, int cpf, String data_nasc, String email, int cTrabalho, int pis, String sexo, String tipo) throws SQLException{
        
        f = new Funcionario();
        fd = new FuncionarioDAL();
        
        f.setNome(nome);
        f.setRg(rg);
        f.setCpf(cpf);
        f.setData_nasc(data_nasc);
        f.setEmail(email);
        f.setSexo(sexo);
        f.setCarteiraTrabalho(cTrabalho);
        f.setPis(pis);
        f.setTipo(tipo);
        
        fd.add(f);
        
    }
    
}
