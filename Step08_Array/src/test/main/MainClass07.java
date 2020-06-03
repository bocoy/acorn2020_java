package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 2. Random 객체를 이용해서 로또 번호를 6개 랜덤하게 얻어내서
		 * 	   배열에 저장한다.
		 *   모두 다 저장이 되면 for 문을 이용해서 배열에 저장된 모든 로또 번호를
		 *   콘솔창에 순수대로 출력하는 코드를 작성새 보세요. 
		 */
		Random rand = new Random();
		int[] nums = new int[6];
		for(int i=0; i<nums.length; i++) {
			int tmp= 1+rand.nextInt(100);
			nums[i] = tmp;
			System.out.println(i+1+"번째 번호: "+nums[i]);
		}
		
		for(int i=0;i<nums.length; i++) {
			int tmp = nums[i];
			System.out.println(tmp);
		}
	}
}
