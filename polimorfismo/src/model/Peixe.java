package model;

public class Peixe extends Animal implements TresDGame{

    private double z;

    public Peixe(){}

    public Peixe(double x, double y) {

    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void mover3D(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    public void desenhar() {
        System.out.println("Moveu 3D");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
