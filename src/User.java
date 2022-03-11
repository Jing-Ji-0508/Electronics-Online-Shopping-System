
public abstract class User {
	public String userId;
	public String userName;
	public String userPassword;	
	
	public User(String userId, String userName, String userPassword) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
	public String toString() {
		return"[ID: "+ userId + "Name: "+ userName + "Passward: " + userPassword + "]";
	}
	
	public void updateUserInfo(String userId, String userName, String userPassword) {
		this.setUserId(userId);
		this.setUserName(userName);
		this.setUserPassword(userPassword);
		System.out.println("User information updated successfully");
	}

	public void searchGoods() {
		
	}
}