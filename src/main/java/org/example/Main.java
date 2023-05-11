package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean rodando = true;

        Inventario inv = new Inventario();

        while(rodando){
            Servico s;
            String servico;

            do {
                System.out.print("""
                        Digite o serviço que você deseja:
                        Banho
                        Tosa
                        Hotelzinho
                        Sair
                        >""");

                servico = sc.nextLine().toLowerCase();
            }while(!servico.equals("banho") && !servico.equals("tosa") && !servico.equals("hotelzinho") && !servico.equals("sair"));

            if(servico.equals("sair"))
                break;

            Animal animal = criaAnimal();

            String pagar;
            switch (servico){
                case "banho" ->{
                    s = new Banho(animal);
                    System.out.println("O preço do serviço será de: R$"+s.calculaPreco());
                    System.out.println("Você deseja pagar? (s/n)");
                    pagar = sc.nextLine().toLowerCase();
                    if(pagar.equals("s")){
                        inv.addServico(s);
                    }
                }

                case "tosa" -> {
                    s = new Tosa(animal);
                    System.out.println("O preço do serviço será de R$"+s.calculaPreco());
                    System.out.println("Você deseja pagar? (s/n)");
                    pagar = sc.nextLine().toLowerCase();
                    if(pagar.equals("s")){
                        inv.addServico(s);
                    }

                }
                case "hotelzinho" -> {
                    System.out.print("Horas que seu animal ficará no hotelzinho: ");
                    int horas = Integer.parseInt(sc.nextLine());

                    s = new Hotelzinho(animal, horas);
                    System.out.println("O preço do serviço será de R$"+s.calculaPreco());
                    System.out.println("Você deseja pagar? (s/n)");
                    pagar = sc.nextLine().toLowerCase();
                    if(pagar.equals("s")){
                        inv.addServico(s);
                    }

                }

                default -> {
                    throw new RuntimeException("Nome de serviço invalido: "+servico);
                }

            }

        }

        System.out.println(inv.emitirRelatorio());

    }


    public static Animal criaAnimal(){
        String tamanho, nome, tamanhoPelo;

        System.out.print("Digite o nome do seu animal: ");
        nome = sc.nextLine();

        do {
            System.out.print("Digite o tamanho do seu animal (p, m ou g): ");
            tamanho = sc.nextLine().toLowerCase();
        }while(!tamanho.equals("p") && !tamanho.equals("m") && !tamanho.equals("g"));

        do {
            System.out.print("Digite o tamanho do pelo do seu animal (curto, medio ou longo): ");
            tamanhoPelo = sc.nextLine().toLowerCase();
        }while(!tamanhoPelo.equals("curto") && !tamanhoPelo.equals("medio") && !tamanhoPelo.equals("médio") && !tamanhoPelo.equals("longo"));

        return new Animal(tamanho, tamanhoPelo, nome);

    }


}