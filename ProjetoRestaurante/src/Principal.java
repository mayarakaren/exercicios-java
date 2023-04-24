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
        Comanda com = new Comanda();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n 1 - Digitar Gastos"
                    + "\n 2 - Verificar Promoção" + "\n 3 - Fechar Mesa"
                    + "\n 4 -  Mostrar Comanda" + "\n 0 - Sair"));
        
            switch(op){
                case 1: 
                    com.Gastos();
                    break;
                case 2: 
                    com.Promocao();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Sua mesa foi fechada. O valor total é: " + com.Comanda());
                    break;
                case 4: 
                    com.MostrarComanda();
                    break;
            }
        }
        while(op != 0);
    }
}

