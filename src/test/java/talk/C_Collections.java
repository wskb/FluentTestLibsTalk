package talk;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;

public class C_Collections {

	@Test
	public void mismatch() {

		Set<State> actual = State.continental();

		assertThat(actual).containsOnly(State.values());
	}

	@Test
	public void ordering() {

		LinkedList<State> states = new LinkedList<State>(Arrays.asList(State.values()));

		states.addLast(states.removeFirst());

		assertThat(states).containsExactly(State.values());
	}

	@Test
	public void extractionByProperty() {

		assertThat(State.continental()).extracting("name", String.class).containsAll(State.getNames());
	}

	@Test
	public void extractionByMethod() {

		assertThat(State.continental()).extractingResultOf("getName", String.class).containsAll(State.getNames());
	}
}



