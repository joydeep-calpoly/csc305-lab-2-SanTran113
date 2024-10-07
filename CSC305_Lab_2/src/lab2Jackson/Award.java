package lab2Jackson;

class Award {
	private final String name;
	private final Integer year;
	
	Award (String name, Integer year) {
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
