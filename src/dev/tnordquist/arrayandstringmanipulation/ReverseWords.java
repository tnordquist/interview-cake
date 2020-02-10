package dev.tnordquist.arrayandstringmanipulation;

public class ReverseWords {


  public static void main(String[] args) {
    char[] words = {'c', 'a', 'k', 'e', ' ',
        'p', 'o', 'u', 'n', 'd', ' ',
        's', 't', 'e', 'a', 'l'};

    char[] words2 = {'t', 'h', 'e', ' ', 'e', 'a', 'g', 'l', 'e', ' ',
        'h', 'a', 's', ' ', 'l', 'a', 'n', 'd', 'e', 'd'};
    ReverseWords reverseWords = new ReverseWords();

    reverseWords.reverseWordsInPlace(words2);
    System.out.println(words2);
  }

  private void reverseLettersInPlace(char[] words) {
    int endCt = words.length - 1;
    int frontCt = 0;

    for (int i = 0; i < words.length / 2; ++i) {

      char temp = words[endCt];
      words[endCt--] = words[frontCt];
      words[frontCt++] = temp;
    }
  }

  private void reverseLettersFromWords(char[] words, int frontCt, int endCt) {
    int diff = endCt - frontCt;
    endCt--;
    for (int i = 0; i < diff / 2; ++i) {
      char temp = words[endCt];
      words[endCt--] = words[frontCt];
      words[frontCt++] = temp;
    }
  }

  private void reverseWordsInPlace(char[] words) {
    reverseLettersInPlace(words);
    int endCt = 0;
    int frontCt = 0;

    for (int i = 0; i <= words.length; ++i) {
      if (i == words.length || words[i] == ' ') {
        reverseLettersFromWords(words, frontCt, endCt);
        endCt += 1;
        frontCt = endCt;
      } else {
        endCt++;
      }
    }
  }

}
