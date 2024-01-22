package innerclass;
class bikes{
    int brakes;
    String colour;
     bikes.engines x;

    public bikes(int brakes, String colour) {
        this.brakes = brakes;
        this.colour = colour;

    }

     class engines{
        int ename;
        int eno;

        public engines(int ename, int eno) {
            this.ename = ename;
            this.eno = eno;

        }
    }
    public void print(int ename,int eno){
        bikes.engines a=new bikes.engines(ename,eno);
        this.x=a;
    }

    public void sfs(){
        System.out.println(this.x.ename);
        System.out.println(this.x.eno);
    }
}

public class bike {
    public static void main(String[] args) {
        bikes n=new bikes(1,"efw");
        n.print(1,12);
       n.sfs();
    }
}
