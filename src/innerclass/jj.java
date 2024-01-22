package innerclass;
 class ii{
    int a;
    String name="yogesh";
    String place="svcdg";
    public void ok(){
        gg hi=new gg();
        hi.ready();

    }
    class gg{
        int g;
        String place="sdnn";
        public void ready(){
          String place="skn";
            System.out.println("im ready");
            System.out.println(place);
            System.out.println(this.place);
            System.out.println(ii.this.place);
        }
    }
}
public class jj {
    public static void main(String[] args) {
        ii hi=new ii();
        ii.gg bye=hi.new gg();
        bye.ready();

    }
}
