package week6optExp;

public class StackNode {
	char data;
	StackNode link;
}
class LinkedStack{
	private StackNode top;
	
	public boolean isEmty() {
			return (top == null);
	}
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty");
			return 0;
		}else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
}
