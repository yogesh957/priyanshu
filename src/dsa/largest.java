package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class largest {
    private static final int INT_MAX = 10000000;

    public static void main(String[] args) {

            Scanner no = new Scanner(System.in);
            System.out.println("enter the size");
            int size = no.nextInt();
            int[] arr = new int[size];
           Arrays.sort(arr);
            for (int i = 0; i < size; ++i) {
                arr[i] = no.nextInt();
            }
            int a=INT_MAX;
            for(int i=0; i<size; ++i){
                   if(arr[i]<a){
                       a = arr[i];
                   }
                    }
        System.out.println(a);
                }

            }



