 class car {
    int modelno;
    String color;
    Owner owner;
    public car(int modelno,String color,Owner owner){
        this.modelno = modelno;
        this.color = color;
        this.owner = owner;
    }

}
class Owner {
    String name;
    int age;

    public Owner(String name,int age) {
        this.name = name;
        this.age = age;
    }
}