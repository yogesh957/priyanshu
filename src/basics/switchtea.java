package basics;

public class switchtea {
    public static void main(String[] args) {
        String day="monday";
        switch (day){
            case "monday":
                System.out.println("it is minday");
                break;
            case "tuesday":
                System.out.println("it is tuesday");
                break;
            case "wednesday":
                System.out.println("it is wednes");
                break;
            default:
                System.out.println("error");
        }
    }
}
