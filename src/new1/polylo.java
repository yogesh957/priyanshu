package new1;
class logo{
    int x;
    int y;
    public int arun(int x,int y){
        return x+y;
    }
    public int arun(int x,int y,int z){
        return x+y+z;
    }
}
public class polylo {
    public static void main(String[] args) {
        logo l=new logo();
        System.out.println(l.arun(1,2));
        System.out.println(l.arun(1,2,3));
    }
}
