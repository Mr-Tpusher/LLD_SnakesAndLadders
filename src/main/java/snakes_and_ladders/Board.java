package snakes_and_ladders;

import java.util.HashMap;

public class Board {
    private int boardDimension;
    private int boardSize;
    private HashMap<Integer, BoardEntity> boardEntities;

    public Board(int boardDimension) {
        this.boardDimension = boardDimension;
        this.boardSize = boardDimension * boardDimension;
    }
}
