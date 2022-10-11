package set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetPractice {
	public static void main(String[] args) {
//		HashSet<Integer> hs = new HashSet<>();
//		hs.add(10);
//		hs.add(20);
//		hs.add(50);
//		hs.add(10);
//		hs.add(null);
//		System.out.println(hs);
//		Iterator<Integer> i=hs.iterator();  
//        while(i.hasNext())  
//        {  
//           System.out.println(i.next());  
//        }  
//        hs.remove(50);
//        System.out.println(hs);
//        HashSet<Integer> hs1 = new HashSet<>();
//		hs1.add(11);
//		hs1.add(22);
//		hs1.add(55);
//		hs1.addAll(hs);
//		System.out.println(hs1);
		HashSet<Student> hs = new HashSet<>();
		Student s1 = new Student("java",10);
		Student s2 = new Student("mava",20);
		Student s3 = new Student("goa",30);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs);
		Iterator<Student> i=hs.iterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		}  
	}
}