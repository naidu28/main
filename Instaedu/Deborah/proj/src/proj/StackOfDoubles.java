package proj;

public class StackOfDoubles {
	/* A stack allows you to store elements by pushing items on the stack of elements
	 * and retrieve and remove items by popping them off of the top of the stack
	 */
	
	// create own stack, but instead of ints, store doubles
	// it should have mostly the same methods as what's in the book... (one additional method, toString)
	
	public double[] elements = new double[8];
	private int size;

	
	public String toString() {
		// returns a String representation of the stack
		// use StringBuilder or StringBuffer to implement toString() method
		// the toString representation should be:
		// [element1] [element2] [element3]
		// 3.0 2.0 74.0
		
		if (empty()) {
		    return "";
		}
		else {
    		StringBuilder stackString = new StringBuilder();
    		for (int i = 0; i < elements.length; i++) {
    			stackString.append(elements[i]);
    			stackString.append(" ");
    		}
    		
    		return stackString.toString();
		}
	}
	
	public boolean empty() {
		// returns a boolean that describes whether or not the stack is empty
		return size == 0;
	}
	
	public double peek() {
		// returns a double... allows you to view the double at the top of the stack
		// without removing it
		return elements[size - 1];
	}
	
	public void push(double num) {
		// doesn't return a value... however, adds a double to the top of the stack
		if (size >= elements.length) {
			double[] temp = new double[elements.length *2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			this.elements = temp;
		}
		
		this.elements[size++] = num;
	}
	public double pop() {
		// removes the top element (that is, the most recently added) element from the 
		// top of the stack... and returns it as a double
		return elements[--size];
	}
}