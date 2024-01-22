package en;
class dill{
     int pin;
    String name;

    dill.lkj d;

    public dill(int pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    class lkj{
        int no;
        String nae;

        public lkj(int no, String nae) {
            this.no = no;
            this.nae = nae;
        }
    }
    public void fgh(int no, String nae){
        dill.lkj k=new dill.lkj(no,nae);
      this.d=k;
    }
   public void print(){
       System.out.println(d.nae);
       System.out.println(d.no);
   }
}

public class officee{
    public static void main(String[] args) {
        dill y=new dill(123,"xfbd");
        y.fgh(32,"dff");
        y.print();


    }
}
