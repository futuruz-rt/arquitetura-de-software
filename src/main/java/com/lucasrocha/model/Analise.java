package com.lucasrocha.arquitetura.model;

public class Analise {
    //informações que foram preenchidas no exemplo: talhão (inteiro), área do talhão (ha), área total (ha), profundidade (cm)
    // dados que serão utilizados em cálculos

    private int ntalhao;
    private double areaTalhao;
    private double areaTotal;
    private int sistemaCultivo;
    private double profundidadeAmostraSoloCm;
    private double resultadoAnalise;
    //controle dos dados
    private String produtor;
    private String data;
    private String municipio;
    private String lote;
    private String matriculaLote;
    private String respTecnico;

    //métodos SET e GET  
    public void setTalhao(int talhao) {
        this.ntalhao = talhao;
    }

    public int getTalhao() {
        return ntalhao;
    }

    public void setAreaTalhao(double areaTalhao) {
        this.areaTalhao = areaTalhao;
    }

    public double getAreaTalhao() {
        return areaTalhao;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setSistemaCultivo(int sistemaCultivo) {
        this.sistemaCultivo = sistemaCultivo;
    }

    public int getSistemaCultivo() {
        return sistemaCultivo;
    }

    public void setProfundidadeAmostraCm(double profundidadeAmostraCm) {
        this.profundidadeAmostraSoloCm = profundidadeAmostraCm;
    }

    public double getProfundidadeAmostraCm() {
        return profundidadeAmostraSoloCm;
    }

    public void setResultadoAnalise(int resultadoAnalise) {
        this.resultadoAnalise = resultadoAnalise;
    }

    public double getResultadoAnalise() {
        return resultadoAnalise;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setMatriculaLote(String matriculaLote) {
        this.matriculaLote = matriculaLote;
    }

    public String getMatriculaLote() {
        return matriculaLote;
    }

    public void setRespTecnico(String respTecnico) {
        this.respTecnico = respTecnico;
    }

    public String getRespTecnico() {
        return respTecnico;
    }
}
