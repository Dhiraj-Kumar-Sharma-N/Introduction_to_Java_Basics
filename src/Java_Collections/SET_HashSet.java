package Java_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class SET_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cannot accept duplicate values
		// HashSet,LinkedHashset,TreeSet Implementing List interface
		// There is no gaurantee on the sequence/ordering of the webelemnts/elements

		HashSet<String> HashSetOfStr = new HashSet<String>();
		HashSetOfStr.add("USA");

		HashSetOfStr.add("CHINA");

		HashSetOfStr.add("RUSSIA");

		HashSetOfStr.add("INDIA");

		System.out.println(HashSetOfStr);

		HashSetOfStr.add("INDIA");

		System.out.println(HashSetOfStr);

		HashSetOfStr.remove("USA");

		System.out.println(HashSetOfStr);

		System.out.println(HashSetOfStr.size());
		System.out.println(HashSetOfStr.isEmpty());
		System.out.println(HashSetOfStr.contains("CHINA"));
		
		HashSetOfStr.add("PAKISTAN");
		
		HashSetOfStr.add("BANGLADESH");
		
		HashSetOfStr.add("AFGHANISTHAN");
		
		HashSetOfStr.add("SRILANKA");
		
// =================================== ITERATOR INTERFACE ===========================================
		System.out.println(HashSetOfStr);
		
		Iterator<String> itrobj = HashSetOfStr.iterator();
		
		for (int i = 0; i < HashSetOfStr.size(); i++) {
			
			/*if (itrobj.hasNext() == true) {
				
				System.out.println(itrobj.next());
			}*/
			
			while(itrobj.hasNext() == true) {
				
				System.out.println(itrobj.next());
			}
		}
		
		
	}

}
