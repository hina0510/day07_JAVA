package random;

import java.util.Random;
import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		int num, ans, su, mi, ma;
		while(true) {
			System.out.println("==========");
			System.out.println("1. EASY");
			System.out.println("2. NORMAL");
			System.out.println("3. HARD");
			System.out.println("4. EXIT");
			System.out.println("==========");
			
			System.out.print(">>>");
			num = input.nextInt();
			switch(num) {
			case 1 :
				ma = 10;
				mi=0;
				ans = r.nextInt(10)+1;
				while(true) {
					System.out.print("A : ");
					su = input.nextInt();
					
					if(mi<=su && su<=ma) {
						if(su>ans) {
							System.out.println("다운!!");
							ma = su-1;
						}else if(su<ans) {
							System.out.println("업!!");
							mi = su+1;
						}else {
							System.out.println("정답입니다.");
							break;
						}
					}
				}break;	
			case 2 :
				ma = 50;
				mi=0;
				ans = r.nextInt(50)+1;
				while(true) {
					System.out.print("A : ");
					su = input.nextInt();
					
					if(mi<=su && su<=ma) {
						if(su>ans) {
							System.out.println("다운!!");
							ma = su-1;
						}else if(su<ans) {
							System.out.println("업!!");
							mi = su+1;
						}else {
							System.out.println("정답입니다.");
							break;
						}
					}
				}break;
			case 3 :
				ma = 100;
				mi=0;
				ans = r.nextInt(100)+1;
				while(true) {
					System.out.print("A : ");
					su = input.nextInt();
					
					if(mi<=su && su<=ma) {
						if(su>ans) {
							System.out.println("다운!!");
							ma = su-1;
						}else if(su<ans) {
							System.out.println("업!!");
							mi = su+1;
						}else {
							System.out.println("정답입니다.");
							break;
						}
					}
				}break;
			case 4 : break;
			default :
				System.out.println("다시 입력");
				break;
			}
		}
	}
}
