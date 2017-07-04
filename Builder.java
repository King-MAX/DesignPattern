class House{
	private String floor;
	private String wall;
	private String housetop;
	public House(){
		super();
	}
	public House(String floor, String wall, String housetop){
		super();
		this.floor = floor;
		this.wall = wall;
		this.housetop = housetop;
	}
	public String getFloor(){
		return this.floor;
	}
	public void setFloor(String floor){
		this.floor = floor;
	}
	public String getWall(){
		return this.wall;
	}
	public void setWall(String wall){
		this.wall = wall;
	}
	public String getHousetop(){
		return this.housetop;
	}
	public void setHousetop(String housetop){
		this.housetop = housetop;
	}
	public String toString(){
		return "House [floor=" + floor + ", wall=" + wall + ", housetop=" + housetop + "]";
	}
}

interface HouseBuilder{
	public void makeFloor();
	public void makeWall();
	public void makeHousetop();
	public House getHouse();
}

class PingFangBuilder implements HouseBuilder{
	private House house = new House();
	public void makeFloor(){
		house.setFloor("PingFang --> Floor");
	}
	public void makeWall(){
		house.setWall("PingFang --> Wall");
	}
	public void makeHousetop(){
		house.setHousetop("PingFang --> Housetop");
	}
	public House getHouse(){
		return this.house;
	}
}

class HouseDirector{
	public void makeHouse(HouseBuilder builder){
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
}

public class MainClass{
	public static void main(String [] args){
		HouseBuilder builder = new PingFangBuilder();
		HouseDirector director = new HouseDirector();
		director.makeHouse(builder);
		House house = builder.getHouse();
		System.out.println(house);
	}
}
