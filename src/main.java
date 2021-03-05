public class main {

    public static void main(String[] args) {

        GameEngine engine1 = GameEngine.getEngine();

        GameEngine engine2 = GameEngine.getEngine();

        System.out.println("porównuje instancje" );
        System.out.println( engine1==engine2);
    }
}
