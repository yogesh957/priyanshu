package inherit;
//multilevel inheritance
class animall {
      int legs;
      int colour;

    public animall(int legs, int colour) {
        this.legs = legs;
        this.colour = colour;
    }
}
    class dog extends animall{
          int eyes;
          String name;

        public dog(int legs, int colour, int eyes, String name) {
            super(legs, colour);
            this.eyes = eyes;
            this.name = name;
        }
    }
  class babydog extends dog{
         int ears;

      public babydog(int legs, int colour, int eyes, String name, int ears) {
          super(legs, colour, eyes, name);
          this.ears = ears;

      }
  }
public class dim{
    public static void main(String[] args) {
           babydog humpy=new babydog(4,5,2,"humpy",2);
           dog d=new dog(3,3,4,"puppy");
           animall h=new animall(3,1);
        System.out.println(humpy.legs);

        }
    }
