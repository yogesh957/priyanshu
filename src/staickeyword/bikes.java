package staickeyword;
class types{
    static String brakes="both";
    int speed;
    types(int speed){
        this.speed=speed;
        //there is no object created for string
    }
    void show(){
        System.out.println("the brakes are "+brakes+ "speed is "+speed);
    }
}
public class bikes {
    public static void main(String[] args) {
        types duke=new types(112);
        types splendor=new types(140);
        duke.show();
        splendor.show();

    }
}
