package Java_Puzzles.assignment_12;

import Java_Puzzles.ignore.ignore12.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {
		String[] strArray = str.split(" ");
		for(int i = 0; i < strArray.length; i++){
			if(strArray[i].equals("*")){
				System.out.println(strArray[i]);
				strArray[i -1] = ("");
				strArray[i] = ("");
				strArray[i - 1] = ("");
			}
			return str;
		}
		return null;
	}


	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
