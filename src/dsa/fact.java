package dsa;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner l =new Scanner(System.in);
        int a=l.nextInt();
        int sum=1;
        for(int i=1; i<=a;++i){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
