package Java_Puzzles.assignment_09;

import Java_Puzzles.ignore.ignore9.TestingUtils;

public class App {


	/**

	Given 2 positive int arguments (a, b), return whichever argument is 
	nearest to the number 21 without going over.
	Return 0 if they both go over 21. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		nearestTwentyOne(19, 21)   <b>---></b> 21 <br>
		nearestTwentyOne(21, 19)    <b>---></b> 21 <br>
		nearestTwentyOne(19, 22) <b>---></b> 19 <br>
		nearestTwentyOne(32, 22) <b>---></b> 0 <br>
	 */
	
	public static int nearestTwentyOne(int a, int b) {
		if(a == 21){
			return a;
		}else if(b == 21){
			return b;
		}else if(a > 21 && b < 21){
			return b;
		}else if(b > 21 && a < 21) {
			return a;
		}else if(a < 21 && b < 21) {
			return Math.max(a,b);
		} else
		 {
			return 0;
		}
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
