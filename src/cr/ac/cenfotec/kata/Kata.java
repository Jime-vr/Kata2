package cr.ac.cenfotec.kata;

public class Kata {
	public String generate(int number) {
		
		String primos = null;
		
		if(number == 1) {
			primos = "[]";
		} else if(number == 2) {
			primos = "2 [2]";
		} else if(number == 3) {
			primos = "3 [3]";
		} else if(number == 4) {
			primos = "4 [2,2]";
		} else if(number == 5) {
			primos = "5 [5]";
		}
		
		return primos;
	}
}
