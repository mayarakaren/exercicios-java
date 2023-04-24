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

    public class Produto {
        private int id;
        private String desc;
        private int estoque;
        private double preco;

        public Produto() {
        }

        public Produto(int id, String desc, int estoque, double preco) {
            this.id = id;
            this.desc = desc;
            this.estoque = estoque;
            this.preco = preco;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getEstoque() {
            return estoque;
        }

        public void setEstoque(int estoque) {
            this.estoque = estoque;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void CadastroProduto(){
            setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do produto:")));
            setDesc(JOptionPane.showInputDialog("Digite a descrição do produto:"));
            setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque disponível:")));
            setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitario do produto:")));       
        }

        public void MostrarProduto(){
            JOptionPane.showMessageDialog(null,"Id: " + getId() + 
        "\nDescrição: " + getDesc() + "\nEstoque: " + getEstoque()+ "\nPreço Unitario: "+getPreco() );
        }

        public double Pedido(int qtd){
            double valor;
            valor=(this.getPreco()*qtd);
            return valor;
        }

        public void vender(int qtd){
            this.setEstoque(this.getEstoque()-qtd);
            JOptionPane.showMessageDialog(null,"Sua venda foi realizada com sucesso");
        }
    }

