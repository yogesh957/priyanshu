package ehandling;

import java.io.FileReader;

public class handle {

    public static void simple () throws Exception{

        FileReader f1 = new FileReader("xy.txt");
    }

    public void add() {
        int x = 10+10;
    }


    public static void main(String[]args) throws Exception{
        System.out.println("HELO");
        try {
               String y = null;
               y.length();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
            System.out.println("BYE");

           simple();

    }
}
