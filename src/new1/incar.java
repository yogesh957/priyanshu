package new1;
class car{
    int num;
    String name;

    public car(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
class eng extends car{
     String arr;
     int erp;

    public eng(int num, String name, String arr, int erp) {
        super(num, name);
        this.arr = arr;
        this.erp = erp;
    }
}

public class incar {
    public static void main(String[] args) {
          eng c1=new eng(12,"yogesh","jdbc",123);
    }
}
