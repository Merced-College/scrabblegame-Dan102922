import java.util.*;
import java.io.*;

public class ScrabbleGame {

  private ArrayList<Word> wordList = new ArrayList<>();

    public static void main(String[] args) {
      ScrabbleGame game = new ScrabbleGame();
      game.loadwords("CollinsScarbbleWords_2019.txt");
      game.run();
    }

  public void loadwords(String filename) {
    Scanner sc = new Scanner(new File(filename));
    while (sc.hasNextLine()) {
      String line = sc.nextline().trim();

      if (!line.isEmpty()) {
        Word w = new Word(line);
          wordList.add(w);
      }
    }
    sc.close();
    Collections.sort(wordList);
  }

  public void run() {

    Random rand = new Random();
    char[] letters = new char[4];
    for (int = 0; i < letters.length; i++) {
        int r = rand.nextInt(26);
        letters[I] = (char) ('a' + r);
    }
    System.out.print("Your letters: ");
    for (char c : letters) {
      System.out.print(c + " ");
  }
    System.out.println();
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
