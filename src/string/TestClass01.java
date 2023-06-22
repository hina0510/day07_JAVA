package string;

public class TestClass01 {
public static void main(String[] args) {
	String str;
	String str2 = new String();
	String str3 = "test";
	String str4 = new String("Java programming");
	
	String s = str4.toUpperCase();
	System.out.println(s);
	String s2 = str4.toLowerCase();
	System.out.println(s2);
	
	str3 = "Java";
	if(str3.toLowerCase().equals("java")) {
		System.out.println("자바");
	}
	
}
}
