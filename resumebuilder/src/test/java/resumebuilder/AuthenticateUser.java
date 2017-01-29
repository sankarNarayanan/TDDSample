package resumebuilder;

public class AuthenticateUser {
	public Boolean userInLoginScreen(){
		return true;
	}
	
	public String authenticate(String emailId){
		if (emailId.equalsIgnoreCase("Sankar@gmail.com")){
			return "Authentication Successful";
		}else{
			return "Authentication Failure";
		}
	}
}
