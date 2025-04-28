package restaurant_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//it does not get scanned
@Entity// jpa entity class
@Table(name = "Restaurant_Master")
public class Restaurant {
	@Id
	@Column(name = "restaurant_id",length = 5)
	private String restaurantId;
	
	@Column(name = "restaurant_name",length = 20)
	private String name;
	
	@Column(name = "restaurant_cuisine",length = 20)
	private String cuisine;
	
	@Column(name = "restaurant_branches")
	private int branches;
	public Restaurant() {
		
	}
	public Restaurant(String restaurantId, String name, String cuisine, int branches) {
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
