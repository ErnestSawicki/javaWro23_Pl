package GuessGame;

public class Game {

    private int generatedNumber = (int)(Math.random()*100);


    public int getGeneratedNumber() {
        return generatedNumber;
    }

    public void setGeneratedNumber(int generatedNumber) {
        this.generatedNumber = generatedNumber;
    }
}
