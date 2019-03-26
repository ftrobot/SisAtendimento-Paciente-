
package com.clinica.cadastro;

public class Funcionario {
    public String nome;
    public String data_nasc;
    public String cpf;
    public String endereco;
    public String celular;
    public double salario;

    public Funcionario(String nome, String data_nasc, String cpf, String endereco, String celular, double salario) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    

    
     public void DadosFuncionario(){
         System.out.println("Dados Cadastrais do Funcionário: ");
         System.out.println("nome: " + this.nome);
         System.out.println("Data nascimento: " + this.data_nasc);
         System.out.println("Cpf: " + this.cpf);
         System.out.println("Endereço:" + this.endereco);
         System.out.println("Celular:" + this.celular);
         System.out.println("Slario:"+ this.salario);
        
     }
}
