package org.test.math.utils;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciUtilTest {

    @Test
    public void FibonacciForkJoinTest()
    {
        FibonacciUtil fibonacciUtil= new FibonacciLinearUtil();
        test(fibonacciUtil);
    }

//    @Test
//    public void FibonacciParallelTest()
//    {
//        FibonacciUtil fibonacciUtil= new FibonacciLinearUtil();
//        test(fibonacciUtil);
//    }
//
//    @Test
//    public void FibonacciRecurTest()
//    {
//        FibonacciUtil fibonacciUtil= new FibonacciRecurUtil();
//        test(fibonacciUtil);
//    }

    @Test
    public void FibonacciLinearTest()
    {
        FibonacciUtil fibonacciUtil= new FibonacciLinearUtil();
        test(fibonacciUtil);
    }


    private void test(FibonacciUtil fibonacciUtil) {
        Assert.assertEquals(fibonacciUtil.calc(1L),1L);
        Assert.assertEquals(fibonacciUtil.calc(2L),1L);
        Assert.assertEquals(fibonacciUtil.calc(3L),2L);
        Assert.assertEquals(fibonacciUtil.calc(10L),55L);
        Assert.assertEquals(fibonacciUtil.calc(100L),3736710778780434371L);
    }
}
