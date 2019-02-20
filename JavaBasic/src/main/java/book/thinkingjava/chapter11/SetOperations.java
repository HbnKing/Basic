package book.thinkingjava.chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.*;

public class SetOperations {

	public static void main(String[] args) {

		Set<String> set1 = new  HashSet<String>();
		Collections.addAll(set1, "A B C D F E R T T S H I J K L ".split(" "));
		set1.add("M");
		print("H " + set1.contains("H"));
		print("M " + set1.contains("M"));
		print(set1.toString());
		Set<String> set2 = new  HashSet<String>();
		Collections.addAll(set2, "H I J K L Q".split(" "));
		print("set2 in set1 " + set1.containsAll(set2));
		set1.remove(set2);
		print("set2 removed from set1 :" +set1.removeAll(set2));
		print(set1.toString());
		Collections.addAll(set1, "X Y Q Z".split(" "));
		print(set1);
	}

}
