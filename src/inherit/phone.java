package inherit;
class  vivo{
    int mp;
    String ram;

    public vivo(int mp, String ram) {
        this.mp = mp;
        this.ram = ram;
    }
    public void arun(){
        System.out.println("sajnxk");
    }
}
class apple extends vivo{
    int frontmpp;
    String rom;

    public apple(int frontmpp,String rom,int mp,String ram){
        super(mp,ram);
        this.frontmpp=frontmpp;
        this.rom=rom;

    }
}
public class phone {
    public static void main(String[] args) {
        apple a=new apple(12,"10",14,"45");
        a.arun();
    }
}
