import java.util.*;

public class Encoding {

	static Map<Character, String> HuffmanCode;	// 허프만 부호
	
	public Encoding(Node root){
		HuffmanCode = new HashMap<Character,String>();
		generateCodes(root, "");
	}

	public static void generateCodes(Node node, String string){
		if(node.left == null && node.right ==  null){	// 자식노드라면 코딩 완료
			HuffmanCode.put(node.word, string);
			return;
		}
		
		generateCodes(node.left, string + '0');
		generateCodes(node.right, string + '1');
	}
		
}
