import java.util.*;
import java.io.*;

public class ScrabbleGame {

  private ArrayList<Word> wordList = new ArrayList<>();

    public static void main(String[] args) {
      ScrabbleGame game = new ScrabbleGame();
      game.loadwords("CollinsScarbbleWords_2019.txt");
      game.run();
    }

  public void loadword(String filename) {
    Scanner sc = new Scanner(new File(filename));
    while (sc.hasNextLine()) {
      String line = scnextline().trim();

      if (!line.isEmpty()) {
        Word w = new Word(line):
          wordList.add(w);
      }
    }
    sc.close();
    Collections.sort(wordList);
  }

  public void play() {
    /*
    //generate 4 random letters, show them, get input from user, check if they're using the letters provided, check if word is valid, then give feedback
    */
  }

  private boolean wordfromletters(String input, char[] letter) {
    //needs to check letters
    return false;
  }
    private boolean binarySearch(String target) {
      //needs to search using word objects
      return false;
    }
}
