package new1;
class students{
    int roll;
    String name;
    static String school="ijis";

    static {
        System.out.println("i will print first");// static block
    }
    public students(int roll,String name) {
        this.roll = roll;
        this.name = name;
    }
    static void change(){
        school="infant"; //changing school name using static method
    }
    void display(){
        System.out.println("roll is" +roll+ "name"+name+ "school"+school);
    }
}
public class staticc {
    public static void main(String[] args) {
          students s1=new students(12,"yogesh");
          students s2=new students(121,"arun");
          students.change();
          s1.display();
          s2.display();
    }
}
