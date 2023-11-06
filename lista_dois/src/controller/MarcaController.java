package controller;

import model.MarcaModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarcaController {

    public static void main(String[] args) {

        MarcaModel fiat = new MarcaModel("fiat");
        MarcaModel ford = new MarcaModel("ford");
        MarcaModel vw   = new MarcaModel("vw ");
        MarcaModel chevrolet = new MarcaModel("chevrolet");
        MarcaModel kya  = new MarcaModel("kya");

        List<MarcaModel> marcas = new ArrayList<>();
        marcas.add(fiat);
        marcas.add(ford);
        marcas.add(vw);
        marcas.add(chevrolet);
        marcas.add(kya);

        System.out.println(marcas.stream().filter(marca -> marca.getDescricao() == "ford").findAny());

        Map<String, MarcaModel> marcaMap = new HashMap<>();
        marcaMap.put(fiat.getDescricao(), fiat);
        marcaMap.put(ford.getDescricao(), ford);
        marcaMap.put(vw.getDescricao(), vw);
        marcaMap.put(chevrolet.getDescricao(), chevrolet);
        marcaMap.put(kya.getDescricao(), kya);


    }

}
