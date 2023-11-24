package Comparable_Comparable_interface;

import java.util.TreeSet;

public class Student implements Comparable<Student> {

		int stdNo;
		String name;
		float per;
		
		public Student(int stdNo,String name,float per)
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
			
			Student s1=new Student(11,"Shubham",78.80f);
			Student s2=new Student(12,"Ruturaj",77.80f);
			Student s3=new Student(13,"Vinayak",79.80f);
			Student s4=new Student(14,"Indra",76.80f);
			Student s5=new Student(15,"Rhishi",77.80f);
			
			TreeSet<Student> stud=new TreeSet<>();
			
			stud.add(s1);
			stud.add(s2);
			stud.add(s3);
			stud.add(s4);
			stud.add(s5);
	}

		public int compareTo(Student o) {
			
			
			if(per<o.per)
				return -1;
			else if(per>1)
				return 1;
			else
				return 0;
		}

}
