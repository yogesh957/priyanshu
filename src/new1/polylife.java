package new1;
class cricket{
    public void prize(){
        System.out.println("20000");
    }

}
class football extends cricket{
    public void prize(){
        System.out.println("22300");
    }
}

public class polylife {
    public static void main(String[] args) {
       football g=new football();
       g.prize();
       cricket f=new cricket();
       f.prize();

    }
}
