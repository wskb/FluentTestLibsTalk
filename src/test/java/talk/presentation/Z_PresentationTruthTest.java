package talk.presentation;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class Z_PresentationTruthTest {

	private String getData() {
		return null;
	}

	@Test
	public void truthExample() {
		String data = getData();
		assertThat(data).startsWith("hello");
	}
}
