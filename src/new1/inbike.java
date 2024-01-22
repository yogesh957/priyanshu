package new1;  //hierachiel inheritance
class dog{
    int legs;
    String sound;

    public dog(int legs, String sound) {
        this.legs = legs;
        this.sound = sound;
    }

}
class cat extends dog{
    int hands;
    String name;

    public cat(int legs, String sound, int hands, String name) {
        super(legs, sound);
        this.hands = hands;
        this.name = name;
    }
}
class bird extends dog{
    String color;

    public bird(int legs, String sound, String color) {
        super(legs, sound);
        this.color = color;
    }
}

public class inbike {
    public static void main(String[] args) {
        bird b=new bird(12,"esf","rfwef");
        cat c=new cat(12,"sefb",23,"efhew");

    }
}
