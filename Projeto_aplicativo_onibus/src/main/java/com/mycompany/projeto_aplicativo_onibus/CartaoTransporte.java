
package com.mycompany.projeto_aplicativo_onibus;
import java.util.ArrayList;
import java.util.Date;

public class CartaoTransporte {
    private int numero;
    private String modelo;
    private String fabricante;
    private String nomeUsuario;
    private int rgUsuario;
    private int cpfUsuario;
    private Date dataNascimentoUsuario;
    private double saldo;
    
    private ArrayList<RecarregamentoCartaoTransporte> recarregamentoscartoestransporte;
    private ArrayList<Usuario> usuarios;
    
    void mostrarInformacoesUsuario(){
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getRgUsuario() {
        return rgUsuario;
    }

    public void setRgUsuario(int rgUsuario) {
        this.rgUsuario = rgUsuario;
    }

    public int getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(int cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public Date getDataNascimentoUsuario() {
        return dataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(Date dataNascimentoUsuario) {
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
