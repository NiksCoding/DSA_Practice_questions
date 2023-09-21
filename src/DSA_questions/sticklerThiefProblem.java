package DSA_questions;

public class sticklerThiefProblem {
    int[] arr = {1,2,3,4,5,7,6,7,8,9,10};
    int oddSum=0;
    int evenSum=0;
    public void maximumLoots(){
        for (int i=0 ;i<arr.length ; i++){
            if(i%2==1){
                evenSum= evenSum+arr[i];
            }
            if(i%2==0){
                oddSum = oddSum+arr[i];
            }
        }
        if(oddSum>evenSum){
            System.out.println("maximum loot with odd house = "+ oddSum);
        }
        else{
            System.out.println("maximum loot with even house = " + evenSum);
        }
    }

    public static void main(String[] args) {
        sticklerThiefProblem obj = new sticklerThiefProblem();
        obj.maximumLoots();
    }
}
