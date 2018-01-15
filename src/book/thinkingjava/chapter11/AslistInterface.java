package book.thinkingjava.chapter11;

import java.util.*;

/**
 * 11.3
 * Arrays.asList()  方法 应该注意初始化类型
 * 必要时 显式转换类型
 * @author HENC
 *
 */

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AslistInterface{
	public static void main(String[] args){
	List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(),new Powder());
	List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
	List<Snow> snow3 = new  ArrayList<Snow>();
	
	Collections.addAll(snow3,new Light(),new Heavy());
	//显式类型参数说明
	List<Snow> snow4  = Arrays.<Snow>asList(new Light(), new Heavy());
	
	}



}
