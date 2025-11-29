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
    }
}
