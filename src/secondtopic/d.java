package secondtopic;
class a{
    String name;
    int role;

    public a(String name,int role){
        this.name=name;
        this.role=role;
    }
    public a(a A1){
        this.name=A1.name;
        this.role=A1.role;

    }


}
public class d {
    public static void main(String[] args) {
        a A1=new a("yogesh",123);
        a A2=new a("khaleel",345);
        System.out.println(A1.name);
        System.out.println(A2.name);
        System.out.println(A1.equals(A1));


    }
}
