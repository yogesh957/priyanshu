package firsttopic;

class game{
    String gamename;
    String name;
    int jerno;
    void show(){
        System.out.println("game name is"+gamename+"my name is"+name+"jerno is"+jerno);
    }

}



public class play {
    public static void main(String [] args){
        game play1=new game();
        play1.gamename="cricket";
        play1.name="pranay";
        play1.jerno=12;

        play1.show();

    }
}

