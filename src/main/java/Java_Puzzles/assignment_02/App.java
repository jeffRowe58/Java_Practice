package Java_Puzzles.assignment_02;

import Java_Puzzles.ignore.ignore2.TestingUtils;

public class App {

	
	/**
	 * You are driving a little too fast, and a police officer stops you. 
	 * Write code to compute the fine you would have to pay. 
	 * If your speed is 60 or less, the result is 0 since there is no fine. 
	 * If speed is between 61 and 80 inclusive, the fine is 100 dollars. 
	 * If speed is 81 or more, the result is 200. 
	 * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		speedingFine(60, false)  <b>---></b> 0 <br>
		speedingFine (65, false)   <b>---></b> 100 <br>
		speedingFine (65, true) <b>---></b> 0 <br>
	 */
		public static int speedingFine(int speed, boolean isHoliday) {
			int limit = 60;
			if(isHoliday){
				speed = speed - 5;
			}
			if(speed > limit && speed < 81){
				return 100;
			}else if(speed >= 81){
				return 200;
			}
			return 0;

		}
		
	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			TestingUtils.runTests();
		}
			

}
