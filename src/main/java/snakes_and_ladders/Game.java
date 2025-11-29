package snakes_and_ladders;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.Queue;

@Getter
@Setter
public class Game {
    private int boardDimension;
    private int boardSize;
    private int numberOfDice;
    private Board board;
    private Queue<Player> players;
    private Queue<Player> winners;

    public Game(int boardDimension, int numberOfDice) {
        this.boardDimension = boardDimension;
        this.boardSize = boardDimension * boardDimension;
        this.numberOfDice = numberOfDice;
        this.board = new Board(boardDimension);
        this.players = new ArrayDeque<>();
        this.winners = new ArrayDeque<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void launch() {
        System.out.println("Game started!!!");

        while (players.size() > 1) {
            Player player = players.poll();

            makeMove(player);

            if (hasWon(player)) {
                winners.add(player);
                System.out.println("Congratulations " + player.getName() + " you won!");
            } else {
                players.offer(player);
            }
        }

        System.out.println("Game ended!!!");
        System.out.println("Winners are....");

        winners.forEach(System.out::println);

    }

    public void makeMove(Player player) {
        // roll dice
        int move = DiceService.roll(numberOfDice);
        System.out.println(player + " you got : " + move);

        int playerCurrPosition = player.getPosition();
        int playerNewPosition = playerCurrPosition + move;

        if (playerNewPosition <= boardSize) {

            // Check if there's Snake or Ladder at new position
            if (board.getBoardEntities().containsKey(playerNewPosition)) {
                playerNewPosition = board.getBoardEntities().get(playerNewPosition).getEnd();
            }
        } else {
            playerNewPosition = playerCurrPosition;
        }

        player.setPosition(playerNewPosition);

        System.out.println("new position = " + player.getPosition());
    }

    public boolean hasWon(Player player) {
        return player.getPosition() == boardSize;
    }
}
