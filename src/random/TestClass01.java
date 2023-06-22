package random;

import java.util.Random;

public class TestClass01 {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		System.out.println(Math.random());
	}
	System.out.println("============");
	for(int i=0;i<5;i++) {
		int num = (int)(Math.random()*3); //*10 =0.000 ~ 9.999
		System.out.println(num);
	}
	System.out.println("============");
	Random r = new Random();
	for(int i=0;i<5;i++) {
		int num = r.nextInt(45);
		System.out.println(num+1);
	}
	
	
}
}
