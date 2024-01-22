package secondtopic;

public class Person {
    String name;
    int age;

    public Person() {
        this("John Doe", 30);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Person 1: " + person1.name + ", " + person1.age + " years old");

        Person person2 = new Person("Alice", 25);
        System.out.println("Person 2: " + person2.name + ", " + person2.age + " years old");
    }
}
