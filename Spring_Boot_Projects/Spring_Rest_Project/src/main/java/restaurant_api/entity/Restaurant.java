package restaurant_api.entity;

public class Restaurant {
	private String restaurantId;
	private String name;
	private String cuisine;
	private int branches;
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	public Restaurant(String restaurantId, String name, String cuisine, int branches) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.branches = branches;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getBranches() {
		return branches;
	}
	public void setBranches(int branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", cuisine=" + cuisine + ", branches="
				+ branches + "]";
	}
	
}
