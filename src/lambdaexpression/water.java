package lambdaexpression;
interface car{
    public String print(String name);
}
public class water {
    public static void main(String[] args) {
        car c=(name)->{
       return "ok"+name;

        };
        System.out.println(c.print("yogesh"));

        car d=name->{
            return "hi"+name;
        };
        System.out.println(d.print("arun"));
    }
}
