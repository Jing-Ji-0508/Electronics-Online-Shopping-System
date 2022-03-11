

import java.util.Date;

public class MallUser extends User {
	
	private String address;
	private boolean isDeleted;
	private boolean lockedFlag;
    private Date createTime;
	
	public MallUser(String userId, String userName, String userPassword, String address, boolean isDeleted, boolean lockedFlag, Date createTime) {
		super(userId, userName, userPassword);
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.address = address;
		this.isDeleted = isDeleted;
		this.lockedFlag = lockedFlag;
		this.createTime = createTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isLockedFlag() {
		return lockedFlag;
	}

	public void setLockedFlag(boolean lockedFlag) {
		this.lockedFlag = lockedFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "MallUser [address=" + address + ", isDeleted=" + isDeleted + ", lockedFlag=" + lockedFlag
				+ ", createTime=" + createTime + ", userId=" + userId + ", userName=" + userName + ", userPassword="
				+ userPassword + "]";
	}
	
	public void register() {
		
	}
	
	public void mallUserLogin() {
		
	}
	
	public void addCartItem() {
		
	}
	
	public void updateCartItem() {
		
	}
	
	public void deleteCartItem() {
		
	}
	
	public void checkOut() {
	
	}
	
	public void cancelOrder() {
		
	}
	
	public void finishOrder() {
		
	}

}
