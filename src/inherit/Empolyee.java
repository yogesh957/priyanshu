package inherit; //hierarcal example
class Boss {
    public void profit() {
        System.out.println("i have to pay");
    }
}
    class further extends Boss{
        public void take(){
            System.out.println("i will take salary");
        }
    }
    class work extends Boss{
        public void recieve(){
            super.profit();
            System.out.println("i will recieve");
        }
    }

public class Empolyee {
    public static void main(String[] args) {
        work w=new work();
        w.recieve();
        w.profit();
    }
}