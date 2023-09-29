package DSA_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class missingNumberFromArray {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    public void getNumbersFromUser(){
        //create ArrayList list
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<n ; i++){
            System.out.println("enter number : " + i+1);
            list.add(sc.nextInt());
        }
        // Instantiate an object of HashSet
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("your unique set : " + set);

        for (int k : set) {
            //System.out.println(itr.next());
            sum += k;
        }
        System.out.println("sum = " + sum);

    }
    public static void main(String[] args) {
        System.out.println("How many numbers u want to write ?");
        missingNumberFromArray obj = new missingNumberFromArray();
        obj.getNumbersFromUser();
        //obj.findMissingNumber();
    }
}
