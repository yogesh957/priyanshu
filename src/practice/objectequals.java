package practice;//equals

import java.util.Objects;

class film {
    int actors;
    String name;

    public film(int actors, String name) {
        this.actors = actors;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) { //o is object class referene variable
        if (this == o) // both the reference is compared
            return true;
        if (o == null)// if the object is null return false
            return false;
        if(getClass()!=o.getClass())// comparing class of the objects
            return false;
        film eq = (film) o;// parent class is converted to child class
        return actors == eq.actors && Objects.equals(name, eq.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actors, name);
    }
}
public class objectequals {
    public static void main(String[] args) {
       film m=new film(12,"srk");
       film n=new film(12,"srk");
        System.out.println(m.equals(n));
    }
}
