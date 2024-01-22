package firsttopic;

import java.net.StandardSocketOptions;
import java.util.Objects;

class classroom{
    int roll;
    String name;
    String section;
    public classroom(int roll,String name,String section){
        this.roll = roll;
        this.name = name;
        this.section=section;
    }

    @Override
    public boolean equals(Object o) {
        classroom classroom;
        classroom = (classroom) o;
        if (this.roll == ((classroom) o).roll) return true;
        return roll == classroom.roll && Objects.equals(name, classroom.name) && Objects.equals(section, classroom.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, section);
    }

    @Override
    public String toString() {
        return
                "roll=" + roll +
                ", name='" + name +
                " section= " + section + '\'';
    }
}


public class human {
    public static void main(String[] args) {
        classroom student = new classroom(101, "hambi", "a");
        classroom student1 = new classroom(101, "bambi", "b");
        System.out.println(student1.equals(student));

    }
}