/* Marios Spyropoulos
 * HMTY
 * 1072763
 * Prohgmenes Texnikes Programmatismou
 */

public class Subtraction {
	
	public static void main(String[] args) {
		
		Subtraction Spyropoulos = new Subtraction();
		String result = Spyropoulos.sub(3, 3);
		System.out.println(result);
	}
	
	
	public String sub(int a, int b) {
		//return (a-b) > 0 ? "POSITIVE" : "NEGATIVE";
		
		if (a-b > 0) return "POSITIVE";
		if (a-b < 0) return "NEGATIVE";
		return "zero"	;
	}
}
/*CHANGE*/
/*BRANCH DEVELOP*/
/*COMMIT GITHUB*/
