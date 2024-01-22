package practice;
class poll{
    static int a=10;
    String name;

    public poll(String name) {
        this.name = name;
    }
    static void poke(){
        a=56;
    }
}
public class door {
    public static void main(String[] args) {
        poll.poke();
        poll p=new poll("yogesh");
        poll pp=new poll("arun");
        System.out.println(p.name);
        System.out.println(poll.a);
        System.out.println(pp.name);

    }
}
