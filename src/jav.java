
    class students{
        int roll;
        String name;

        public void iop(int roll,String name){
            System.out.println(roll);
            System.out.println(name);

        }
    }
    class inter{
       int roll;
       String name;
        public void poi(int roll,String name){
            System.out.println(roll);
            System.out.println(name);

        }
    }
    public class jav {
        public static void main(String[] args) {
            students s1 = new students();
            s1.roll = 123;
            s1.name = "skfsl";
          s1.iop(12,"sdsd");
          inter i1=new inter();
          i1.poi(12,"dsc");
        }
    }