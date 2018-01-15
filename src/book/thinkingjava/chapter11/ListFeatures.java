package book.thinkingjava.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Hamster;
import typeinfo.pets.*;
import static net.mindview.util.Print.*;

/**
 * 11.5 List
 * @author HENC
 *
 */
public class ListFeatures {

	public static void main(String[] args) {

		Random rand = new Random();
		int i = rand.nextInt(100);
		List<Pet> pets = Pets.arrayList(7);
		print("1" +pets);
		//Hamster	Rodent	Pet
		Hamster h = new Hamster();
		pets.add(h);
		print("2" +pets);
		print("3" +pets.contains(h));
		pets.remove(h);
		Pet p = pets.get(2);
		print("4"  +p +"	"+pets.indexOf(p));
		Pet cymric = new Cymric();
		print("5"  +"	"+pets.indexOf(cymric));
		print("6"   +"	"+pets.remove(cymric));
		print("7"  +pets.remove(p));
		print("8"  +pets);
		
		pets.add(3, new Mouse());
		print("9" +pets);
		
		List<Pet> sub = pets.subList(1, 4);
		print("sublist" +sub);
		print("10" + pets.contains(sub));
		Collections.sort(sub);
		//字典序排序
		print("SORT sublist" +sub);
		
		print("11	" + pets.contains(sub));
		Collections.shuffle(sub,rand);
		print ("shuffle sublist" + sub);
		//随机混洗  shuffle 
		print("12	" + pets.containsAll(sub));
		//混洗之后变成了 true 
		List<Pet> copy =new ArrayList<Pet>(pets);
		sub = Arrays.asList(pets.get(1) ,pets.get(4));
		print ("sub" +sub);
		
		copy.retainAll(sub);
		print("13" +copy);
		copy = new ArrayList<Pet>(pets);
		copy.remove(2);
		print("14" + copy);
		copy.removeAll(sub);
		print("15" + copy);
		copy.set(1, new Mouse());
		
		print ("16" +copy);
		copy.addAll(2,sub);
		
		print ("17" +copy);
		
		print ("18" +pets.isEmpty());
		pets.clear();
		print ("19" +pets);
		print ("20" +pets.isEmpty());
		pets.addAll(Pets.arrayList(4));
		print("21" +pets);
		Object [] o = pets.toArray();
		print("22 " +o[3]);
		
		Pet[] pa  = pets.toArray(new Pet[0]);
		print("23" +pa[3].id());
		print("23" +pa[0].id());
		
	}

}
