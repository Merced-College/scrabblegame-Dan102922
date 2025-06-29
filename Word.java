public class Word  implements Comparable<Word> {
  private String word;

  public Word(String w) {
    this.word = w.toLowerCase();
  }

public String getWord() {
  return word;
  }
}
