package in.ineuron.bean;

import java.util.Date;

//Target class----->User defined
public class WishMessageGenerator {
	
	//Dependent class----->Predefined
	private Date date;
	
	static {
		System.out.println("WishmessageGenerator.class is loading");
	}

	public WishMessageGenerator() {
	System.out.println("WishmessageGenerator object instatiated ");
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
