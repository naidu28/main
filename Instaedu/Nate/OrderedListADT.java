/* Nayshawn Maddox
 * 
 * Masc1503
 */

import java.util.Iterator;
import java.util.NoSuchElementException;


public interface OrderedListADT<E> extends Iterable<E> {
    public static final int DEFAULT_MAX_CAPACITY = 100;

    

//  Adds the Object obj to the list in the correct position as determined by the Comparable interface.

    public void insert(E obj);
    
    

 

//  Removes the object located at the parameter index position (zero based).

//  Throws IndexOutOfBoundsException if the index does not map to a valid position within the list.

    public E remove(int index);

   

//  Removes and returns the parameter object obj from the list if the list contains it, null otherwise.

    public E remove(E obj);   

 

//  Returns the parameter object located at the parameter index position (zero based).

//  Throws IndexOutOfBoundsException if the index does not map to a valid position within the underlying array

    public E get(int index);

   

//  Returns the parameter object obj from the list if the list contains it, null otherwise.

    public E get(E obj);   

 

//  Returns true if the parameter object obj is in the list, false otherwise.

    public boolean contains(E obj);   

 

//  The list is returned to an empty state.

    public void clear();

 

//  Returns true if the list is empty, otherwise false

    public boolean isEmpty();

 

//  Returns the number of Objects currently in the list.

    public int size();

   

//  Returns an Iterator of the values in the list, presented in

//  the same order as the list.

    public Iterator iterator();

 

}

 