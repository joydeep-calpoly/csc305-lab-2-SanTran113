package lab2Jackson;



import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Driver {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("input1.json");
		
			try {
				Person p = mapper.readValue(file, Person.class);
				System.out.println(p.getName());

				System.out.println("\nKnown For:");
				for (int gk = 0; gk < p.getKnownFor().size(); gk++) {
					System.out.println(p.getKnownFor().get(gk));
				}
				
				System.out.println("\nAwards:");
				for (int a = 0; a < p.getawards().size(); a++) {
					System.out.println(p.getawards().get(a).getAwardName() + ", " + p.getawards().get(a).getAwardYear());
				}
				
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
}
