package controller;

import model.Bicicleta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BicicletaController {

    public static void main(String[] args) {

        Bicicleta caloi = new Bicicleta(2, "humana", "caloi", "barra forte", 2012, 24,"A4A");
        Bicicleta monark = new Bicicleta(2, "humana", "monark", "barra forte", 2013, 24,"A5A");
        Bicicleta hill = new Bicicleta(2, "humana", "hill", "sport", 2014, 24,"A45A");
        Bicicleta burracha = new Bicicleta(2, "humana", "burracha", "speed", 2016, 24,"A88A");
        Bicicleta ciclone = new Bicicleta(2, "humana", "ciclone", "off-road", 2019, 24,"A01A");

        List<Bicicleta> bicicletaList = new ArrayList<>();
        bicicletaList.add(caloi);
        bicicletaList.add(monark);
        bicicletaList.add(hill);
        bicicletaList.add(burracha);
        bicicletaList.add(ciclone);

        bicicletaList.sort(Comparator.comparing(Bicicleta::getAnoFabricacao));

        System.out.println(bicicletaList);



    }
}
