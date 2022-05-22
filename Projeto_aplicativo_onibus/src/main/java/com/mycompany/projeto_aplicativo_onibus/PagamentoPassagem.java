
package com.mycompany.projeto_aplicativo_onibus;

import java.util.ArrayList;


public class PagamentoPassagem {
    private int quantidade;
    
    private ArrayList<Usuario> usuarios;
    
    private ComprovantePagamento comprovante;
    
    
    void gerarComprovantePagamento(){
        
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ComprovantePagamento getComprovante() {
        return comprovante;
    }

    public void setComprovante(ComprovantePagamento comprovante) {
        this.comprovante = comprovante;
    }
    
    
    
}
