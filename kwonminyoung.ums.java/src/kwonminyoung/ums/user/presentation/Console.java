package kwonminyoung.ums.user.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	public static int inNum(String msg) {
		System.out.print(msg + "\n>> ");
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static String inStr(String msg) {
		System.out.print(msg + "\n>> ");
		String str = sc.nextLine();
		return str;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
}