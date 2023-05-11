package org.example;

public class Animal {
    private String tamanho;
    private String tamanhoPelo;
    private String nome;

    public Animal(String tamanho, String tamanhoPelo, String nome){
        this.tamanho = tamanho.toLowerCase();
        this.tamanhoPelo = tamanhoPelo.toLowerCase();
        this.nome = nome;
    }

    public String getTamanho(){return tamanho;}

    public String getTamanhoPelo(){return tamanhoPelo;}

    public String getNome(){
        return nome;
    }

    public void tosado(){
        tamanhoPelo = "curto";
    }

    @Override
    public String toString(){
        return "Animal "+nome+" tamanho="+tamanho+" tamanhoPelo="+tamanhoPelo;
    }
}
