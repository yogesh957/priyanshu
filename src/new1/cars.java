package new1;
class carss{
    int number;
    String name;
    public carss(int number,String name){
        this.number=number;
        this.name=name;
    }
}
public class cars {
    public static void main(String[] args) {
        carss car1=new carss(12,"bmw");
        System.out.println(car1.name);
        carss car2=new carss(23,"audi");
        System.out.println(car2.name);
    }
}
