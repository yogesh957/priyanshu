package new1;
interface file{
    public void chance();
}
class open implements file{
   public void chance(){
        System.out.println("run");
    }
}

public class intercar {
    public static void main(String[] args) {
         open o=new open();
         o.chance();

    }
}
