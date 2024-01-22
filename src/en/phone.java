package en;
class types {
    private int pass;
    private String password;
    public void setpass(int pass) {
        if (pass==123) {
            this.pass = pass;
        }
    }
    public int getpass() {
        return pass;
    }
}
public class phone {
    public static void main(String[] args) {
        types insta=new types();
        insta.setpass(1234);
        System.out.println(insta.getpass());
    }
}
