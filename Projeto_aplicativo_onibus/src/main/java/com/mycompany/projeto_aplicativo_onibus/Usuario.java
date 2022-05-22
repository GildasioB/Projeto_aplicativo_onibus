
package com.mycompany.projeto_aplicativo_onibus;

import java.util.ArrayList;
import java.util.Date;





public class Usuario {
    private String nome;
    private int cpf;
    private int rg;
    private int numeroTelefone;
    private double saldoConta;
    private char senha;
    private String email;
    private String nacionalidade;
    private Date dataNascimento;
    
    private ArrayList<Onibus> onibus;
    private ArrayList<Alarme> alarmes;
    private ArrayList<Deposito> depositos;
    private ArrayList<RecarregamentoCartaoTransporte> recarregamentosCartaoTransporte;
    private ArrayList<Passagem> passagens;
    private ArrayList<PagamentoPassagem> pagamentoPassagens;
    private ArrayList<CartaoTransporte> cartoesTransporte;
    
    
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public char getSenha() {
        return senha;
    }

    public void setSenha(char senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    void realizarCadastro(){
        
    }
    void fazerLogin(){
        
    }
    void consultarSaldo(){
        
    }
    void depositarDinheiro(){
        
    }
    void programarAlarme(){
        
    }
    void recarregarCartaoTransporte(){
        
    }
    void acessarControleParental(){
        
    }
    void visualizarInformacoesOnibus(){
        
    }
    void pagarPassagem(){
        
    }
    void excluirConta(){
        
    }
    void gerenciarCartaoTransporte(){
        
    }
    void modificarCartaoTransporte(){
        
    }
    
}
