package snakes_and_ladders;

public class Main {
    public static void main(String[] args) {
        int boardDimension = 10;
        int numberOfDice = 1;

        Game game = new Game(boardDimension, numberOfDice);

        Player p1 = new Player("A");
        Player p2 = new Player("B");
        game.addPlayer(p1);
        game.addPlayer(p2);

        game.launch();
    }
}
