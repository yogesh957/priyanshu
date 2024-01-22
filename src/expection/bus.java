package expection;//

public class bus {
    public static void main(String[] args) {
        try{
            String a=null;
            try {
                int aa=9/0;
            }catch (ArithmeticException e){
                System.out.println("Arithmetic");
            }
        }catch (ArithmeticException e){
            System.out.println("arithmetic");
        }
        System.out.println("poll");
    }
}
