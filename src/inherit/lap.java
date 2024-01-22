package inherit;
class parent{
    int a;
    String name;

    public parent(int a, String name) {
        this.a = a;
        this.name = name;
    }
}
class child extends parent{
    int b;
    String colour;
    public child(int a,String name,int b,String colour){
        super(a,name);
        this.b=b;
        this.colour=colour;
    }
}
class second extends child{
    int ok;
    String colour;

    public second(int a, String name, int b, String colour, int ok, String colour1) {
        super(a, name, b, colour);
        this.ok = ok;
        this.colour = colour1;
    }
}
public class lap {
    public static void main(String[] args) {
        child c=new child(12,"yogesh",45,"orange");
        System.out.println(c.colour);
    }
}
