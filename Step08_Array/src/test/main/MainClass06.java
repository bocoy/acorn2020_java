package test.main;

<<<<<<< HEAD
import java.util.Random;
import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  1.Scanner 객체를 이용해서 문자열을 5번입력 받는다.
		 *  입력 받은 문자열은 차례대로 배열에 저장 되어야 한다.
		 *  모두 다 입력 받은 후 for 문을 이용해서 배열에 저장된
		 *  모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해 보세요. 
		 */
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		for(int i=0; i<str.length; i++) {
			System.out.println(i+1+"번째 문자입력: ");
			str[i] = sc.nextLine();
		}
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		/*
		 * 2. Random 객체를 이용해서 로또 번호를 6개 랜덤하게 얻어내서
		 * 	   배열에 저장한다.
		 *   모두 다 저장이 되면 for 문을 이용해서 배열에 저장된 모든 로또 번호를
		 *   콘솔창에 순수대로 출력하는 코드를 작성새 보세요. 
		 */
		Random rand = new Random();
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = 1+rand.nextInt(100);
			System.out.println(i+1+"번째 번호: "+lotto[i]);
		}	
=======
import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  1. Scanner 객체를 이용해서 문자열을 5번 입력 받는다.
		 *     입력 받은 문자열은 차례대로 배열에 저장 되어야 한다.
		 *     모두다 입력 받은후 for 문을 이용해서 배열에 저장된 
		 *     모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해 보세요.
		 */
		//Scanner 객체를 생성해서 참조값을 지역 변수에 담기
		Scanner scan=new Scanner(System.in);
		//문자열(String) 5개를 담을수 있는 배열 객체 생성해서 참조값을 지역변수에 담기
		String[] msgs=new String[5];
		
		//5번 문자열을 입력 받기 위해 for 문을 구성한다. 
		for(int i=0; i<5; i++) {
			System.out.println("문자열 입력:");
			String str=scan.nextLine();
			//입력받은 문자열의 참조값을 배열에 순서대로 저장하기
			msgs[i]=str;
		}
		
		for(int i=0; i<msgs.length; i++) {
			//i번째 방에 있는 String  객체의 참조값을 불러온다.
			String tmp=msgs[i];
			//콘솔에 출력한다.
			System.out.println(tmp);
		}
>>>>>>> refs/heads/master
	}
}
