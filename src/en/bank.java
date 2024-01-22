package en;
class details{
   private int Id;
    private String name;

    public void setId(int id){
        this.Id=id;
    }
    public int getId() {
        return Id;
    }

}
public class bank {
    public static void main(String[] args){
         details emp=new details();
         emp.setId(123);
         System.out.println(emp.getId());
    }
}
