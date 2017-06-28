import java.io.Console;

public class App {
  public static void main(String[] args) {

    while(true) {
      Console myConsole = System.console();
      Scrabble scrabbleGame = new Scrabble();
      System.out.println("I am a Scrabble Application. Input a word and I will calculate your Scrabble score");
      String word = myConsole.readLine();
      int score = scrabbleGame.calculateScore(word);
      System.out.println("Your Scrabble score is " + score + " points.");
    }
  }
}
