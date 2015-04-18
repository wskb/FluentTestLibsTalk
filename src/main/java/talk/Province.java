package talk;

import com.google.common.collect.ImmutableSet;

public enum Province {
	AB("AB", "Alberta"),
	BC("BC", "British Columbia"),
	NL("NL", "Newfoundland and Labrador"),
	NB("NB", "New Brunswick"),
	NS("NS", "Nova Scotia"),
	MB("MB", "Manitoba"),
	ON("ON", "Ontario"),
	PE("PE", "Prince Edward Island"),
	QC("QC", "Québec"),
	SK("SK", "Saskatchewan"),
	;

	private final String postAbbr;
	private final String name;

	private Province(String postAbbr, String name) {
		this.postAbbr = postAbbr;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getPostAbbr() {
		return postAbbr;
	}

	public static ImmutableSet<String> getNames() {
		ImmutableSet.Builder<String> names = ImmutableSet.builder();
		for( Province province : values() ) {
			names.add(province.getName());
		}
		return names.build();
	}
}