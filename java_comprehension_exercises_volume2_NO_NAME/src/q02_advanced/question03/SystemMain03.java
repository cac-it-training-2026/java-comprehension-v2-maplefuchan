package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();
		Member loginMember = null;

		while (!isLogin) {

			int inputId = 0;
			String inputPassword = null;

			try {
				System.out.println("input id >>");
				inputId = cr.inputNumber();

				System.out.println("input password>>");
				inputPassword = cr.inputString();

			} catch (NumberFormatException e) {
				System.out.println("不正な値です。再度入力してください");
				continue;

			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}

			loginMember = loginService.doLogin(inputId, inputPassword);

			if (loginMember == null) {
				System.out.println("Idまたはパスワードが違っています。再度入力してください");

			} else {
				System.out.println("ログインに成功しました");
				isLogin = true;
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		loginMember.showMember();

	}

}
