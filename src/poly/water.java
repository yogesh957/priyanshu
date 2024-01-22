package poly;
class drop{
    public void share(){
        System.out.println("good morning");
    }
}
class wind extends drop{
    public void share(){
        System.out.println("good evening");
    }
}
public class water {
    public static void main(String[] args) {
        wind w=new wind();
        drop d=new drop();
        w.share();
        d.share();
        drop u=new wind();// parent class child object
        u.share();

    }
}
