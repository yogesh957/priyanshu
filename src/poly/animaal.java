package poly; //overloading
class z{
    public void ab(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
     }
}
class y extends z{
   public void ab(int c,int d){
         int add=c+d;
       System.out.println(add);
   }
}
public class animaal {
    public static void main(String[] args) {
      y s=new y();
         s.ab(1,3,5);
         s.ab(1,9);
    }
}
