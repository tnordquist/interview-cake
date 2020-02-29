package dev.tnordquist.arrayandstringmanipulation;

public class IsFirstComeFirstServe {

  public static void main(String[] args) {
    IsFirstComeFirstServe firstServe = new IsFirstComeFirstServe();

//    int[] takeOut = {1,3,5};
//    int[] dineIn = {2,4,6};
//    int[] serveOrder = {1,2,3,4,5,6};
//
//    System.out.println("Serving order is fair: " + firstServe.servingOrderFair(takeOut,dineIn,serveOrder));
//
//    int[] takeOut2 = {55, 9};
//    int[] dineIn2 = {7, 8};
//    int[] serveOrder2 = {1, 7, 8, 9};
//    System.out.println("Serving order is fair2: " + firstServe.servingOrderFair(takeOut2,dineIn2,serveOrder2));
//
//    int[] takeOut3 = {1, 5};
//    int[] dineIn3 = {2, 3, 6};
//    int[] serveOrder3 = {1, 2, 6, 3, 5};
//    System.out.println("Serving order is fair3 should be false: " + firstServe.servingOrderFair(takeOut2,dineIn2,serveOrder2));
//
//    int[] takeOut4 = {1,9};
//    int[] dineIn4 = {7,8};
//    int[] serveOrder4 = {1, 7, 8};
//    System.out.println("Serving order is fair4 should be false: " + firstServe.servingOrderFair(takeOut4,dineIn4,serveOrder4));

    System.out.println(sum1ToN(3));

  }

  private boolean servingOrderFair(int[] to, int[] di, int[] so) {

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
