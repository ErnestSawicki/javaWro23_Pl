package GuessGame;

import Stopwatch.Stopwatch;

import java.util.Scanner;

public class VsComputerGame {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        System.out.println("Podaj liczbe z zakresu 0 - 99: ");
        Scanner sc = new Scanner(System.in);
        int searchedNumber = sc.nextInt();
        int generatedNumber = -1;
        int scopeUpper = 100;
        int scopeLower = 0;
        for (int i = 0; i < 8; i++) {
            generatedNumber =((scopeUpper + scopeLower) / 2);
            if (generatedNumber == searchedNumber){
                System.out.println(generatedNumber);
                break;
            }
            if (generatedNumber > searchedNumber) {
                scopeUpper = generatedNumber;
            }
            if (generatedNumber < searchedNumber) {
                scopeLower = generatedNumber;
            }
            System.out.printf("scope is equal to: %d - %d\n", scopeLower, scopeUpper);
        }
        System.out.println(generatedNumber);
        System.out.println(stopwatch.stop()/1000000);

    }
}
