package dsa;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int sum=0,temp=h;
        while(h>0){
            int r=h%10;
            sum=sum+(r*r*r);
            h=h/10;
        }
        if(sum==temp){
            System.out.println("it is amstrong number");
        }
    }
}
