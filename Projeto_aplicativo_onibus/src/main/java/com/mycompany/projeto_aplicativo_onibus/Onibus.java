
package com.mycompany.projeto_aplicativo_onibus;

import java.util.ArrayList;


public class Onibus {
    private String fabricante;
    private double horarioChegada;
    private double horarioSaida;
    private String pontoParada;
    private String cor;
    private int numero;
    private String modelo;
    private String rota;
    
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Trabalhador> trabalhadores;
    
    void transportarUsuario(){
        
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(double horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public double getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(double horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getPontoParada() {
        return pontoParada;
    }

    public void setPontoParada(String pontoParada) {
        this.pontoParada = pontoParada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
    
    
}
