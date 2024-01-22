package innerclass;
class classes{
    static int a=123;
    String name="yogesh";
    public  void creatingclasses(){
        System.out.println("setting primary class");
        class dept{         //class dept is inside the method creatingclasses so object is created inside the creatingclass method
            public void nursery(){
                System.out.println("opened nursery");
                System.out.println(a);// can access static variables
                System.out.println(); //cant access because it is non static
            }
        }
         dept sir=new dept();// created an object of class dept becuase class itself is a method here
        sir.nursery();// calling function of deptclass
    }

}
public class school {
    public static void main(String[] args) {
              classes kids=new classes();
              kids.creatingclasses();

    }
}
