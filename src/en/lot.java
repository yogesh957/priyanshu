package en;
class lott{
    private int num;
    private  String name;

    public void number(){
        System.out.println("im yogesh");
    }
    public void setNum(int num){

        this.num=num;
    }
    public int getNum(){
        return num;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

public class lot {
    public static void main(String[] args) {
        lott e=new lott();
        e.setNum(12);
        System.out.println(e.getNum());
    }
}
