package example.spring.core.autowiring;

public class Engine {
	private String type;
	private String power;

	public Engine() {
		type="v2 Petrol";
		power="15000 horsepower";
	}

	@Override
	public String toString() {
		return "\nEngine [type=" + type + ", power=" + power + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Engine(String type, String power) {
		super();
		this.type = type;
		this.power = power;
	}
}
