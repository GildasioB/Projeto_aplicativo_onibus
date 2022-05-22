
package com.mycompany.projeto_aplicativo_onibus;
import java.util.ArrayList;
import java.util.Date;

public class RecarregamentoCartaoTransporte {
    private int numeroCartao;
    private String modeloCartao;
    private String modeloUsuario;
    private int rgUsuario;
    private int cpfUsuario;
    private Date dataNascimentoUsuario;
    private double valor;
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<CartaoTransporte> cartoestransporte;
    
   
    void adicionarSaldoConta(){
        
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getModeloCartao() {
        return modeloCartao;
    }

    public void setModeloCartao(String modeloCartao) {
        this.modeloCartao = modeloCartao;
    }

    public String getModeloUsuario() {
        return modeloUsuario;
    }

    public void setModeloUsuario(String modeloUsuario) {
        this.modeloUsuario = modeloUsuario;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
