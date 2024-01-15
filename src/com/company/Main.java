package com.company;

import java.util.*;

public class Main {
  //array rotation
    int [] i = {1,2,3,4,5};
    int len = i.length;
    public  void rotaion(int c){
        //c from user
        for(int j=c; j<len; j++){
            System.out.print(i[j]);
        }
        for (int k =0 ;k<c;k++){
            System.out.print(i[k]);
        }

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.rotaion(3);
    }

}
