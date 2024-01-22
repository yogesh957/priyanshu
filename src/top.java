class bot{
    int d;
    int b;
        }
public class top {
    public static void main(String[] args) {
      bot fr=new bot();
      fr.d=12;
      bot df=new bot();
      df.d=34;
        run(fr);
        System.out.println(fr.d);
    }
    static void run(bot p){
        p.d=10;
    }
}
