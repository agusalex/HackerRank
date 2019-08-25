package Strings;

import Algorithms.Strings.CaesarCipher;
import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTest {


    @Test
    public void testCase1(){
        Assert.assertEquals("okffng-Qwvb",CaesarCipher.caesarCipher("middle-Outz",2));


    }
}

