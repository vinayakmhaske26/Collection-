package Comparable_Comparable_interface;

import java.util.Comparator;
import java.util.TreeSet;

class compairstdNo implements Comparator<Student0>
{

	@Override
	public int compare(Student0 o1, Student0 o2)
	{
		if(o1.stdNo>o2.stdNo)
			return -1;
		else if(o1.stdNo<o2.stdNo)
			return 1;
		else
			return 0;
	}
	}

class comapairname implements Comparator<Student0>
{

	@Override
	public int compare(Student0 o1, Student0 o2) {
		return o1.name.compareTo(o2.name);
	}
}	
	
class compareper implements Comparator<Student0>
{
	@Override
	public int compare(Student0 o1, Student0 o2)
	{

		if(o1.per>o2.per)
			return -1;
		else if(o1.per<o2.per)
			return 1;
		else
			return 0;
	}
	}

public class Student0 {
	
		int stdNo;
		String name;
		float per;
		
		public Student0(int stdNo,String name,float per)
		{
			this.stdNo=stdNo;
			this.name=name;
			this.per=per;
		}
		public String toString()
		{
			return this.stdNo+" "+this.name+" "+this.per;
			
		}
		
		public static void main(String[] args) {
			
			Student0 s1=new Student0(10, "Shubham", 78.0f);
			Student0 s2=new Student0(11, "Ruturaj", 77.0f);
			Student0 s3=new Student0(12, "Vinayak", 76.0f);
			
			compairstdNo a=new compairstdNo();
			TreeSet<Student0> set1=new TreeSet<>();
			set1.add(s3);
			set1.add(s2);
			set1.add(s1);
			
			comapairname b=new comapairname();
			TreeSet<Student0> set2=new TreeSet<>();
			set2.add(s3);
			set2.add(s2);
			set2.add(s1);
			
			compareper c=new compareper();
			TreeSet<Student0> set3=new TreeSet<>();
			set3.add(s3);
			set3.add(s2);
			set3.add(s1);
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			

		
	}

}


