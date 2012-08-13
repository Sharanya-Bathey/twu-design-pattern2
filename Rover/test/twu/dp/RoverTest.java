package twu.dp;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RoverTest {
    @Test
    public void shouldNavigateToCorrectPosition() {
        Rover rover = new Rover(new Position(1, 1), 'N');
        rover.navigate("RMLM");
        assertThat(rover.getPosition().getX(), is(2));
        assertThat(rover.getPosition().getY(), is(2));
    }

    @Test
    public void shouldNavigateAndHaveCorrectDirection() {
        Rover rover = new Rover(new Position(1, 1), 'N');
        rover.navigate("RMLM");
        assertThat(rover.getDirection(), is('N'));
    }

}
