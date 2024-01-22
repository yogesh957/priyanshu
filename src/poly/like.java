package poly;
class wrong{
    int a;
    int b;
    public void print(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public void print(int a,int b,int d){
        int c=a+b+d;
        System.out.println(c);
    }
}
public class like {
    public static void main(String[] args) {
        wrong w=new wrong();
        w.print(1,2);
        w.print(1,2,4);
    }
}
