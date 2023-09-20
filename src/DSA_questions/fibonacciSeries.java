package DSA_questions;
import java.util.Scanner;
public class fibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0]=1;
        arr[1]=1;
         if(n==1){
            arr[0]=1;
            System.out.println(arr[0]);
        }
         if(n==2){
            arr[1]= 1;
            System.out.println(arr[1]+" "+arr[1]);
        }
         if(n>2){
            System.out.print(1 +" "+ 1+" ");
            for(int i =1 ; i<n-1 ; i++){
                arr[i+1]=arr[i-1]+arr[i];
                System.out.print(arr[i+1]+ " ");
            }
        }

    }
}
