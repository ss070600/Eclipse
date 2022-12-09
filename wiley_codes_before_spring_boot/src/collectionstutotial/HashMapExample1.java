package collectionstutotial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(3, "sandeep");
		hashMap.put(2, "akhand");
		hashMap.put(4, "akshay");
		hashMap.put(5, "adhiraj");
		hashMap.put(1, "rudra");

		System.out.println(hashMap);
		hashMap.put(1, "abhayraj");
		System.out.println(hashMap);
		hashMap.putIfAbsent(1, "shiva");
		System.out.println(hashMap);
		System.out.println("Is empty : " + hashMap.isEmpty());
		System.out.println("size : " + hashMap.size());
		System.out.println("containes key : " + hashMap.containsKey(5));
		System.out.println("output if we try to access the key which doesn't exixts : " + hashMap.get(15));
		System.out.println("check if a value 'sandeep' exists or not :  " + hashMap.containsValue("sandeep"));

		// traversing map
		System.out.println("traversing map using Map.Entry ---");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println(
				"deleting a key value pair with remove method that doesn't exists : " + hashMap.remove(1, "sandeep"));
		System.out
				.println("deleting a key value pair with remove method that exists : " + hashMap.remove(1, "abhayraj"));
		Set<Map.Entry<Integer, String>> entrysets = hashMap.entrySet();
		System.out.println("Set<Map.Entry<Integer,String>> entrysets = hashMap.entrySet() : " + entrysets);

		Set<Integer> keysets = hashMap.keySet();
		System.out.println("Set<Integer> keysets = hashMap.keySet() : " + keysets);

		Collection<String> valuesets = hashMap.values();
		System.out.println("Collection<String> valuesets = hashMap.values() : " + valuesets);

		// System.out.println(new ArrayList((ArrayList)hashMap.values().getClass()));
		System.out.println("forEach : ");
		hashMap.forEach((id, value) -> {
			System.out.println(id + "  " + value);
		});

		System.out.println("forEach using entrySety() : ");
		hashMap.entrySet().forEach((entry) -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});

		System.out.println("Using iterator to iterate over map : ");
		Set entrySet = hashMap.entrySet();
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) itr.next();
			System.out.println("Key is: " + me.getKey() + " & " + " value is: " + me.getValue());
		}

		System.out.println("foreach with keySet : ");
		hashMap.keySet().forEach((keys) -> {
			System.out.println(keys);
		});
	}

}
