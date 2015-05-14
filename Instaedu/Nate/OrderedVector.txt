package data_structures;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class OrderedVector<E> implements OrderedListADT<E>,Comparable<OrderedVector>{
  
	private int size; //`length` is the length of the underlying array, `size` is the length of the vector
    private E[] storage;
	
	  public OrderedVector(){
	    storage = (E[]) new Object[DEFAULT_MAX_CAPACITY];
	    size = 0;
	  }

//  Adds the Object obj to the list in the correct position as determined by the Comparable interface.
//  Vector is sorted in increasing order
    public void insert(E obj){
            
        //adding element obj to array 
    	if(size == storage.length) {
    		resize();
    	}
    	
    	int address = 0;
    	int start = 0;
    	int end = size;
    	boolean shouldContinue = true;
    	
    	if (size > 0 && obj != null)
    	{
    	    address = (size - 1) / 2;
    	    while (shouldContinue)
    	    {
                if(((Comparable<E>) storage[address]).compareTo(obj) > 0)
                {
                    end = address;
                    address = address / 2;
                }
                else if (((Comparable<E>) storage[address]).compareTo(obj) < 0)
                {
                    start = address;
                    if (address == (address + size - 1)/2)
                        address = address + 1;
                    else
                        address = (address + size - 1)/ 2; //average of address and size
                }
                else
                {
                    shouldContinue = false;
                }
            
                if (Math.abs(end - start) == 1)
                {
                    shouldContinue = false;
                }
    	    }
    	} else
    	    storage[0] = obj;
    	
    	size++;
    	if(size == storage.length) {
    		resize();
    	}
    	
    	for (int x = size; x > address; x--)
    	{
    	    storage[size] = storage[size-1];
    	}
    	storage[address] = obj;
    	
        //sort(storage);
    }
    	        //else {throw new RuntimeException("Inefficient space");}

    
//  Removes the object located at the parameter index position (zero based).
//  Throws IndexOutOfBoundsException if the index does not map to a valid position within the list.
    public E remove(int index){
    	if(index >= size) {
    		throw new IndexOutOfBoundsException("Index  is out of bounds");
    	}
    	E[] copy = (E[]) new Object[storage.length];
    	E removed = storage[index];
    	for(int i = 0; i < index; i++) {
    		copy[i] = storage[i];
    	}
        for (int i=size - 1; i >= index ; i--){
        	copy[i] = storage[i+1];
        }
        storage = copy;
        size--;
        return removed;
    }

//  Removes and returns the parameter object obj from the list if the list contains it, null otherwise.
    public E remove(E obj){  
    	for (int i = 0; i < storage.length; i++){
    			E[] copy = (E[]) new Object[storage.length];
                if (storage[i] == obj)
                {
                	
                    for(int j = i; j < storage.length -1; j++) {
                    	copy[i] = storage[i+1];
                    }
                    storage = copy;
                    size--;
                    return obj;
                } else {
                	copy[i] = storage[i];
                }
            }


            return null;
            }

//  Returns the parameter object located at the parameter index position (zero based).
//  Throws IndexOutOfBoundsException if the index does not map to a valid position within the underlying array
    public E get(int index){
    	return storage[index];
    }

//  Returns the parameter object obj from the list if the list contains it, null otherwise.
    public E get(E obj){
            for (final E e : storage){
                if (e == obj || obj != null && obj.equals(e))
                    

            return null;}
			return obj;
    }

//  Returns true if the parameter object obj is in the list, false otherwise.
    public boolean contains(E obj){
    for (int i=0; i<size; i++) 
    	if( ((Comparable<E>) obj).compareTo(storage[i])==0)
    	return true;
    	return false;	
    }

//  The list is returned to an empty state.
    public void clear(){
    	E[] blank = (E[]) new Object[DEFAULT_MAX_CAPACITY];
        storage=blank;
    }
//  Returns true if the list is empty, otherwise false
    public boolean isEmpty(){
    return size == 0;
    }

//  Returns the number of Objects currently in the list.
    public int size(){
    	return size;
    }

//  Returns an Iterator of the values in the list, presented in
//  the same order as the list.
    public Iterator<E> iterator(){
            return new IteratorHelper();
            }
    public <E extends Comparable<? super E>> void sort(E[] storage){
        int c,d;
        int n=storage.length;
        E swap;

        for (c = 0; c < ( n - 1 ); c++) {
            for (d = 0; d < n - c - 1; d++){
                if(storage[d].compareTo(storage[d+1])== 1){
                    swap       = storage[d];
                    storage[d]   = storage[d+1];
                    storage[d+1] = swap;
                }

            }
        }
    }
    
    private void resize() {
        E[] newStorage = (E[]) new Object[2 * storage.length];
        for(int i =0; i< storage.length;i++){
            newStorage[i] = storage[i];
        }
        storage = newStorage;

      }
    
//    //@Override
//    public int compareTo(OrderedVector<E> o) {
//        OrderedVector<E> j = o;
//        if (j < o) {
//            return -1;
//        } else if (this.i == j) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }    
    
    class IteratorHelper implements Iterator<E> {
        int iterIndex;
        
        public IteratorHelper() {
            iterIndex = 0;
            }
            
        public boolean hasNext() {
            return iterIndex < size;
            }
            
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return storage[iterIndex++];
            }
            
        public void remove() {
            throw new UnsupportedOperationException();
            }
        }

@Override
public int compareTo(OrderedVector arg0) {
	if(arg0.size() < this.size()) {
		return 1;
	} else if (arg0.size() > this.size()) {
		return -1;
	} else {
		for(int i = 0; i < this.size(); i++) {
			if(!arg0.get(i).equals(this.get(i))) {
				return 1;
			}
		}
	}
	return 0;
}
    }
