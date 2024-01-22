public class pillow {
    public static void main(String[] args) {
        try {
            int a = 9 / 0;
            String b=null;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("error");
        }catch (Exception e){
            System.out.println("jsdjjj");
        }
        System.out.println("yogesh");

    }
}
