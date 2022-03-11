

public class AdminUser extends User {

	
	public AdminUser(String userId, String userName, String userPassword) {
		super(userId, userName, userPassword);
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "AdminUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	public void adminLogin() {
		
	}
	
	public void getUserDetailById(String Id) {
		
	}
	
	public void updateMalluserStatus() {
		
	}
	
	public void addGoods() {
		
	}
	
	public void updateGoods() {
		
	}
	
	public void updateOrderStatus() {
		
	}
	
}
