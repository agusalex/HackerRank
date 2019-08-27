package Implementation;

import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Implementation.BirthdayChocolate.birthday;

public class BirthdayChocolateTest
{
    @Test
    public void testcase0()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(1);list.add(3);list.add(2);
        Assert.assertEquals(2,birthday(list,3,2));
    }
}
