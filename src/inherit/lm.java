package inherit;
class livingbeing {
    int k;
    String growth;

    public livingbeing(int k, String growth) {
        System.out.println("living beings ");
        this.k = k;
        this.growth=growth;
    }
}
class humann extends livingbeing{
    String speak;
    String activities;

    public humann( String speak, String activities) {
        super(20,"yes");
        this.speak = speak;
        this.activities = activities;
    }
}
public class lm {
    public static void main(String[] args) {
        humann h = new humann("hi","k");
    }
}
