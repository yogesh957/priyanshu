import java.util.Objects;

class react{
    String name;
    int roll;

    public react(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        react react = (react) o;
        return roll == react.roll && Objects.equals(name, react.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }
}
public class call {
    public static void main(String[] args) {
         react r1=new react("yogesh",123);
         react r2=new react("yogesh",123);
        System.out.println(r1.equals(r2));
        System.out.println(r1.getClass());
        System.out.println(r2.getClass());

    }
        }


