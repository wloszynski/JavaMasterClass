public class Main {
    public static void main(String[] args) {

        //excercise
        displayHighScorePosition("Adrian", calculateHighScorePosition(1200));

    }

    public static void displayHighScorePosition(String name, int highScore) {
        System.out.println(name + " managed to get into position:" + highScore + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) return 1;
        else if (playerScore >= 500) return 2;
        else if (playerScore >= 100) return 3;
        else return 4;

    }
}
