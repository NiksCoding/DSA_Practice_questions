package DSA_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumberFromArray {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;

    public void findMissingNumber(){
        //create ArrayList list
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<n ; i++){
            System.out.println("enter number : " + (i+1));
            list.add(sc.nextInt());
        }
        // Instantiate an object of HashSet
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("your unique set : " + set);

        for (int k : set) {
            //System.out.println(itr.next());
            sum += k;
        }
        System.out.println("sum of all unique number = " + sum);
        Integer[] array = new Integer[set.size()];
        //Converting Set object to integer array
        set.toArray(array);
        int arrayLength = array.length +1 ;
        //calculating sum for expected array
        int expectedSum = (arrayLength)*(arrayLength+1)/2 ;
        int missingNumber = (expectedSum) - (sum) ;
        //Get the missing number
        if (expectedSum!=sum){
            System.out.println("missingNumber = " + missingNumber);
        }

    }
    public static void main(String[] args) {
        System.out.println("enter n natural number in sequence from 1 to n skipping any one number between them. Numbers can be repetitive ");
        System.out.println("How many numbers u want to write ?");
        MissingNumberFromArray obj = new MissingNumberFromArray();
        obj.findMissingNumber();
    }
}
