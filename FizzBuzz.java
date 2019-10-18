/*
  * The goal of this problem is efficiently detect any mutliples of 3 and 5
  * The return value should be the sum of all multiples of 3 and 5
  * Keep in mind multiple of 15 would be a repeat
  * good way to appraoch would be to iterate from one boundary to the other
  * while iterating add multiples of 3 5 and 15 (and not including 3 and 5 if multiple of 15 so no duplicates)
*/

public class FizzBuzz {

  // finds the sum of all of the multiples of 3 and 5 within the bounds given
  public static int sum(int limit) {
    
    // null case for boundaries
    if (limit < 0) return -1;

    int sum = 0;
    int i = 0;

    while (i < limit - 15) {
      sum += i + (i + 3) + (i + 5) + (i + 6) + (i + 10) + (i + 9) + (i + 12);
      i += 15;
    }

    // accounts for the exceptions at the end
    while (i < limit) {
      if (i % 15 == 0) {
        sum += i;
      }
      else if (i % 5 == 0) {
        sum += i;
      }
      else if (i % 3 == 0) {
        sum += i;
      }

      ++i;
    }

    return sum;
  }
  public static void main(String[] args) {
    System.out.println(sum(10));
    System.out.println(sum(1000));
  }
}