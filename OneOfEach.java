public class OneOfEach {
	public static void main (String[] args) {
      double x = Math.random();
	  boolean chanceGirl = (x >= 0 && x < 0.5);
	  boolean chanceBoy = (x >= 0.5 && x < 1);
      int sum = 0;
		
       if (chanceGirl) {
        	while(chanceGirl) {
		    	System.out.print( "g ");
		    	sum++;
		    	x = Math.random();
		    	chanceGirl = (x >= 0 && x < 0.5);
			 }
		      System.out.print( "b");
			  sum++; // יצאנו מהלולאה כי קיבלנו בן ולכן הוספנו אותו לסכום.
					
		} else { 
			while(chanceBoy) {
			  System.out.print("b ");	
		    	sum++;
		    	x = Math.random();
				chanceBoy = (x >= 0.5 && x < 1);
			}
			System.out.print( "g");
			sum++;
						
		}
	 	System.out.println();
	    System.out.println("You made it ... and you now have " + sum + " children.");


		}

	}
		