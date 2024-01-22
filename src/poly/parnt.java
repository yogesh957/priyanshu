package poly;
class lenovo{
    public void print(){
        System.out.println("parent");
    }
}
class subclass extends lenovo{
    public void print() {
        System.out.println("sb");
    }
}
class subclass1 extends lenovo{
    public void print(){
        System.out.println("sb1");
    }
}
public class parnt {
    public static void main(String[] args) {
        lenovo p=new lenovo();
        p.print();
        lenovo g=new subclass();
        g.print();
        lenovo k=new subclass1();
        k.print();
    }

}
