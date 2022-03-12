import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		AdminUser admin1 = new AdminUser("yifanyang", "Yifan Yang", "123456");
		
		MallUser user1 = new MallUser("yifanyang", "Erfan Yang", "123456", "Montreal, QC, Canada", false, false, new Date("03/12/2022"));
		MallUser user2 = new MallUser("sanfanyang", "Sanfan Yang", "123456", "Montreal, QC, Canada", false, false, new Date("03/12/2022"));

		MallGoods iPhone13 = new MallGoods(001L, "iPhone 13", "The lastest model of iPhone", 1399.00, 1399.00, 999, "On Stock", 003L, "Smart Phones");
		MallGoods iPhone13mini = new MallGoods(002L, "iPhone 13 mini", "The lastest model of iPhone", 1399.00, 1399.00, 999, "On Stock", 003L, "Smart Phones");
		MallGoods iPhone13Pro = new MallGoods(003L, "iPhone 13 Pro", "The lastest model of iPhone", 1399.00, 1399.00, 999, "On Stock", 003L, "Smart Phones");
		MallGoods iPhone13ProMax = new MallGoods(004L, "iPhone 13 Pro Max", "The lastest model of iPhone", 1399.00, 1399.00, 999, "On Stock", 003L, "Smart Phones");
		
		ArrayList<MallGoods> shoppingCart1 = new ArrayList<MallGoods>();
		ArrayList<MallGoods> shoppingCart2 = new ArrayList<MallGoods>();
		
		ArrayList<MallGoods> mallOrder1 = new ArrayList<MallGoods>();
		ArrayList<MallGoods> mallOrder2 = new ArrayList<MallGoods>();


		admin1.adminLogin();
		System.out.println(admin1);
		admin1.updateUserInfo("yifanyang", "Yifan Yang", "123445");
		System.out.println(admin1);
		admin1.updateMallUserStatus(user2);
		System.out.println(user2);
		
		user1.mallUserLogin();
		System.out.println(admin1);
		user1.updateUserInfo("erfanyang", "Erfan Yang", "123456");
		System.out.println(user1);
		
		user1.addCartItem(shoppingCart1, iPhone13ProMax);
		user1.addCartItem(shoppingCart1, iPhone13);
		user1.addCartItem(shoppingCart1, iPhone13mini);
		user1.addCartItem(shoppingCart1, iPhone13Pro);
		System.out.println(shoppingCart1);
		
		user1.deleteCartItem(shoppingCart1, iPhone13ProMax);
		System.out.println(shoppingCart1);
		
		user1.checkOut(shoppingCart1, mallOrder1);
		
	}

}
