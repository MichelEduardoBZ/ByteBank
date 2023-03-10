package Aplications;

public class Endereco {

	private String state;
	private String city;
	private String neighborhood;
	private String road;
	private int number;
	
	public Endereco(){
	}

	public Endereco(String state, String city, String neighborhood, String road, int number) {
		this.state = state;
		this.city = city;
		this.neighborhood = neighborhood;
		this.road = road;
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public int getNumberHome() {
		return number;
	}

	public void setNumberHome(int number) {
		this.number = number;
	}

	
	
}
