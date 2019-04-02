/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class testeFicha {
    
    public testeFicha() {
    }
    
    
    @Test
    public void testeFicha(){
        String nome = "Gabriel";
        String dataNascimento = "05/04/1998";
        
        double altura = 1.72;
        double peso = 68;
        String tipoSang = "O+";
        String doencasInfancia = "Nenhuma";
        String cirurgiasSofridas = "Estrabismo";
        String algergiasExternas = "Nenhuma";
        String alergiaMedicamento = "Nenhum";
        String doencaGrave = "Nenhuma";
        String remedioDiario = "Nenhum";
        String problemaRespirat = "Nenhum";
        String fazInalacao = "Nenhum";
        String diabetico = "Não";
        String vacinacaoEmDia = "Sim";
        String tratPsiquiPsicol = "Não";
        String panicoFobia = "Não";
        String sonambulismo = "Não";
       
        
        FichaMedica ficha = new FichaMedica(nome, dataNascimento, altura, peso, tipoSang, doencasInfancia,
                                            cirurgiasSofridas, algergiasExternas, alergiaMedicamento,
                                            doencaGrave, remedioDiario, problemaRespirat, fazInalacao, diabetico,
                                            vacinacaoEmDia, tratPsiquiPsicol, panicoFobia, sonambulismo);
    }
    
}
