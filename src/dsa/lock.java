package dsa;

import java.util.Scanner;

public class lock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int h= sc.nextInt();
        System.out.println("enter the second number");
        int n=sc.nextInt();
        int count=0;
        for(int i=h; i<=n; ++i){
            if(i%2==0){
               count++;
            }
        }
        System.out.println(count);
    }
}
