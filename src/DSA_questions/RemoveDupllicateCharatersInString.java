package DSA_questions;

import com.company.Main;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupllicateCharatersInString {
    public static void rev(){
        String str = "My Name is Nikhil";

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet();
        for (int i = 0 ; i<str.length();i++){
            set.add(str.charAt(i));

        }
        for (Character c:set){
            sb.append(c);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        RemoveDupllicateCharatersInString.rev();
        //method 2
        String s2 = "Lets have some fun";
        char[] ch = s2.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (int i=0;i<ch.length;i++){
            boolean bool = false;
            for (int j = i+1; j<ch.length;j++){
                if(ch[i]==ch[j]){
                    bool = true;
                    break;
                }
            }
            if(!bool){
                sb2.append(ch[i]);
            }
        }
        System.out.println(sb2);
    }
}
