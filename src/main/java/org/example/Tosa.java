package org.example;

public class Tosa extends Servico{


    public Tosa(Animal a) {
        super(a);
        this.setNome("Tosa");
    }

    @Override
    public double calculaPreco() {
        switch (getAnimal().getTamanho()) {
            case "p" -> {
                return 22;
            }
            case "m" -> {
                return 30;
            }
            case "g" -> {
                return 40;
            }
        }
        throw new RuntimeException("Tamanho de animal invalido");
    }

}
