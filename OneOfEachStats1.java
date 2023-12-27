
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int numbersOfFamlies = Integer.parseInt(args[0]);
		double x = Math.random();
		boolean chanceGirl = (x >= 0 && x < 0.5);
		boolean chanceBoy = (x >= 0.5 && x < 1);
		int sum = 0;

		double average = 0;
		int twoKids = 0;
		int threeKids = 0;
		int fourkidsOrMore = 0;

       for(int i = 1; i <= numbersOfFamlies; i++) {

		if (chanceGirl==true) {
			while(chanceGirl==true) {
				sum++;
				x = Math.random();
				chanceGirl = (x >= 0 && x < 0.5);
	         }

			 sum++; // יצאנו מהלולאה כי קיבלנו בן ולכן הוספנו אותו לסכום.
			
			} else { 
				while(chanceBoy==true) {
				sum++;
				x = Math.random();
				chanceBoy = (x >= 0.5 && x < 1);
				}
				sum++;
			
			}
            
			average += sum;  // לסכום את כל הילדים מכל המשפחות
			if(sum == 2) twoKids++;
			if(sum == 3) threeKids++;
			if(sum >=4) fourkidsOrMore++;
			x = Math.random();
			 chanceGirl = (x >= 0 && x < 0.5);
		     chanceBoy = (x >= 0.5 && x < 1);
			sum = 0; 

		}

			System.out.println("Average:" + (average / numbersOfFamlies) + " children to get at least one of each gender.");
			System.out.println("Number of families with 2 children: " + twoKids);
			System.out.println("Number of families with 3 children " + threeKids);
			System.out.println("Number of families with 4 or more children: " + fourkidsOrMore);
			int max = (Math.max(Math.max(twoKids, threeKids), fourkidsOrMore));
			if (max == twoKids) System.out.println("The most common number of children is 2.");
			if (max == threeKids) System.out.println("The most common number of children is 3.");
			if (max == fourkidsOrMore) System.out.println("The most common number of children is 4 or more.");

		
	}

}

			
		