package dev.tnordquist.arrayandstringmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrays {

  public static void main(String[] args) {
    MergeSortedArrays m = new MergeSortedArrays();
    int[] mergeArr = m.mergeArray(new int[]{3, 4, 6, 10, 11, 15},new int[]{1, 5, 8, 12, 14, 19});
    System.out.println(Arrays.toString(mergeArr));
  }

  private int[] mergeArray(int[] arr1, int[] arr2) {

    int[] mergedArr;

    List<Integer> list = new ArrayList<>();

    for (Integer id : arr1
    ) {
      list.add(id);
    }

    for (Integer id : arr2
    ) {
      list.add(id);
    }

    Collections.sort(list);

    Integer[] arr3 =  list.toArray(new Integer[list.size()]);

    mergedArr = new int[arr3.length];
    for (int i = 0; i < arr3.length; ++i) {
      mergedArr[i] = arr3[i];
    }
    return mergedArr;
  }

}
