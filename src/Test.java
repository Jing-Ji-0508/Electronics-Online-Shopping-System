

public class Test {

	public static void main(String[] args) {
		AdminUser admin1 = new AdminUser("yifanyang", "Yifan Yang", "123456");
		System.out.println(admin1);
		admin1.updateUserInfo("erfanyang", "Yifan Yang", "123445"); //updateUserInfo() OK
		System.out.println(admin1);
	}

}
