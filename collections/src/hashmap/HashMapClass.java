package hashmap;

import java.util.HashMap;

import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(1, "java");
		hm.put(2,30);
		hm.put("hii","c++");
		System.out.println(hm.get(2));
		System.out.println(hm.get("hii"));
		System.out.println(hm.get(13));
		System.out.println(hm.containsKey(1));
		System.out.println(hm.get("hii"));
		System.out.println(hm.containsValue("c++"));
		System.out.println(hm.keySet());
		Set s = hm.keySet();  // 1 2 hii
		for(Object key : s){
			System.out.println(key+"---->"+hm.get(key));
		}	
	}
}