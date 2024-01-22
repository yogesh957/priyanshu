public class vehicles

{
    int vtyres;
    String vname;
    vehicles.engine z;

    public vehicles(int vtyres, String vname) {
        this.vtyres = vtyres;
        this.vname = vname;
    }

    private static class engine {
        int eno;
        String ename;
        vehicles v1;

        public engine(int eno, String ename) {
            this.eno = eno;
            this.ename = ename;

        }
    }

    public void passdetails(int eno,String ename) {
        vehicles.engine m = new vehicles.engine(eno,ename);
        System.out.println(m.ename);
        System.out.println(m.eno);
    }
}
class manafacture {

    public static void main(String[]args) {
        vehicles v = new vehicles(3,"j");
        v.passdetails(1001,"bamba");


    }
}