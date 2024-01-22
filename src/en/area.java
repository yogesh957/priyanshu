package en;

class dimension {
    int length;
    int breadth;
    dimension(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void getarea(){
        int area=length*breadth;
        System.out.println(area);

    }

}
public class area {
      public static void main(String[] args){
          dimension rec=new dimension(12,34);
         rec.getarea();

      }
}
