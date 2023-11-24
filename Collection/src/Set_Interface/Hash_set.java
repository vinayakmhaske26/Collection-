package Set_Interface;

import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {


		HashSet<Integer> s=new HashSet<>();
		
		HashSet<Integer> s1=new HashSet<>(s);
		
		HashSet<Integer> s2=new HashSet<>(10);
		
		HashSet<Integer> s3=new HashSet<>(10,0.50f);
		
		s.add(1);
		s.add(23);
		s.add(33);
		s.add(60);
		s.add(10);
		
		System.out.println(s); // Insertion order are not maintained...
		
		System.out.println(s.hashCode());
		
		
	}
	

}
