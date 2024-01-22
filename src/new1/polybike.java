package new1;// method overriding
class no{
    public void run(){
        System.out.println("walking");
    }

}
class yes extends no{
    public void run(){
        System.out.println("talking");
    }

}
public class polybike {
    public static void main(String[] args) {
    no y=new yes();
    y.run();

    }
}
