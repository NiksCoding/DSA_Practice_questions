package DSA_questions;

public class ReverseString {

    public static void main(String[] args) {
        String s = "My name is Nikhil";
        char[] ch = s.toCharArray();
        String s2 ="";
        System.out.println(s.length());
        int i=0;
        while(i<ch.length){
            s2=ch[i]+s2;
            i++;
        }
        System.out.println(s2);
        //or using for loop with 2nd method
        String s3="";
        for(int j=ch.length-1; j>=0;j--){
            s3 += ch[j];

        }
        System.out.println(s3.trim());

    }

}
