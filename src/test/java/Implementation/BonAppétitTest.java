package Implementation;

import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Implementation.BonAppétit.bonAppetit;

public class BonAppétitTest
{
    @Test
    public void testcase0()
    {
        List<Integer> list = new ArrayList<>();
        list.add(3);list.add(10);list.add(2);list.add(9);
        Assert.assertEquals(5,bonAppetit(list,1,12));
    }
}
