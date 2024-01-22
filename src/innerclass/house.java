package innerclass;
 class room{
    String paintcolour;
    int ac;
  static class rroom{
        int doors;
        String doorcolour;

      public int getDoors() {
          return doors;
      }

      public void setDoors(int doors) {
          this.doors = doors;
      }

      public String getDoorcolour() {
          return doorcolour;
      }

      public void setDoorcolour(String doorcolour) {
          this.doorcolour = doorcolour;
      }
  }

}
public class house {
    public static void main(String[] args) {
        room bed=new room();
       room.rroom e=new room.rroom();
         e.doorcolour="eded";
    }
}
