package pack;

public class driver {
	public static void main(String[] args)
	{
		MySinglyLinkedList<String> disciples = new MySinglyLinkedList<>();
		
		disciples.append("Simon");
		disciples.append("Andrew");
		disciples.append("James");
		disciples.append("John");
		disciples.append("Philip");
		disciples.append("Bartholomew");
		disciples.append("Thomas");
		disciples.append("Matthew");
		disciples.append("James");
		disciples.append("Thaddeus");
		disciples.append("Simon the Zealot");
		disciples.append("Judas Iscariot");
		
		disciples.remove("Judas Iscariot");
		
		disciples.sort();
		
		disciples.printReverse();
	}
}
