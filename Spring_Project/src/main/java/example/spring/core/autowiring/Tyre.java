package example.spring.core.autowiring;

public class Tyre {
	private String make;
	private String type;

	public Tyre() {
		make = "MRF";
		type = "with tube";
	}

	public Tyre(String make, String type) {
		super();
		this.make = make;
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\nType [make=" + make + ", type=" + type + "]";
	}

}
