package dsa;

import java.util.Scanner;

public class element {
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


    }
}
