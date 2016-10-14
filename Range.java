public class Range {


    public static void main(String[] args) {		
		for (int number = 100; number <= 999; number++) {	
			if (isArmstrong(number)) {
				System.out.println(number);
			}
		}
    }
	
	
	public static boolean isArmstrong(int number) {
		int sum = 0;
		int remainder;
		int temp;  
		temp = number;  
		while(number > 0) {  
			remainder = number % 10;  
			number = number / 10;  
			sum = sum + (remainder*remainder*remainder);  
		}
		return temp == sum;
	}

}