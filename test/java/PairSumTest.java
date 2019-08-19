package java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
public class PairSumTest {

    @Test
    public void pairSum(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);
        Assert.assertEquals(4, PairSum.pairSum(10,list));
    }
}
