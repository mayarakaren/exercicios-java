import javax.swing.*;

        public class Calculadora{
            private double num1;
            private double num2;
            private double res;

        public Calculadora(){
        }

        public Calculadora(double num1, double num2, double res){
            this.num1 = num1;
            this.num2 = num2;
            this.res = res;
        }

        public double getNum1(){
            return num1;
        }

        public void setNum1(double num1){
            this.num1 = num1;
        }

        public double getNum2(){
            return num2;
        }

        public void setNum2(double num2){
            this.num2 = num2;
        }

        public double getRes(){
            return res;
        }

        public void setRes(double res){
            this.res = res;
        }
    
    public void sum(){
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite um número:")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite outro número:")));
        
        setRes(getNum1() + getNum2());
        JOptionPane.showMessageDialog(null,getRes());
    }
    
    public void sub(double Num1, double Num2){
        setRes(Num1 - Num2);
        JOptionPane.showMessageDialog(null,getRes());
    }
    
    public double mult(){
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite um número:")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite outro número:")));
        
        setRes(getNum1() * getNum2());
        return getRes();
    }
    
    public double div(double Num1, double Num2){
        setRes(Num1/Num2);
        return getRes();
    }
}
