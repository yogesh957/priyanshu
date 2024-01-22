package inherit;
class names{
    void fun(){
        System.out.println("english");

    }
}
class extra extends names{
    void laugh(){
        System.out.println("maths");
        System.out.println("biology");
    }
}
public class subject {
    public static void main(String[] args) {
        extra ok=new extra();
        ok.fun();
        ok.laugh();

    }
}
