package pdinamica;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import pdinamica.Fibonaci;

public class FibonaciTest {

  public static void main(String[] args) {
    //Result result = JUnitCore.runClasses(FibonaciTest.class);
  
    //for (Failure failure : result.getFailures()) {
   //    System.out.println(failure.toString());
   // }
  
   //System.out.println(result.wasSuccessful());

   System.out.println("hello");
 }

  @Test
  public void testfibMemoized() {
    //prpare
    Fibonaci fibonaci = new Fibonaci();
    for(int i =1; i < 30; i++){

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
    for(int i =1; i < 30; i++){

      //act
      int fibMemoizedResult = fibonaci.fibBottomUp(i);

      //assert
      int fibResult = fibonaci.fib(i);
      assertEquals(fibResult, fibMemoizedResult);
    }
  }
}