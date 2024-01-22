package inherit;
class ball{
    int players;
    String name;

    public ball(int players, String name) {
        this.players = players;
        this.name = name;
    }
}
class bird extends ball{
    String note;
    int expense;

    public bird(int players, String name, String note, int expense) {
        super(6, "too many");
        this.note = note;
        this.expense = expense;
    }
}
public class basket {
    public static void main(String[] args) {

    }
}
