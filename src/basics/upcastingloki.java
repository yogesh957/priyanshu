package basics;
class loko{
    public void arun(){
        System.out.println("xjbv");
    }
}
class pogo extends loko{
    public void kailash(){
        System.out.println("dhvc");
    }
}
public class upcastingloki {
    public static void main(String[] args) {
        loko l=(loko) new pogo(); //here child obejct to parent object it is up casting
        l.arun();//
        pogo p=(pogo)l;// converting parent object to child object is downcasting
        p.kailash();// both child and parent method is accessed
        p.arun();

    }
}
