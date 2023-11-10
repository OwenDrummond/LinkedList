package pack;

public class MyNode<T> {
	public T Data;
	public MyNode<T> NextNode;
	
	public MyNode(T data)
	{
		this.Data = data;
		this.NextNode = null;
	}

}
