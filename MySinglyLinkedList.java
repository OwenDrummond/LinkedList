package pack;

public class MySinglyLinkedList<T extends Comparable<T>> implements List<T>{

	// linked list parameters
	MyNode<T> head;
	MyNode<T> tail;
	int size;
	
	public MySinglyLinkedList()
	{
		this.head = null;
		this.size = 0;
	}
	
	
	@Override
	public void append(T item) {
		MyNode<T> newNode = new MyNode<>(item);
		// We create a new node and if the first spot in the linked list is empty it goes there
		if(head == null)
		{
			head = newNode;
			return;
		}
		  MyNode<T> current = head;
		// We find the spot in the back where it is empty and put the new node there
	        while (current.NextNode != null) {
	            current = current.NextNode;
	        }

	        current.NextNode = newNode;
	}

	@Override
	public void prepend(T item) {
		MyNode<T> newNode = new MyNode<>(item);
        newNode.NextNode = head;
        head = newNode;
	}

	@Override
	public void insertAfter(T previous, T newItem) {
		  MyNode<T> newNode = new MyNode<>(newItem);
	        MyNode<T> current = head;

		// We run through until we find the desired node that our new node will be behind
	        while (current != null) {
	            if (current.Data.equals(previous)) {
	                newNode.NextNode = current.NextNode;
	                current.NextNode = newNode;
	                return;
	            }
	            current = current.NextNode;
	        }
		
	}

	@Override
	public void remove(T item) {
		 if (head == null) {
	            return;
	        }

		// If the head is the item we want to remove, the node behidn head becoems the new head
	        if (head.Data.equals(item)) {
	            head = head.NextNode;
	            return;
	        }

		
	        MyNode<T> current = head;
	        while (current.NextNode != null) {
	            if (current.NextNode.Data.equals(item)) {
	                current.NextNode = current.NextNode.NextNode;
	                return;
	            }
	            current = current.NextNode;
	        }
		
	}

	@Override
	public boolean search(T item) {
		 MyNode<T> current = head;

	        while (current != null) {
	            if (current.Data.equals(item)) {
	                return true;
	            }
	            current = current.NextNode;
	        }
		return false;
	}

	@Override
	public void print() {
		MyNode<T> current = head;

        while (current != null) {
            System.out.print(current.Data + " ");
            current = current.NextNode;
        }
        System.out.println();
		
	}

	@Override
	public void printReverse() {
		 printReverse(head);
	     System.out.println();
		
	}
	
	private void printReverse(MyNode<T> node) {
        if (node == null) {
            return;
        }

        printReverse(node.NextNode);
        System.out.print(node.Data + " ");
    }

	@Override
	public void sort() {
		if (size <= 1) {
            return; // No need to sort if the list is empty or has only one element
        }

        MyNode<T> sorted = null; // Initialize sorted linked list

        MyNode<T> current = head;
        while (current != null) {
            MyNode<T> next = current.NextNode;

            // Insert current node into sorted linked list
            sorted = sortedInsert(sorted, current);
            current = next;
        }

        // Update head to the sorted list
        head = sorted;
	    }
	
	private MyNode<T> sortedInsert(MyNode<T> sorted, MyNode<T> newNode) {
		 if (sorted == null || sorted.Data.compareTo(newNode.Data) >= 0) {
	            newNode.NextNode = sorted;
	            return newNode;
	        } else {
	            MyNode<T> current = sorted;
	            while (current.NextNode != null && current.NextNode.Data.compareTo(newNode.Data) < 0) {
	                current = current.NextNode;
	            }
	            newNode.NextNode = current.NextNode;
	            current.NextNode = newNode;
	            return sorted;
	        }
    }


	@Override
	public boolean isEmpty() {
		 if (head == null)
	        {
	        return true;
	        }
	       
	        return false;
	}

	@Override
	public int getLength() {
		int length = 0;
        MyNode<T> current = head;

        while (current != null) {
            length++;
            current = current.NextNode;
        }

        return length;
	}

	
}
