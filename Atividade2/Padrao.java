package Atividade2;

public class Padrao extends Funcionario {
   
        public Padrao (int matricula, String nome, double salario) {
          super(matricula, nome, salario);    
        }
      
        @Override
        public double calcularProventos() {    
          return getSalario();
        }
      }

