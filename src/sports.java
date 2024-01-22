class sports {
    String name;
    int number;
    String sportname;

    public void show() {
        System.out.println("name is " + name + "number " + number + "sport name is " + sportname);
    }


    public static void main(String[] args) {
        sports pp = new sports();
        pp.name = "arun";
        pp.number = 454;
        pp.sportname = "cricket";

        sports bb= new sports();
        bb.name = "khaleel";
        bb.number = 123;
        bb.sportname = "badminton";

        pp.show();
    }
}

