package generics;

public class like<t> {
    t name;

    public like(t name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);

    }

    public static void main(String[] args) {
        like<Integer> l=new like<>(13);
        l.print();

    }
}
