public class GameEngine {

    private int hp = 100;
    private String characterName = "Sir Emmentaller";

    private static GameEngine instance = new GameEngine();  //od razu stworzona instancja to proste zabezpieczenie przed punktami zapalnymi (np. wielowatkowowścią)

    private GameEngine(){

    }

    public void run(){
        while(true){

        }
    }

    public static GameEngine getEngine(){

        if(instance==null){
            System.out.println("tworze instancję ");
            System.out.println();
            instance = new GameEngine();

             return instance;
        }else{
            System.out.println("instancja istnieje, zwracam ją");

            return instance;
        }
    }
}
