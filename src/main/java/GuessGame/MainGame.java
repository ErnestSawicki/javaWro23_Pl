package GuessGame;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Podaj liczbe: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int guessedNumber = sc.nextInt();
            if (guessedNumber > game.getGeneratedNumber())
                System.out.println("Podana liczba jest wieksza!");
            if (guessedNumber < game.getGeneratedNumber())
                System.out.println("Podana liczba jest mniejsza!");
            if (guessedNumber == game.getGeneratedNumber()){
                System.out.println("Wygrales!");
                break;
            }
        }
        System.out.println("Przegrales!");
        System.out.println("Zadana liczba wynosila: " + game.getGeneratedNumber());





    }
}
