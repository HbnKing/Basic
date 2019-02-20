package book.thinkingjava.chapter11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typeinfo.pets.Cymric;
import typeinfo.pets.Mutt;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;


/**
 * 11.10
 * map 中包含map  或者list
 * map 可以返回它的键的set
 * 它的值得collection
 * @author HENC
 *
 */
public class MapOfList {
	public static Map<Person,List<? extends Pet>> 
		petPeople = new  HashMap<>();
	static {
		petPeople.put(new Person("Dawn"), 
				Arrays.asList(new Cymric("molly"),new Mutt("Spot") ));
	}

}
