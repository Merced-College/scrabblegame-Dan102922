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
    if (!wordfromletters(inputtedword, letters)) {
      System.out.println("Invalid, use letters you are given.");
        return;
    }

    if (binarySearch(inputtedword)) {
      System.out.println("This word is valid");
    } else {
      System.out.println("Invalid dictionary word");
    }
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
      int left = 0;
      int right = wordList.size() - 1;

      Word targetWord = new Word(target);

        while (left <= right) {
        int mid = (left + right) / 2;
        Word midWord = wordList.get(mid);
        int comparison = midWord.compareTo(targetWord);
        if (comparison == 0) {
          return true;
        } else if (comparison < 0) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }

      return false;
    }
}

// Things left:
// Add a new improvement
// Add more comments
// Write a reflection




