package generics;// generic class one is integer and one is String different data members
class sim<T,U>{
    T name;
    U num;

    public sim(T name, U num) {
        this.name = name;
        this.num = num;
    }
}
public class phone {
    public static void main(String[] args) {
       sim<String,Integer> s=new sim<String,Integer>("yogesh",12);
    }
}
