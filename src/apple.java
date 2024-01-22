class fruit{

    int quantity;
    String name;

    fruit(int quantity,String name){
         this.quantity=quantity;
         this.name=name;



    }
    public void print(){
        System.out.println("quantity is"+quantity+"name"+name);
    }
}
public class apple {
    public static void main(String[] args) {
       fruit b =new fruit(10,"banana");
       b.print();
    }
}
