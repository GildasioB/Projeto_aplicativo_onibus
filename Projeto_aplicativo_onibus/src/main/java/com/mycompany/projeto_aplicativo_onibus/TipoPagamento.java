
package com.mycompany.projeto_aplicativo_onibus;

import java.util.ArrayList;


public class TipoPagamento {
    private String nome;
    private double quantia;
    
    private ArrayList<Deposito> depositos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }
    
    
}
