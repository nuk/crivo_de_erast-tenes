import java.util.ArrayList;
import java.util.List;


public class Crivo {

	public static List<Integer> primes(int limit) {
		List<Integer> allNumber = createAllNumbersToTheLimit(limit);
		List<Integer> result = new ArrayList<Integer>();
		
		result.add(allNumber.get(0));
		
		for(int i = 1; i < allNumber.size(); i++){
			int number = allNumber.get(i);
			
			if (!isDivisible(result, number)){
				result.add(number);
			}
		}
		return result;
	}

	private static boolean isDivisible(List<Integer> result, int number) {
		boolean divisible = false;
		for(int prime : result){
			if (prime <= Math.sqrt(number)){
				divisible |= number % prime == 0;
			}else{
				break;
			}
		}
		return divisible;
	}

	private static List<Integer> createAllNumbersToTheLimit(int limit) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 2 ; i <= limit; i ++){
			result.add(i);
		}
		return result;
	}

}
