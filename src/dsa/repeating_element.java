package dsa;
import java.util.Scanner;
public class repeating_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; ++i){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size-1; ++i){
            for(int j=i+1; j<size; ++j){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
