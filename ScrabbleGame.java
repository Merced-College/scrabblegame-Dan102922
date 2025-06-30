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
      String line = sc.nextLine().trim();

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
    for (int i = 0; i < letters.length; i++) {
        int r = rand.nextInt(26);
        letters[i] = (char) ('a' + r);
    }
    Scanner input = new Scanner(System.in);
    
    System.out.print("Your letters: ");
    for (char c : letters) {
      System.out.print(c + " ");
  }
    System.out.print("Type a word in with the letters you have: ");
    String inputtedword = input.nextLine().toLowerCase();
    System.out.println();
  }


  
  private boolean wordfromletters(String input, char[] letter) {
    Map<Character, Integer> letterCounts = new HashMap<>();
    for (char c : letter) {
      letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
    }
    for (char c : input.toCharArray()) {
      if (!letterCounts.containsKey(c) || letterCounts.get(c) == 0) {
        return false;
      }
      letterCounts.put(c, letterCounts.get(c) - 1);
    }
    return true;
  }


  
    private boolean binarySearch(String target) {
      //needs to search using word objects
      //dont forget reflection
      return false;
    }
}
