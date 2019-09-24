package Challenge;
import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Challenge.Challenge2.*;


public class Challenge2Test {


    @Test
    public void studentsTest(){
        Integer[] list = new Integer[]{5,4,3,6,1};
        Assert.assertEquals(2,students(list));

    }

    @Test
    public void processesTest(){
        Integer[] list = new Integer[]{1,2,3,4,5};
        Assert.assertEquals(1,processes(list));

    }




}
