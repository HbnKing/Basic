package book.thinkingjava.chapter8;

import static net.mindview.util.Print.*;
/**
 * 构造器内部的多态方法行为
 * 
 * 父类构造器 调用的普通方法会被  子类 重写的方法覆盖掉  
 * @author HENC
 *发生
 *  1. 任何事物发生之前  将分配给对象的存储空间初始化为二进制的0
 *  2. 调用基类的构造器  ,此时  调用被覆盖的draw() 方法   ,要在 构造方法之前调用   ,变量radius 
 *		初始值为0;
 *	3.按照声明顺序调用成员初始化方法.
 *	4.调用 导出类的构造器 主体
 *
 *	在构造器内 唯一能够安全的调用 那些 方法是 基类中的 final方法 (private  自动归属于 final)
 *	这些方法不能被覆盖 所以不会出现   这个问题 
 */
public class PloyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RoundGlyph(5);
	}

}
//Glyph  雕刻  
class Glyph{
	void draw() {print("Glyph.draw()");}
	Glyph(){
		print("Glyph() before draw()");
		draw();
		//draw() 会被子类 重写的  方法 覆盖掉      默认值为0
		//RoundGlyph.draw() , radius = 0
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int r){
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = "+radius);
	}
	@Override
	void draw() {
		print("RoundGlyph.draw() , radius = "+radius);
	}
}
