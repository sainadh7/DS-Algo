package implementations;

import adt.ListADT;
import nodes.SLListNode;

public class SinglyLinkedList<T> implements ListADT<T> {
	
	//LinkedList Head declaration
	SLListNode<T> head;
	
	//Constructors
	public SinglyLinkedList() {}
	public SinglyLinkedList(T data) {
		this.head = new SLListNode<T>(data);
	}
	
	
	//ADT Implementation
	@Override
	public void insert(T data, int position) {
		
		int length = this.size();
		if(position <1 || position > length || (this.head == null && position > 1)) {
			throw new IllegalArgumentException("Invalid position");
		}
		
		
		SLListNode<T> newNode = new SLListNode<T>(data);
		if(position == 1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			int currentPosition = 1;
			SLListNode<T> positionNode = head, previousNode = null;
			
			while(positionNode != null && currentPosition <position) {
				previousNode = positionNode;
				positionNode = positionNode.next;
				
				currentPosition++;
			}
			newNode.next = positionNode;
			previousNode.next = newNode;
		}
		
	}
	@Override
	public void delete(int position) {
		
		int length = this.size();
		if(position <1 || position > length || (this.head == null && position > 1)) {
			throw new IllegalArgumentException("Invalid position");
		}
		
		if(position == 1) {
			head = head.next;
		}
		else {
			int currentPosition = 1;
			SLListNode<T> positionNode = head, previousNode = null;
			
			while(positionNode != null && currentPosition < position) {
				previousNode = positionNode;
				positionNode = positionNode.next;
				
				currentPosition++;
			}
			previousNode.next = positionNode.next;
		}
		
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		this.head = null;
	}
	
	@Override
	public void traverse() {
		SLListNode<T> pointerNode = this.head;
		
		System.out.println("Linked List is: ");
		
		while(pointerNode != null) {
			System.out.print("->" + pointerNode.data);
			pointerNode = pointerNode.next;
		}
		
		System.out.println();
		
	}
	
	@Override
	public int size() {
		int size = 0;
		
		SLListNode<T> pointerNode = this.head;
		while(pointerNode != null) {
			size++;
			pointerNode = pointerNode.next;
		}
		
		return size;
	}
	
	
	
	
}
