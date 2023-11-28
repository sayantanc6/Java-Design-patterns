package designpattern.facade_strategy;

public class DeliverManagerImpl implements DeliveryManager {
	
	private DesignationTypes designation;
	private String joblevel;
	private String projectCode;
	private int employeeID;
	private String employeeName;
	
	public DeliverManagerImpl(DesignationTypes designation, String joblevel, String projectCode, int employeeID,
			String employeeName) {
		super();
		this.designation = designation;
		this.joblevel = joblevel;
		this.projectCode = projectCode;
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}

	public DeliverManagerImpl() {
	}

	@Override
	public void workAsDH(InfosysEmployee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void workAsAVP(InfosysEmployee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public DesignationTypes getDesignation() {
		return this.designation;
	}

	@Override
	public String getJobLevel() {
		return this.joblevel;
	}

	@Override
	public String getProjectCode() {
		return this.projectCode;
	}

	@Override
	public int getEmployeeID() {
		return this.employeeID;
	}

	@Override
	public String getEmployeeName() {
		return this.employeeName;
	}

	@Override
	public void workAsDM(InfosysEmployee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDesignation(DesignationTypes designation) {
		this.designation = designation;
	}

	@Override
	public void setJobLevel(String joblevel) {
		this.joblevel = joblevel;
	}

	@Override
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	@Override
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	@Override
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "DeliverManagerImpl [designation=" + designation + ", joblevel=" + joblevel + ", projectCode="
				+ projectCode + ", employeeID=" + employeeID + ", employeeName=" + employeeName + "]";
	}
}
