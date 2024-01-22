class rew {
    int roll;
    String name;

    public void display() {
        System.out.println("my roll" + roll + "my name is" + name);
    }
}


public class student {
     public static void main(String args[]){
          rew s1=new rew();
          s1.roll=2345;
          s1.name="yogesh";

          rew s2=new rew();
          s2.roll=9876;
          s2.name="arun";

          s1.display();
          s2.display();
     }

}
