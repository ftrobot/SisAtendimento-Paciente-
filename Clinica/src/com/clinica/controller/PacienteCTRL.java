/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controller;

import com.clinica.dal.PacienteDAL;
import com.clinica.model.Paciente;
import java.sql.SQLException;

/**
 *
 * @author Jonathan
 */
public class PacienteCTRL {
    
    private Paciente p;
    private PacienteDAL pd;
    
    public void add(String nome, int rg, int cpf, String data_nasc, String pSaude, String email, String sexo) throws SQLException{
        
        p = new Paciente();
        pd = new PacienteDAL();
        
        p.setNome(nome);
        p.setRg(rg);
        p.setCpf(cpf);
        p.setData_nasc(data_nasc);
        p.setpSaude(pSaude);
        p.setEmail(email);
        p.setSexo(sexo);
        
        pd.add(p);
        
    }
    
}
