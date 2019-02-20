package book.thinkingjava.chapter10;

import java.book.thinkingjava.chapter10.Contorller;
import java.book.thinkingjava.chapter10.Event;

public class GreenHouseContorls extends Contorller {

	private boolean light =false;
	public class LightOn extends java.book.thinkingjava.chapter10.Event {

		public LightOn(long time) {
			super(time);
		}

		@Override
		public void action() {
			light =true;
		}
		public String toString() {
			return "ligth is on";
		}	
		
	}
	
	public class LightOff extends java.book.thinkingjava.chapter10.Event {
		public LightOff(long time) {
			super(time);
		}

		@Override
		public void action() {
			light =false;
		}
		public String toString() {
			return "ligth is off";
		}
	}
	private boolean water = false;
	public class WaterOn extends java.book.thinkingjava.chapter10.Event {

		public WaterOn(long time) {
			super(time);
		}

		@Override
		public void action() {
			water = true;
		}
		public String toString() {
			return "GREENhOUSE WATER IS ON";
		}
		
	}
	public class WaterOff extends java.book.thinkingjava.chapter10.Event {

		public WaterOff(long time) {
			super(time);
		}

		@Override
		public void action() {
			water =false;
		}
		public String toString() {
			return "GREENhOUSE WATER IS Off";
		}
	}
	private String thermostat = "Day";
	public class ThermostatNight extends java.book.thinkingjava.chapter10.Event {

		public ThermostatNight(long time) {
			super(time);
		}

		@Override
		public void action() {
			thermostat = "Night";
		}
		public String toString() {
			return "thermostat on Night setting";
		}
	}
	public class ThermostatDay extends java.book.thinkingjava.chapter10.Event {

		public ThermostatDay(long time) {
			super(time);
		}

		@Override
		public void action() {
			thermostat = "day";
		}
		public String toString() {
			return "thermostat on day setting";
		}
	}
	
	
	//-------------------------
	//an example of an action()
	
	public class Bell extends java.book.thinkingjava.chapter10.Event {

		public Bell(long time) {
			super(time);
		}

		@Override
		public void action() {
			//  bell  本類運行完畢之後 還可以在運行    再添加一個新對象
			addEvent(new Bell(delayTime));
		}
		public String toString() {
			return "Bing !";
		}
	}
	
	public class Restart extends java.book.thinkingjava.chapter10.Event {
		//本类的属性里 有父类的 数组
		private java.book.thinkingjava.chapter10.Event[] eventList;
		public Restart(long time , java.book.thinkingjava.chapter10.Event[] eventList) {
			//调用父类必须在首行
			super(time);
			this.eventList = eventList;
			for(java.book.thinkingjava.chapter10.Event e: eventList)
			//Greenhouse 的  父类 contorls 的方法
			addEvent(e);
		}
		@Override
		public void action() {
			for(java.book.thinkingjava.chapter10.Event e: eventList) {
				e.start(); //event []  父类对象的start()   //rerun each event
				addEvent(e);
			}
			start(); //本类对象的start();   //rerun this event
			// jiang  
			addEvent(this);
		}
		public String toString() {
			return "Restarting System";
		}
	}
	
	/**
	 * 关机
	 * @author HENC
	 *
	 */
	public static class Terminate extends Event {

		public Terminate(long time) {
			super(time);
		}

		@Override
		public void action() {
			//退出系统
			System.exit(0);
		}
		public String toString(){
			return "Terminate";
		}
		
	}
	
	public static void main(String[] args) {

	}

}
