package example.jdbc;

public class Department {

	private int deptNo;
	private String dName;
	private String loc;

	public Department() {
		System.out.println("Inside Department()");
	}

	public Department(int deptNo, String dName, String loc) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
		this.loc = loc;
	}

	public int getDeptNo() {
		System.out.println("indside Get deptno()");
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		System.out.println("indside Set deptno()");
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ",\t dName=" + dName + ",\t loc=" + loc + "]";
	}

}
