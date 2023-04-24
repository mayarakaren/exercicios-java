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
        Produto pd = new Produto();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua opção: \n 1 - Cadastrar Cliente"
                    + "\n 2 - Mostrar Cliente" + "\n 3 - Cadastrar Produto"
                    + "\n 4 - Mostrar Produto" + "\n 5 - Vender"+ "\n 0 - Sair"));
        
            switch(op){
                case 1: 
                    cli.Cadastro();
                    break;
                case 2: 
                    cli.MostrarCliente();
                    break;
                case 3:
                    pd.CadastroProduto();
                    break;
                case 4:
                    pd.MostrarProduto();
                    break;
                case 5:
                    int qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
                    if(pd.getEstoque()>= qtd){
                        pd.Pedido(qtd);
                        JOptionPane.showMessageDialog(null,"Preço total da compra: R$"+ pd.Pedido(qtd));
                        pd.vender(qtd);
                    }else{
                        JOptionPane.showMessageDialog(null," Estoque Indisponivel");
                    }
                    break;
            }      
        }
        
        while(op!= 0);
    } 
}

