package innerclass;
class types{
    int legs;
    int lfingers;

    public types(int legs, int lfingers) {
        this.legs = legs;
        this.lfingers = lfingers;
    }
    class human{
        String speak;
        int hands;
        public human(String speak, int hands) {
            this.speak = speak;
            this.hands = hands;
        }
    }
    public void print(types.human bhuvan){
        System.out.println("bhuvan legs are"+this.legs);
        System.out.println("bhuvan hands are"+this.lfingers);
        System.out.println("bhuvan hands are ");
    }
}
public class livingbein {
    public static void main(String[] args) {
        types bhuvan=new types(4,10);
        types.human ubhuvan=bhuvan.new human("yes",2);

    }
}
