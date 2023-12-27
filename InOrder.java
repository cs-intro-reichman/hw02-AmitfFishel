
public class InOrder {
	public static void main (String[] args) {
		int time = (int)(Math.random() * 10) + 1;
	    int firstNumber = (int)(Math.random() * 10);
		int num = 0;
		System.out.print(firstNumber);
		System.out.print(" ");
		int i = 0;
		  while (i< time-1) {
			num = (int)(10*Math.random());
			  if (num >= firstNumber) {
				System.out.print(num);
				System.out.print(" ");
				firstNumber = num; 
				i++;
			
	     	}
		} 
	}
}

