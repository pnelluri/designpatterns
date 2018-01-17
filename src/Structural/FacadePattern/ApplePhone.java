package Structural.FacadePattern;
//Operating system
//Map of building
//Business layer
//dont know with whom we are talking

//Facade hides who you are talking to whereas proxy hides the location of the callee
public class ApplePhone implements Mobile{
	public String modelNo="Apple Phone Model";
	public double amount=30000;
	

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getModelNo() {
		return modelNo;
	}

	public double getAmount() {
		return amount;
	}

	

}
