package basics;
class def_1{
    static int a=10;
    String b;
   def_1(){
       System.out.println("im called");
   }
    public def_1(String b) {
       this();
        this.b = b;
    }
    static void yogesh(){
        a=122;
    }
}
public class def {
    public static void main(String[] args) {
        def_1 aa=new def_1("jrgg");
        def_1.yogesh();
        System.out.println(aa.a);

    }
}
