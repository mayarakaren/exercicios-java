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
        Cliente cli = new Cliente();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n 1 - Cadastrar os Clientes"
                    + "\n 2 - Listar Clientes"+ "\n 3 - Calcular o limite de crédito"+ "\n 0 - Sair"));
        
            switch(op){
                case 1: 
                    cli.Cadastro();
                    break;
                case 2: 
                    cli.MostrarCliente();
                    break;
                case 3:
                    cli.calcularCredito();
                    break;
            }
        
        }
        
        while(op != 0); 
    }
}

