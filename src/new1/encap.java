package new1; // layer of security is provided
class bank{
   private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id==1234) {
            this.id = id;
        }
    }
}
public class encap {
    public static void main(String[] args) {
       bank b1=new bank();
       b1.setId(1234);
        System.out.println(b1.getId());
    }
}
