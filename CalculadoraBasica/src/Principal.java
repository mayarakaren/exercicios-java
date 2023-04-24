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

        /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args) {
     Calculadora cal = new Calculadora();
        
     int operacao;
     double num1, num2;
        
    do{
    operacao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n 1 - Somar"+"\n 2 - Subtrair"
    +"\n 3 - Multiplicar"+"\n 4 - Dividir"+"\n 0 - Sair"));
        
        switch(operacao){
            case 1: 
                cal.sum();
                break;
            case 2: 
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                cal.sub(num1,num2);
                break;
            case 3: 
                JOptionPane.showMessageDialog(null,cal.mult());
                break;
            case 4:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                JOptionPane.showMessageDialog(null,cal.div(num1,num2));
                break;
            }
    }
    while(operacao != 0);
    }   
}
