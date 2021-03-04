package br.com.impacta.models;

public class Carro {
  private String cor;
  private int ano;
  private double valor;

  public String getCor() {
    return this.cor;
  }

  public int getAno() {
    return this.ano;
  }

  public Double getValor() {
    return this.valor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}