package test.main;

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
		str[0] = sc.nextLine();
		str[1] = sc.nextLine();
		str[2] = sc.nextLine();
		str[3] = sc.nextLine();
		str[4] = sc.nextLine();
		for(int i=0; i<str.length; i++) {
			System.out.println(i+1+"번째 문자: "+str[i]);
		}
		
		/*
		 * 2. Random 객체를 이용해서 로또 번호를 6개 랜덤하게 얻어내서
		 * 	   배열에 저장한다.
		 *   모두 다 저장이 되면 for 문을 이용해서 배열에 저장된 모든 로또 번호를
		 *   콘솔창에 순수대로 출력하는 코드를 작성새 보세요. 
		 */
		Random rand = new Random();
		int[] lotto = new int[6];
		lotto[0] = 1+rand.nextInt(100);
		lotto[1] = 1+rand.nextInt(100);
		lotto[2] = 1+rand.nextInt(100);
		lotto[3] = 1+rand.nextInt(100);
		lotto[4] = 1+rand.nextInt(100);
		lotto[5] = 1+rand.nextInt(100);
		for(int i=0; i<lotto.length; i++) {
			System.out.println(i+1+"번째 번호: "+lotto[i]);
		}
		
	}
}
