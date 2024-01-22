 class fry {
    private int x=10;
    public void come(int y){
        x=x+y;
     }
     public int go(){
        return x;
     }
 }

public class building{
        public static void main(String[] args){
            fry num1=new fry();
            num1.come(10);
            System.out.print(num1.go());

           }
        }