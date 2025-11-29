package snakes_and_ladders;

public class Snake extends BoardEntity {

    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String toString() {
        return "S(" + super.getStart() + "->" + super.getEnd();
    }
}
