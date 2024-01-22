package secondtopic;
class variety{
    String colour;
    int prize;
    int gm;
    variety(String colour,int prize,int gm){
        this.colour=colour;
        this.gm=gm;
        this.prize=prize;
        }
        void display(){
            System.out.println("colour is"+colour+"prize is"+prize+"weight is"+gm);
    }
}

public class powder {
    public static void main(String[] args) {
        variety c1=new variety("red",12,100);
        variety c2=new variety("black",30,300);
        c1.display();
        c2.display();
    }
}
