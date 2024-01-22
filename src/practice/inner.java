package practice;
class vechile{
    int vecno;
    String name;

    public vechile(int vecno, String name) {
        this.vecno = vecno;
        this.name = name;
    }
    public void rr(){
        engine vv=new engine(12,"jds");
        vv.printt();
    }

 class engine{
        int engno;
        String model;

        public engine(int engno, String model) {
            this.engno = engno;
            this.model = model;
        }
        public void printt(){
            engno=1222;
            System.out.println("vec no"+vecno);
            System.out.println("eng no"+this.engno);
            System.out.println(engno);
        }


    }
}
public class inner {
    public static void main(String[] args) {
        vechile v=new vechile(34,"jdbsf");
          vechile.engine vv=v.new engine(122,"hfvbh");
          vv.printt();


    }
}
