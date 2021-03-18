package week3;

public class Node<E> {
	private E item;
	private Node<E> next;
	public Node(E item, Node<E> next) { //생성자
		super(); //생략가능 
		this.item = item;   //item = Newitem 으로 대체가능, 위의 item과 구별시키기 위해서 this를 붙임 
		this.next = next;   //위의 next과 구별시키기 위해서 this를 붙임 
	}
	public E getItem() { return item; }
	public void setItem(E item) { this.item = item; }
	public Node<E> getNext() { return next; }
	public void setNext(Node<E> next) { this.next = next; }

}
