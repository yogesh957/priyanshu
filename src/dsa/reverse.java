package dsa;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
            Scanner no=new Scanner(System.in);
        System.out.println("enter the size");
            int size= no.nextInt();
            int[] arr=new int[size];

            for(int i=0; i<size; ++i){
                arr[i]=no.nextInt();
            }
        int a=0;
        int b=size-1;
            for (int i=0; i<=b; i++) {
                int temp = arr[i];
                arr[i] = arr[b];
                arr[b] = temp;
                b--;
            }
            for(int i=0; i<size; ++i){
                System.out.println(arr[i]);
            }
    }
}
