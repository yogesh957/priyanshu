package secondtopic;

import java.util.Objects;
import java.util.Scanner;

class B{
    String name;
    int roll;

    public B(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public B(B b2 ){
        this.name= b2.name;
        this.roll=b2.roll;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass()) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return roll == b.roll && Objects.equals(name, b.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }


    public static void main(String[] args) {
        B b1=new B("yogesh",123);
        B b2=new B("khaleel",123);
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
         System.out.println(b1.equals(b2));
         Object obj = new Object();
         System.out.println(obj.getClass().getName());

        Scanner sc = new Scanner(System.in);
         sc.nextInt();


    }

}
