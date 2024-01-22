package expection;

public class throww  {
       static void check(int age){
           if(age<18){
               throw new ArithmeticException("age invalid");
           }
       }
    public static void main(String[] args) {
            try {
                check(17);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        System.out.println("ok");
    }
}
