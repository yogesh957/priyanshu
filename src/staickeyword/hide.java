package staickeyword;

class calci {
    static int i=10;
    int j = 12;

    public void print(){
        int x=i+j;
        System.out.println(x);
    }

}

public class hide {
    public static void main(String[] args) {
        calci num=new calci(); //created object for nonstatic variable
        num.print();
        System.out.println(num.j);
    }
}
