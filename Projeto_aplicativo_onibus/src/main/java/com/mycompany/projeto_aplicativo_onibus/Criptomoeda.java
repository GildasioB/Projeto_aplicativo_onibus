
package com.mycompany.projeto_aplicativo_onibus;


public class Criptomoeda extends TipoPagamento {
    private String nomeMoeda;
    private String numeroDocumentoIdentificacaoUsuario;
    private String primeiroNomeUsuario;
    private String ultimoNomeUsuario;
    
    void gerarQrCode(){
        
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }

    public String getNumeroDocumentoIdentificacaoUsuario() {
        return numeroDocumentoIdentificacaoUsuario;
    }

    public void setNumeroDocumentoIdentificacaoUsuario(String numeroDocumentoIdentificacaoUsuario) {
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
