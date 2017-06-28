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
      } else if (eachLetter.equals("b") || eachLetter.equals("c") ||
        eachLetter.equals("m") || eachLetter.equals("p")) {
        score += 3;
      } else if (eachLetter.equals("f") || eachLetter.equals("h") ||
        eachLetter.equals("v") || eachLetter.equals("w") || eachLetter.equals("y")) {
        score += 4;
      } else if (eachLetter.equals("k")) {
        score += 5;
      }  else if (eachLetter.equals("j")  || eachLetter.equals("x") ) {
        score += 8;
      } else if ( eachLetter.equals("q")  || eachLetter.equals("z") ) {
        score += 10;
      } else {
        System.out.println("Not a word");
      }
    }
    return score;
  }
}
