public class Word  implements Comparable<Word> {
  private String word;

  public Word(String w) {
    this.word = w.toLowerCase();
  }

public String getWord() {
  return word;
  }

@override
public int compareTo(Word other) {
  return this.word.compareTo(other.word);
  }

@override
public String toString() {
  return word;
  }
}
