package en;
class giff {
    int salary;
    String name;

    giff(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}
class more extends giff{
    int count;
    String bonus;
    public more(int salary, String name,int count,String bonus) {
        super(salary, name);
        this.bonus=bonus;
        this.count=count;
    }
}

public class gif {
    public static void main(String[] args) {
      more w=new more(123,"kejf",12,"fdknv");
        System.out.println(w.salary);
        System.out.println(w.name);
    }
}
