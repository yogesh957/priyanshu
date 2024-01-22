package abstraction;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exam {
    public static void main(String[] args) {
     // File file = new File("note.text");

        try {
            FileReader fil = new FileReader("bamba.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("HI");
    }
}
