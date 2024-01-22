package en;
class book {
    private int num;
    private String name;

    public void setNum(int num) {
        if (num == 1234) {
            this.num = num;
        }else{
            System.out.println("wrong");
        }
    }
    public int getNum() {
        return num;
    }
}
public class note {
    public static void main(String[] args) {
        book eco=new book();
        eco.setNum(124);
        System.out.println(eco.getNum());
    }
}
