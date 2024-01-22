package secondtopic;
class point{
    int modelno;
    String type;
    int year;
    point(int modelno,String type,int year){
        this.modelno=modelno;
        this.type=type;
        this.year=year;
    }
    void result(){
        System.out.println("the model no is"+modelno+"the type is"+type+"the year is"+year);
    }
}


public class scooter {
    public static void main(String[] args){
        point scooter1=new point(1234,"activa",2003);
        scooter1.result();

    }
}
