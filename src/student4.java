class student4{
    int id;
    String name;
    student4(int id,String name){
      this.id=id;
       this.name=name;
}
  void display(){
        System.out.println("my id is "+id+"name is "+name);
    }
       public static void main(String[] args){
           student4 s1=new student4 (234,"dddd");
           s1.display();
    }
}
