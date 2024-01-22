class bamba {
    public void air() {
        System.out.println("require to survive");
    }
}
class mamba extends bamba{
        public void air(){
            System.out.println("allowed");
        }
}

public class khamba{
    public static void main(String[] args) {
        bamba b1=new mamba();
        b1.air();

    }
}