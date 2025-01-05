package demo1_car;

public class CarStore {
	
	private float  load;  //载重量
	private int peopleNum; //载客量
	private String name; //车的名字
	private Double rent; //出的租金
	
	//封装各个属性
	public float getLoad() {
		return load;
	}
	public void setLoad(float load) {
		this.load = load;
	}
	public int getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRent() {
		return rent;
	}
	public void setRent(Double rent) {
		this.rent = rent;
	}
	
//做个自定义的构造方法
	public CarStore(){
		System.out.println("欢迎使用~构造方法");
	}

	public String tostrings(){
		return "";
	}

}
