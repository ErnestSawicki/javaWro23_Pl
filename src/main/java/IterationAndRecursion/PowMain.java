package IterationAndRecursion;

public class PowMain {
    public static void main(String[] args) {
        TwoToPower two = new TwoToPower();

        System.out.println(two.toPowerOfTwo(4));
        System.out.println(two.powRecursion(4));
        System.out.println(two.powBite(4));
    }
}
