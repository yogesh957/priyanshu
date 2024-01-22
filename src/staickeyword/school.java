package staickeyword;
class details{
    String name;
   static String uniform="whites";
    int id;
    details(String name,int id){
        this.name=name;
        this.id=id;
    }


}
public class school {
    public static void main(String[] args) {
        details subjunior=new details("yogesh",123);
        details.uniform="black";
    }
}
