
package func;
class addd{
    int x;
    int y;
    public int max(int x,int y){
        if(x>y) {
            return x;
        }else{
              return y;
            }
        }
    }
public class add {
    public static void main(String[] args) {
        addd a = new addd();
       int df=a.max(1,2);
        System.out.println(df);
    }
}
