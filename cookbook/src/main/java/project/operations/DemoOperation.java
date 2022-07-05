package project.operations;

import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;

@Operation(id = DemoOperation.ID)
public class DemoOperation{
	public static final String ID = "DemoOperation";
	@OperationMethod
	public String run() {
		
		return "i am here";
	}
	
}