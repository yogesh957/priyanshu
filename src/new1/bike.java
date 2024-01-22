package new1;
//construtor overloading
class bikee{
    String name;
    int num;
    String color;

    public bikee(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public bikee(String name, int num, String color) {
        this.name = name;
        this.num = num;
        this.color = color;
    }
    public void display(){
        System.out.println("name"+name+"num"+num+"colod"+color);
    }
}
public class bike {
    public static void main(String[] args) {
        bikee b1=new bikee("bmw",12);
        bikee b2=new bikee("passion",23,"yellow");
        b1.display();
        b2.display();


    }
}
