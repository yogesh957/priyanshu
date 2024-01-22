package inherit;
import accessmodifiers.andaman;
public class accesssub extends andaman{
    public static void main(String[] args) {
        andaman a=new andaman();
        System.out.println(a.roll);//accessing public methods and variables of other class within the package in the subclass
        a.roll();
    }
}
