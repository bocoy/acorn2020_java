package test.main;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
//		Random rand = new Random();
//		String[] items = {"cherry","apple","banana","melon","7"};
//		String[] str = new String[4]; 
//				
//		for(int i=0; i<str.length; i++) {
//			int a = rand.nextInt(5);
//			str[i] = items[a];
//		}
//		System.out.println(str[0]+" | "+str[1]+" | "+str[2]);
		
		
		String[] items={"cherry", "apple", "banana", "melon", "7"};
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
		//출력하기 
		System.out.println(line);
		
	}
}
