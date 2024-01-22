class ok{
    int a;
    String b;
    ok.bye c;

    public ok(int a, String b) {
        this.a = a;
        this.b = b;
    }

    class bye{
            int si;
            String hi;

        public bye(int si, String hi) {
            this.si = si;
            this.hi = hi;
        }
    }
     public void kok(int si,String pi){
        ok.bye lo=new ok.bye(23,"kloi");
        this.c=lo;
    }
    public void getkok(){
        System.out.println(c.hi);
        System.out.println(c.si);

    }
}
public class hi{
    public static void main(String[] args) {
        ok g=new ok(12,"dfd");

    }
}


