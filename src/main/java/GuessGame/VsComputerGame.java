package GuessGame;

import java.util.Scanner;

public class VsComputerGame {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe z zakresu 0 - 99: ");
        Scanner sc = new Scanner(System.in);
        int searchedNumber = sc.nextInt();
        int generatedNumber = -1;
        int scopeUpper = 99;
        int scopeLower = 0;
        for  (int i = 0; i < 7; i++){
            generatedNumber = (scopeUpper + scopeLower)/2;
            if (generatedNumber > searchedNumber){
                scopeUpper = scopeUpper /2;
            }
            if (generatedNumber < searchedNumber){
                scopeLower = (scopeUpper + scopeLower) /2;
            }
        }
        System.out.println(generatedNumber);

    }
}
