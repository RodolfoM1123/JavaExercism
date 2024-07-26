import java.util.Arrays;

public class LuhnValidator {
	
	boolean isValid(String candidate) {
		
		if(!candidate.matches("[\\d\\s]+")) return false;
		
		String reverseString = new StringBuilder(candidate).reverse().toString();
		int[] cardNumbers;
		int sum = 0;
		int number;
		cardNumbers = Arrays.stream(reverseString.replace(" ","").split("")).mapToInt(c -> Integer.parseInt(c)).toArray();
		//System.out.println(Arrays.toString(cardNumbers));
		
		if(cardNumbers.length <= 1) return false;
		
		for(int i = 0; i < cardNumbers.length; i++) {
			if((i+1) % 2 == 0) {
				number = cardNumbers[i] * 2; 
				if(number > 9) number -= 9;
				sum += number;
				continue;
			}
			sum += cardNumbers[i];
		}
        
		return sum % 10 == 0;
    }
	
}
