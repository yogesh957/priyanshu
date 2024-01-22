package abstraction;
abstract class A{

   public abstract void  nilo();
   public void locate(){
       System.out.println("im at nilo");
   }
}
class B extends A{
    public void nilo(){
        System.out.println("himayatnagr nilofour");

    }


}
public class school {
    public static void main(String[] args) {
         A a = new B();
         a.nilo();
         a.locate();
    }
}
