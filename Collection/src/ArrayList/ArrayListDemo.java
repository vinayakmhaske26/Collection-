package ArrayList;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Float> perc=new ArrayList<>();
		
		perc.add(98.0f);
		perc.add(91.0f);
		perc.add(93.0f);
		
		System.out.println(perc);
		
		ArrayList<Float> per = new ArrayList<>();
		
		per.add(67.0f);
		per.add(77.0f);
		per.add(87.0f);
		
		perc.addAll(per); // it adds the two Array Lists togetherly..
		System.out.println(perc);
		
	System.out.println(perc.addAll(3, perc));// Add two lists of specific position
		
	perc.remove(3); // Removes the element at the specified position in this list.
	System.out.println(perc);
	
	perc.set(0, 76.0f); // Replaces the element at the specified position in this list with the specified element.
	System.out.println(perc);
	
	System.out.println(perc.get(0));  //Returns the element at the specified position in this list.
		
	perc.remove(93.0f);  // remove specific element of the list..
	System.out.println(perc);
	
	System.out.println(perc.size());// It gives the number of element in given array list..
	
	System.out.println(perc.containsAll(perc));// it contains all elements are in specific position..
	
	System.out.println(perc.contains(perc));// it contains only one or more than element are in specific position..
	
	perc.ensureCapacity(12); // We can add minimum capacity of Array List
	
    System.out.println(perc.clone());// it is object duplication.
    
    System.out.println(perc.equals(per));//  compares the specific objects and check its equality.. 
    
    System.out.println(perc.indexOf(per));// first occurrence of first object,value not match then return -1.
	
    System.out.println(perc.lastIndexOf(per));//last occurrence of last object,value not match then return -1.
    
    System.out.println(perc.retainAll(perc));// It gives common elements of the objects..
    
    System.out.println(perc.toString());// it gives string representation of this collection..
    
    System.out.println(perc.getClass());// this method is gives the runtime class of this objects..
    
    
    
    System.out.println(perc.removeAll(per));// remove from the list of all element in specific collection.
    
	System.out.println(perc.isEmpty());// Return True if the list are empty..
	
	
	//perc.removeAll(perc);
	//System.out.println(perc);
	
	
	
	}
	

}
