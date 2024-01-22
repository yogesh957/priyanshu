package poly;
class aa{
    int a;
    int b;

    int c;
    public void add(int a,int b){
        int add=a+b;
        System.out.println(add);
    }

    public void add(int c,int d,int e){
        int add=c+d+e;
        System.out.println(add);
    }
}
public class book {
    public static void main(String[] args) {
       aa h=new aa();
       h.add(1,4);
       h.add(1,2,3);
    }
}
