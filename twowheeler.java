package week1.day1;

public class twowheeler {
		String bikename="KAWASAKI";
		char model='X';
		int cc=350;
		boolean bs6=true;
		short exhauster=2;
		double price=300000.08;
		float tankCapacity=20.5f;
		long engineChassNumber=1234567890;
		
        public static void main(String[] args) {
        	twowheeler details=new twowheeler();
        	System.out.println("BIKENAME:"+details.bikename);
        	System.out.println("MODEL:"+details.model);
        	System.out.println("CC:"+details.cc);
        	System.out.println("BS6:"+details.bs6);
        	System.out.println("EXHAUSTER:"+details.exhauster);
        	System.out.println("PRICE:"+details.price);
        	System.out.println("TANK CAPACITY:"+details.tankCapacity);
        	System.out.println("ENGINE NUMBER:"+details.engineChassNumber);
}

		}
			
