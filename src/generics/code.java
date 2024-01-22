package generics; //generic methods

public class code {
    public static<t> void display(t s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        display("ok");
        display(12);

    }
}
