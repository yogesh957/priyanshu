package lambdaexpression;
@FunctionalInterface
interface a{
    public void like();

}
public class air {
    public static void main(String[] args) {
       a b=()->{
           System.out.println("like you");
       };
       b.like();
    }
}
