package book.thinkingjava.chapter15;

import java.util.ArrayList;
import net.mindview.util.*;

public class TupleList <A , B ,C ,D> extends 
	ArrayList<FourTuple<A,B,C,D>> {
	
	public static void main(String [] args) {
		TupleList<Vehicle ,Amphibian,String,Integer> t1 =
				new TupleList< Vehicle ,Amphibian,String,Integer> ();
		
		t1.add(TupleTest.g());  //这里获取的是  ThreeTuple<Automobile, String, Integer>
		t1.add(TupleTest.g());
		
	}

}
class Vehicle{}
class Amphibian{}