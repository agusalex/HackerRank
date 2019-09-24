package Challenge;

import Algorithms.Challenge.Challenge1;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Challenge1Test {


    @Test
    public void pairSum(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);
        Assert.assertEquals(4, Challenge1.pairSum(10,list));
    }


    @Test
    public void getAnimals(){
        int[] animals = new int[]{1,5,2,7,9,3};
        Assert.assertArrayEquals(new int[]{1,9}, Challenge1.getAnimals(animals,10));

    }

    @Test
    public void multipleChoicePanicNotPass(){
        int n=3;
        List<Integer> q =new ArrayList<Integer>();
        List<Double>  pc=new ArrayList<Double>();
        List<Double>  pw = new ArrayList<Double>();
        q.add(2);
        q.add(4);
        q.add(2);
        pc.add(1.0);
        pc.add(4.0);
        pc.add(1.0);
        pw.add(0.5);
        pw.add(1.0);
        pw.add(1.0);

        Assert.assertEquals("NO", Challenge1.isExpectedToPassExam(n,2.0,q,pc,pw));

    }

    @Test
    public void multipleChoicePanicPass(){
        int n=2;
        List<Integer> q =new ArrayList<Integer>();
        List<Double>  pc=new ArrayList<Double>();
        List<Double>  pw = new ArrayList<Double>();
        q.add(2);
        q.add(2);
        pc.add(2.0);
        pc.add(2.0);
        pw.add(1.0);
        pw.add(1.0);

        Assert.assertEquals("YES", Challenge1.isExpectedToPassExam(n,2.0,q,pc,pw));

    }

   @Test
    public void kinderSquare(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(4);
        System.err.println(Challenge1.kinderSquare(arr));
    }

    @Test
    public void minefield1(){
        Assert.assertEquals("YES", Challenge1.isPossible(1,1,2,5));

    }

    @Test
    public void minefield2(){
        Assert.assertEquals("NO", Challenge1.isPossible(1,1,6,3));
    }
}
