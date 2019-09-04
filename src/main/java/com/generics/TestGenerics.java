package com.generics;

import java.util.Arrays;

public class TestGenerics {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,0};
        int[] b = {1,2,1,0,3,4};
        Arrays.sort(a);
        for (int i = 0; i < b.length; i++) {
            int count =0;
            int query = b[i];
            System.out.println(query);
            int index = Arrays.binarySearch(a,query);
            System.out.println(index);
            if(index>=0){
                int ind = index;
                while(ind>=0&&(a[ind]==a[index])){
                    count++;
                    ind--;
                }
            }
            if(count>0){
                //System.out.println(count);
            }
            else{
                //System.out.println("NOT PRESENT");
            }
        }


    }
}
