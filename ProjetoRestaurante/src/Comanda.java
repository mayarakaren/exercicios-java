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

    public class Comanda {
        private int mesa;
        private double Consumo;
        private double Estacionamento;
        private double Couvert;
        private double DescontoPromocional;
        private double Total;

        public Comanda() {
        }

        public Comanda(int mesa, double Consumo, double Estacionamento, double Couvert, double DescontoPromocional, 
                double Total) {
            this.mesa = mesa;
            this.Consumo = Consumo;
            this.Estacionamento = Estacionamento;
            this.Couvert = Couvert;
            this.DescontoPromocional = DescontoPromocional;
            this.Total = Total;
        }

        public int getMesa() {
            return mesa;
        }

        public void setMesa(int mesa) {
            this.mesa = mesa;
        }

        public double getConsumo() {
            return Consumo;
        }

        public void setConsumo(double Consumo) {
            this.Consumo = Consumo;
        }

        public double getEstacionamento() {
            return Estacionamento;
        }

        public void setEstacionamento(double Estacionamento){
            this.Estacionamento = Estacionamento;
        }

        public double getCouvert() {
            return Couvert;
        }

        public void setCouvert(double Couvert) {
            this.Couvert = Couvert;
        }

        public double getDescontoPromocional() {
            return DescontoPromocional;
        }

        public void setDescontoPromocional(double DescontoPromocional) {
            this.DescontoPromocional = DescontoPromocional;
        }

        public double getTotal() {
            return Total;
        }

        public void setTotal(double Total) {
            this.Total = Total;
        }

        public void Gastos(){
            setMesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mesa:")));
            setConsumo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta:")));
            setEstacionamento(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do estacionamento:")));
            setCouvert(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do couvert:")));
            setDescontoPromocional(0);
            setTotal(0);
        }

        public void Promocao(){
            if(getConsumo()>100) {
                setDescontoPromocional((getConsumo()/100)*10);
            }
        }

        public void MostrarComanda(){
            JOptionPane.showMessageDialog(null,"Valor do consumo: " + getConsumo()
                +"\n Valor do estacionamento:" + getEstacionamento()+"\n Valor do couvert: " + getCouvert()
                +"\n Valor do desconto promocional: "+ getDescontoPromocional()+"\n Valor total: " + getTotal());
        }

        public double Comanda(){
            setTotal((getConsumo()+getEstacionamento()+getCouvert())-getDescontoPromocional());
            return getTotal();
        }

    }
