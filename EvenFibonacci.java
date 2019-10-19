public class EvenFibonacci {

  // accepts a param/ limit to fib numbers and sums up the even ones
  public static long sum(long limit) {
    long i = 1;
    if (limit < 1) return -1;
    if (limit == 1)
      return 1;
    long sum = 1;
    long prev = 1;
    long curr = 1;
    while (i < limit) {
      long temp = prev + curr;
      if (temp % 2 == 0)
        sum += temp;
      prev = curr;
      curr = temp;
      ++i;
    }

    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(40));
  }
}