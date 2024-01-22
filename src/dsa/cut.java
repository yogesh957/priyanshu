package dsa;//input of an array

import java.util.Scanner;

public class cut {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY : ");
        int size=num.nextInt();
        int[] my=new int[size];
        int j=0;
        System.out.println("ENTER THE VALUES OF THE ARRAY : ");
          for(int i=0; i<size; ++i){
              my[i]=num.nextInt();
          }
          for(int k=0; k<size; ++k){
              System.out.print(my[k]*2);
          }
    }
}
