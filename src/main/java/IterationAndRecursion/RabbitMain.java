package IterationAndRecursion;

public class RabbitMain {
    public static void main(String[] args) {
        Rabbits rabbits = new Rabbits();
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i + "||Fibonacci number = " + rabbits.rabbitsAfterMonths(i));
        }
    }
}
