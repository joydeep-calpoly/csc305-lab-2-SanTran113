package lab2Jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Person {
	private String name;
	private List<String> knownFor;
	private List<Award> awards;
	
	@JsonCreator
	private Person(@JsonProperty("name") String name, @JsonProperty("knownFor") List<String> knownFor, @JsonProperty("awards") List<Award> awards) {
		this.name = name;
		this.knownFor = knownFor;
		this.awards = awards;
	};
	

	static class  Award {
		private String name;
		private Integer year;
		
		@JsonCreator
		private Award (@JsonProperty("name") String name, @JsonProperty("year") Integer year) {
			this.name = name;
			this.year = year;
		};
		
		String getAwardName() {
			return name;
		}
		
		Integer getAwardYear() {
			return year;
		}
	
	}
	
	
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
