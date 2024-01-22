package new1;
class robot{
    int legs;
    int hands;
    String name;
    public robot(){
        System.out.println("where are you");
    }
    public robot(int legs, int hands, String name) {
        this(); //call of the constructor and should be wriiten in first
        this.legs = legs;  //refers to current class instance variable
        this.hands = hands;
        this.name = name;

    }
}
public class thiss {
    public static void main(String[] args) {
        robot a1=new robot(2,2,"animal");

    }
}
