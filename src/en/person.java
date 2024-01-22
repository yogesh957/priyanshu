package en;
class kind{
    private String name;
   private int age;
   private String country;

   public void setName(String name){
       this.name=name;
   }
   public void setAge(int age){
       this.age=age;
   }
   public void setCountry(String country){
    this.country=country;
   }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }
   public String getCountry(){
       return country;
   }
}



public class person {
    public static void main(String[] args){
          kind person1=new kind();
          person1.setName("yogesh");
          person1.setAge(21);
          person1.setCountry("india");
          System.out.println(person1.getName());
          System.out.println(person1.getAge());
          System.out.println(person1.getCountry());
    }
}
