package br.com.Atividade;


public class Normal extends Ingresso {

  public Normal(double valordoingresso) {
    super(valordoingresso);
  }

  public String imprimeIngresso () {
    return "Valor do ingresso: "+ getValor();
  }
}