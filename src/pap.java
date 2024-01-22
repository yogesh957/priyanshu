class paper{
    int pages;
    String subject;
    paper.pens plo;

    public paper(int pages,String subject) {
        this.pages = pages;
        this.subject=subject;
    }
    class pens{
        int eng;
        String hhh;

        public pens(int eng, String hhh) {
            this.eng = eng;
            this.hhh = hhh;
        }
    }
    public void let(int eng,String hhh){
        paper.pens l=new paper.pens(eng,hhh);
        this.plo=l;
    }
    public void print(){
        System.out.println(plo.eng);
        System.out.println(plo.hhh);
    }
}
public class pap {
    public static void main(String[] args) {
        paper lkl=new paper(12,"srg");
        lkl.let(12,"sdc");
        lkl.print();

    }
}
