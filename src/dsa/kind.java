package dsa;

import java.util.Scanner;

public class kind {
    public static void main(String[] args) {
      int[] myarr = new int[5];
      int j = 0;
      for(int i=0;i<5;i++){
          myarr[i] = ++j;
      }
      for(int i=0; i<5; ++i){
          System.out.println(myarr[i]);
      }
        System.out.println("Length of the array is  "+ myarr.length);

    }

}
