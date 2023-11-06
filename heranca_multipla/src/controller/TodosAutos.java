package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TodosAutos {
    public static void main(String[] args) {

        Bicicleta caloi = new Bicicleta(2, "humana", "caloi", "barra forte", 2012, 24,"A4A");
        Bicicleta monark = new Bicicleta(2, "humana", "monark", "barra forte", 2013, 24,"A5A");
        Bicicleta hill = new Bicicleta(2, "humana", "hill", "sport", 2014, 24,"A45A");
        Bicicleta burracha = new Bicicleta(2, "humana", "burracha", "speed", 2016, 24,"A88A");
        Bicicleta ciclone = new Bicicleta(2, "humana", "ciclone", "off-road", 2019, 24,"A01A");
        Carro ford = new Carro(2, "motor", "ford", "fiesta", 1999, 12, "H1R8", "AB223", "A123B1QWEQW23");
        Carro fiatNew = new Carro(2, "motor", "fiat", "fiesta", 2005, 12, "H8NN", "V123", "A123B12QWE3");
        Carro chevrolet = new Carro(2, "motor", "chevrolet", "fiesta", 2010, 12, "AXA-P2", "ABC1QEQW23", "A123ASD123");
        Carro kya = new Carro(2, "motor", "kya", "fiesta", 2015, 12, "H1238", "AWLC13", "A12ASD3B123");
        Carro vw = new Carro(2, "motor", "vw", "fiesta", 2020, 12, "H1OOP", "ABCKLADW23", "A23WEQ123");
        Caminhao iveco = new Caminhao(12, "motor", "iveco", "FH-125", 2012, 25000, "BBB", "A2A1A1", "A1A2A21");
        Caminhao mercedez = new Caminhao(14, "motor", "mercedez", "FH-300", 2014, 20000, "BBB1", "A3A1A1", "A121AA21");
        Caminhao jmc = new Caminhao(16, "motor", "jmc", "FH-5000", 2016, 15820, "BBB2", "A4R1A1", "A121A2A666");
        Caminhao scania = new Caminhao(18, "motor", "scania", "FH-J20", 2018, 22100, "BBB3", "Q5A1A1", "A00072A21");
        Caminhao fordw = new Caminhao(20, "motor", "ford", "FH-CCC", 2022, 21000, "BBB4", "A7X1A1", "A1215551");


        List<Veiculo> todosList = new ArrayList<>();
        todosList.add(iveco);
        todosList.add(mercedez);
        todosList.add(jmc);
        todosList.add(scania);
        todosList.add(fordw);
        todosList.add(ford);
        todosList.add(fiatNew);
        todosList.add(chevrolet);
        todosList.add(kya);
        todosList.add(vw);
        todosList.add(caloi);
        todosList.add(monark);
        todosList.add(hill);
        todosList.add(burracha);
        todosList.add(ciclone);

        todosList.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println(todosList);

        todosList.stream().forEach((item) -> {
            if(item instanceof Automovel) {
                System.out.println(item);
            }
        });

        Stream<Veiculo> filtered =  todosList.stream().filter(c -> c instanceof Automovel);
        System.out.println(filtered);
    }
}
