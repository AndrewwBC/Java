package controller;

import model.Carro;
import model.Veiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarroController {
    public static void main(String[] args) {

        Carro fiat = new Carro();

        // carro
        fiat.setCapacidadePortaMalas(8);

        // Veiculo
        fiat.setMarca("Fiat");
        fiat.setModelo("Uno");
        fiat.setNumeroDeEixos(2);
        fiat.setAnoFabricacao(2012);
        fiat.setPropulsao("combustao");
        // interface
        fiat.setRenavam("AAA12666");
        fiat.setChassi("BB12");
        fiat.setPlaca("A4A1");

        System.out.println(fiat);


        Carro ford = new Carro(2, "motor", "ford", "fiesta", 1999, 12, "H1R8", "AB223", "A123B1QWEQW23");
        Carro fiatNew = new Carro(2, "motor", "fiat", "fiesta", 2005, 12, "H8NN", "V123", "A123B12QWE3");
        Carro chevrolet = new Carro(2, "motor", "chevrolet", "fiesta", 2010, 12, "AXA-P2", "ABC1QEQW23", "A123ASD123");
        Carro kya = new Carro(2, "motor", "kya", "fiesta", 2015, 12, "H1238", "AWLC13", "A12ASD3B123");
        Carro vw = new Carro(2, "motor", "vw", "fiesta", 2020, 12, "H1OOP", "ABCKLADW23", "A23WEQ123");

        List<Carro> carros = new ArrayList<>();
        carros.add(ford);
        carros.add(fiatNew);
        carros.add(chevrolet);
        carros.add(kya);
        carros.add(vw);


        Map<String, Carro> carroMap = new HashMap<>();
        carroMap.put(ford.getChassi(), ford);
        carroMap.put(fiatNew.getChassi(), fiatNew);
        carroMap.put(chevrolet.getChassi(), chevrolet);
        carroMap.put(kya.getChassi(), kya);
        carroMap.put(vw.getChassi(),vw);



    }
}
