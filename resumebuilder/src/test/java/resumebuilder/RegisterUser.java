package resumebuilder;

public class RegisterUser {
	
	String response = "";

	public Boolean userInRegisterScreen(){
		return true;
	}
	
	public Boolean registerUser(String arg1, String arg2){
		if(arg1.equalsIgnoreCase("sankar@gmail.com") && arg2.equalsIgnoreCase("sankar")){
			this.response = "Verification email sent successfully";
			return true;
		}else{
			this.response = "Verification email sending failed";
			return false;
		}
	}
	
	public String getResponse(){
		return this.response;
	}
}
