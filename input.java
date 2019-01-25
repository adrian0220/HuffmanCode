import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {

	static String filename = new String();
	
	public Input(String filename){
		Input.filename = filename;
		
	}
	
	public static char[] inputFile() throws IOException { 
	
		String text = "";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		while(true){
			String line = br.readLine();
			if (line==null) break;
			//System.out.println(line);
			text+=line;
		}

		br.close();
		
		char[] fullline = new char[text.length()];
		fullline = text.toCharArray();
		return fullline;
		
	}
	
}
