package talk;

import java.util.EnumSet;

import com.google.common.collect.ImmutableSet;

public enum State {
	AL("AL", "Alabama", true),
	AK("AK", "Alaska", false),
	AZ("AZ", "Arizona", true),
	AR("AR", "Arkansas", true),
	CA("CA", "California", true),
	CO("CO", "Colorado", true),
	CT("CT", "Connecticut", true),
	DE("DE", "Delaware", true),
	FL("FL", "Florida", true),
	GA("GA", "Georgia", true),
	HI("HI", "Hawaii", false),
	ID("ID", "Idaho", true),
	IL("IL", "Illinois", true),
	IN("IN", "Indiana", true),
	IA("IA", "Iowa", true),
	KS("KS", "Kansas", true),
	KY("KY", "Kentucky", true),
	LA("LA", "Louisiana", true),
	ME("ME", "Maine", true),
	MD("MD", "Maryland", true),
	MA("MA", "Massachusetts", true),
	MI("MI", "Michigan", true),
	MN("MN", "Minnesota", true),
	MS("MS", "Mississippi", true),
	MO("MO", "Missouri", true),
	MT("MT", "Montana", true),
	NE("NE", "Nebraska", true),
	NV("NV", "Nevada", true),
	NH("NH", "New Hampshire", true),
	NJ("NJ", "New Jersey", true),
	NM("NM", "New Mexico", true),
	NY("NY", "New York", true),
	NC("NC", "North Carolina", true),
	ND("ND", "North Dakota", true),
	OH("OH", "Ohio", true),
	OK("OK", "Oklahoma", true),
	OR("OR", "Oregon", true),
	PA("PA", "Pennsylvania", true),
	RI("RI", "Rhode Island", true),
	SC("SC", "South Carolina", true),
	SD("SD", "South Dakota", true),
	TN("TN", "Tennessee", true),
	TX("TX", "Texas", true),
	UT("UT", "Utah", true),
	VT("VT", "Vermont", true),
	VA("VA", "Virginia", true),
	WA("WA", "Washington", true),
	WV("WV", "West Virginia", true),
	WI("WI", "Wisconsin", true),
	WY("WY", "Wyoming", true),
	;

	private final String postCode;
	private final String name;
	private final boolean continental;

	private State(String postCode, String name, boolean continental) {
		this.postCode = postCode;
		this.name = name;
		this.continental = continental;
	}

	public boolean isContinental() {
		return continental;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("%s - %s", postCode, name);
	}

	public static EnumSet<State> continental() {
		EnumSet<State> states = EnumSet.noneOf(State.class);
		for( State state : values() ) {
			if(state.isContinental()) {
				states.add(state);
			}
		}
		return states;
	}

	public static ImmutableSet<String> getPostCodes() {
		ImmutableSet.Builder<String> names = ImmutableSet.builder();
		for( State state : values() ) {
			names.add(state.getPostCode());
		}
		return names.build();
	}

	public static ImmutableSet<String> getNames() {
		ImmutableSet.Builder<String> names = ImmutableSet.builder();
		for( State state : values() ) {
			names.add(state.getName());
		}
		return names.build();
	}
}
