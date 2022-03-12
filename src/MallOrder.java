

public class MallOrder {
	
	private Long orderId;
	private String orderNo;
	private Long userId;
	private double totalPrice;
	private String payStatus;
	private String orderStatus;
	private String userAddress;
	private boolean isDeleted;
	private String extraInfo;
	
	public MallOrder(Long orderId, String orderNo, Long userId, double totalPrice, String payStatus, String orderStatus, String userAddress, boolean isDeleted, String extraInfo) {
		this.orderId = orderId;
		this.orderNo = orderNo;
		this.totalPrice = totalPrice;
		this.payStatus = payStatus;
		this.orderStatus = orderStatus;
		this.userAddress = userAddress;
		this.isDeleted = isDeleted;
		this.extraInfo = extraInfo;
	}
	
	public Long getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getPayStatus() {
		return payStatus;
	}
	
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public String getExtraInfo() {
		return extraInfo;
	}
	
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	
	@Override
	public String toString() {
		return "MallOrder [orderId=" + orderId + ", orderNo=" + orderNo + ", userId=" + userId + ", totalPrice="
				+ totalPrice + ", payStatus=" + payStatus + ", orderStatus=" + orderStatus + ", userAddress="
				+ userAddress + ", isDeleted=" + isDeleted + ", extraInfo=" + extraInfo + "]";
	}
	
	
}
