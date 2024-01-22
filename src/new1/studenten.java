package new1;  //encapsulation only by get method
class anup{
    private int roll=1233;

    public int getRoll() {
        return roll;
    }
}
public class studenten {
    public static void main(String[] args) {
        anup a=new anup();
        System.out.println(a.getRoll());
    }
}
