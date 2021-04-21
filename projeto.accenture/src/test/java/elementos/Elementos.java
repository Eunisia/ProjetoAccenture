package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By make = By.id("make");
	private By model = By.id("model");
	private By cylindercapacity = By.id("cylindercapacity");
	private By engineperformance = By.id("engineperformance");
	private By nextenterinsurantdata = By.id("nextenterinsurantdata");
	private By firstname = By.id("firstname");
	private By lastname = By.id("lastname");
	private By nextenterproductdata = By.id("nextenterproductdata");
	private By nextselectpriceoption = By.id("nextselectpriceoption");
	
	
	
	
	public By getMake() {
		return make;
	}
	public By getModel() {
		return model;
	}
	public By getCylindercapacity() {
		return cylindercapacity;
	}
	public By getEngineperformance() {
		return engineperformance;
	}
	public By getNextenterinsurantdata() {
		return nextenterinsurantdata;
	}
	
	public By getFirstname() {
		return firstname;
	}
	public By getLastname() {
		return lastname;
	}
	
	public By getNextenterproductdata() {
		return nextenterproductdata;
	}
	public By getNextselectpriceoption() {
		return nextselectpriceoption;
	}

	

	
	

}
