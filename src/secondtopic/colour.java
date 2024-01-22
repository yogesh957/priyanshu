package secondtopic;

class type{
    int total;
    String colourname;
    String customer;
    type(){
        System.out.println("hello");
    }
    type(int total,String colourname,String customer){
        this();
        this.total=total;
        this.colourname=colourname;
        this.customer=customer;
    }
        }
public class colour {
    public static void main(String[] args) {
        type cus1 = new type(3, "oranhe", "yogesh");
        System.out.println("total packs" + cus1.total+"colour name is"+cus1.colourname+"cus name is "+cus1.customer);
    }
}
