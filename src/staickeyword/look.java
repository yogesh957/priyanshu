package staickeyword;
class hi{
    int a;
    static String v="vardhaman";

    public hi(int a) {
        this.a = a;
    }
    public void print(){
        System.out.println("num of items "+a+  "college is"+v);
    }
}
public class look {
    public static void main(String[] args) {
           hi a=new hi(12);
        a.print();
        hi b=new hi(23);
        b.print();
    }
}
