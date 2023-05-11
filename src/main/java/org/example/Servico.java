package org.example;

import java.util.Date;

public abstract class Servico {
    private int codigo;
    private Animal animal;
    private Date data;
    private String nome;


    public Servico(Animal a){
        setAnimal(a);
        data = new Date();
    }
    public abstract double calculaPreco();
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public Animal getAnimal(){
        return animal;
    }

    public void setAnimal(Animal a){
        animal = a;
    }

    public Date getData(){
        return data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String dataToString(){
        return String.valueOf(data.getDay())+"/"+
                String.valueOf(data.getMonth())+"/"+
                String.valueOf(data.getYear())+" "+
                String.valueOf(data.getHours())+":"+
                String.valueOf(data.getMinutes());
    }

}
