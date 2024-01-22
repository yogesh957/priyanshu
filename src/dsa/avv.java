package dsa;

import java.util.Scanner;

public class avv {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        System.out.println("enter the number a");
        int h=lk.nextInt();
        System.out.println("enter the number b");
        int k= lk.nextInt();
        int sum=0;
        for(int i=h; i<=k; ++i){
             sum=sum+i;
        }
        System.out.println(sum);
    }
}
