package test.main;

import java.util.Random;

/*
 * 	1.
 *  cherry, apple, banana, melon, 7
 *  
 *  5개의 문자열중에서 하나가 랜덤하게 출려되게 해 보세요. 
 * 
 * 	2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출려되게 해보세요.
 */
public class MainClass08 {
	public static void main(String[] args) {
		Random rand = new Random();
		String[] items = {"cherry","apple","banana","melon","7"};
		String[] str = new String[4]; 
				
		int a = rand.nextInt(5);
		System.out.println(items[a]);
		
		for(int i=0; i<str.length; i++) {
			int b = rand.nextInt(5);
			str[i] = items[b];
		}
		System.out.println(str[0]+"|"+str[1]+"|"+str[2]);
		
	}
}
