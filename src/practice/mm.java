package practice;
class arun{
    int name;
    String roll;

    public arun(){
        System.out.println("fmngvlk");
    }
    public arun(int name,String roll){
        this();
        this.name=name;
        this.roll=roll;
    }
    public void print(){
        System.out.println("name is"+name+"roll is"+roll);
    }
}
public class mm {
    public static void main(String[] args) {
        arun a =new arun(12,"jsd");
        a.print();


    }
}
