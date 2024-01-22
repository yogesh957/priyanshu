import java.io.*;


class fl {

    public static void filecreation() throws IOException {
        File file = new File("parbi.txt");
        file.createNewFile();

        // WRITING IN FILE
        FileWriter wr = null;
        BufferedWriter bw = null;
        try {
            wr = new FileWriter(file);
            bw = new BufferedWriter(wr);
            bw.write("MADRA HAULA BULLA HAI");

            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

      finally {
            bw.close();

        }


    }

}


public class fo {
    public static void main(String[]args) throws IOException {


    }

}
