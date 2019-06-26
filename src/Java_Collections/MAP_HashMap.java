package Java_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAP_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> HashMapOfKeyValuePair = new HashMap<Integer, String>();
		HashMapOfKeyValuePair.put(0, "Dhawan");
		HashMapOfKeyValuePair.put(1, "Rohith");
		HashMapOfKeyValuePair.put(2, "Virat");
		HashMapOfKeyValuePair.put(3, "Shankar");
		HashMapOfKeyValuePair.put(4, "Dhoni");
		HashMapOfKeyValuePair.put(5, "Pandya");

		System.out.println(HashMapOfKeyValuePair);

		HashMapOfKeyValuePair.remove(3);

		System.out.println(HashMapOfKeyValuePair);

		System.out.println(HashMapOfKeyValuePair.get(22));

		// Entry set interface/Method is used to convert a hashmap to a hash set for
		// iteration

		Set<Entry<Integer, String>> Setobjs = HashMapOfKeyValuePair.entrySet();

		Iterator itobj = Setobjs.iterator();

		while (itobj.hasNext()) {

			// System.out.println(itobj.next()); // this will retrieve both key valu pair
			// together

			// In order to retrieve either key or value only we male use of Map Entry
			// Interface

			Map.Entry mpobj = (Map.Entry) itobj.next();

			System.out.println(mpobj.getKey());

			System.out.println(mpobj.getValue());

		}

		System.out.println(HashMapOfKeyValuePair.isEmpty());
		
		HashMapOfKeyValuePair.replace(0, "Rahul");
		
		System.out.println(HashMapOfKeyValuePair);
		
	}

}
