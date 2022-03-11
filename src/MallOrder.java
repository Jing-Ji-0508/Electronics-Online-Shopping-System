

public class MallOrder {
	
	private Long orderId;
	private String orderNo;
	private Long userId;
	private int totalPrice;
	private byte payStatus;
	private byte orderStatus;
	private String userAddress;
	private byte isDeleted;
	private String extraInfo;
	
	public MallOrder(Long orderId, String orderNo, Long userId, int totalPrice, byte payStatus, byte orderStatus, String userAddress, byte isDeleted, String extraInfo) {
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
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public byte getPayStatus() {
		return payStatus;
	}
	
	public void setPayStatus(byte payStatus) {
		this.payStatus = payStatus;
	}
	
	public byte getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(byte orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public byte getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(byte isDeleted) {
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
