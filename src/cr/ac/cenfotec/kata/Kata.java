package cr.ac.cenfotec.kata;

public class Kata {
	public String generate(int number) {
		
		String primos = null;
		
		if(number == 1) {
			primos = "[]";
		} else if(number == 2) {
			primos = "2 [2]";
		}
		
		return primos;
	}
}
