package hw4;

public class Homework4_3 {
	
	public static void main(String[]args) {
		
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String vowel = "aeiou";
		int count = 0;
		
		for (int i=0; i<planet.length; i++) {
			for(int j=0; j<planet[i].length();j++) {
				for(int x=0; x< vowel.length(); x++ ) {
					if (planet[i].substring(j,j+1).equals(vowel.substring(x,x+1)))
						count++;
				}
			}
		}System.out.println(count);
	}
}
