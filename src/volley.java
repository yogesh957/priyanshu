class ball{
    private int players;
    private String name;

    public int getPlayers() {
        return players;
    }
    public  String getName(){
        return name;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class volley {
    public static void main(String[] args) {
        ball one=new ball();
        one.setName("yogesh");
        System.out.println(one.getName());
    }
}
