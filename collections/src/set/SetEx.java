package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		TreeSet<String> ts = new TreeSet<>();
		HashSet<String> hs = new HashSet<>();
		for(String str:Arrays.asList("two","one","three","one"))
		{
			lhs.add(str);
			ts.add(str);
			hs.add(str);
		}
		System.out.println("After Insertion HashSet: "+hs);
		System.out.println("After Insertion LinkedHashSet: "+lhs);
		System.out.println("After Insertion TreeSet: "+ts);
		
	
	}
}