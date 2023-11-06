package controller;
/*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*/
import model.Automovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomovelController {

    public static void main(String[] args) {

        Automovel firstCar = new Automovel("123", "1ABC2", "cinza", 4, "gasolina", 80000, "1a1a1a", 1.200);
        Automovel secondCar = new Automovel("124", "1ABC4", "prata", 4, "gasolina", 72000, "1b1b1b", 2.000);
        Automovel thirdCar = new Automovel("111", "1AXC9", "vermelho", 4, "flex", 35000, "2b9b0b", 4.000);
        Automovel fourthCar = new Automovel("555", "1AXD9", "bordô", 4, "flex", 47524, "2g9b0t", 3.200);
        Automovel fifthCar = new Automovel("999", "1AXC9", "azul", 4, "flex", 55217, "ct9b0b", 9.500);

        List<Automovel> AutomovelList = new ArrayList<Automovel>();

        AutomovelList.add(firstCar);
        AutomovelList.add(secondCar);
        AutomovelList.add(thirdCar);
        AutomovelList.add(fourthCar);
        AutomovelList.add(fifthCar);


        String filteredColorCar = String.valueOf(AutomovelList.stream().filter(automovel -> automovel.getCor() == "vermelho").findAny().orElse(null));
        System.out.println(filteredColorCar);

        Map<Double, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(firstCar.getValor_locacao(), firstCar);
        automovelMap.put(secondCar.getValor_locacao(), firstCar);
        automovelMap.put(thirdCar.getValor_locacao(), firstCar);
        automovelMap.put(fourthCar.getValor_locacao(), firstCar);
        automovelMap.put(fifthCar.getValor_locacao(), firstCar);

        System.out.println(automovelMap.get(4.000));





    }



}
