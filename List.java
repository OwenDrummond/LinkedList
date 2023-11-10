package pack;
public interface List<T> {
	void append(T item);
	void prepend(T item);
	void insertAfter(T previous, T newItem);
	void remove(T item);
	boolean search(T item);
	void print();
	void printReverse();
	void sort();
	boolean isEmpty();
	int getLength();
}
