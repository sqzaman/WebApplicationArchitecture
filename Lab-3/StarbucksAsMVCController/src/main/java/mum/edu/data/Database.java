package mum.edu.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import mum.edu.domain.User;

@Component
public class Database {
	public HashMap<String, User> users = new HashMap<String, User>();
	public HashMap<String, List<String>> advice = new HashMap<String, List<String>>();
	 {
		users.put("Zaman", new User("Zaman","111"));
		users.put("Abul", new User("Abul","222"));
		users.put("Kuddus", new User("Kuddus","333"));
		ArrayList<String> darkList = new ArrayList<String>();
		darkList.add("Inidan");
		darkList.add("Cinese");
		darkList.add("FFC");
		advice.put("dark", darkList);
		ArrayList<String> medList = new ArrayList<String>();
		medList.add("Breakfast Blend");
		medList.add("Colombia");
		medList.add("Yukon");
		medList.add("Pike Place");
		medList.add("House Blend");
		advice.put("medium", medList);
		ArrayList<String> lightList = new ArrayList<String>();
		lightList.add("Willow");
		lightList.add("Aria");
		lightList.add("Bright Sky");
		lightList.add("Veranda");
		advice.put("light", lightList);
	}
	
		public Map<Integer, String> roasts =  new HashMap<Integer, String>() {
            {
                put(1, "dark");
                put(2, "medium");
                put(3, "light");
             }
        };
		

 
}
