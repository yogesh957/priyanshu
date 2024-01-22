package en;
class f{
    private int id;
    private int pass;

    public void setId(int id) {

            this.id = id;
            System.out.println(id);

    }
    public int  getid(){
        return id;
    }
}
public class k {
    public static void main(String[] args) {
        f h=new f();
        h.setId(12);
        System.out.println(h.getid());


    }
}
