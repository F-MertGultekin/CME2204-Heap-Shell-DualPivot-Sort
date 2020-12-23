import java.util.Random;

public class InputHandle {
	
	public InputHandle() {
	
	}
	/*creates int array 
	 * all elements are equal each other
	 */
	void equalInt(int[] input) 
	{
		Random random = new Random();
	    int randomNumber= random.nextInt(Integer.MAX_VALUE);
	    
	    
		for (int i = 0; i < input.length; i++) {
			input[i]=randomNumber;
		}
		
		
	}
	/*creates int array 
	 * all elements are assinged randomly
	 */
	void RandomInt(int[] input) 
	{
	    
		for (int i = 0; i < input.length; i++) {
			Random random = new Random();
			int randomNumber= random.nextInt(Integer.MAX_VALUE);
			input[i]=randomNumber;
		}
	}
	/*creates int array 
	 * all elements are increasing order 
	 * one element is picking randomly 
	 * then others are increasing 
	 * difference between two consecutive element is one
	 */
	void IncreasingInt(int[] input) 
	{
		int max= 100000;
		int min=0;
		int random_int = (int)(Math.random() * (max - min + 1) + min);
	
		input[0]=(random_int);
		
		for (int i = 1; i < input.length; i++) {
			int num = input[i-1]+1;
			input[i]=num;
			
		}
	}
	/*creates int array 
	 * all elements are decreasing order 
	 * one element is picking randomly 
	 * then others are decreasing 
	 * difference between two consecutive element is one
	 */
	void DecreasingInt(int[] input) 
	{
		int max= 10000000;
		int min=-10000000;
		int random_int = (int)(Math.random() * (max - min + 1) + min);

		input[0]=(random_int);
		
		for (int i = 1; i < input.length; i++) {
			int num = input[i-1]-1;
			input[i]=num;
			
		}
	}
	
}
