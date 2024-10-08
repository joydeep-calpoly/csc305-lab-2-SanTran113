package lab2org;

class Award {
	private String name;
	private Integer year;
	
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
