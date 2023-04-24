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
public class Usuario {
    private int codigo;
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    // IMPORTE A CLASSE DE CONEXÃO
    Conexao con = new Conexao();
    // FAÇA O CONSTRUTOR
    public Usuario () {
        this(0, "", "", "", "");
    }
    
    public Usuario (int codigo, String nome, String email, String login, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
    
    // FAÇA O ENCAPSULAMENTO
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    // MÉTODOS
    public void cadastrar() {
        String sql = "insert into Usuarios (codigo, nome, email, login, senha) values " + "("+this.getCodigo()+", '"
                +this.getNome()+"','"+this.getEmail()+"','"+this.getLogin()+"','"+this.getSenha()+"')";
        con.executeSQL(sql);
        JOptionPane.showInputDialog(null, "Registrado!");
    }
    
    public ResultSet consultar () {
        ResultSet tabela;
        tabela = null;
        String sql = "select * from Usuarios";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }

    public void excluir(){
        String sql;
        sql= "delete Usuarios where codigo="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showInputDialog(null, "Registro excluido!");
    }
    
    // nome email login senha
    public void alterar(){
        String sql;
        sql="update Usuarios set nome='" + this.getNome() + "',email='" + this.getEmail() + "',login='" + this.getLogin() 
                + "', senha='" + this.getSenha() + "' where codigo=" + this.getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado!");   
    }
}