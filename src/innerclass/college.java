package innerclass;

public class college {
    int a=12;
    int fine=1;
    String name="yogesh";
    boolean uniform=false;
    public static void main(String[] args) {
        college principle=new college();
        college.dept hod=principle.new dept();
          hod.function();//accessed the method of inner class
          principle.meethod(); //accessed method of outer class
    }
    public void meethod(){
        dept hod=new dept();//accessed inner class method by creating object of dept
        hod.function();
    }
    class dept{   //inner class
        int fine=2;
        boolean uniform=true;
        public void function(){
            int fine=1000;
            college c=new college();
            System.out.println(fine);// accessed function local variable
            System.out.println(this.fine); //accessed inner class variable
            System.out.println(college.this.fine);//accessed outer class variable
            System.out.println(c.uniform);
            System.out.println(college.this.uniform);
            System.out.println("eee dept function");
            System.out.println(a);  //inner class can access all the members of outer class
            System.out.println(name); //inner class can access all the members of outer class
        }

    }
}
