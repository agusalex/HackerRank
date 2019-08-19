
import java.util.ArrayList;

class PairSum {

    static int pairSum(int k, ArrayList<Integer> list){
        if(k<3){
            return 0;  //Numbers wont be repeated so 1+1 is ruled out
        }
        int count = 0;
        for (int i = 0; i <list.size() -1; i++) {
            int first = list.get(i);
            for (int j = i+1;j <list.size()-1 ; j++) {
                int second = list.get(j);
                int sum = first+second;
                if(sum<k) {
                    count+=1;
                    System.out.println("("+first+" , "+second+") = "+sum);
                }
            }
        }
        return count;

    }

}
