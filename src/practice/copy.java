package practice;
class Class{
    int num;
    String name;
   public Class(){
        System.out.println("ok");
    }
    public Class(int num,String name){
       this();
        this.num=num;
        this.name=name;
    }
    void display(){
        System.out.println("name is"+name+"num is"+num);
    }
}
public class copy {
    public static void main(String[] args) {
        Class c=new Class(12,"yogesh");
        c.display();
    }
}
