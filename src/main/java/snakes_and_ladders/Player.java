package snakes_and_ladders;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private int position;

    public Player(String name) {
        this.name = name;
    }
}
