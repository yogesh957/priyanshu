package secondtopic;
class book{
    String bookname;
    String topic;
    int id;
book(String bookname,String topic,int id){
    this.bookname=bookname;
    this.topic=topic;
    this.id=id;
    }
    void see(){
         System.out.println("book name is"+bookname+"topic name"+topic+"id no is"+id);
    }

}



public class subjets {
    public static void main(String[] args) {
        book Student1=new book("python","strings",123);
          Student1.see();
    }
}

