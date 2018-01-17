package Structural.FacadePattern;

public class ShopKeeper {
	private Mobile apple;
	private Mobile samsung;
	public ShopKeeper() {
		apple = new ApplePhone();
		samsung= new SamsungMobile();
	}
	public void getAppleDetails() {
		System.out.println(apple.getModelNo());
		System.out.println(apple.getAmount());
	}
	public void getSamsungDetails() {
		System.out.println(samsung.getModelNo());
		System.out.println(samsung.getAmount());
	}
}
