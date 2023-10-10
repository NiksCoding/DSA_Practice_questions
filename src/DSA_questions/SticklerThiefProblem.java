package DSA_questions;

import java.util.Scanner;

public class SticklerThiefProblem {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int oddSum=0;
    int evenSum=0;
    public void maximumLoots(){
        for (int i=0 ;i<arr.length ; i++){
            System.out.println("gold coins in  house number "+ (i+1) );
            arr[i]=sc.nextInt();
            if(i%2==1){
                evenSum= evenSum+arr[i];
            }
            if(i%2==0){
                oddSum = oddSum+arr[i];
            }
        }
        if(oddSum>evenSum){
            System.out.println("maximum loot with odd house = "+ oddSum + " Gold Coins");
        }
        else{
            System.out.println("maximum loot with even house = " + evenSum + " Gold Coins" );
        }
    }

    public static void main(String[] args) {
        System.out.println("how many houses are there ?" );
        SticklerThiefProblem obj = new SticklerThiefProblem();
        obj.maximumLoots();
    }
}
