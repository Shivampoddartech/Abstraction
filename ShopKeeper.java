package Abstraction;

public class ShopKeeper extends Apple{

	
	
	
	@Override 
	void closeBuisness() {
	System.out.println("End of the day making good money as compare to It Feeshers ");	
	}
	
	@Override 
	void startBuisness() {
		System.out.println("Start selling fruits");
	}
	
	public static void main(String[] args) {
		
		ShopKeeper sp = new ShopKeeper();
	    
	}
		
	}

			
		
	
	
