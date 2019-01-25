import java.util.HashMap;
import java.util.Map;

public class makeCharFrequency {

	public static char[] text;
	public static Map<Character, Integer> charFreq;	// 각 문자의 빈도수
	
	public makeCharFrequency(char[] fulltext) {
		// TODO Auto-generated constructor stub
		this.text = fulltext;
		charFreq = getCharFrequency(text);
		
	}
	
	public static Map<Character, Integer> getCharFrequency(char[] text){
		
		if (text == null) {
            throw new NullPointerException("Null Text Error.");
        }
        if (text.length == 0) {
            throw new IllegalArgumentException("Text size is Zero");
        }
		
		final Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length; i++) {
            char ch = text[i];
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int val = map.get(ch);
                map.put(ch, ++val);
            }
        }

        return map;
		
	}

}
