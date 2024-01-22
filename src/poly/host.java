package poly;
class speech{
    int num;
    public void table(int num){
        System.out.println("hii");
    }
}
class d extends speech{
    int num;
    public void table(int num){
        System.out.println("hiiiii");
    }
}
public class host {
    public static void main(String[] args) {
        speech s=new speech();
        s.table(12);
        speech n=new d();
        n.table(13);
    }
}
