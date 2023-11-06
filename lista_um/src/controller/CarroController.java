package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {

       Carro fiat = new Carro("Fiat", "uno", 1999);
       Carro vw = new Carro("vw", "gol", 2004);
       Carro kia = new Carro("kia", "soul", 2013);
       Carro chevrolet = new Carro("chevrolet", "camaro", 2015);
       Carro ford = new Carro("ford", "mustang", 2018);

        List<Carro> carros = new ArrayList<>();
        carros.add(fiat);
        carros.add(vw);
        carros.add(kia);
        carros.add(chevrolet);
        carros.add(ford);

        System.out.println(carros);
        carros.sort(Comparator.comparing(Carro::getAnoFabricacao).reversed());
        /* findAny serve para encontrar o primeiro item e parar a operação */
        Carro filteredCar = carros.stream().filter(c -> c.getMarca().equals("kia")).findAny().orElse(null);
        System.out.println(carros);
        System.out.println(filteredCar);

        // Map

        Map<String, Carro> carroMap = new HashMap<>();
        carroMap.put(fiat.getMarca(), fiat);
        carroMap.put(vw.getMarca(), vw);
        carroMap.put(kia.getMarca(), kia);
        carroMap.put(chevrolet.getMarca(), chevrolet);
        carroMap.put(ford.getMarca(), ford);



    }
}