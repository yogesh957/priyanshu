package dsa;

import java.util.Scanner;

public class laptop {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the size");
        int size=a.nextInt();
        int [] arr=new int[size];
        
        for(int i=0; i<size; ++i){
            arr[i]=a.nextInt();
        }
        for(int i=0; i<size; ++i){
            System.out.println(arr[i]);
        }
    }
}
