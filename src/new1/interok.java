package new1;// multiple inheritance achieved in interface
interface hello{
     void call(); // by default method is abstract
     abstract  void reject();
}
interface hi{
    abstract void call();
    abstract  void reject();
}
class bye implements hello,hi{
    public void call(){
        System.out.println("im ok");
    }
    public void reject(){
        System.out.println("not ok");
    }

}
public class interok {
    public static void main(String[] args) {
         bye c=new bye();
         c.call();
         c.reject();
    }
}
