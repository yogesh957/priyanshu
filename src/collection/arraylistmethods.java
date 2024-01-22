package collection;

import java.util.ArrayList;

public class arraylistmethods {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(12);
        a.add(20);
        a.add(15);
        a.add(23);
        a.add(11);
        System.out.println(a);
        System.out.println(a.remove(1));
        a.add(2,23);
        System.out.println(a);

        System.out.println(a.contains(23));

        System.out.println(a.size());
        a.add(23);
        System.out.println(a.indexOf(23));
        System.out.println(a.lastIndexOf(23));

        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(123);
        b.add(56);
        b.addAll(a); //adding all the elements in the b arraylist
        System.out.println(b);
        b.removeAll(a);// removes all elements of a
        System.out.println(b);


    }
}
