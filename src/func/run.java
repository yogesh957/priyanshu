package func;

class walk{
    int x;
    int y;
    public int sum(int x,int y){
        return x+y;
    }
        }
public class run {
    public static void main(String[] args) {
    walk tike=new walk();
        System.out.println(tike.sum(23,45));
   }
}