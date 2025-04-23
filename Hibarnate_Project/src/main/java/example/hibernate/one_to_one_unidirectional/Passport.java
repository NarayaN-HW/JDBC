package example.hibernate.one_to_one_unidirectional;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passport_master")
public class Passport {
	@Id
	@Column(name = "passport_no", length = 30)
	private String passportNumber;

	@Column(name = "passport_holder_Name", length = 30)
	private String passpordHolder;

	@Column(name = "passport_exp_date", length = 30)
	private LocalDate expirydate;

	public Passport() {

	}

	public Passport(String passportNumber, String passpordHolder, LocalDate expirydate) {
		super();
		this.passportNumber = passportNumber;
		this.passpordHolder = passpordHolder;
		this.expirydate = expirydate;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPasspordHolder() {
		return passpordHolder;
	}

	public void setPasspordHolder(String passpordHolder) {
		this.passpordHolder = passpordHolder;
	}

	public LocalDate getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(LocalDate expirydate) {
		this.expirydate = expirydate;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", passpordHolder=" + passpordHolder + ", expirydate="
				+ expirydate + "]";
	}
}
