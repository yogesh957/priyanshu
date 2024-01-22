import java.util.Objects;

class declare{
    private int math;
    private int che;
    private int bio;
    public void setMath(int math){
        this.math=math;
    }
   public void setChe(int che){
        this.che=che;
    }
    public void setBio(int bio){
        this.bio=bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        declare declare = (declare) o;
        return math == declare.math && che == declare.che && bio == declare.bio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(math, che, bio);
    }

    void details(){
        System.out.println("maths marks " +math);
        System.out.println("chemistry msrks " +che);
        System.out.println("biology marks"+bio);
        int total=math+che+bio;
        System.out.println(total);
    }
}
public class marks {
    public static void main(String[] args) {
        declare rohit=new declare();
        rohit.setMath(67);
        rohit.setBio(78);
        rohit.setChe(89);
        rohit.details();
    }
}
