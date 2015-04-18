package talk;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import java.io.File;
import java.net.URISyntaxException;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;

public class D_Grabbag {

	@Rule
	public final JUnitSoftAssertions softly = new JUnitSoftAssertions();

	@Test
	public void distinguishingRevisited() {
		String homeProvince = System.getProperty("homeProvince", "");
		String birthProvince = System.getProperty("birthProvince", "");

		softly.assertThat(homeProvince).as("homeProvince property").isIn(Province.getNames());
		softly.assertThat(birthProvince).as("birthProvince property").isIn(Province.getNames());
	}

	@Test
	public void file() {

		String nameLines = Joiner.on("\n").join(State.getNames());

		File file = fileFromResource("/StateAbbreviations.txt");

		assertThat(file).usingCharset(Charsets.UTF_8).hasContent(nameLines);
	}

	@Test
	public void beanWithoutEquals() {
		CapitalCity city1 = new CapitalCity("Edmonton", Province.AB);
		CapitalCity city2 = new CapitalCity("Fort Edmonton", Province.AB);

		assertThat(city1).isEqualTo(city2);
	}

	@Test
	public void expectedException() {
		try {
			//throwException();
			failBecauseExceptionWasNotThrown(IllegalStateException.class);
		} catch( IllegalStateException e ) {
			assertThat(e).hasNoCause().hasMessageContaining("eror");
		}
	}

	public void throwException() {
		throw new IllegalStateException("an error has occurred");
	}

	public File fileFromResource(String resourceName) {
		try {
			return new File(getClass().getResource(resourceName).toURI());
		} catch( URISyntaxException e ) {
			throw new RuntimeException("an error occurred", e);
		}
	}
}



