package innerclass;
class outer{
    private int a=45;

    class inner{
        public void display(){
            System.out.println("no is"+a);
        }
    }
}

public class hh {
    public static void main(String[] args) {
        outer num1=new outer();
        outer.inner num2=num1.new inner();
        num2.display();
    }
}
