
class cars{
 int x  =10;

    static {
        cars mc = new cars();
        System.out.println("Iam first static block so i will be called first...."+mc.x);
    }
   private int tyre;
    String name;
   static String tankcapacity = "5L";
    public cars() {
        System.out.println("IAM CALLED WHENEVER cars CLASS OBJ IS CREATED that is ");
    }

    public cars(int tyre,String name) {

        this.tyre = tyre;
        this.name = name;

    }

}

