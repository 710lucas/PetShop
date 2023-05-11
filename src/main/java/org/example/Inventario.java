package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Servico> servicos = new ArrayList<>();

    public void addServico(Servico s){
        s.setCodigo(servicos.size());
        servicos.add(s);
    }

    public double calculaServico(int posicao) {
        return servicos.get(posicao).calculaPreco();
    }

    public double calculaTodosServicos(){
        double total = 0;
        for(Servico s : servicos){
            total+=s.calculaPreco();
        }
        return total;
    }

    public String emitirRelatorio(){
        String out= "";
        int ESPACO = 14;
        System.out.println("Relatorio de serviços");
        System.out.print(calculaEspacos("Nome",ESPACO));
        System.out.print(calculaEspacos("Data",ESPACO*2));
        System.out.print(calculaEspacos("Nome animal",ESPACO*2));
        System.out.print(calculaEspacos("Codigo",ESPACO));
        System.out.print(calculaEspacos("Preco",ESPACO));

        System.out.println();


        for(Servico s : servicos){
            out+=calculaEspacos(s.getNome(), ESPACO);
            out+=calculaEspacos(s.dataToString(), ESPACO*2);
            out+=calculaEspacos(s.getAnimal().getNome(), ESPACO*2);
            out+=calculaEspacos(String.valueOf(s.getCodigo()), ESPACO);
            out+=calculaEspacos(String.valueOf(s.calculaPreco()), ESPACO);
            out+="\n";
        }

        return out+"Valor total: "+String.valueOf(calculaTodosServicos());
    }

    private String calculaEspacos(String inp, int qntEspaco){
        String out = "";
        for(int i = 0; i<qntEspaco-inp.length(); i++){
            out += " ";
        }
        return inp+out;
    }



}
