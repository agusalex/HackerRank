package Strings;

import Algorithms.Strings.CamelCase;
import org.junit.Assert;
import org.junit.Test;

import static Algorithms.Strings.CamelCase.camelCase;


public class CamelCaseTest {
    @Test
    public void testCase0(){
        Assert.assertEquals(5,camelCase("saveChangesInTheEditor"));
    }
}
