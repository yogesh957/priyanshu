package new1;
abstract class hike{
    abstract void run();
}
class honda extends hike{
    void run(){
        System.out.println("i can run");
    }
}
class passion extends  hike{
    void run(){
        System.out.println("i can walk");
    }
}
public class abscar {
    public static void main(String[] args) {
      hike h=new honda();
      h.run();
      hike b=new passion();
      b.run();

    }
}
