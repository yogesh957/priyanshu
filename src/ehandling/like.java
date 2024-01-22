package ehandling;

public class like extends Exception  {
    like(String k){
        super(k);
    }
    public static void main(String[] args) throws Exception {
             throw new like("dont run");
        }
    }

