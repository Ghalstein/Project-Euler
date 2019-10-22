/*
Figure out the best way to find the largest prime factor of a given number
First look at 2 becasue there cannot be a prime factor lower than 2
Remeber to check if % 2 == 0 becasue that would give the hgihest value
*/

import java.util.*;

public class PrimeNumber {

  // finds the largest prime factor
  public static int max(int n) {
    ArrayList<Integer> primes = new ArrayList<>();

    // null case
    if (n < 1)
      return -1;

    int i = 3;

    // loop that adds prime numbers and tests them against current prime number
    bigLoop: while (i < n / 2) {
      for (int value : primes) {
        if (i % value == 0 || i % 3 == 0) {
          i += 2;
          continue bigLoop;
        }
      }
      primes.add(i);

      i += 2;
    }

    if (primes.isEmpty())
      return 1;
    else {
      i = primes.size() - 1;
        while (i >= 0) {
          if (n % primes.get(i) == 0) return primes.get(i);
          --i;
        }}
    return 1;
  }

  public static void main(String[] args) {
    System.out.println(max(-1));
    System.out.println(max(0));
    System.out.println(max(2));
    System.out.println(max(5));
    System.out.println(max(18));
    // System.out.println(max(6008));

  }
}