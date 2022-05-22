
package com.mycompany.projeto_aplicativo_onibus;


public class Pix extends TipoPagamento {
    private int numeroDocumentoIdentificacaoUsuario;
    private String primeiroNomeUsuario;
    private String ultimoNomeUsuario;
    
    void gerarQrCode(){
        
    }
    void gerarCodigoPix(){
        
    }

    public int getNumeroDocumentoIdentificacaoUsuario() {
        return numeroDocumentoIdentificacaoUsuario;
    }

    public void setNumeroDocumentoIdentificacaoUsuario(int numeroDocumentoIdentificacaoUsuario) {
        this.numeroDocumentoIdentificacaoUsuario = numeroDocumentoIdentificacaoUsuario;
    }

    public String getPrimeiroNomeUsuario() {
        return primeiroNomeUsuario;
    }

    public void setPrimeiroNomeUsuario(String primeiroNomeUsuario) {
        this.primeiroNomeUsuario = primeiroNomeUsuario;
    }

    public String getUltimoNomeUsuario() {
        return ultimoNomeUsuario;
    }

    public void setUltimoNomeUsuario(String ultimoNomeUsuario) {
        this.ultimoNomeUsuario = ultimoNomeUsuario;
    }
    
    
    
    
}
