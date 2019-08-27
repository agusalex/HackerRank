package Implementation;

import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Implementation.AppleandOrange.countApplesAndOranges;

public class AppleandOrangeTest
{
    @Test
    public void testcase0()
    {
        Assert.assertEquals("1 1",countApplesAndOranges(7,11,5,15,3,2,new int[]{-2,2,1},new int[] {5,-6}));
    }
}
