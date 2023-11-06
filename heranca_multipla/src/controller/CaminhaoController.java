package controller;

import model.Caminhao;

import java.util.*;

public class CaminhaoController {

    public static void main(String[] args) {

        Caminhao volvo = new Caminhao();

        volvo.setCapacidadeDeCarga(52);

        // Caminhao
        volvo.setCapacidadeDeCarga(25500);

        //Veiculo
        volvo.setMarca("Volvo");
        volvo.setModelo("FH-515");
        volvo.setNumeroDeEixos(16);
        volvo.setAnoFabricacao(2017);
        volvo.setPropulsao("combustao");

        // Interface
        volvo.setRenavam("AAA12666");
        volvo.setChassi("BB12");
        volvo.setPlaca("A4A1");

        //System.out.println(volvo.toString());

        Caminhao iveco = new Caminhao(12, "motor", "iveco", "FH-125", 2012, 25000, "BBB", "A2A1A1", "A1A2A21");
        Caminhao mercedez = new Caminhao(14, "motor", "mercedez", "FH-300", 2014, 20000, "BBB1", "A3A1A1", "A121AA21");
        Caminhao jmc = new Caminhao(16, "motor", "jmc", "FH-5000", 2016, 15820, "BBB2", "A4R1A1", "A121A2A666");
        Caminhao scania = new Caminhao(18, "motor", "scania", "FH-J20", 2018, 22100, "BBB3", "Q5A1A1", "A00072A21");
        Caminhao ford = new Caminhao(20, "motor", "ford", "FH-CCC", 2022, 21000, "BBB4", "A7X1A1", "A1215551");

        List<Caminhao> caminhaoList = new ArrayList<>();
        caminhaoList.add(iveco);
        caminhaoList.add(mercedez);
        caminhaoList.add(jmc);
        caminhaoList.add(scania);
        caminhaoList.add(ford);

        Map<String, Caminhao> caminhaoMap = new HashMap<>();
        caminhaoMap.put(iveco.getChassi(), iveco);
        caminhaoMap.put(mercedez.getChassi(), mercedez);
        caminhaoMap.put(jmc.getChassi(), jmc);
        caminhaoMap.put(scania.getChassi(), scania);
        caminhaoMap.put(ford.getChassi(), ford);
        System.out.println(caminhaoMap.get("A7X1A1"));

    }

}
