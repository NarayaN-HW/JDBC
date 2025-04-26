package example.spring.core.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	private String carId;
	private String make;
	private String model;
	@Autowired(required = false)// optional if bean not found is ok return null
	private Tyre tyreDetails;
	@Autowired // Mandatory so declare 
	@Qualifier("enginebean2")// specifer the ID of bean if multiple bean present
	private Engine engineDetails;

	public Car() {
		carId = "c01";
		make = "ford";
		model = "mustang";
		tyreDetails = null;
		engineDetails = null;
	}

	public Car(String carId, String make, String model, Tyre tyreDetails, Engine engineDetails) {
		super();
		this.carId = carId;
		this.make = make;
		this.model = model;
		this.tyreDetails = tyreDetails;
		this.engineDetails = engineDetails;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Tyre getTyreDetails() {
		return tyreDetails;
	}

	public void setTyreDetails(Tyre tyreDetails) {
		this.tyreDetails = tyreDetails;
	}

	public Engine getEngineDetails() {
		return engineDetails;
	}

	public void setEngineDetails(Engine engineDetails) {
		this.engineDetails = engineDetails;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", make=" + make + ", model=" + model + ", tyreDetails=" + tyreDetails
				+ ", engineDetails=" + engineDetails + "]";
	}

}
