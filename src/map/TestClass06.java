package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TestClass06 {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
	
	int num, cash;
	String menu;
	Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println("1. 메뉴 등록");
		System.out.println("2. 메뉴별 가격 보기");
		System.out.println("3. 종료");
		System.out.print(">>>");
		num = sc.nextInt();
		if (num==1) {
			System.out.print("메뉴 입력 : ");
			menu = sc.next();
			if(map.containsKey(menu)!=true) {
				System.out.print("가격 입력 : ");
				cash = sc.nextInt();
				map.put(menu, cash);
			}else {
				System.out.println("존재하는 메뉴입니다");
			}
		}else if (num==2) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key+" : "+map.get(key));
			}
			while(true) {
				System.out.print("1. 수정\t");
				System.out.print("2. 삭제\t");
				System.out.println("3. 나가기");
				System.out.print(">>>");
				num = sc.nextInt();
				if (num==1) { 
					System.out.print("메뉴 입력 : ");
					menu = sc.next();
					if(map.containsKey(menu)==true) {
						System.out.print("가격 입력 : ");
						cash = sc.nextInt();
						map.put(menu, cash);
					}else {
						System.out.println("없는 메뉴입니다");
					}
				}
				else if(num==2) {
					System.out.print("메뉴 입력 : ");
					menu = sc.next();
					if(map.containsKey(menu)==true) {
						map.remove(menu);
						System.out.println("메뉴 삭제");
					}else {
						System.out.println("없는 메뉴입니다");
					}
				}else break;
			}
		}else break;
	}//while
}
}
