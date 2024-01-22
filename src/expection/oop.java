package expection;

public class oop {
    public static void main(String[] args) {
        try {
            int a=9/0;
            String aa=null;
            System.out.println(aa);
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("run even after error");
    }
}
