import java.util.HashMap;


public class ShortURL {
	String key="";
	String reply;
	int i = 48;
	HashMap map = new HashMap<String, String>(62);
	
	public String set(String shortURL) {
		if (i >=48 && i < 58) {
			key = Character.toString((char)i);
			map.put(key, shortURL);
			i++;
			
			if(i == 58)
				i = 65;
			
			return key;
		}
		else if(i >= 65 && i < 91) {
			key = Character.toString((char)i);
			map.put(key, shortURL);
			i++;
			
			if(i == 91)
				i = 97;
			
			return key;
		}
		else if(i >= 97 && i < 123) {
			key = Character.toString((char)i);
			map.put(key, shortURL);
			i++;
			
			return key;
		}
		else
			return "Map is full";
		
	}
	
	public String get(String shortURL) {
			
		if (!shortURL.isEmpty()) {
			if (shortURL.matches("[A-za-z0-9]"))
				reply = map.get(shortURL).toString();
			
			else
				reply = "Enter a single-digit alphanumeric key";
		}
		
		else
			reply = "Key should not be empty";
		
		return reply;
	}
}
