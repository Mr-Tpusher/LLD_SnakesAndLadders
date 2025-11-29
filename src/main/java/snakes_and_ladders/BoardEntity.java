package snakes_and_ladders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class BoardEntity {
    private int start;
    private int end;
}
