package practice;
class apple{
    public void aa(){
        System.out.println("im walking");
    }
}
class guava extends apple{
    public void aa(){
        System.out.println("im reading");
    }
}
class ntg extends apple{
    public void aa(){
        System.out.println("im writing");
    }
}
public class life {
    public static void main(String[] args) {
        apple a=new apple();
        a.aa();
        apple b=new guava();
        b.aa();

    }
}
