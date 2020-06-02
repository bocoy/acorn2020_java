package test.main;


/*
 * 	[ 기본 data type 의 참조 data type ]
 * 
 * byte : Byte
 * short : Short
 * int	: Integer
 * long	: Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean : Boolean
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 type
		int num1 = 10;
		//참조 데이터 type
		Integer num2 = 10;
        String strNum = num2.toString(num2);
        
        String strNum2 = "999";
        int result4 = Integer.parseInt(strNum2);
	}
}
