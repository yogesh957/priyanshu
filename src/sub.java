class priyanshu{
    int roll;
    String name;

    public priyanshu(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
class plo extends priyanshu{
    int rolll;
    String namee;

    public plo(int roll, String name, int rolll, String namee) {
        super(roll, name);
        this.rolll = rolll;
        this.namee = namee;
    }
}

public class sub {
    public static void main(String[] args) {
           plo l=new plo(12,"priyanshu",23,"sdjf");

          }
    }