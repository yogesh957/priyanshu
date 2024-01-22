package new1; //set is only to set the value cant get the value
class fans{
    private int pin;
    public void setPin(int pin){
        this.pin=pin;
    }
}
public class fansen {
    public static void main(String[] args) {
        fans f=new fans();
       f.setPin(123);

    }
}
