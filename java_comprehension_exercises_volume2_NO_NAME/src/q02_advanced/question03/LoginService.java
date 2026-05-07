package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String newPassword) {

		boolean found = false;

		for (Member m : memberStorage.getMembers()) {
			if (m.getId() == id && m.getPassword().equals(newPassword)) {
				found = true;
				return m;
			}
		}

		if (!found) {
			System.out.println("該当者はいませんでした。");
		}

		return null;
	}
}
