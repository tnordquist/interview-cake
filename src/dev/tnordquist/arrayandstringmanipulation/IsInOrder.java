package dev.tnordquist.arrayandstringmanipulation;

public class IsInOrder {

  public static boolean combinedIsInOrder(int[] to, int[] di, int[] so) {

    int ctto = 0;
    int ctdi = 0;
    boolean isFair = true;

    if(so.length != to.length + di.length){
      return false;
    }

    for(int i = 0; i < so.length; ++i) {
      if(ctto < to.length && so[i] == to[ctto]) {
        ctto++;
      } else if (ctdi < di.length && so[i] == di[ctdi]) {
        ctdi++;
      } else {
        isFair = false;
      }
    }
    return isFair;
  }

  public static int sum1ToN(int n) {

    if(n==0){
      return n;
    }
    return n + sum1ToN(n-1);
  }

}
