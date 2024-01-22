package ehandling;

public class wash extends Exception {
    wash(String msg)

    {
        super(msg);
    }
    static void check (int age) throws wash{
        if (age < 18) {
            throw new wash("invalid");
        }
    }

    public static void main(String[] args) {
        try{
            check(12);
        }catch (wash e){
            System.out.println(e);
        }
    }
}