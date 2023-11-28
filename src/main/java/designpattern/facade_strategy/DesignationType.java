package designpattern.facade_strategy;

public enum DesignationType implements DesignationTypes{

	AVP(new AssistantVicePresidentImpl(),"8"),
	DH(new DeliveryHeadImpl(),"8"),
	DM(new DeliveryManagerImpl(),"7"),
	EVP(new ExecutiveVicePresidentImpl(),"8"),
	GPM(new GroupProjectManagerImpl(),"6A"),
	IE(new InfosysEmployeeImpl(),""),
	OE(new OperationsExecutiveImpl(),"2B"),
	PM(new ProjectManagerImpl(),"6B"),
	SOE(new SeniorOperationsExecutiveImpl(),"2A"),
	SPM(new SeniorProjectManagerImpl(),"6A"),
	SSE(new SeniorSystemsEngineerImpl(),"3A"),
	SVP(new SeniorVicePesidentImpl(),"8"),
	SE(new SystemsEngineerImpl(),"3B"),
	TL(new TechnologyLeadImpl(),"5"),
	TA(new TechnologyAnalystImpl(),"4"),
	VP(new VicePresidentImpl(),"8");
	

	private Object object;
	private String joblevel;
	
	DesignationType(Object object, String joblevel) {
		this.object = object;
		this.joblevel = joblevel;
	}
	
	@Override
	public Object getConstructor() {
		return this.object;
	}
	
	@Override
	public String getJobLevel() {
        return this.joblevel;
    }
}
