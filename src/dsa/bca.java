package dsa;

import java.util.Scanner;

public class bca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the number");
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

