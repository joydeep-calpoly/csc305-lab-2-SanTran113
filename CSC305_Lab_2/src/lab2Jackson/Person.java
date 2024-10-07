package lab2Jackson;

import java.util.List;

class Person {
	private final String name;
	private final List<String> knownFor;
	private final List<Award> awards;
	
	Person(String name, List<String> knownFor, List<Award> awards) {
		this.name = name;
		this.knownFor = knownFor;
		this.awards = awards;
	};
	
	String getName() {
		return name;
	}
	
	List<String> getKnownFor() {
		return knownFor;
	}
	
	List<Award> getawards() {
		return awards;
	}
	
}
