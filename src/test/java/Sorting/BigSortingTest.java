package Sorting;

import Algorithms.Sorting.BigSorting;
import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Sorting.BigSorting.bigSorting;

public class BigSortingTest {

    @Test
    public void testCase0(){
        Assert.assertArrayEquals(new String[]{"1","2","100","111","200","3084193741082937","3084193741082938","12303479849857341718340192371"},bigSorting(new String[]{"1","2","100","12303479849857341718340192371","3084193741082937","3084193741082938","111","200"}));

    }
}
