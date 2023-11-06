package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Uber {

    public static void main(String[] args) {


        Usuario usuario = new Usuario(333333L, "Andrew", "andrew@mail.com", "9999999");

        Veiculo gol = new Veiculo(444444L, "Sedan", "ABC123", 2012);

        Motorista manoel = new Motorista(55555L,"Manoel", "manoel@mail.com", "333222111");

        Corrida corridaUm = new Corrida(123123L, "Dinheiro", "Parcelado 12 vezes", 2022, 24.00, manoel, usuario);
        Corrida corridaDois = new Corrida(1231223L, "Dinheiro", "Parcelado 6 vezes", 2023, 28.00, manoel, usuario);
        Corrida corridaTres = new Corrida(1777723L, "Dinheiro", "Parcelado 2 vezes", 2021, 45.00, manoel, usuario);

        usuario.adicionarCorridas(corridaUm);
        usuario.adicionarCorridas(corridaDois);

        manoel.adicionarCorridas(corridaUm);
        manoel.adicionarCorridas(corridaDois);
        manoel.adicionarCorridas(corridaTres);

        manoel.adicionarVeiculo(gol);

        usuario.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        usuario.getCorridas().forEach(corrida -> {
           // System.out.println(corrida);
        });

        manoel.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio));
        manoel.getCorridas().forEach(corrida -> {
           // System.out.println(corrida);
        });

      manoel.getCorridas().forEach(corrida -> {
          System.out.println(corrida.getPreco());
        });

        List<Corrida> corridasManoel = manoel.getCorridas();

        System.out.println(corridasManoel.stream().mapToDouble(Corrida::getPreco).sum());

    }
}
