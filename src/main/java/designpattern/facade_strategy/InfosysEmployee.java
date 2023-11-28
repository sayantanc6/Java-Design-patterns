package designpattern.facade_strategy;

public interface InfosysEmployee {

	DesignationTypes getDesignation();
	String getJobLevel();
	String getProjectCode();
	int getEmployeeID();
	String getEmployeeName();
	
	void setDesignation(DesignationTypes designation);
	void setJobLevel(String joblevel);
	void setProjectCode(String projectCode);
	void setEmployeeID(int employeeID);
	void setEmployeeName(String employeeName);
}
