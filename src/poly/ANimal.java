package poly;
class AAnimal{
    String name;
    int num;

    public AAnimal(String name, int num) {
        this.name = name;
        this.num = num;
    }
    class bird{
        int hii;

        public bird(int hii) {
            this.hii = hii;
        }
    }
}

public class ANimal {
    public static void main(String[] args) {
      AAnimal a=new AAnimal("sd",12);
      AAnimal.bird b=a.new bird(90);
        System.out.println(b.hii);
        System.out.println(a.num);
    }
}
