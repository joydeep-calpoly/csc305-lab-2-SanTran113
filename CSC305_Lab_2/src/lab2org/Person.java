package lab2org;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileReader;  
import java.io.Reader;
import java.io.FileNotFoundException;  
import java.util.*; 

class Person {
	public static void main(String[] args) {
		try {
//		input = read file (input is a map?)
		String js = new String("../../input1.json"); //get loc of file
		FileReader file = new FileReader(js); // open file as file ob
		JSONTokener token = new JSONTokener(file);
//		String input = new String();
//		while(s.hasNextLine()) {
//			input
//		}
		JSONObject jo = new JSONObject(token);
		JSONArray ja = new JSONArray();
		ja.put(jo);
		
		System.out.println(ja);
//		String input = jo.getJSONObject("input1").getString("");
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (JSONException e) {
			System.out.println("Could not find token");
		}
		
	}
}
