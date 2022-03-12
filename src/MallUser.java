
import java.util.ArrayList;
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
	
	public void register(String userId, String userName, String userPassword, String address, boolean isDeleted, boolean lockedFlag, Date createTime) {
		MallUser newMallUser = new MallUser(userId, userName, userPassword, address, isDeleted, lockedFlag, createTime);
		System.out.println("Register successful!");
	}
	
	public void mallUserLogin() {
		System.out.println("Welcome! Mall User: " + this.getUserName());
	}
	
	public ArrayList<MallGoods> addCartItem(ArrayList<MallGoods> shoppingCart, MallGoods mallGoods) {
		try{
			shoppingCart.add(mallGoods);
		}
		catch(NullPointerException e) {
			System.out.println("This product does not exsit.");
		}
		return shoppingCart;
		
	}
	
	public ArrayList<MallGoods> updateCartItem(ArrayList<MallGoods> shoppingCart, MallGoods mallGoods) {
		ArrayList<MallGoods> updatedShoppingCart = new ArrayList<MallGoods> ();
		//TODO UpdateCartItem
		return updatedShoppingCart;
	}
	
	public ArrayList<MallGoods> deleteCartItem(ArrayList<MallGoods> shoppingCart, MallGoods mallGoods) {
		if (shoppingCart.removeIf(e -> e.equals(mallGoods))) {
			System.out.println("This item has been removed from the shopping cart");
		}
		else
			System.out.println("Cannot find this item in the shopping cart");
		return shoppingCart;
		
	}
	
	public ArrayList<MallGoods> checkOut(ArrayList<MallGoods> shoppingCart, ArrayList<MallGoods> orderItem) {
		orderItem = (ArrayList<MallGoods>)shoppingCart.clone();
		shoppingCart.clear();
		return orderItem;
	
	}
	
	public void cancelOrder(MallOrder mallOrder) {
		if (mallOrder.getOrderStatus() == "Canceled")
			System.out.println("This order has been already canceled, operation failed.");
		else {
			mallOrder.setOrderStatus("Canceled");
			System.out.println("This order has been successfully canceled.");
			System.out.println(mallOrder);
		}
	}
	
	public void finishOrder(MallOrder mallOrder) {
		if (mallOrder.getOrderStatus() == "Canceled")
			System.out.println("This order has been already canceled, operation failed.");
		else if (mallOrder.getOrderStatus() == "Finished")
			System.out.println("This order is finished already, operation failed.");
		else {
			mallOrder.setOrderStatus("Finished");
			System.out.println("This order is now finished, come back!");
		}

	}

}
