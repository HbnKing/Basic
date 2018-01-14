package book.thinkingjava.chapter10;

/**
 * 有判断条件的  作用域   
 * @author HENC
 * trackingslip 类被嵌入 在  if 语句的作用域 内 
 *
 */
public class Parcel6 {
	
	private void internalTracking(boolean b){
		if(b) {
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s ;
				}
				String getSlip() { return id ;}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			
		}
		//can't use it here  out of scope;
		//!TrackingSlip ts = new TrackingSlip("slip");
		
	}

	public void track() {internalTracking(true);}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel6 p = new  Parcel6();
		p.track();
	}

}
