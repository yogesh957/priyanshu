package inherit;
class can{
    int name;
    String add;

    public can(int name, String add) {
        this.name = name;
        this.add = add;
    }
}
class juniore extends can{
    static int roll=90;
    public juniore(int name,String add,int roll){
        super(12,"sdsd");
        juniore.roll =roll;
    }

}
public class hostel {
    public static void main(String[] args) {
        juniore j=new juniore(23,"sdcda",90);
        System.out.println();
    }
}
