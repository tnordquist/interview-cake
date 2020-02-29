package dev.tnordquist.arrayandstringmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MergeSortedArrays {

  public static void main(String[] args) {
    MergeSortedArrays m = new MergeSortedArrays();
    //    int[] mergeArr = m.mergeArray(new int[]{3, 4, 6, 10, 11, 15}, new int[]{1, 5, 8, 12, 14, 19});
    //    int[] mergeArr = m.mergeArray(new int[]{-3, -2, -1, 0}, new int[]{1, 2, 3, 4});
    //    int[] mergeArr = m.mergeArray(new int[]{3, 4, 6, 10, 11, 15}, new int[]{100,200,1001,100011});
    //    int[] mergeArr = m.mergeArray(new int[]{}, new int[]{1});
    int[] mergeArr = m
        .mergeArray(new int[]{3, 4, 6, 10, 11, 15, 78, 112}, new int[]{13});
    // More
    System.out.println(Arrays.toString(mergeArr));

  }

  private int[] mergeArray(int[] arr1, int[] arr2) {

    int[] newArr = new int[arr1.length + arr2.length];
    int ctA = 0;
    int ctB = 0;

    for (int i = 0; i < newArr.length; ++i) {

      if (ctA >= arr1.length && ctB < arr2.length) {
        newArr[i] = arr2[ctB++];
      } else if (ctB >= arr2.length && ctA < arr1.length) {
        newArr[i] = arr1[ctA++];
      } else {
        if (arr1[ctA] <= arr2[ctB]) {
          newArr[i] = arr1[ctA++];
        } else {
          newArr[i] = arr2[ctB++];
        }
      }
    }
    return newArr;
  }

}
