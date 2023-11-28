package designpattern.facade_strategy;

import java.util.HashMap;
import java.util.Map;

public class InfosysEmployeeFacade {
	
	private HashMap<Integer, InfosysEmployee> employeesMap;
	
	public InfosysEmployeeFacade() {
		employeesMap = new HashMap<Integer, InfosysEmployee>();
	}
	
	public void addEmployee(InfosysEmployee employee) { 
		employeesMap.put(employee.getEmployeeID(), employee);
	}
	
	public InfosysEmployee getEmployee(int employeeID) {
		return employeesMap.get(employeeID);
	}
	
	public void printAllEmployees() {
		for (Map.Entry<Integer, InfosysEmployee> entry : employeesMap.entrySet()) {
			System.out.println("employeeID : "+entry.getKey()+" "+"details : "+entry.getValue().toString());
		}
	}
	
	public void changeDesignation(DesignationTypes designationTypes,String joblevel,int employeeID) {
		InfosysEmployee oldemployee = employeesMap.get(employeeID);
		InfosysEmployee newemployee = employeeJobRoleTransfer(oldemployee,joblevel, (InfosysEmployee) designationTypes.getConstructor());
		employeesMap.remove(employeeID);
	    employeesMap.put(employeeID, newemployee);
	}
	
	public InfosysEmployee employeeJobRoleTransfer(InfosysEmployee oldemployee,String joblevel,InfosysEmployee newemployee) {
		newemployee.setDesignation(oldemployee.getDesignation());
		newemployee.setEmployeeID(oldemployee.getEmployeeID());
		newemployee.setEmployeeName(oldemployee.getEmployeeName());
		newemployee.setJobLevel(joblevel); 
		newemployee.setProjectCode(oldemployee.getProjectCode()); 
		return newemployee;
		 
	}
}
