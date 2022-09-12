package practice.password;

public class Password {
	private int lng = 8;
	private String pass;
	
//CONST	
	public Password(int lng, String pass) {
		this.lng = lng;
		this.pass = pass;
	}

//GET AND SET
	public int getLng() {
		return lng;
	}


	public void setLng(int lng) {
		this.lng = lng;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
//METH
	public void isStrong() {
		
	}
	
	public void generatePass() {
		
	}
}
