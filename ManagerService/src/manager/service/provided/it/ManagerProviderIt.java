package manager.service.provided.it;

public interface ManagerProviderIt {

	public void movementIn(String location);
	
	public void peopleIn(String location);
	
	public void peopleOut(String location);
	
	public void newTemperature(String location, double temp);

	public void pushTenMinutes();

}
