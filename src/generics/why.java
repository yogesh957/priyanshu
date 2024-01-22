package generics;// generic class
class test<T>{
    T name;
    T color;

    public test(T name, T color) {
        this.name = name;
        this.color = color;
    }
    public void display(){
        System.out.println("name is"+name+"jsdnc"+color);
    }
}
public class why {
    public static void main(String[] args) {
           test<String> l=new test<>("yogesh","kumar");
           test<Integer> j=new test<>(12,90);

    }
}




