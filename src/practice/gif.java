package practice;
class lif{
    static void wrong(int age){
        if(age<18){
            throw new ArithmeticException("not allowed");
        }
    }
}
public class gif {
    public static void main(String[] args) {
        try {
            lif.wrong(12);
        }catch (Exception e){
            System.out.println("ok");
        }
    }
}
