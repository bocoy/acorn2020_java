package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass03 {
	public static void main(String[] args) {
		MyObject obj1 = new MyObject();
		obj1.setNum(10);
		obj1.setName("김구라");
		obj1.useCar(new Car());

	}
	
}
