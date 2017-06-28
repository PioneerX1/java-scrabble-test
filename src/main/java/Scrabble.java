import java.util.List;
import java.util.ArrayList;

public class Scrabble {

  public int calculateScore(String phrase) {
    int score = 0;
    String[] userLetters = phrase.split("");
    for ( String eachLetter:userLetters ){
      if (eachLetter.equals("a") || eachLetter.equals("e") || eachLetter.equals("i") || eachLetter.equals("o") || eachLetter.equals("u") || eachLetter.equals("l") || eachLetter.equals("n") || eachLetter.equals("r") || eachLetter.equals("s") || eachLetter.equals("t") ) {
      score += 1;
      } else if (eachLetter.equals("d") || eachLetter.equals("g")){
        score += 2;
      }
    }
    return score;
  }
}
