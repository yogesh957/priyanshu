package inherit;
class senior{
    int experience;
    String name;

    public senior(int experience, String name) {
        this.experience = experience;
        this.name = name;
    }
    public void enter(){
        System.out.println("you are not selected");
    }
}
class junior extends senior{
    int certificate;
    String name;

    public junior(int experience, String name, int certificate, String name1) {
        super(experience, name);
        super.enter();
        this.certificate = certificate;
        this.name = name1;
    }
    public void exit(){
        System.out.println("you are not selected");
    }
   static public void add(int s,int j){
        int z=s+j;
        System.out.println(z);
    }
}
class subjunior extends junior{
    int shield;
    String selection;

    public subjunior(int experience, String name, int certificate, String name1, int shield, String selection) {
        super(experience, name, certificate, name1);
        this.shield = shield;
        this.selection = selection;
        super.enter();
        super.exit();
        super.add(1,3);
    }
}

public class teams {
    public static void main(String[] args) {
       subjunior akash=new subjunior(9,"lite",5,"efss",0,"yes");
       akash.add(4,3);
    }
}
