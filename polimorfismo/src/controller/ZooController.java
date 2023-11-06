package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ZooController {

    public static void main(String[] args) {

        Peixe nemo = new Peixe();
        Peixe dori = new Peixe();
        nemo.mover3D(1,2,3);
        dori.mover3D(2,2,2);


        Passaro bemTeVi = new Passaro();
        Passaro canario = new Passaro();

        bemTeVi.mover3D(1,2,3);
        canario.mover3D(5,5,5);

        Cachorro bob = new Cachorro();
        Cachorro rex = new Cachorro();
        bob.mover(4,4);
        rex.mover(6,6);


        List<Animal> animais = new ArrayList<>();
        animais.add(nemo);
        animais.add(dori);
        animais.add(bemTeVi);
        animais.add(canario);
        animais.add(bob);
        animais.add(rex);

        animais.forEach(animal -> {
            if(animal instanceof Cachorro) {
                animal.mover(2,2);
            } else {
                ((TresDGame) animal).mover3D(2,2,2);
            }
            animal.desenhar();
            System.out.println(animal.toString());
        });

        animais.forEach(animal -> {
            if(animal instanceof Cachorro) {
                animal.mover(8,8);
            }
            animal.desenhar();
            System.out.println(animal.toString());
        });

        animais.forEach(animal -> {
            if(animal instanceof Peixe || animal instanceof Passaro) {
                ((TresDGame) animal).mover3D(5,5,5);
            }
            animal.desenhar();
            System.out.println(animal.toString());
        });

    }
}
