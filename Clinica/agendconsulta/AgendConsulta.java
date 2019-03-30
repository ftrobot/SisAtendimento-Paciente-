/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendconsulta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class AgendConsulta {
    
    int codPaciente;
    String nomePaciente;
    int codMedico;
    String nomeMedico;
    String especialidadeMedico;
    String dataConsulta;
    String horaConsulta;
    String motivoConsulta;
    
    public static boolean validaData(String dataConsulta){
         String dateFormat = "dd/MM/uuuu";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
        .ofPattern(dateFormat)
        .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(dataConsulta, dateTimeFormatter);
            return true;
            } catch (DateTimeParseException e) {
            return false;
    }
    }
    
    public static boolean validaHora(String horaConsulta){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		sdf.setLenient(false);
	try{
		sdf.parse(horaConsulta);
	}catch(ParseException e){
		return false;
	}
		return true;
    }
    
    public void consulta(){
        
        Scanner entrada = new Scanner(System.in);
        Scanner leString = new Scanner(System.in);
        
        
       // System.out.println("Digite o código do Paciente:");
        codPaciente = entrada.nextInt();
        //System.out.println("Digite o nome do paciente:");
        nomePaciente = leString.nextLine();
        //System.out.println("Digite o código do médico:");
        codMedico = entrada.nextInt();
        //System.out.println("Digite o nome do médico:");
        nomeMedico = leString.nextLine();
        //System.out.println("Digite a especialidade do médico:");
        especialidadeMedico = leString.nextLine();
        //System.out.println("Digite a data da consulta:");
        dataConsulta = leString.nextLine();
        validaData(dataConsulta);
        //System.out.println("Digite a hora da consulta:");
        horaConsulta = leString.nextLine();
        validaHora(horaConsulta);
        //System.out.println("Digite o motivo da consulta:");
        motivoConsulta = leString.nextLine();
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            TelaAgendamento telap = new TelaAgendamento(); 
            telap.setVisible(true);
            
    }
    
}
