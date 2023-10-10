package DSA_questions;

import java.util.Scanner;

public class GetArrayFromUser {

    Scanner sc;
    int n;
    int[] arr;
    public GetArrayFromUser( ){

        System.out.println("type length of array ");
        sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
    }


    public int[] getInputArray(){
        System.out.println("type your elements : ");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void yourArray(){
        System.out.print("printing your array : " );
        for(int i=0 ;i<n;i++){
            System.out.print( " " + arr[i] );
        }
    }

    public static void main(String[] args) {
        GetArrayFromUser obj = new GetArrayFromUser();
        obj.getInputArray();
        obj.yourArray();
    }
}
