package br.com.Atividade;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double valor;
        double valorVIP;
        int opcao = Integer.parseInt(JOptionPane
                .showInputDialog("1_- Ingresso Normal\n 2 - Ingresso VIP\n 3 - Ingresso Camarote\n 4 - Sair"));
        switch (opcao) 
        {
            case 1:
                valor = Double.parseDouble(JOptionPane.showInputDialog("valor do Ingresso"));
                Normal ingresso = new Normal(valor);
                JOptionPane.showMessageDialog(null, ingresso.imprimeIngresso(), "Messagen", JOptionPane.CANCEL_OPTION);
                break;
            case 2:
                valor = Double.parseDouble(JOptionPane.showInputDialog("valor do Ingresso"));
                valorVIP = Double.parseDouble(JOptionPane.showInputDialog("Valor do VIP"));
                VIP ingressoVIP=new VIP(valor, valorVIP);
                JOptionPane.showConfirmDialog(null,ingressoVIP.imprimeIngresso(),"menssagen",JOptionPane.CANCEL_OPTION);             
                break;

        }
    }
}