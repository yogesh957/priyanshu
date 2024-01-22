class   Livingbeings{
    String diet = "MEAT";
    int legs;
    String Ancestors;

    public Livingbeings(int legs){
        this.legs = legs;
    }

}

class human extends Livingbeings{
    String diet = "FOOD";

  int Iqlevel;

  public void show() {
      System.out.println(super.diet);
  }
   public human(int Iqlevel,int legs){
       super(legs);
       this.Iqlevel = Iqlevel;
   }


}



public class inhar {
    public static void main(String[]args) {

        human yogesh = new human(100,4);
        System.out.println(yogesh.legs);

    }


}
