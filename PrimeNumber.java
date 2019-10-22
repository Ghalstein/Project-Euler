/*
Figure out the best way to find the largest prime factor of a given number
First look at 2 becasue there cannot be a prime factor lower than 2
Remeber to check if % 2 == 0 becasue that would give the hgihest value
*/

public class PrimeNumber {

  // finds the largest prime factor
  public static int max(int n) {

    // null case
    if (n < 1)
      return -1;

    // handles best case
    if (n % 2 == 0)
      return n / 2;

    int i = 3;

    while (i < n / 2) {
      if (n % i == 0)
        return n / i;
      else
        i += 2;
    }
    
    return 1;

  }

  public static void main(String[] args) {

  }
}