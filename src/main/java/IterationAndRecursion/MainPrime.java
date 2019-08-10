package IterationAndRecursion;

public class MainPrime {
    public static void main(String[] args) {
        Prime prime = new Prime();
        for (int i = 1; i < 21; i++) {
            if (prime.isPrime(i))
                System.out.println("Number = " + i + " is Prime");
        }
    }
}
