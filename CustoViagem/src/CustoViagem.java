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

    public class CustoViagem {
        private double Percurso;

        public CustoViagem() {
        }

        public CustoViagem(double Percurso) {
            this.Percurso = Percurso;
        }

        public double getPercurso() {
            return Percurso;
        }

        public void setPercurso(double Percurso) {
            this.Percurso = Percurso;
        }

        public void CalcViagem(Percurso perc){
            this.Percurso= (perc.getKms() * perc.getCombustivel()) + perc.getPedagio();
            JOptionPane.showMessageDialog(null, "O Total da viagem é:" + this.Percurso);
        }   
    }
