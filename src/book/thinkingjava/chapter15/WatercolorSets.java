package book.thinkingjava.chapter15;

import java.util.EnumSet;
import java.util.Set;
import static net.mindview.util.Print.*;
import generics.watercolors.Watercolors;
import static net.mindview.util.Sets.*;
import static generics.watercolors.Watercolors.*;

public class WatercolorSets {
 
	public static void main(String [] args ) {
		Set< Watercolors> set1 =
				EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
		Set< Watercolors> set2 = 
				EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
		print("SET1 :" +set1);
		print("SET2 :" +set2);
		print("union(Set1,set2) :" +union(set1,set2));
		Set< Watercolors> subSet =
				intersection(set1 ,set2);
		print("intersection(Set1 ,set2): " + subSet);
		
		print("difference(set1,subset): " +difference(set1,subSet));
		print("complement(set1 ,set2) :" +complement(set1,set2));
		
	}
}
