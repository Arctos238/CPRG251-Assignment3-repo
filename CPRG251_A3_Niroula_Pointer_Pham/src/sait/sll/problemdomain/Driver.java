package sait.sll.problemdomain;

import sait.sll.utility.SLL;

public class Driver {

	public static void main(String[] args) {
		
		SLL sll = new SLL();
		
		String o5 = "Object 5";
		
		sll.append("Object 1");
		sll.append("Object 2");
		sll.append("Object 3");
		sll.append("Object 4");
		sll.append(o5);
		
		
		sll.print();
		sll.replace("object 3 has been replaced", 4);		
		sll.print();
	}

}
