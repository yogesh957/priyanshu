package en;
class office{
    int id;
    String pass;

    public void setId(int id) {
        if (id == 1234) {
            this.id = id;
        }
    }
    public int getId(){
        return id;
    }
    public void setPass(String pass){
        this.pass=pass;
    }

    public String getPass(){
        return pass;
    }

}

public class secure {
    public static void main(String[] args) {
      office k=new office();
      k.setId(987);
        System.out.println(k.getId());
    }
}
