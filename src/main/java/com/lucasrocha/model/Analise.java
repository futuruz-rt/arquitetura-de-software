package com.lucasrocha.model;

import java.util.Date;

public class Analise {
    //informações que foram preenchidas no exemplo: talhão (inteiro), área do talhão (ha), área total (ha), profundidade (cm), textura do solo (índices)
    // dados que serão utilizados em cálculos
    private int numeroTalhao;
    private double areaTalhao;
    private double areaTotal;
    private int texturaSolo;
    private int sistemaCultivo;    
    private double profundidadeAmostraSoloCm;
    private double resultadoAnalise;    
    //controle dos dados
    private String produtor;
    private Date dataAnalise;
    private String municipio;
    private String lote;
    private String matriculaLote;
    private String respTecnico;    
    private Elemento elementosAtuais = new Elementos(); //instanciação da parte superior da tabela
    private Elemento elementosIdeais = new Elementos(); //instanciação da parte inferior da tabela
    
    //métodos SET e GET  
    public void setTalhao(int talhao) {
      this.talhao = talhao;
    }
  
    public int getTalhao() {
        return talhao;
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
  
    public void setTexturaSolo(int texturaSolo) {
      this.texturaSolo = texturaSolo;
    }

    public int getTexturaSolo() {
      return texturaSolo;
    }
    
    public void setSistemaCultivo(int sistemaCultivo) {
      this.sistemaCultivo = sistemaCultivo;
    }
    
    public int getSistemaCultivo() {
      return sistemaCultivo;
    }
    
    public void setProfundidadeAmostraCm(double profundidadeAmostra) {
      this.profundidadeAmostra = profundidadeAmostra;
    }

    public double getProfundidadeAmostraCm() {
      return profundidadeAmostra;
    }
    
    public void setResultadoAnalise(int resultadoAnalise) {
      this.resultadoAnalise = resultadoAnalise;
    }
  
    public int getResultadoAnalise() {
      return resultadoAnalise;
    }
    
    public Elementos getElementosAtuais() {
      return elementosAtuais;
    }
  
    public void setElementosAtuais(Elemento elementosAtuais) {
      this.elementosAtuais = elementosAtuais;
    }

    public Elemento getElementosIdeais() {
      return elementosIdeais;
    }
  
    public void setElementosIdeais(Elementos elementosIdeais) {
      this.elementosIdeais = elementosIdeais;
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
    
    public void setMatriculaLote(String matrculaLote) {
      this.matriculaLote = matriculaLote;
    }
  
    public String getMatrculaLote() {
      return matrculaLote;
    }
  
     public void setRespTecnico(String respTecnico) {
      this.responsavelTecnico = responsavelTecnico;
    }
    
    public String getRespTecnico() {
      return responsavelTecnico;
    }
