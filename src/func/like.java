package func;
class share{
    int x;
    int y;
    public int add(int x,int y){
        int z=x+y;
        return z;
    }
}
public class like {
    public static void main(String[] args) {
        share s=new share();
        System.out.println( s.add(1,3));
    }
}
