package example.hibernate.one_to_many_unidirectional;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_master")
public class Customer {
	@Id
	@Column(name = "customer_id")
	private String customerId;
// 	default taken column name as ->name
	private String name;

	private String emailAddress;
//modify hibernateUtils class

//	1-to-m so mapping, joincolumn same id coustomer
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id") // its foreign key column credit card master not customer master
	private Collection<Creditcard> creditcards;

//	 add 1 card at a time
	public void addCreditCard(Creditcard card) {// method for convenience
		creditcards.add(card);
	}

	public Customer() {
		creditcards = new ArrayList<>();
	}

	public Customer(String customerId, String name, String emailAddress, Collection<Creditcard> creditcards) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailAddress = emailAddress;
		this.creditcards = creditcards;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	// collection return
	public Collection<Creditcard> getCreditcards() {
		return creditcards;
	}

	public void setCreditcards(Collection<Creditcard> creditcards) {
		this.creditcards = creditcards;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", emailAddress=" + emailAddress
				+ ", creditcards=" + creditcards + "]";
	}

}
