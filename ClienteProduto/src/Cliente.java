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

    public class Cliente{
        private int id;
        private String nome;
        private String end;
        private String email;
        private double renda;
        private double limite;

        public Cliente(){
        }

        public Cliente(int id, String nome, String end, String email, double renda, double limite){
            this.id = id;
            this.nome = nome;
            this.end = end;
            this.email = email;
            this.renda = renda;
            this.limite = limite;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public double getRenda() {
            return renda;
        }

        public void setRenda(double renda) {
            this.renda = renda;
        }

        public double getLimite() {
            return limite;
        }

        public void setLimite(double limite) {
            this.limite = limite;
        }

        public void Cadastro(){
            setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:")));
            setNome(JOptionPane.showInputDialog("Digite o nome:"));
            setEnd(JOptionPane.showInputDialog("Digite o endereço:"));
            setEmail(JOptionPane.showInputDialog("Digite o email:"));
            setRenda(Double.parseDouble(JOptionPane.showInputDialog("Digite a renda mensal:")));       
        }

        public void MostrarCliente(){
            JOptionPane.showMessageDialog(null,"Id do cliente: " + getId() + "\n Nome do : " + getNome() + 
            "\n Endereço do cliente: " + getEnd()+"\n Email do cliente: "+getEmail()
            +"\n Renda Mensal do cliente: " + getRenda());
        }

        public void calcularCredito(){
            setLimite(getRenda()*0.40);
            JOptionPane.showMessageDialog(null, "Limite de Crédito: "+ getLimite());
        }
    }
