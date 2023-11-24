package Treeset;

import java.util.Comparator;
import java.util.TreeSet;

class reverseorder1 implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		if(o1.length()<o2.length())
			return -1;
		else if(o1.length()>o2.length())
			return 1;
		else
			return o1.compareTo(o2);
	}
	
}


public class String_datatype {

	public static void main(String[] args) {

				TreeSet<String> set=new TreeSet<>(new reverseorder1());
				
				set.add("ABCD");
				set.add("A");
				set.add("BCD");
				set.add("CD");
				set.add("AB");
				set.add("A");
				
				System.out.println(set);
				
			}

		

	}


