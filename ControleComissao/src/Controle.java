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

public class Controle{
    private String nome;
    private double salario;
    private double valor;
    private double salarioTotal;
    
    public Controle(){
    }
    
    public Controle(String nome, double salario, double valor, double salarioTotal){
        this.nome = nome;
        this.salario = salario;
        this.valor = valor;
        this.salarioTotal = salarioTotal;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getSalarioTotal(){
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal){
        this.salarioTotal = salarioTotal;    
    }
    
    public void DigitarNome(){
        setNome(JOptionPane.showInputDialog("Digite o Nome:"));
    }
    
    public void DigitarSalario(){
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário:")));
    }
    
    public double calculoComissao(double valor){
        setSalarioTotal(((valor * 10)/100) + getSalario());   
        return getSalarioTotal();
    }
}
