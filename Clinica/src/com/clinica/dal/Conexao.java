package com.clinica.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    //Possibilita instancias
    private static Connection con = null;

    public static Connection getConexao() {
        if (con == null) {
            System.out.println("Conectando ao banco...");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://clinicadb.ckygqmbdoejq.us-east-2.rds.amazonaws.com:8080/ClinicaDB?useTimezone=true&serverTimezone=UTC", "adm", "88286261");
                System.out.println("Conectado.");
            } catch (ClassNotFoundException ex) {
                System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
        return con;
    }
}
