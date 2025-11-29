package snakes_and_ladders;

public class Ladder extends BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String toString() {
        return "L(" + super.getStart() + "->" + super.getEnd();
    }

}
