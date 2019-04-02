/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

/**
 *
 * @author gabriel
 */
public class FichaMedica {
    
    //Dados Pessoais
    
    private String nomePaciente;
    private String dataNascimento;
    
    
    //Dados Gerais
    
    private double altura;
    private double peso;
    //tipo sanguíneo
    private String tipoSang;
    //doenças de infância
    private String doencasInfancia;
    //ciruigias sofridas
    private String cirurgSofridas;
    //alergias externas
    private String agergiasExternas;
    //alergias a medicamento
    private String alergiaMedicamento;
    //doença grave
    private String doencaGrave;
    //toma algum remedio diariamente
    private String remedioDiario;
    //tem algum problema respiratório
    private String problemaRespirat;
    //faz inalação
    private String fazInalacao;
    //é diabetico
    private String diabetico;
    //está com a vacinação em dia
    private String vacinacaoEmDia;
    //faz tratamento psiquiatrico ou psicológico
    private String tratPsiquiPsicol;
    //tem alguma fobia ou pânico
    private String panicoFobia;
    //tem crises de sonambulismo
    private String sonambulismo;
    
    FichaMedica(String nomePaciente, String dataNascimento, double altura, double peso,
             String tipoSang, String doencasInfancia, String cirurgSofridas, String alergiasExternas, String alergiaMedicamento,
              String doencaGrave, String remedioDiario, String problemaRespirat, String fazInalacao,
               String diabetico, String vacinacaoEmDia, String tratPsiquiPsicol, String panicoFobia, String sonambulismo){
        this.nomePaciente = nomePaciente;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSang = tipoSang;
        this.doencasInfancia = doencasInfancia;
        this.cirurgSofridas = cirurgSofridas;
        this.alergiaMedicamento = alergiaMedicamento;
        this.doencaGrave = doencaGrave;
        this.remedioDiario = remedioDiario;
        this.problemaRespirat = problemaRespirat;
        this.fazInalacao = fazInalacao;
        this.diabetico = diabetico;
        this.vacinacaoEmDia = vacinacaoEmDia;
        this.tratPsiquiPsicol = tratPsiquiPsicol;
        this.panicoFobia = panicoFobia;
        this.sonambulismo = sonambulismo;
      
    }




    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoSang() {
        return tipoSang;
    }

    public void setTipoSang(String tipoSang) {
        this.tipoSang = tipoSang;
    }

    public String getDoencasInfancia() {
        return doencasInfancia;
    }

    public void setDoencasInfancia(String doencasInfancia) {
        this.doencasInfancia = doencasInfancia;
    }

    public String getCirurgSofridas() {
        return cirurgSofridas;
    }

    public void setCirurgSofridas(String cirurgSofridas) {
        this.cirurgSofridas = cirurgSofridas;
    }

    public String getAgergiasExternas() {
        return agergiasExternas;
    }

    public void setAgergiasExternas(String agergiasExternas) {
        this.agergiasExternas = agergiasExternas;
    }

    public String getAlergiaMedicamento() {
        return alergiaMedicamento;
    }

    public void setAlergiaMedicamento(String alergiaMedicamento) {
        this.alergiaMedicamento = alergiaMedicamento;
    }

    public String getDoencaGrave() {
        return doencaGrave;
    }

    public void setDoencaGrave(String doencaGrave) {
        this.doencaGrave = doencaGrave;
    }

    public String getRemedioDiario() {
        return remedioDiario;
    }

    public void setRemedioDiario(String remedioDiario) {
        this.remedioDiario = remedioDiario;
    }

    public String getProblemaRespirat() {
        return problemaRespirat;
    }

    public void setProblemaRespirat(String problemaRespirat) {
        this.problemaRespirat = problemaRespirat;
    }

    public String getFazInalacao() {
        return fazInalacao;
    }

    public void setFazInalacao(String fazInalacao) {
        this.fazInalacao = fazInalacao;
    }

    public String getDiabetico() {
        return diabetico;
    }

    public void setDiabetico(String diabetico) {
        this.diabetico = diabetico;
    }

    public String getVacinacaoEmDia() {
        return vacinacaoEmDia;
    }

    public void setVacinacaoEmDia(String vacinacaoEmDia) {
        this.vacinacaoEmDia = vacinacaoEmDia;
    }

    public String getTratPsiquiPsicol() {
        return tratPsiquiPsicol;
    }

    public void setTratPsiquiPsicol(String tratPsiquiPsicol) {
        this.tratPsiquiPsicol = tratPsiquiPsicol;
    }

    public String getPanicoFobia() {
        return panicoFobia;
    }

    public void setPanicoFobia(String panicoFobia) {
        this.panicoFobia = panicoFobia;
    }

    public String getSonambulismo() {
        return sonambulismo;
    }

    public void setSonambulismo(String sonambulismo) {
        this.sonambulismo = sonambulismo;
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
