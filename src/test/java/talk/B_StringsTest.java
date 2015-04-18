package talk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class B_StringsTest {

	@Test
	public void contains() {
		String provinceName = Province.NL.getName();
		// fix me
		assertThat(provinceName).contains("poodle");
	}

	@Test
	public void distinguishingAndIn() {
		String homeProvince = System.getProperty("homeProvince", "");
		String birthProvince = System.getProperty("birthProvince", "");

		// make this more obvious
		// (as)
		assertThat(homeProvince).isIn(Province.getNames());
		assertThat(birthProvince).isIn(Province.getNames());
	}
}
