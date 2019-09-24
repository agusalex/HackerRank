package Algorithms.Challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge3 {



    public static Integer[] solutionB(Integer[] N, int K){

        ArrayList<Integer[]> allSubs = findAllSubArrays(N,K);

        for (int i = 0; i < allSubs.size(); i++) {
            Integer[] X = allSubs.get(i);
            if(isLargest(allSubs,i,X)){
                return X;
            }



        }
        return new Integer[]{};


    }

    public static boolean isLargest(ArrayList<Integer[]> allSubs, int index, Integer[] X){
        if(index+1>=allSubs.size()){
            return true;
        }

        for (int i = index+1; i <allSubs.size() ; i++) {
            Integer[] Y = allSubs.get(i);

            if(!isLargerThan(X,Y)){
                return false;
            }
        }


        return true;
    }




    public static boolean isLargerThan(Integer[] X, Integer [] Y){
        for (int i = 0; i < X.length; i++) {
            if(X[i]!=Y[i]){
                return X[i]>Y[i];
            }
        }
        return false;

    }
    public static ArrayList<Integer[]> findAllSubArrays(Integer [] original, int k){
        ArrayList<Integer[]> subarrays = new ArrayList<>();

        for (int i = 0; i <original.length ; i++) {
            Integer [] subarray = subArray(original,i,k);
            if(subarray.length!=0){
                subarrays.add(subarray);
            }

        }
        return subarrays;

    }

    public static Integer[] subArray(Integer[] original,  int i,int k){

        return (i+k)<=original.length? Arrays.copyOfRange(original,i,i+k) : new Integer[]{};
    }

































    public static int[] solutionA(String A, String B){

        String[] aS = A.split(",", 0);
        String[] bS = B.split(",", 0);
        int [] result = new int[bS.length];

        for (int i = 0; i < result.length; i++) {
            String bString = bS[i];
            for (String aString:aS
                 ) {

                if(isLesserThan(aString,bString)){
                    result[i]+=1;
                }

            }



        }
        return result;


    }


    public static boolean isLesserThan(String A, String B){


        char smallestOnA = smallest(A);
        char smallestOnB = smallest(B);

        int A_Ocurrences = countOccurrences(A,smallestOnA);
        int B_Ocurrences = countOccurrences(B,smallestOnB);

        return A_Ocurrences < B_Ocurrences;

    }

    public static int countOccurrences(String string, char query){
        int appearences = 0;

        for (int i = 0; i < string.length(); i++) {
            String character = string.substring(i,i+1);
            if(character.charAt(0) == query){
                appearences+=1;
            }

        }

        return appearences;
    }


    public static char smallest(String string){
        String smallest = "z";
        for (int i = 0; i < string.length(); i++) {
            String character = string.substring(i,i+1);
            if(character.compareTo(smallest)< 0){
                smallest = character;
            }

        }

        return smallest.charAt(0);
    }






}
