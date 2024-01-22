package firsttopic;
class bat{
    String destination;
    int phno;
    String name;
    void display(){
               System.out.println("im going to"+destination+"num"+phno+"name is"+name);
    }
}

public class tour {
    public static void main(String[] args){
         bat pass1=new bat();
         pass1.destination="sfsd";
         pass1.phno=123;
         pass1.name="yogesh";
         pass1.display();
    }
}
