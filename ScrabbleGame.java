import java.util.*;
import java.io.*;

public class ScrabbleGame {

  private ArrayList<Word> wordList = new ArrayList<>();

    public static void main(String[] args) {
      ScrabbleGame game = new ScrabbleGame();
      game.loadwords("CollinsScarbbleWords_2019.txt");
      game.run();
    }

  // load words
  public void loadword(String filename) {
    /*
    needs to read file, create word objects & add them to word list, then sort it
    */
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
