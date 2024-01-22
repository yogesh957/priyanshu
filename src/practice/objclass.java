package practice; //tostring
class op{
    int num;
    String name;

    public op(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "op{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
public class objclass {
    public static void main(String[] args) {
        op o=new op(12,"yogesh");
        op n=new op(122,"khaleel");
        System.out.println(o);
        System.out.println(n);


    }
}
