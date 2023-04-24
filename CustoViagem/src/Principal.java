/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mayar
 */
    import javax.swing.*;

    public class Principal {

        public static void main(String[] args) {
           CustoViagem cust = new CustoViagem();
           Percurso perc = new Percurso();

           int op;

            do{
                op = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção: \n 1 - Cadastrar o percurso"
                        + "\n 2 - Mostrar o percurso" + "\n 3 - Visualizar o total da viagem" + "\n 0 - Sair"));

                switch(op){
                    case 1: 
                        perc.Percurso();
                        break;
                    case 2: 
                        perc.ListarPercurso();
                        break;
                    case 3:
                        cust.CalcViagem(perc);
                        break;
                }
            }
            
            while(op != 0);
        }
    }

