package example.spring.core;

public class Address {
private String city;
private int pincode;
public Address(String city, int pincode) {
	System.out.println("inside address paramater constructor");
	this.city = city;
	this.pincode = pincode;
}
public Address() {
	System.out.println("inside address default");
}
@Override
public String toString() {
	return "Address [city=" + city + ", pincode=" + pincode + "]";
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
}
