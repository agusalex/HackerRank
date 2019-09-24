package Challenge;
import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Challenge.Challenge3.*;


public class Challenge3Test {



    @Test
    public void solution1(){
        Assert.assertArrayEquals(new int[]{3,2},solutionA("abcd,aabc,bd","aaa,aa"));



    }

    @Test
    public void solution2(){
        Assert.assertArrayEquals(new Integer[]{4, 3, 2, 5},solutionB(new Integer[]{1, 4, 3, 2, 5},4));

    }

}
