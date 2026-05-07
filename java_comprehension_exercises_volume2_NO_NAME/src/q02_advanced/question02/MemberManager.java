package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int id, String newPassword) {

		boolean found = false;

		for (Member m : members) {
			if (m.getId() == id) {
				m.setPassword(newPassword);
				found = true;
			}
		}

		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}

}
