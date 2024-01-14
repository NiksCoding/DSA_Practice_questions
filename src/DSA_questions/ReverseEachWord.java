package DSA_questions;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Reverse Each Word";
        String[] words = input.split(" ");

        String output = "";
        for(String word:words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            output = output + rev+" ";
        }
        System.out.println(output);
    }
}
