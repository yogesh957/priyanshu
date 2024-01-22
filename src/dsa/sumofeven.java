package dsa;

import java.util.Scanner;

public class sumofeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int z= sc.nextInt();
        int sum=0;
        for(int i=y; i<z; ++i){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
