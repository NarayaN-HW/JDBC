package example.spring.core;

public class Customer {
	private int customerId;
	private String name;
	private Address permenentAddress; // refrence properties

	public Customer() {
		System.out.println("inside Customer default");
	}

	public Customer(int customerId, String name, Address permenentAddress) {
		System.out.println("inside Customer parameter ");
		this.customerId = customerId;
		this.name = name;
		this.permenentAddress = permenentAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", permenentAddress=" + permenentAddress + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getPermenentAddress() {
		return permenentAddress;
	}

	public void setPermenentAddress(Address permenentAddress) {
		this.permenentAddress = permenentAddress;
	}

}
