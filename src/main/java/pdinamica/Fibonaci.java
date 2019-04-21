package pdinamica;

public class Fibonaci {

  public int fib(int num) {
    if (num == 1 || num == 2) {
      return 1;
    } else { 
      return fib(num - 1 ) + fib(num - 2);
    }
  }

  public int fibMemoized(int num) {
    Integer[] memo = new Integer[num];
    return fibMemoized(num, memo);
  }

  public int fibBottomUp(int num){
    if (num == 1 || num == 2) {
      return 1;
    }

    int[] bottomUp = new int[num + 1];
    bottomUp[0] = 1;
    bottomUp[1] = 1;

    for (int i = 2; i < bottomUp.length; i++){
      bottomUp[i] = bottomUp[i-1] + bottomUp[i-2];
    }
    return bottomUp[num-1];
  }

  private Integer fibMemoized(int num, Integer[] memo) {
    if (memo[num-1] != null){
      return memo[num-1];
    }
    
    if (num == 1 || num == 2) {
      return 1;
    } else { 
      int result = fibMemoized(num - 1, memo) + fibMemoized(num - 2, memo);
      memo[num-1] = result;

      return result;
    }
  }
}