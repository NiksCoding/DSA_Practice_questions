package DSA_questions;

import java.util.Scanner;

public class WaveArray extends GetArrayFromUser{
    public void convertToWave(){
        for (int i =0 ; i< arr.length-1; i++){
            if (i%2==0){
            int k = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]= k;
            }
        }
        System.out.print("\nwave array : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        WaveArray obj1 = new WaveArray();
        obj1.getInputArray();
       obj1.yourArray();
        obj1.convertToWave();

    }
}
