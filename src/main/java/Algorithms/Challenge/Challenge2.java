package Algorithms.Challenge;


import java.util.*;
import java.util.HashSet;

public class Challenge2 {


    public static int students(Integer[] A) {
        if(A.length==0){
            return 0;
        }
        ArrayList<ArrayList<Integer>> studentMatrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(A[0]);
        studentMatrix.add(first);

        for (int i = 1; i < A.length; i++) {
            addStudent(studentMatrix,A[i]);

        }
        // Your solution goes here.
        return studentMatrix.size();
    }


    public static void addStudent(ArrayList<ArrayList<Integer>> studentMatrix, Integer student){
        //This could be better improved by doing binary search on the tallest of students of each row (the 0 element)
        for (ArrayList<Integer> row:studentMatrix
        ) {
            if(!(row.get(0)<=student)) {
                if (allAreTaller(row, student)) { //I
                    row.add(student);
                    return;
                }
            }

        }
        ArrayList<Integer> last = new ArrayList<>();
        last.add(student);
        studentMatrix.add(last);



    }
    public static boolean allAreTaller(ArrayList<Integer> arrayList,Integer student){
        int search = Collections.binarySearch(arrayList,student);
        System.err.println(search+" "+student);
        if(search < 0){ //not found
            if (search == -1){ //Inserts at begging, all are bigger
                return true;
            }
            else{  //there items that are smaller
                return false;

            }
        }
        return false; //there are items that are same as student

    }


    public static int processes(Integer[] loads) {

        return findLesserOfAllCombinations(loads,0,new ArrayList<Integer>(),new ArrayList<Integer>());


    }


    public static int findLesserOfAllCombinations(Integer[] loads,int i,ArrayList<Integer> firstServer,ArrayList<Integer> secondServer){
        if(i>=loads.length){ //BASE CASE
        return absSum(firstServer,secondServer);
        }


        ArrayList<Integer> firstServerClone = (ArrayList<Integer>) firstServer.clone();
        ArrayList<Integer> secondServerClone = (ArrayList<Integer>) secondServer.clone();
        firstServerClone.add(loads[i]);
        secondServerClone.add(loads[i]);
        int left = findLesserOfAllCombinations(loads,i+1,firstServerClone,secondServer);
        int right = findLesserOfAllCombinations(loads,i+1,firstServer,secondServerClone);
        return left <= right? left : right;

    }

    public static int absSum(ArrayList<Integer> left,ArrayList<Integer> right){
        int leftSum = 0;
        int rightSum = 0;
        for (Integer item: left
             ) {
            leftSum+=item;
        }
        for (Integer item:right
             ) {
            rightSum+=item;
        }

        return Math.abs(leftSum-rightSum);

    }





    



}
