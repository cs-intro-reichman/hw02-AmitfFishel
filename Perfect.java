
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]); 
		String sSum = " = 1";
		int sum = 1;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				sSum = sSum + " + " + i;
				sum += i;
	         }
		}
	 
	if (sum == num) {
	System.out.println(num + "  is a perfect number since " + num + sSum);
}   else {
	 System.out.println(num + "  is not a perfect number"); 

           }   

		}

	}


