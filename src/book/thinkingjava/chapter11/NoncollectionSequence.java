package book.thinkingjava.chapter11;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

/**
 * 获取迭代器对象的 方式
 * 
 * @author HENC
 *
 */
class PetSequence{
	protected Pet[] pets = Pets.createArray(8);
}
public class NoncollectionSequence extends PetSequence{

	/**
	 * 一种 简单的获取迭代器的方法
	 * 重写该实现方法
	 * @return
	 */
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < pets.length;
			}

			@Override
			public Pet next() {
				// TODO Auto-generated method stub
				return pets[index++];
			}
			public void remove() {
			}
		};
	}
	public static void main(String [] args) {
		NoncollectionSequence nc = new NoncollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
		new String();
	}
}
