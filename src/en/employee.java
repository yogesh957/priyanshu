package en;

class door{
    int empid;
    String empname;
    int empsalary;
    public void setEmpid(int empid){
        this.empid=empid;
    }
    public void setEmpname(String empname){
        this.empname=empname;
    }
    public void setEmpsalary(int empsalary){
        this.empsalary=empsalary;
    }
    public int getEmpid(){
        return empid;
    }
    public String getEmpname(){
        return empname;
    }
    public int getEmpsalary(){
        return empsalary;
    }
}

public class employee {
    public static void main(String[] args){
        door empolyee1=new door();
        empolyee1.setEmpid(12);
        empolyee1.setEmpname("yogesh");
        empolyee1.setEmpsalary(80000);

        System.out.println(empolyee1.getEmpid());
        System.out.println(empolyee1.getEmpname());
        System.out.println(empolyee1.getEmpsalary());
    }
}
