package DSA_questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharacterInString {
    public static void main(String[] args) {
        String str = "Count each character in a string";
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap();
        for(char ch :chars){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int value = map.get(ch);
                map.put(ch, value+1);
            }
        }
        System.out.println(map);
    }
}
