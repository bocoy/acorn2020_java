package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass13 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("종료(q) 계속(Enter):");
			String qore = sc.nextLine();
			if(qore.equals("q")) {
				break;
			}
			MainClass13.rcp();
		}
		System.out.println("종료합니다.");
	}
	
	
	public static void rcp() {
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//		int a = rand.nextInt(3);
//		String[] com = {"s","r","p"};
//		System.out.print("가위(s) 바위(r) 보(p): ");
//		String user = sc.nextLine();
//		if(com[a].equals("s")) {
//			if(user.equals("s")) {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("draw \n");
//			}
//			else if(user.equals("r")) {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("win \n");
//			}
//			else {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("lose \n");
//			}
//		}
//		else if(com[a].equals("r")) {
//			if(user.equals("s")) {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("lose \n");
//			}
//			else if(user.equals("r")) {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("draw \n");
//			}
//			else {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("win \n");
//			}
//		}
//		else if(com[a].equals("p")) {
//			if(user.equals("s")) {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("win \n");
//			}
//			else if(user.equals("r")) {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("lose \n");
//			}
//			else {
//				System.out.println("나: "+user+" vs"+" 컴: "+com[a]);
//				System.out.println("draw \n");
//			}
//		}
		
		
		String[] items= {"가위", "바위","보"};
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String result = null;
		System.out.print("가위(s) 바위(r) 보(p): ");
		String clientInput = scan.nextLine();
		int me = 0;
		if(clientInput.equals("s")) {
			me = 0;
		}else if(clientInput.equals("r")) {
			me = 1;
		}else if(clientInput.equals("p")) {
			me = 2;
		}
		int com = ran.nextInt(3);
		if((me==0&&com==2)||(me==1&&com==0)||(me==2&&com==1)) {
			result = "win";
		}else if(me == com) {
			result = "draw";
		}else {
			result = "lose";
		}
		System.out.println("나: "+items[me]+" vs 컴: "+items[com]);
		System.out.println(result);
	}
}
