package designpattern.facade_strategy;

public class FacadeTest {

	public static void main(String[] args) {
		
		// facade pattern - hiding sub-systems of interface hierarchies
		
		InfosysEmployeeFacade facade = new InfosysEmployeeFacade();
		InfosysEmployee sayantan = new TechnologyAnalystImpl();
		sayantan.setEmployeeID(637504);
		facade.addEmployee(sayantan);
		
		InfosysEmployee ardhendu = new TechnologyLeadImpl();
		ardhendu.setEmployeeID(6677);
		facade.addEmployee(ardhendu);
		
		// strategy pattern - changing algorithm dynamically.
		
		@SuppressWarnings("unused")
		DesignationType types = (DesignationType) sayantan.getDesignation();
		facade.changeDesignation(DesignationType.TL,DesignationType.TL.getJobLevel(),sayantan.getEmployeeID());
		facade.printAllEmployees(); 

	}
}
