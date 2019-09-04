package com.search;

import java.util.Arrays;
import java.util.LinkedList;

public class IceCreamParlor {

    public static void main(String[] args) {

        int arr[] = {1,4,5,3,2};
        int m = 4;

        int num1,num2;
        int set[] = new int[2];
        for(int i=0;i<arr.length;i++) {
            num1 = arr[i];
            num2 = m-num1;
            int index = Arrays.binarySearch(arr, num2);
            if(index!=-1) {
                set[0] = num1;
                set[1] = num2;
                break;
            }
        }

        LinkedList ll = new LinkedList(Arrays.asList(arr));

        System.out.println(ll.contains(""));

        int index1 = ll.indexOf(set[0]);
        int index2 = ll.indexOf(set[1]);

        System.out.println(index1+" "+index2);
    }
}
