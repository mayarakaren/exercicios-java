/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mayar
 */
public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;

    Conexao con = new Conexao();
    
    public Produto() {
       this(0, "", "");
    }

    public Produto(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto() {
        String sql = "insert into Produtos (codigo, nomeProduto, descricao) values" + "(" + this.getCodigo() + ", '" 
                + this.getNomeProduto() + "','" + this.getDescricao() + "')";
        con.executeSQL(sql);
        JOptionPane.showInputDialog(null, "Produto registrado");
    }
    
    public ResultSet Consultar() {
        ResultSet tabela;
        tabela = null;
        String sql = "select * from rodutos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }

    public void excluirProduto(){
        String sql;
        sql= "delete from Produtos where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showInputDialog(null, "Registro excluido!");
    }
    
    public void alterarProduto(){
        String sql;
        sql="update Produtos set nomeProduto='" + this.getNomeProduto() + "',descricao='" + this.getDescricao() 
                + "' where codigo=" + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado!");   
    }    
}