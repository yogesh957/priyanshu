package staickeyword;
class sand{
    static int x;
    static String type;
    static void van(){      //static variable can be accessed through static mathod
        System.out.println(x);
        System.out.println(type);
    }

    public static void main(String[] args) {
        x=12;
        type="soft";
        van();

    }
}
