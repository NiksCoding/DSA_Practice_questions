package DSA_questions;

public class LongestPalindrome {

    int maxLen = 0;
    int lo = 0;
    public String subLongestPalindrome(String s) {

        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }

        for(int i = 0; i<input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }

    public void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
           // System.out.println( s[j] == s[k]);
            j--;
            k++;
        }
        if(maxLen < k - j - 1) {
            maxLen = k - j - 1;
            System.out.println("j = " + j);
            System.out.println("k =" + k);
           // System.out.println(maxLen);
            lo = j+1;
        }
    }

    public static void main(String[] args) {
        LongestPalindrome obj = new LongestPalindrome();
       // obj.longest("aaaabbbaa");
        System.out.println(obj.subLongestPalindrome("aaaaba"));
    }
}
