class person {
    String name;
    int age;

    person() {
        System.out.println("my name is karthick");
    }

    person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    void see() {
        System.out.println("my name is" + name + "age is" + age);
    }
}
 public class Person{
        public static void main(String[] args) {
            person person1 = new person("yogesh", 16);
            person person2 = new person("arun", 34);

            person1.see();
            person2.see();
        }
    }
