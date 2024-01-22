package poly; // overriding
class dogg{
    public void arun(){
        System.out.println("im arun");
    }
}
class bird extends dogg{
    public void arun(){
        System.out.println("im giff");
    }
}
class rat extends dogg{
    public void arun(){
        System.out.println("im hiff");
    }
}
public class catt {
    public static void main(String[] args) {
        dogg b=new dogg();
      dogg n=new bird();
      dogg r=new rat();
        r.arun();
        b.arun();
        n.arun();

    }
}
