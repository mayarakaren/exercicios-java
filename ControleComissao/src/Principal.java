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
        Controle cont = new Controle();
        
        int op;
        double valor;
        
    do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção: \n 1 - Nome"
            + "\n 2 - Salário"+ "\n 3 - Calcular comissão"+ "\n 0 - Sair"));
        
        switch(op){
            case 1: 
                cont.DigitarNome();
                break;
            case 2: 
                cont.DigitarSalario();
                break;
            case 3:
                valor = Double.parseDouble(JOptionPane.showInputDialog("O Valor vendido é: "));
                JOptionPane.showMessageDialog(null,cont.calculoComissao(valor));
                break;
            }
        }
        
        while(op != 0);
    }  
}
