package poly;
class act{
    public void arun(){
        System.out.println("12");
    }
}
class no extends act{
    public void arun(){
        System.out.println("123");
    }
}
class yes extends no{
    public void arun(){
        System.out.println("1234");
    }
}
public class serial {
    public static void main(String[] args) {
        act a1=new act();
        act a2=new no();
        act a3=new yes();
        a1.arun();
        a2.arun();
        a3.arun();
    }
}
