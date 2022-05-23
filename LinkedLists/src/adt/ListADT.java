package adt;

public interface ListADT<T> {
	
	//Insert at a position
	void insert(T data, int position);
	
	//Delete entry at a position
	void delete(int position);
	
	//Delete all entries matching a data value
	void delete(T data);
	
	//Delete Linked List
	void delete();
	
	//Traverse and print all elements
	void traverse();
	
	//Return size of list
	int size();
}
