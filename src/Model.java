import java.util.Map;
import java.util.TreeMap;


public class Model {
	
	private Map<String,String> history = new TreeMap<>();
	private String monitorData = new String();
	private Model modelSingle = null;
	
	private Model(){
		
	}
	
	public static Model getModel() {
		if (modelSingle == null) return modelSingle;
		else return modelSingle;
	}

	/**
	 * @return the monitorData
	 */
	public String getMonitorData() {
		return monitorData;
	}

	/**
	 * @param monitorData the monitorData to set
	 */
	public void setMonitorData(String monitorData) {
		this.monitorData = monitorData;
	}
	
	
	

}
