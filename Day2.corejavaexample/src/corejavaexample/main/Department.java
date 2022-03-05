
/*                                  5                                  */

package corejavaexample.main;

//class Department with public access modifiers
public class Department {
	//Properties or attributes with private access modifiers
	private Integer deptId;
	private String deptName;

	// Default constructor of class Department
	// If we not make a constructor it can be accessible directly
	public Department() {
	}
	
	
	//Parameterized constructor of class Department
	public Department(Integer deptNo, String deptName) {
		//this refers to current object in a method or constuctor
		this.deptId = deptNo;
		this.deptName = deptName;
	}

	//Method that retrieve a property's value are called getter methods
	public Integer getDeptId() {
		return deptId;
	}

	//Method that change a property's value are called setter methods
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}