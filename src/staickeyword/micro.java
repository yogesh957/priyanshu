package staickeyword;
class cry{
    static String name;
    int num;
    static {
        System.out.println("im printed only once"); //static will run only once and print once independent of objects
    }
    cry(){
        System.out.println("im invoked"); //prints twice as the object is invoked twice

    }
}
public class micro {
    public static void main(String[] args) {
        cry apple=new cry();
        cry banana=new cry();
        System.out.println(cry.name);
        System.out.println(cry.name);
        System.out.println(cry.name);
    }
}
