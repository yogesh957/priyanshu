package new1;
class sbi{
  private int pin;
    void setPin(int pin){
        this.pin=pin;
    }
    public int getPin(){
        return pin;
    }
}
public class banken {
    public static void main(String[] args) {
        sbi s1=new sbi();
        s1.setPin(123);
        System.out.println(s1.getPin());
    }
}
