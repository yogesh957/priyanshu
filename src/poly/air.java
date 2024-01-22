package poly;
class  plane {
    private String name;

    public plane(String name) {
        this.name = name;
    }

    class lot {
        public void boi() {
            System.out.println(name);
        }
    }
}
public class air {
    public static void main(String[] args) {
        plane.lot m=new plane("ewd") .new lot();
        m.boi();
    }
}
