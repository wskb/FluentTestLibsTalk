package talk.presentation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Z_PresentationAssertJTest {

	private String getData() {
		return null;
	}

	@Test
	public void assertJExample() {
		String data = getData();
		assertThat(data).as("data").startsWith("hello");
	}
}
