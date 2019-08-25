package Sorting;

import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Sorting.ClosestNumbers.closestNumbers;

public class ClosestNumbersTest {

    @Test
    public void testcase0(){
        Assert.assertEquals("-20 30 ",closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 }));
    }
}
