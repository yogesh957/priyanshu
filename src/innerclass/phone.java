package innerclass;
class demo{
    private int num=12;
   class memo{
        public int getnum(int num){
            return num;
        }
    }
}
public class phone {
    public static void main(String[] args) {
        demo d=new demo();
        demo.memo m=d.new memo();
        System.out.println(m.getnum(12));

    }
}
