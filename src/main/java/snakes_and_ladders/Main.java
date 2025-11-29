package snakes_and_ladders;

public class Main {
    public static void main(String[] args) {
        int boardDimension = 10;
        int numberOfDice = 1;

        Game game = new Game(boardDimension, numberOfDice);

        Player p1 = new Player("A");
        Player p2 = new Player("B");
        Player p3 = new Player("C");
        Player p4 = new Player("D");

        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);
        game.addPlayer(p4);

        game.launch();
    }
}
