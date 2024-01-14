package DSA_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
