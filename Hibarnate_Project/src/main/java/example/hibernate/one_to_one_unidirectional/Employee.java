package example.hibernate.one_to_one_unidirectional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_master")
public class Employee {
	@Id
	@Column(name = "emp_no", length = 40)
	private int empNo;

	@Column(name = "emp_name", length = 40)
	private String name;

	@Column(name = "emp_sal", length = 40)
	private int sal;
//	modify hibernateUtils class
	
	
	
// cascade =  a referential action applied to foreign key constraints, specifically when dealing with parent and child tables
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_no") // foreign key of column employee_master
	private Passport passportDetails; // association mapping 1-to-1 unidirectional

	public Employee() {
	}

	public Employee(int empNo, String name, int sal, Passport passportDetails) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
		this.passportDetails = passportDetails;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Passport getPassportDetails() {
		return passportDetails;
	}

	public void setPassportDetails(Passport passportDetails) {
		this.passportDetails = passportDetails;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", sal=" + sal + ", passportDetails=" + passportDetails
				+ "]";
	}

}
