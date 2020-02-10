package dev.tnordquist.arrayandstringmanipulation.reversestring;

public class ReverseStringInPlace {


  public char[] reverseLettersInPlace(char[] chars){
    int endCt = chars.length-1;
    int frontCt = 0;

    for (int i = 0; i < chars.length/2; ++i) {

      char temp = chars[endCt];
      chars[endCt--] = chars[frontCt];
      chars[frontCt++] = temp;
    }
    return chars;
  }

}
