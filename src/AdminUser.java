

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
	
	public void updateMalluserStatus(MallUser mallUser) {
		if (mallUser.isLockedFlag() == false)
			mallUser.setLockedFlag(true);
		else
			mallUser.setLockedFlag(false);
		System.out.println("The mall user: " + mallUser.getUserName() + "'s lock status has been changed to" + mallUser.isLockedFlag());
	}
	
	public void addGoods(Long goodsId, String goodsName, String goodsIntro, Long goodsCategoryId, double originalPrice,
			double sellPrice, int stockNum, String goodsSellStatus, Long categoryId, String categoryName) {
		MallGoods newGoods = new MallGoods(goodsId, goodsName, goodsIntro, goodsCategoryId, originalPrice, sellPrice, stockNum, goodsSellStatus, categoryId, categoryName);
		System.out.println(newGoods.getGoodsName() + "has been added successfully.");
	}
	
	public void updateGoods(MallGoods mallGoods, Long goodsId, String goodsName, String goodsIntro, Long goodsCategoryId, double originalPrice,
			double sellPrice, int stockNum, String goodsSellStatus, Long categoryId, String categoryName) {
		mallGoods.setGoodsId(goodsId);
		mallGoods.setGoodsName(goodsName);
		mallGoods.setGoodsIntro(goodsIntro);
		mallGoods.setGoodsCategoryId(goodsCategoryId);
		mallGoods.setOriginalPrice(originalPrice);
		mallGoods.setSellPrice(sellPrice);
		mallGoods.setStockNum(stockNum);
		mallGoods.setGoodsSellStatus(goodsSellStatus);
		mallGoods.setCategoryId(categoryId);
		mallGoods.setCategoryName(categoryName);
		System.out.println(mallGoods.getGoodsName() + "'s information has been updated");
		System.out.println(mallGoods);
	}
	
	public void updateOrderStatus(MallOrder mallOrder, String orderStatus) {
		mallOrder.setOrderStatus(orderStatus);
		System.out.println("The Order: " + mallOrder.getOrderNo() + "'s status has been changed to " + mallOrder.getOrderStatus());
		System.out.println(mallOrder);
	}
	
}
