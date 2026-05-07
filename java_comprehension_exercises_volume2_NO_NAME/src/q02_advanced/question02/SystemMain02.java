package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する

		ConsoleReader reader = new ConsoleReader();

		Member m1 = Member.getInstance(1, "pass1", "田中", 25, 1);
		Member m2 = Member.getInstance(2, "pass2", "佐藤", 30, 2);

		List<Member> members = new ArrayList<Member>();

		MemberManager.showAllMembers(members);

		try {
			System.out.println("IDを入力してください:");
			int id = reader.inputNumber();

			System.out.println("新しいパスワードを入力してください:");
			String pass = reader.inputString();

			MemberManager.updatePassword(members, id, pass);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}

		MemberManager.showAllMembers(members);

	}

}
