package nodes;

public class SLListNode<T> {
	public T data;
	public SLListNode<T> next;
	
	public SLListNode(T data){
		this.data = data;
		this.next = null;
	}
	
}
