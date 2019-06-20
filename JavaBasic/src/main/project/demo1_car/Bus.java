package demo1_car;

public class Bus extends CarStore {
	public Bus(){
		//如果什么都没有,给他一个默认值
		String name = "客车";
		int peopleNum = 0; //车的名字
		Double rent = 0.0; //出的租金
		
		this.setName(name);
		this.setRent(rent);
		this.setPeopleNum(peopleNum);
	}
	public Bus(String name,double rent,int peopleNum){
		this.setRent(rent);
		this.setPeopleNum(peopleNum);
		this.setName(name);
	}
	public String tostrings(){
		String h = this.getName()+"\t"+this.getRent()+"\t"+this.getPeopleNum()+"\t"+this.getLoad();
		return h;
	}

}
