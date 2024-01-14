package DSA_questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "aababc";
        int lengthOfString =0;
        String longestSubString = "";
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap();
        for(int i=0;i<ch.length;i++){
            char ch2= ch[i];
            if(!map.containsKey(ch2)){
                map.put(ch2,i);
            }else{
                i=map.get(ch2);
                map.clear();
            }
            if(map.size()>lengthOfString){
                lengthOfString=map.size();
                longestSubString = map.keySet().toString();
            }

        }
        System.out.println(longestSubString);
        System.out.println(lengthOfString);
    }
}
