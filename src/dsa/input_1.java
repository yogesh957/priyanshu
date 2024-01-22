package dsa;

import java.util.Scanner;
public class input_1 {
    public static void main(String[] args) {
        Scanner dc=new Scanner(System.in);
        int size=dc.nextInt();
        int [] arr=new int [size];
        for(int i=0; i<size; ++i){
            arr[i]=dc.nextInt();
        }

        for(int i=0; i<size; ++i){
            System.out.println(arr[i]);
        }
    }
}
