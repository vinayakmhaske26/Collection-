package Vector_Ass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class student_list {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First student details");
		
		student s1=new student();
		s1.setName(sc.next());
		s1.setPer(sc.nextFloat());
		s1.setRollno(sc.nextInt());
		
		System.out.println("Enter the Second student details");
		student s2=new student();
		s2.setName(sc.next());
		s2.setPer(sc.nextFloat());
		s2.setRollno(sc.nextInt());
		
		System.out.println("Enter the Third student details");
		student s3=new student();
		s3.setName(sc.next());
		s3.setPer(sc.nextFloat());
		s3.setRollno(sc.nextInt());
		
		ArrayList<student> student_list=new ArrayList<>();
		
		student_list.add(s1);
		student_list.add(s2);
		student_list.add(s3);
		
		
		ListIterator itr=student_list.listIterator();
		
		while(itr.hasNext())
		{
			
			student s=(student) itr.next();
			System.out.println(s.getName()+"  ");
			System.out.println(s.getRollno()+"  ");
			System.out.println(s.getPer()+"\n");
			
			if(s.getPer()<=35.00)
			{
					itr.remove();
			}
		}
		
		System.out.println("The passed student list is :");
	    //System.out.println(student_list);
		Iterator<student> itr2=student_list.iterator();
		while(itr2.hasNext())
		{
			student s=itr2.next();
			System.out.println(s.getName()+"  "+s.getRollno()+"  "+s.getPer());
		}
		
		
	}

}
