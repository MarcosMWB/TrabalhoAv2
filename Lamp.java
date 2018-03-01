package Project_Lamp;

public class Lamp {
	
	private int status;
	
	public void turn_on(){
		
		status = 1;
		
	}

	public void turn_off(){
		
		status = 0;
		
	}
	
	public void showstatus(){
		
		if (status == 1)
			System.out.println("ON");
		else
			System.out.println("OFF");
		
	}
	
}
