public class Test {
	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");
		dao.select("taro", "123");
		dao.select("jiro", "456");
		dao.select("hanako", "789");
	}
}