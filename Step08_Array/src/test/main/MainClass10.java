package test.main;

import java.util.Random;

public class MainClass10 {
	public static void main(String[] args) {
		/*  cherry, apple, banana, melon, 7 
		 * 
		 * 	5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
		 *    예)  cherry | apple | cherry
		 *         7 | apple | melon
		 *         7 | 7 | 7
		 *   
		 *   cherry | cherry | cherry
		 *   10점 입니다.
		 *   
		 *   apple | apple | apple
		 *   20점 입니다.
		 *   
		 *   7|7|7
		 *   1000점 입니다.
		 *   
		 *   apple | cherry | apple
		 *   0점 입니다.
		 */
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		int[] points = {10,20,30,40,1000};
		//렌덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//렌덤하게 얻어낸 3개의 정수를 저장할 배열
		int[] nums=new int[3];
		//0~4 사이의 렌덤한 정수 3개 얻어내기
		for(int i=0;i<3;i++) {
			//렌덤한 정수를 얻어내서 
			int ranNum=ran.nextInt(5);
			nums[i]=ranNum; //배열에 저장한다 
		}
		int one=nums[0];
		int two=nums[1];
		int three=nums[2];
		//출력할 문자열 구성하기
		String line=items[one]+" | "+items[two]+" | "+items[three];
		System.out.println(line);
		//출력하기 
		
		
		if(nums[0]==nums[1]&&nums[1]==nums[2]) {
			for(int i=0; i<items.length; i++) {
				if(items[one]==items[i]) {
					System.out.println(points[i]+"점 입니다.");
				}
			}
		}
		else {
			System.out.println("0점 입니다.\n");
		}
		
		
	}
}
