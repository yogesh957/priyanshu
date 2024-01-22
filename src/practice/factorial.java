package practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        int a= ok.nextInt();
        int b=1;
        for(int i=1; i<=a; ++i){
             b=b*i;
        }
        System.out.println(b);
    }
}
