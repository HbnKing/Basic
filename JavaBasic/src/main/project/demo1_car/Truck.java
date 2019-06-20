package demo1_car;

public class Truck extends CarStore {

	public Truck(){
		//如果什么都没有,给他一个默认值
		float  load = 0.0f;  //载重量
		String name = "卡车"; //车的名字
		Double rent = 0.0; //出的租金
		
		this.setRent(rent);
		this.setLoad(load);
		this.setName(name);
	}
	public Truck(String name,double rent ,float load){
		this.setRent(rent);
		this.setLoad(load);
		this.setName(name);
	}
	public String tostrings() {
		String h = this.getName()+"\t"+this.getRent()+"\t"+this.getPeopleNum()+"\t"+this.getLoad();
		return h;
		
	}
}
