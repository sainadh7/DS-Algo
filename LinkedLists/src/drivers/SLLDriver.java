package drivers;

import implementations.SinglyLinkedList;

public class SLLDriver {

	public static void main(String[] args) {
		
		SinglyLinkedList<Character> linkedList = new SinglyLinkedList<>('A');
		
		linkedList.insert('B', 1);
		linkedList.insert('C', 2);
		linkedList.insert('D', 3);
		linkedList.insert('E', 4);
		//linkedList.insert('C', 7); //Throws Exception
		
		linkedList.traverse();
		
		
		linkedList.delete(4);
		
		System.out.println("Size: " + linkedList.size());
		linkedList.traverse();
		
		linkedList.delete();
		
		System.out.println("Size: " + linkedList.size());
		linkedList.traverse();
	}

}
