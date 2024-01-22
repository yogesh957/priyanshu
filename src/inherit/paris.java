package inherit;
class america{
    int types;
    String name;

    public america(int types, String name) {
        this.types = types;
        this.name = name;
    }
}
 class flight extends america{
     int members;
     String types;

     public flight(int types, String name, int members, String types1) {
         super(types, name);
         this.members = members;
         this.types = types1;
     }
 }
public class paris {
    public static void main(String[] args) {
        flight f=new flight(12,"boeing",23,"dfgd");
        System.out.println(f.name);
    }
}
