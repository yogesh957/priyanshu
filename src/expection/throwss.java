package expection;

import java.io.File;
import java.io.FileReader;

public class throwss  {

    public static void arun() throws Exception{
        FileReader file=new FileReader("abx.txt");
    }

    public static void sub(){
        int x=10-5;
    }
    public static void main(String[] args) throws Exception{// throws keyword should be used in main method also
           arun();
           sub();
    }
}
