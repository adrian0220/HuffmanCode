import java.util.*;
import java.util.Map.Entry;;

public class MakeTree {
	
	public static Node root;			// 루트 노드
	Map<Character,Integer> charFreq;	// 글자 빈도수
	Queue<Node> HuffmanQueue;			// 빈도수가 적은 순서대로 Queue에 넣기
		
	public MakeTree(Map<Character,Integer> charFreq){
		this.charFreq = charFreq;
		this.root = getTree();
		
	}

	public Node getTree() {
		// Huffman Queue에 노드 입력
		getQueue();
		
		// Queue에서 노드가 비워질 때까지
		while (HuffmanQueue.size() > 1) {
            final Node node1 = HuffmanQueue.remove();
            final Node node2 = HuffmanQueue.remove();
            Node node = new Node('$', node1.getData() + node2.getData(), node1, node2);
            HuffmanQueue.add(node);
        }
		
		return HuffmanQueue.remove();
	}
	
	public void getQueue(){
		
		HuffmanQueue = new PriorityQueue<Node>();
		
		//HuffmanQueue 만들기
		for (Entry<Character, Integer> entry : charFreq.entrySet()) {
			HuffmanQueue.add(new Node(entry.getKey(), entry.getValue(), null, null));
        }
		
		
		
	}
	
}
