
public class userInfoTest {
public static void main(String args[]){
	simpleUserInfo userInfo=new simpleUserInfo("Dave", "12345", "01/01/1993");
	userInfo.setName("Bob");
	userInfo.setStaffID("00001");
	System.out.println(userInfo.getName());
	System.out.println(userInfo.getStaffID());
}
}
