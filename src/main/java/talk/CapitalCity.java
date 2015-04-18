package talk;

public class CapitalCity {

	private final String name;
	private final Province province;

	public CapitalCity( String name, Province province ) {
		this.name = name;
		this.province = province;
	}

	public String getName() {
		return name;
	}

	public Province getProvince() {
		return province;
	}
}