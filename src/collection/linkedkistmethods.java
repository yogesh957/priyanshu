package collection;

import java.util.LinkedList;

public class linkedkistmethods {
    public static void main(String[] args) {
        LinkedList<Integer> t = new LinkedList<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        System.out.println(t);
        t.addFirst(10);
        t.addLast(133);
        System.out.println(t);
        System.out.println(t.poll());// prints the first element ready to go
        System.out.println(t.pollFirst());// prints the first element ready to go
        t.offer(20);// offer element to the last
        System.out.println(t);
        System.out.println(t.peek());
    }
}
