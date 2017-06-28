import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    int expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }


    @Test
    public void calculateScore_returnScoreForMultipleOfSame_3() {
      Scrabble testScrabble = new Scrabble();
      int expected = 3;
      assertEquals(expected, testScrabble.calculateScore("aaa"));
    }

    @Test
    public void calculateScore_returnScoreForMultipleOnePointers_10() {
      Scrabble testScrabble = new Scrabble();
      int expected = 10;
      assertEquals(expected, testScrabble.calculateScore("aeioulnrst"));
    }

    @Test
    public void calculateScore_returnScoreForMultipleTwoPointers_10() {
      Scrabble testScrabble = new Scrabble();
      int expected = 4;
      assertEquals(expected, testScrabble.calculateScore("dg"));
    }


}
