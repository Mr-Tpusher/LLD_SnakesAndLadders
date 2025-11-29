package snakes_and_ladders;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Getter
@Setter
public class Board {
    private int boardDimension;
    private int boardSize;
    private HashMap<Integer, BoardEntity> boardEntities;

    public Board(int boardDimension) {
        this.boardDimension = boardDimension;
        this.boardSize = boardDimension * boardDimension;
        this.boardEntities = new HashMap<>();
        createBoardEntities();
    }

    private void createBoardEntities() {
        Random random = new Random();
        // create snakes
        Set<Integer> entityStart = new HashSet<>();

        for (int i = 0; i < boardDimension; i++) {

            int start;
            do {
                start = random.nextInt(boardSize - 2) + 1;
            } while (entityStart.contains(start) || entityStart.contains(start + 1));

            entityStart.add(start);

            int end = random.nextInt(start);

            boardEntities.put(start, new Snake(start, end));
        }

        // create Ladders
        for (int i = 0; i < boardDimension; i++) {

            int start;
            do {
                start = random.nextInt(boardSize - 2) + 1;
            } while (entityStart.contains(start));

            entityStart.add(start);
            int end = start + random.nextInt(boardSize - start);

            boardEntities.put(start, new Ladder(start, end));
        }
    }

    public void printBoard() {
        for (int i = 0; i < boardDimension; i++) {
            for (int j = 1; j <= boardDimension; j++) {
                int cell = (i * boardDimension) + j;

                System.out.print(cell);
                if (boardEntities.containsKey(cell))
                    System.out.print("{" + boardEntities.get(cell).toString() + ")}  ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
