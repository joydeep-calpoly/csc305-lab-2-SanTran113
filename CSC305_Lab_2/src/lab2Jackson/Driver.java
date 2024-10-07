package lab2Jackson;



import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("input1.json");
		
		
		try {
			Person p = mapper.readValue(file, Person.class);
//			System.out.println(p.getName());
			
		} catch (JsonParseException e) {
			System.out.println("Could not parse Json");
		} catch (JsonMappingException e) {
			System.out.println("Mapping Error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		
	}
}
