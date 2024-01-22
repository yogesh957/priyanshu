package collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class learning {
    public static void main(String []args) {
        LinkedList<Integer> mylist = new LinkedList<Integer>();
        List<Integer> my = new ArrayList<Integer>();
        mylist.add(10);
        mylist.add(30);
        mylist.add(80);
        mylist.add(1,40);
        System.out.println(mylist);

    }
}
