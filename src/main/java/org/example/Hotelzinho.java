package org.example;

public class Hotelzinho extends Servico{

    private double horas;

    public Hotelzinho(Animal a, double horas) {
        super(a);
        this.horas = horas;
        this.setNome("Hotelzinho");

    }

    public double getHoras(){
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public double calculaPreco() {

        double precoPorHora = 0;
        switch (getAnimal().getTamanho()){
            case "p" -> {
                precoPorHora = 12;
            }
            case "m" -> {
                precoPorHora = 18;
            }
            case "g" ->{
                precoPorHora = 25;
            }
            default -> {
                throw new RuntimeException("Tamanho de animal invalido: "+getAnimal().getTamanho());
            }
        }

        return horas*precoPorHora;

    }
}
