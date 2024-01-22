package expection;// multiple catch block

public class train {
    public static void main(String[] args) {
      int a=0;
      int j=0;
      try {
           j=9/a;
          String b=null;
      }
      catch (ArithmeticException e){
          System.out.println("cannot divide by zero");
      }
      catch (NullPointerException e){
          System.out.println("array out of bound");// cannot print thuis value
      }
        System.out.println("ok");
    }
}
