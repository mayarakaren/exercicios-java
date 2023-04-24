/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mayar
 */import javax.swing.*;

    public class Percurso{
        
        private double kms;
        private double combustivel;
        private double pedagio;

        public Percurso() {

        }

        public Percurso(double kms, double Combustivel, double Pedagio) {
            this.kms = kms;
            this.combustivel = Combustivel;
            this.pedagio = Pedagio;
        }

        public double getKms() {
            return kms;
        }

        public void setKms(double kms) {
            this.kms = kms;
        }

        public double getCombustivel() {
            return combustivel;
        }

        public void setCombustivel(double Combustivel) {
            this.combustivel = Combustivel;
        }

        public double getPedagio() {
            return pedagio;
        }

        public void setPedagio(double Pedagio) {
            this.pedagio = Pedagio;
        }

        public void Percurso(){
            setKms(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilômetros percorridos:")));
            setCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do combutível:")));
            setPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do pedagio:")));
        }

        public void ListarPercurso(){
            JOptionPane.showMessageDialog(null,"Quilômetros percorridos: " + getKms()+
                    "\n Valor do combustível: " + getCombustivel()+ "\n Valor do pedagio: " + getPedagio());
        }
    }
