package model;

public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Moveu em 2D");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
