package new1;
abstract class dive{
    abstract void ok();
}
class kite extends dive{
     void ok(){
        System.out.println("sdjbv");
    }
}
public class abslook {
    public static void main(String[] args) {
        dive d=new kite();
        d.ok();

    }
}
