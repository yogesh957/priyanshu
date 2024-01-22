package staickeyword;
class dove {
    int speed = 120;
    String name;

    public dove(String name) {
        this.name = name;
    }
  static int cube(int x){
        return x*x;
  }
   void arun(){
        System.out.println("speed is "+speed+ "name is "+name);
    }
}

public class example{

    public static void main(String[] args) {
      dove d=new dove("yogesh");
      dove s=new dove("dhanush");
        d.arun();
        s.arun();

        System.out.println(dove.cube(3));
    }
}
