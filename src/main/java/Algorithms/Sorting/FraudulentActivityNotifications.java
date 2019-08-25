package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FraudulentActivityNotifications {

    public static int activityNotifications(int[] expenditure, int d) {
        int notifications = 0;
        if(expenditure.length<=d){
            return 0;
        }


        for (int i = d; i < expenditure.length ; i++) {
            float median = median(Arrays.copyOfRange(expenditure,i-d, i-1));
            if((float)expenditure[i]>=2*median){
                notifications++;
            }

        }
        return notifications;


    }



public static float median(int[] values){
    Arrays.sort(values);
    if(values.length==0){
        return -1;
    }
    else if (values.length%2!=0){
        return values[values.length/2];
    }
    else{
        return (float)(values[values.length/2]+values[(values.length/2)-1])/(float)2;
    }
}


        }

