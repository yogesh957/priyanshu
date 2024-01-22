package abstraction;
abstract class yog {
    abstract void lop();
    public void print(){
        System.out.println("good");
    }

}
class lok extends yog{
    public void lop(){
        System.out.println("hi");
    }
}
public class kit {
    public static void main(String[] args) {
        yog l=new lok();
        l.lop();
        l.print();
    }
}
