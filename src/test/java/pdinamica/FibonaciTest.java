package pdinamica;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import pdinamica.Fibonaci;

public class FibonaciTest {

  @Test
  public void testfibMemoized() {
    //prpare
    Fibonaci fibonaci = new Fibonaci();
    for(int i =1; i < 43; i++){

      //act
      int fibMemoizedResult = fibonaci.fibMemoized(i);

      //assert
      int fibResult = fibonaci.fib(i);
      assertEquals(fibResult, fibMemoizedResult);
    }
  }

  @Test
  public void testfibBottomUp() {
    //prpare
    Fibonaci fibonaci = new Fibonaci();
    for(int i =1; i < 43; i++){

      //act
      int fibMemoizedResult = fibonaci.fibBottomUp(i);

      //assert
      int fibResult = fibonaci.fib(i);
      assertEquals(fibResult, fibMemoizedResult);
    }
  }
}