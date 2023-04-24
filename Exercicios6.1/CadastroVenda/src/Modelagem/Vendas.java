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
public class Vendas {
    private int codigo;
    private String nomeVendedor;
    private String produtoVendido;

    // IMPORTE A CLASSE DE CONEXÃO
    Conexao con = new Conexao();
    
    public Vendas() {
       this(0, "", "");
    }
    
    public Vendas(int codigo, String nomeVendedor, String produtoVendido) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.produtoVendido = produtoVendido;
    }

    // GETTER AND SETTER
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    // MÉTODOS
    public void cadastrarVendas() {
        String sql = "insert into Vendedor (codigo, nomeVendedor, produtoVendido) values " + "(" + this.getCodigo() + ", '" 
                + this.getNomeVendedor() + "','" + this.getProdutoVendido() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet consultar () {
        ResultSet tabela;
        tabela = null;
        String sql = "select * from Vendedor";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }

    public void excluirVendas(){
        String sql;
        sql= "delete from Vendedor where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido!");
    }
    
    // nome email login senha
    public void alterarVendas(){
        String sql;
        sql="update Vendedor set nomeVendedor='" + this.getNomeVendedor() + "',produtoVendido='" + this.getProdutoVendido() 
                + "' where codigo=" + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado!");   
    }
}