
package com.mycompany.projeto_aplicativo_onibus;
import java.util.Date;

public class ComprovantePagamento {
    private String nomeUsuario;
    private double valor;
    private Date data;
    private char codigoautenticacao;
    private double horaTransacao;
    private char idTransacao;
    
    private PagamentoPassagem pagamento;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public char getCodigoautenticacao() {
        return codigoautenticacao;
    }

    public void setCodigoautenticacao(char codigoautenticacao) {
        this.codigoautenticacao = codigoautenticacao;
    }

    public double getHoraTransacao() {
        return horaTransacao;
    }

    public void setHoraTransacao(double horaTransacao) {
        this.horaTransacao = horaTransacao;
    }

    public char getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(char idTransacao) {
        this.idTransacao = idTransacao;
    }

    public PagamentoPassagem getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoPassagem pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
    
}
