package innerclass;
class no{
    int no;
    String name;

    public no(int no, String name) {
        this.no = no;
        this.name = name;
    }
    class yes{
        int gif;
        String hi;

        public yes(int gif, String hi) {
            this.gif = gif;
            this.hi = hi;
        }
    }
}
public class chair {
    public static void main(String[] args) {
        no n=new no(12,"sdc");
        no.yes m=n.new yes(12,"ergv");
        System.out.println(m.gif);
    }
}
