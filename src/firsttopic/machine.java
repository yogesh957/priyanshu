package firsttopic;
class types{
    String name;
    int weight;
    String metal;
}
class categories{
    String department;
    int now;
}
public class machine {
    public static void main(String[] args) {
        types electric=new types();
        electric.metal="iron";
        electric.weight=12;
        electric.name="dc";
        System.out.println(electric.metal);
        System.out.println(electric.weight);
        System.out.println(electric.name);
        categories electronic=new categories();
                electronic.department="vdfv";
                electronic.now=12;
        System.out.println(electronic.department);
        System.out.println(electronic.now);
    }
}
