package banana_admin.view;

import java.util.Scanner;

import banana_admin.controller.Controllers;
import banana_admin.domain.Admin;

public class InsertAdminView {

	private Scanner keyboard;

	public InsertAdminView() {

		keyboard = new Scanner(System.in);

	}

	public void insertAdminView(){
<<<<<<< HEAD

		System.out.println("관리자 아이디를 입력하세요.");
=======
		
		System.out.print("관리자 아이디을 입력하세요 : ");
>>>>>>> refs/remotes/yuns111/master
		String insertAdminId = keyboard.next();
		System.out.print("관리자 비밀번호를 입력하세요 : ");
		String insertAdminPassWord = keyboard.next();
		System.out.print("관리자명을 입력하세요 : ");
		String insertAdminName = keyboard.next();

		Admin adminDomain = new Admin(insertAdminId, insertAdminPassWord, insertAdminName);

		Controllers.getAdminController().requestRegisterAdmin(adminDomain);

	}

}
