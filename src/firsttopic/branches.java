package firsttopic;

class details{
        String group;
        int num;
        String name;
        public void gijj(String group,int num,String name){
            System.out.println(group);
            System.out.println(num);
            System.out.println(name);
        }
        }
public class branches {
    public static void main(String[] args){
        details student1=new details();
        student1.group="eee";
        student1.num=121;
        student1.name="yogesh";
        details student2=new details();
        student2.group="cse";
        student2.num=456;
        student2.name="deepak";
    }

}
