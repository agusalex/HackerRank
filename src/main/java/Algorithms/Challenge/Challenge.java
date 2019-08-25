package Algorithms.Challenge;



import java.util.*;

public class Challenge {


    //2018
    public static int pairSum(int k, ArrayList<Integer> list){
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
    //2019
    public static int[] getAnimals(int[] animalWeights, int truckCapacity) {
        int[] sortedAnimals = animalWeights.clone();
        int[] result = new int[2];
        Arrays.sort(sortedAnimals);
        for (int i = sortedAnimals.length - 1; i >= 0; i--) {//find heaviest
            int search = findCompatibleSkinny(sortedAnimals, sortedAnimals[i],truckCapacity);
            if (search != -1) {
                result[0] = search;
                result[1] = sortedAnimals[i];
                return result;
            }


        }
        return new int[]{};
    }

    //2019
    public static int findCompatibleSkinny(int[] sortedAnimals,int weight,int truckCapacity){
        for (int i = 0; weight+sortedAnimals[i]<=truckCapacity ; i++) {
            if(weight+sortedAnimals[i]==truckCapacity){
                return sortedAnimals[i];
            }
        }
        return -1;

    }
    //2019
    public static String isExpectedToPassExam(int N, double P, List<Integer> q, List<Double> pc, List<Double> pw) {
        Double expectedScore = 0.0;
        for (int i = 0; i <N ; i++) {
                Double amountOfAnswers = (double)q.get(i);
                Double pointsIfRight = pc.get(i);
                Double pointsIfWrong = pw.get(i);

                expectedScore+=randomScorePredictedPerQuestion(amountOfAnswers,pointsIfRight,pointsIfWrong);

                if(expectedScore>=P){
                    return "YES";
                }

        }

        return "NO";

    }


    //2019
    public static Double randomScorePredictedPerQuestion(Double answerAmount,Double c,Double w){
        double chancesOfWrong = (answerAmount-1)/answerAmount;
        double chancesOfRight = 1/answerAmount;
        double wrongWeight = chancesOfWrong * w;
        double rightWeight = chancesOfRight * c;
        if(rightWeight>wrongWeight) {
            return rightWeight;
        }
        return 0.0;
    }

    //2019
    public static String isPossible(int x_start, int y_start, int x_end, int y_end) {
        if(findPath(x_start,y_start,x_end,y_end)){
            return "YES";
        }
        else {
            return "NO";
        }

    }
    //2019
    public static boolean findPath(int x_start, int y_start, int x_end, int y_end) {
        //BaseCases
        if((x_start==x_end)&&(y_start)==(y_end)){ //Reached destination
            return true;
        }
        else if((x_start>x_end)||(y_start)>(y_end)){ //Not Possible

            return false;
        }
        //End Base Cases
        return findPath(x_start+y_start,y_start,x_end,y_end)||findPath(x_start,y_start+x_start,x_end,y_end);
    }


    //2019
    public static List<Integer> kinderSquare(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        for (Integer item : arr
        ) {
            Integer newItem = (item * item) + 10;
            String newItemString = newItem.toString();
            String lastDigit = newItemString.substring(newItemString.length() - 1);
            if (!lastDigit.equals("5")&& !lastDigit.equals("6")) {
                if (Collections.binarySearch(result,newItem)<0) {
                    result.add(newItem);
                }
            }

        }

        return result;
    }




}
