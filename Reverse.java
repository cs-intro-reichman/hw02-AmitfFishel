public class Reverse {
    public static void main(String[] args) {
      String s = (args[0]);  

      int right = s.length() - 1;
      int left = 0;

        for (int m = right; m >= 0; m--) {
          System.out.print(s.charAt(m)); 
        }
       
        System.out.println(); // Move to the next line

        if (s.length() % 2 == 0) {

          System.out.println("The middle character is " + s.charAt((s.length() / 2) -1));

        } else if (s.length() % 2 != 0) {

            System.out.println("The middle character is " + s.charAt((s.length() / 2)));

             }

        }
        
    }

 
