package demo1_car;

public class PickUpCar extends CarStore{
	
	public PickUpCar(){
	 float  load = 0.0f;  //载重量
	 int peopleNum = 0 ; //载客量
	 String name = "皮卡"; //车的名字
	 Double rent= 0.0; //出的租金
	 	
	 	this.setName(name);
		this.setRent(rent);
		this.setLoad(load);
		this.setPeopleNum(peopleNum);
		
	}
	public PickUpCar(String name,Double rent,int peopleNum,float load){
		
	 	this.setName(name);
		this.setRent(rent);
		this.setLoad(load);
		this.setPeopleNum(peopleNum);
	}
	public String tostrings(){
		String h = this.getName()+"\t"+this.getRent()+"\t"+this.getPeopleNum()+ "\t"+this.getLoad();
		return h;
	}
}
