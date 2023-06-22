package random;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> chk = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		
		chk.put("가위 바위 보", a); // a
		chk.put("업 다운 게임", b); // b
		chk.put("랜덤 더하기 문제", c); // c
		
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 가위 바위 보");
			System.out.println("2. 업 다운 게임");
			System.out.println("3. 랜덤 더하기 문제");
			System.out.println("4. 전체 게임 횟수 확인");
			System.out.println("=====================");
			System.out.print(">>> ");
			int n = sc.nextInt();
			
			switch (n) {
				case 1: 
					double rand = Math.random() * 3;
					int sys = (int)rand + 1;
					
					System.out.println("1.가위 2.바위 3.보");
					System.out.print(">>> ");
					int play = sc.nextInt();
				
					if (sys == 1) {
						if (play == 1) {
							System.out.println("상대방이 가위를 냈습니다. 비겼습니다");
						}else if (play == 2) {
							System.out.println("상대방이 가위를 냈습니다. 이겼습니다");
						}else if (play == 3) {
							System.out.println("상대방이 가위를 냈습니다. 졌습니다");
						}
					}else if (sys == 2) {
						if (play == 1) {
							System.out.println("상대방이 바위를 냈습니다. 졌습니다");
						}else if (play == 2) {
							System.out.println("상대방이 바위를 냈습니다. 비겼습니다");
						}else if (play == 3) {
							System.out.println("상대방이 바위를 냈습니다. 이겼습니다");
						}
					}else if (sys == 3) {
						if (play == 1) {
							System.out.println("상대방이 보를 냈습니다. 이겼습니다");
						}else if (play == 2) {
							System.out.println("상대방이 보를 냈습니다. 졌습니다");
						}else if (play == 3) {
							System.out.println("상대방이 보를 냈습니다. 비겼습니다");
						}
					}
					chk.put("가위 바위 보", ++a);	
				break;
	// case 1. 가위바위보---------------------------------------------------------------------------		
			case 2: 
				Random r1 = new Random();
				int num, ans, su, mi, ma;
				while(true) {
					System.out.println("==========");
					System.out.println("1. EASY");
					System.out.println("2. NORMAL");
					System.out.println("3. HARD");
					System.out.println("4. EXIT");
					System.out.println("==========");
					
					System.out.print(">>>");
					num = sc.nextInt();
					switch(num) {
						case 1 :
							ma = 10;
							mi = 0;
							ans = r1.nextInt(10)+1;
							while(true) {
								System.out.print("A : ");
								su = sc.nextInt();
							
								if(mi <= su && su <= ma) {
									if(su > ans) {
										System.out.println("다운!!");
										ma = su-1;
							 		}else if(su < ans) {
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
							mi = 0;
							ans = r1.nextInt(50)+1;
							while(true) {
								System.out.print("A : ");
								su = sc.nextInt();
							
								if(mi <= su && su <= ma) {
									if(su > ans) {
										System.out.println("다운!!");
										ma = su-1;
									}else if(su < ans) {
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
							mi = 0;
							ans = r1.nextInt(100)+1;
							while(true) {
								System.out.print("A : ");
								su = sc.nextInt();
							
								if(mi <= su && su <= ma) {
									if(su > ans) {
										System.out.println("다운!!");
										ma = su-1;
									}else if(su < ans) {
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
					break;
					}
				chk.put("업 다운 게임", ++b);
				break;
	// case 2. 업다운게임---------------------------------------------------------------------------			
			case 3: 
				Random r2 = new Random();
				int i, n3 , n4 = 0, n5 = 0;
				String str1 = "정답입니다";
				String str2 = "오답입니다";
				for(i = 0; i <= 4; i++) {
					int n1 = r2.nextInt(100);
					int n2 = r2.nextInt(100);
					
					System.out.print(n1 + " + " + n2 + " = ");
					int sum = n1 + n2;
					n3 = sc.nextInt();
					if(n3 == sum) {
						System.out.println(str1);
						n4++;
					}else {
						System.out.println(str2);
						n5++;
					}
						
					if(i == 4) {
						System.out.println("-----------------");
						System.out.println("끝났습니다\n"+"맞춘문제 : "+ n4 +"개 틀린문제 : " + n5 + "개");	
					}
				}
				chk.put("랜덤 더하기 문제", ++c);
				break;
	// case 3. 랜덤 더하기 문제---------------------------------------------------------------------------		
			case 4:
				Iterator<String> it = chk.keySet().iterator();
				System.out.println("");
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key + " : " + chk.get(key));
				}
				System.out.println("");
				break;
			case 5:
				System.exit(0);
			}
		}		
	}
}

