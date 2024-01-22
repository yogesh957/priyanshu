package new1;
class kind {
     private int pin;

    public void setPin(int pin) {
        if (pin > 100) {
            this.pin = pin;
        }
    }
    public int getPin(){
        return pin;
    }
}
public class enviper {
    public static void main(String[] args) {
      kind k=new kind();
        k.setPin(233);
        System.out.println(k.getPin());
    }
}
