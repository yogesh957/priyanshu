package secondtopic;
class copyconstructor {
    int sid;
   String sname;

    public copyconstructor(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    copyconstructor(copyconstructor c) {
        this.sid = c.sid;
       this.sname = c.sname;
    }
}
public class copy {
    public static void main(String[] args) {
       copyconstructor c=new copyconstructor(12,"yogesh");
       copyconstructor c1=new copyconstructor(c);
        System.out.println(c.sid);
        System.out.println(c1.sid);
    }
}
