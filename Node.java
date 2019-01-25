class Node implements Comparable<Node>{
	// 데이터 선언
	public int data;
	public char word;
	public Node left;
	public Node right;
	
	// Constructor
	public Node(char word, int data, Node right, Node left){
		this.setData(data);
		this.setWord(word);
		setRight(right);
		setLeft(left);
	}

	// getter, setter
	public int getData() {return data;}
	public void setData(int data) {this.data = data;}
	public char getWord() {return word;}
	public void setWord(char word) {this.word = word;}
	public Node getLeft() {return left;}
	public void setLeft(Node left) {this.left = left;}
	public Node getRight() {return right;}
	public void setRight(Node right) {this.right = right;}

	@Override
	public int compareTo(Node target) {
		// TODO Auto-generated method stub
		
		// 내림차순 정리
		return this.data <= target.data ? 1 : - 1;
		
		
	}
}
