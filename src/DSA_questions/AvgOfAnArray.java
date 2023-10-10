package DSA_questions;

public class AvgOfAnArray {
    int[] arr = {2,3,2,5,3,6,8};
    double sum =0;
    int n =arr.length;
    public void average(){
        for (int i =0; i<n ;i++){
            sum += arr[i];
            System.out.println(sum);

        }
        double avg = sum/n;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        AvgOfAnArray obj = new AvgOfAnArray();
        obj.average();
    }
}
