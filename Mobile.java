package week1.day1;

public class Mobile {
	String mobilename="REALME";
	char model='9';
	short ram=8;
	int rom=256;
	boolean isFastCharging=true;
	double price=25000;
	float mobileFrequency=1.55f;
	long ipAddress=9879876543210l;
	public static void main(String[] args) {
		Mobile choice=new Mobile();
		System.out.println("MOBILE NAME:"+choice.mobilename);
		System.out.println("MODEL:"+choice.model);
		System.out.println("RAM:"+choice.ram);
		System.out.println("ROM:"+choice.rom);
		System.out.println("FAST CHARDGING:"+choice.isFastCharging);
		System.out.println("PRICE:"+choice.price);
		System.out.println("MOBILE FREQUENCY:"+choice.mobileFrequency);
		System.out.println("IP ADDRESS:"+choice.ipAddress);
	}
	
}
