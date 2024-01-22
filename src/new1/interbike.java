package new1;//multiple inheritance achieved in interface
interface dogg{
    void sound();
    int i=12; //by default it is final and it is static
}
interface caat{
    void sound();
}
class annimal implements dogg,caat{
    public void sound(){
        System.out.println("snjkan");
    }
}
public class interbike {
    public static void main(String[] args) {
        annimal a=new annimal();
        a.sound();
    }
}
