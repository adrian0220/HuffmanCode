import java.io.IOException;
import java.util.*;

public class Solution {
	
	public static char[] Fulltext = new char[100000];
	public static Map<Character,String> HuffmanCode;
	//public static Queue<HuffmanMap> Huffman queue;
	
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		 
		// 파일명으로 파일 입출력
		Input input = new Input("src/word.txt");
		
		// 텍스트 불러오기
		try {
			Fulltext = input.inputFile();
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Fulltext);
		
		// 문자 별 빈도수 구하기
		makeCharFrequency charFrequency = new makeCharFrequency(Fulltext);
	
		// 트리 만들기
		MakeTree makeTree = new MakeTree(charFrequency.charFreq); 
		
		// Encoding
		Encoding encoding = new Encoding(makeTree.root);
		HuffmanCode = encoding.HuffmanCode;
		
		// 문자열 입력하면 코딩 출력
		Scanner sc = new Scanner(System.in);
		
		// 검색하고 싶은 문자 입력
		while(true){
			
			System.out.println("Please press key");
			String temp = sc.nextLine();
			
			char[] charArray = temp.toCharArray();
			String HuffmanMessage = "";
			for(int i=0;i<charArray.length;i++){
				HuffmanMessage += HuffmanCode.get(charArray[i]);
			}
			System.out.println(HuffmanMessage);
			
		}
	 }

}
