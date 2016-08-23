public class simpleUserInfo {
	private String name;
	private String staffID;
	private String dateOfBirth;

	public simpleUserInfo(String name, String staffID, String dateOfBirth) {
		this.name = name;
		this.staffID = staffID;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getStaffID(){
		return this.staffID;
	}
	
	public void setStaffID(String staffID){
		this.staffID=staffID;
	}
	
	public String dateOfBirth(){
		return this.dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth=dateOfBirth;
	}
}
