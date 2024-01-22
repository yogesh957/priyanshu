class room{
    int paper;
    String Students;

    public room(int paper, String students) {
        this.paper = paper;
        this.Students = students;
    }
    private class bench{
        int length;
        String count;
       room r1;

        public bench(int length, String count, bench b1) {
            this.length = length;
            this.count = count;

            this.r1 = r1;
        }
    }
}




public class lll {

}
