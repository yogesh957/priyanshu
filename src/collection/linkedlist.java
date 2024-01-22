package collection;
import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("nike");
        ll.add("adidas");
        System.out.println(ll);
        ll.add(1,"reebok");
        System.out.println(ll);

    }
}
