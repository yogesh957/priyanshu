package practice;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the secound number");
        int b = sc.nextInt();

        int count=0;
        for(int i=a; i<=b; i++){
            int j;
            for(j=2;j<i;j++) {
                if(i%j==0){
                    break;
                }
            }
            if(j==i) {
                count++;
            }

        }
        System.out.println("THE NUMBER OF PRIME NUMBERS FROM "+a+"TILL "+b+"ARE"+ count);
    }
}
