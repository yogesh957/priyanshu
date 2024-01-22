package new1;
abstract class cycle{
   abstract void walk();// abstract method

    int i=0;
    static final int w=10;
   void display(){
       System.out.println("im in display");// non abstract method
   }
}
class chain extends cycle{
   void walk(){
       System.out.println("jck");
   }
}
public class absbike {
    public static void main(String[] args) {
        cycle c=new chain();
        c.walk();
        c.display();
    }
}
