//  java does not have a build in library for reading json fles
//  so a third party library call simple json is use here to help witj the parsing json files
// you can get it from http://www.java2s.com/Code/Jar/j/Downloadjsonsimple11jar.htm
// you can read the the link https://stackoverflow.com/questions/5698900/add-json-package-reference-new-to-java/5698935 to add jar files on eclipse 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadFromjson {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {

		Object obj = new JSONParser().parse(new FileReader("person.json"));

		JSONObject jsonObject = (JSONObject) obj;
		// System.out.println(obj);
		String name = (String) jsonObject.get("name");
		long age = (Long) jsonObject.get("age");
		System.out.println(name);
		System.out.println(age);
		// reading an array from a json file
		JSONArray jsonarray = (JSONArray) jsonObject.get("messages");

		Iterator<String> it = jsonarray.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
