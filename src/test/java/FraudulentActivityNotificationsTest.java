import org.junit.Assert;
import org.junit.Test;


public class FraudulentActivityNotificationsTest {



    @Test
    public void testCase1(){
        Assert.assertEquals(2,FraudulentActivityNotifications.activityNotifications(new int[]{2,3,4,2,3,6,8,4,5},5));


    }
    @Test
    public void median(){
        Assert.assertEquals((float)6.0,FraudulentActivityNotifications.median(new int[]{1,3,6,6,7,8,9}),0);
        Assert.assertEquals((float)4.5,FraudulentActivityNotifications.median(new int[]{1,2,3,4,5,6,8,9}),0);



    }
}
