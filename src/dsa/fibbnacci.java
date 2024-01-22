package dsa;

import java.util.Scanner;

public class fibbnacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j= sc.nextInt();
        int a=0,b=1;
        for(int i=2; i<=j; ++i){
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }
}
