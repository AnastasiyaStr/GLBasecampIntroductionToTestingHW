package main;

public class Triplet {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Triplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
