package br.com.Atividade;

public class VIP extends Ingresso{
    public double valorVIP;
    public VIP(double valordoingresso, double valorVIP) {
        super(valordoingresso);
        this.valorVIP = valorVIP;
    }

    public double getValorVIP() {
        return valorVIP;
    }

    public void setValorVIP(double valorVIP) {
        this.valorVIP = valorVIP;
    }
    
    public String imprimeIngresso()
    {
        return "Ingresso VIP:" + (getValor()+getValorVIP());
    }

}
