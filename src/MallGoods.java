

public class MallGoods {
	private Long goodsId;
	private String goodsName;
	private String goodsIntro;
	private Long goodsCategoryId;
	private double originalPrice;
	private double sellPrice;
	private int stockNum;
	private String goodsSellStatus;
	private Long categoryId;
	private String categoryName;
	
	public MallGoods(Long goodsId, String goodsName, String goodsIntro, Long goodsCategoryId, double originalPrice,
			double sellPrice, int stockNum, String goodsSellStatus, Long categoryId, String categoryName) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsIntro = goodsIntro;
		this.goodsCategoryId = goodsCategoryId;
		this.originalPrice = originalPrice;
		this.sellPrice = sellPrice;
		this.stockNum = stockNum;
		this.goodsSellStatus = goodsSellStatus;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
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

	public String getGoodsIntro() {
		return goodsIntro;
	}

	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}

	public Long getGoodsCategoryId() {
		return goodsCategoryId;
	}

	public void setGoodsCategoryId(Long goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getStockNum() {
		return stockNum;
	}

	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}

	public String getGoodsSellStatus() {
		return goodsSellStatus;
	}

	public void setGoodsSellStatus(String goodsSellStatus) {
		this.goodsSellStatus = goodsSellStatus;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "MallGoods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsIntro=" + goodsIntro
				+ ", goodsCategoryId=" + goodsCategoryId + ", originalPrice=" + originalPrice + ", sellPrice="
				+ sellPrice + ", stockNum=" + stockNum + ", goodsSellStatus=" + goodsSellStatus + ", categoryId="
				+ categoryId + ", categoryName=" + categoryName + "]";
	}
	
	
}
