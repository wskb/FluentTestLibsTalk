package talk.presentation;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Z_PresentationJUnitTest {

	@Test
	public void example() {
		String data = getData();
		if( data.startsWith("hello") ) {
			throw new AssertionError();
		}
	}

	@Test
	public void clarifiedExample() {
		String data = getData();
		assertTrue(data.startsWith("hello"));
	}

	@Test
	public void distinguishedExample() {
		String data = getData();
		assertNotNull(data);
		assertTrue(data.startsWith("hello"));
	}

	@Test
	public void informativeExample() {
		String data = getData();
		assertNotNull("data must not be null", data);
		assertTrue(data.startsWith("hello"));
	}

	@Test
	public void hamcrestExample() {
		String data = getData();
		assertThat(data, startsWith("hello"));
	}

	private String getData() {
		return null;
	}
}
