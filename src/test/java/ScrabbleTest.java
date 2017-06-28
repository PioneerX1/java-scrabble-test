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
    public void calculateScore_returnScoreForMultipleTwoPointers_4() {
      Scrabble testScrabble = new Scrabble();
      int expected = 4;
      assertEquals(expected, testScrabble.calculateScore("dg"));
    }

    @Test
    public void calculateScore_returnScoreForMultipleThreePointers_12() {
      Scrabble testScrabble = new Scrabble();
      int expected = 12;
      assertEquals(expected, testScrabble.calculateScore("bcmp"));
    }

    @Test
    public void calculateScore_returnScoreForMultipleFourPointers_20() {
      Scrabble testScrabble = new Scrabble();
      int expected = 20;
      assertEquals(expected, testScrabble.calculateScore("fhvwy"));
    }

    @Test
    public void calculateScore_returnScoreForSingleFivePointers_5() {
      Scrabble testScrabble = new Scrabble();
      int expected = 5;
      assertEquals(expected, testScrabble.calculateScore("k"));
    }

    @Test
    public void calculateScore_returnScoreForMultipleEightPointers_16() {
      Scrabble testScrabble = new Scrabble();
      int expected = 16;
      assertEquals(expected, testScrabble.calculateScore("jx"));
    }

    @Test
    public void calculateScore_returnScoreForMultipleTenPointers_20() {
      Scrabble testScrabble = new Scrabble();
      int expected = 20;
      assertEquals(expected, testScrabble.calculateScore("qz"));
    }

    @Test
    public void calculateScore_returnScoreForWatermelon_15() {
      Scrabble testScrabble = new Scrabble();
      int expected = 15;
      assertEquals(expected, testScrabble.calculateScore("watermelon"));
    }



}
