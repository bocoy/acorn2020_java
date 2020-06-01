package test.main;

import java.util.Scanner;

import test.mypac.CarInfo;
import test.mypac.MyObject;
import test.mypac.Toast;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * test.mypac 페키지에 다양한 모양의 메소드를 가지는
		 * 클래스를 정의하고
		 * 그 클래스를 이용해서 객체도 생성하고 메소드도 호출해 보세요.
		 */
		Toast toast = new Toast();
		Scanner sc = new Scanner(System.in);
		System.out.println("빵갯수: ");
		int a = sc.nextInt();
		toast.inputb(a);
		
		toast.carinfo(new CarInfo(), "벤츠");
		
		toast.num1(15, 24);
	}
}
