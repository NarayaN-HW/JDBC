package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// alternate ot HBM file

@Entity // marks as an entiry
@Table(name = "student_details")
public class Students {

	@Id // amrks student as in id
	@Column(name = "student_id")
	private int studentId;

	@Column(name = "student_name", length = 40)
	private String name;

	@Column(name = "student_branch", length = 30)
	private String branch;

	@Column(name = "student_year", length = 30)
	private String year;

	public Students() {

	}

	public Students(int studentId, String name, String branch, String year) {
		this.studentId = studentId;
		this.name = name;
		this.branch = branch;
		this.year = year;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", branch=" + branch + ", year=" + year + "]";
	}

}
