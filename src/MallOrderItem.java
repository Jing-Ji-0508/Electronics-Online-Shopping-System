

import java.util.Date;

public class MallOrderItem {
	private Long orderItemId;
	private Long orderId;
	private Long goodsId;
	private String goodsName;
	private double sellingPrice;
	private int goodsCount;
	private Date createTime;
	
	public MallOrderItem(Long orderItemId, Long orderId, Long goodsId, String goodsName, double sellingPrice, int goodsCount, Date createTime) {
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.sellingPrice = sellingPrice;
		this.goodsCount = goodsCount;
		this.createTime = createTime;
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(int goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "MallOrderItem [orderItemId=" + orderItemId + ", orderId=" + orderId + ", goodsId=" + goodsId
				+ ", goodsName=" + goodsName + ", sellingPrice=" + sellingPrice + ", goodsCount=" + goodsCount
				+ ", createTime=" + createTime + "]";
	}


	
	
}
