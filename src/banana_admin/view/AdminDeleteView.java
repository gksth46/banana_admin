package banana_admin.view;

import java.util.Scanner;

<<<<<<< HEAD:src/banana_admin/view/AdminDeleteView.java
public class AdminDeleteView {
	
	private Scanner keyboard;
	
	public AdminDeleteView() {
=======
public class DeleteAdminView {
	
	private Scanner keyboard;
	
	public DeleteAdminView() {
>>>>>>> refs/remotes/yuns111/master:src/banana_admin/view/deleteAdminView.java
		
		keyboard = new Scanner(System.in);
		
	}

	public int searchDeleteAdminNumber() {
		
		int searchDeleteAdminNumber = 0;
		
		System.out.println("\n[관리자 삭제 모드]");
		System.out.print("관리자 번호 : ");
		searchDeleteAdminNumber = keyboard.nextInt();
		
		return searchDeleteAdminNumber;
		
	}
	
}
