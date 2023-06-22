package string;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	String str = "test";
	System.out.println("문자열 입력 : ");
	//String str2 = new Scanner(System.in).next();
	String str2 = "       test        ";
	
	System.out.println(str+".");
	System.out.println(str2+".");
	System.out.println(str2.trim()+".");
	System.out.println("str == str2 : "+str.equals(str2));
	System.out.println("str == str2 : "+str.equals(str2.trim()));
	
	String addr = "052154/서울 종로구/단성사 4층";
	String[] s_addr = addr.split("/"); //입력값을 기준으로 자름
	for(int i=0;i<s_addr.length;i++) {
		System.out.println(s_addr[i]);
	}
	
	String result = addr.replace("/", ":"); // 앞의 입력값을 뒤의 입력값으로 바꿈
	System.out.println(result);
	
}
}
