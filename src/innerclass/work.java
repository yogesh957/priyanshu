package innerclass;// class as a property
class k{
    int a;
    String b;
    k.kk d;
    public k(int a, String b) {
        this.a = a;
        this.b = b;
    }
    class kk {
        int f;
        String l;

        public kk(int f, String l) {
            this.f = f;
            this.l = l;
        }
    }
        public void run(int f,String l){
            k.kk lo=new k.kk(12,"yogesh");
            this.d=lo;
        }
        public void print(){
            System.out.println(d.f);
            System.out.println(d.l);
        }
    }
public class work {
    public static void main(String[] args) {
     k lop=new k(12,"efew");
     

    }
}
