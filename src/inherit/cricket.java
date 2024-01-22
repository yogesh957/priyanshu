package inherit;
class player {
 int jerseyno;
    String name;

    public player(int jerseyno, String name) {
        this.jerseyno = jerseyno;
        this.name = name;
    }
    public void rest(){
        System.out.println("ok");
    }
}
    class allrounder extends player {
             String bowl;
             String bat;
       public void arun(){
           System.out.println("sjdkjsd");
       }
        public allrounder(int jerseyno, String name, String bowl, String bat) {
            super(34, "jdsl");
            this.arun();
            this.bowl = bowl;
            this.bat = bat;
            System.out.println(super.jerseyno);

            super.rest();

        }
    }

            public class cricket{
            public static void main(String[] args) {
                allrounder vinay=new allrounder(12,"kick","yes","yes");
                System.out.println(vinay.jerseyno);


            }
    }
