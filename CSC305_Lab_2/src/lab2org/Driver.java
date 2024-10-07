package lab2org;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

class Driver {
	public static void main(String[] args) {
		String joName = "";
		JSONArray joKnownFor = null;
		JSONArray joAwards = null;
		JSONObject jo;
		
		try {
//		input = read file (input is a map?)
		String js = new String("input3.json"); //get loc of file
		FileReader file = new FileReader(js); // open file as file ob
		JSONTokener token = new JSONTokener(file);
		
		jo = new JSONObject(token);
	
		joName = (String) jo.get("name");
		joKnownFor = (JSONArray) jo.get("knownFor");
		joAwards = (JSONArray) jo.get("awards");
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (JSONException e) {
			System.out.println("Could not find token");
		}
		
		List<Award> awardList = new ArrayList<>();
		for (int i = 0; i < joAwards.length(); i++) {
			try {
				Award a = new Award(joAwards.getJSONObject(i).getString("name"), joAwards.getJSONObject(i).getInt("year"));				
				awardList.add(a);
			} catch (JSONException e) {
				System.out.println("Error Json Awards");
			}
		}
		
		List<String> knownList = new ArrayList<>();
		for (int k = 0; k < joKnownFor.length(); k++) {
			try {
				knownList.add(joKnownFor.getString(k));
			} catch (JSONException e) {
				System.out.println("Not able to create knownFor List");
			}
		}
		
		Person p = new Person(joName, knownList, awardList);
		
		System.out.println(p.getPersonName());
		
		System.out.println("\nKnown For:");
		for (int gk = 0; gk < p.getKnownFor().size(); gk++) {
			System.out.println(p.getKnownFor().get(gk));
		}
		
		System.out.println("\nAwards:");
		for (int a = 0; a < p.getawards().size(); a++) {
			System.out.println(p.getawards().get(a).getAwardName() + ", " + p.getawards().get(a).getAwardYear());
		}
		
	}
}
