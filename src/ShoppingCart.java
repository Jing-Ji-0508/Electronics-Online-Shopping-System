

import java.util.Date;

public class ShoppingCart {
	private Long cartItemId;
	private Long userId;
	private Long goodsId;
	private int goodsCount;
	private boolean isDeleted;
	private Date createDate;
	private Date updateDate;
	
	public ShoppingCart(Long cartItemId, Long userId, Long goodsId, int goodsCount, boolean isDeleted, Date createDate,
			Date updateDate) {
		super();
		this.cartItemId = cartItemId;
		this.userId = userId;
		this.goodsId = goodsId;
		this.goodsCount = goodsCount;
		this.isDeleted = isDeleted;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public int getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(int goodsCount) {
		this.goodsCount = goodsCount;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "ShoppingCart [cartItemId=" + cartItemId + ", userId=" + userId + ", goodsId=" + goodsId
				+ ", goodsCount=" + goodsCount + ", isDeleted=" + isDeleted + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
