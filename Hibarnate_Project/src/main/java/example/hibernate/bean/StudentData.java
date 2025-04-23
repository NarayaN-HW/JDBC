package example.hibernate.bean;

public class StudentData {
	private String studentName;
	private String StudentBranch;
	private String StudentYear;

	@Override
	public String toString() {
		return "StudentData [studentName=" + studentName + ", StudentBranch=" + StudentBranch + ", StudentYear="
				+ StudentYear + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return StudentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		StudentBranch = studentBranch;
	}

	public String getStudentYear() {
		return StudentYear;
	}

	public void setStudentYear(String studentYear) {
		StudentYear = studentYear;
	}

	public StudentData(String studentName, String studentBranch, String studentYear) {
		super();
		this.studentName = studentName;
		StudentBranch = studentBranch;
		StudentYear = studentYear;
	}

	public StudentData() {

	}
}
