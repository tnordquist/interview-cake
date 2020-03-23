package dev.tnordquist.arrayandstringmanipulation.hashinghashtables;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InflightEntertainment {

  public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {
    int fL = flightLength;
    int[] mL = movieLengths;
    boolean match = false;

    HashSet<Integer> hashset = IntStream.of(mL).boxed()
        .collect(Collectors.toCollection(HashSet::new));

    // determine if two movies add up to the flight length

    for(int j = 0; j < mL.length-1; ++j) {

      int test = (fL-mL[j+1]);
      if(hashset.contains(test)){
        return match = true;

      }
    }

    return match;
  }


}
