class yogesh {
    int weight;
    String excessive;
    yogesh(int weight, String excessive) {
        this.weight = weight;
        this.excessive = excessive;
    }
    void follow() {
        System.out.println("my weight is " + weight + "my exe is " + excessive);
    }
    static class gym {
        public static void main(String[] args) {
        yogesh day1 = new yogesh(20, "biceps");
          day1.follow();
      }
    }
}