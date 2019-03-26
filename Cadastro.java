
package com.clinica.cadastro;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome:");
        String nome = sc.nextLine();
        System.out.println("Informe Data Nascimento:");
        String data_nasc = sc.nextLine();
        System.out.println("Informe cpf:");
        String cpf = sc.nextLine();
        System.out.println("Informe endereço:");
        String endereco = sc.nextLine();
        System.out.println("Informe celular:");
        String celular = sc.nextLine();
        System.out.println("Informe salario: ");
        double salario = sc.nextDouble();
        Funcionario f = new Funcionario(nome,data_nasc,cpf,endereco,celular,salario);
        f.DadosFuncionario();
       
    }
}
