package new1; //method overloading
class type{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

}
public class polycar {
    public static void main(String[] args) {
        type c=new type();
        System.out.println(c.add(1,2));
        System.out.println(c.add(2,3,4));
    }
}
