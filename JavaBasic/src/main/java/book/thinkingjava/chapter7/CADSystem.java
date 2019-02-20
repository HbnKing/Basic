package book.thinkingjava.chapter7;

import static net.mindview.util.Print.*;
/**
 * 继承  调用父类的方法 
 * 最好写自己的清理方法   但不要使用finalize()
 * @author HENC
 *
 */
public class CADSystem extends Shape {

	private Circle c;
	private Triangle t;
	private Line[]  lines = new Line[3];
	public CADSystem(int i) {
		super(i+1);
		for(int j = 0; j<lines.length;j++)
			lines[j] = new Line(j,j+1);
		c=new Circle(1);
		t = new Triangle(1);
		print("Combined  constructor");
	}
	public void dispose() {
		print("CAD System dispose()");
		c.dispose();
		t.dispose();
		for(int j = 0; j<lines.length;j++)
			lines[j].dispose();;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CADSystem x = new CADSystem(11);
		try {
			print("**********");
		}finally{
			x.dispose();
		}
		
	}

}

class Shape{
	Shape(int i){
		print("Shape Constructor");
	}
	void dispose() {
		print("Shape dispose");
	}
}
class Circle extends Shape{

	Circle(int i) {
		super(i);
		print("Drawing Circle");
	}
	void dispose() {
		print("dispose Circle");
		super.dispose();
	}
}

class Triangle extends Shape{

	Triangle(int i) {
		super(i);
		print("Drawing Triangle");
	}
	void dispose() {
		print("dispose Triangle");
		super.dispose();
	}
}
class Line extends Shape{
	private int start ,end;
	Line(int start,int end){
		super(start);
		this.start= start;
		this.end =end;
		print("Drawing Line :" + start + ", " +end);
		
	}
	void dispose() {
		print("dispose Line :" + start + ", " +end);
		super.dispose();
	}
}

