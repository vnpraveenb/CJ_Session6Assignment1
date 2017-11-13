package looping;

 /**
 * @author Praveen
 *
 */
public class Loop {

	int[] intArray = new int[10];
	
 
	public void initialise()
	{		
		for(int i = 0; i<10; i++)
		{
			intArray[i] = i+1;
		}
	}
	
	 
	public void printEvenNumbers()
	{
		System.out.println("Printing the even numbers");
		
		for(int j = 0; j<10; j++)
		{
			if((intArray[j]%2) == 0)
			{
				System.out.println(intArray[j]);
			}
		}
	 
	}
	
	public static void main(String[] args) {
 		
		Loop loopObj = new Loop();
		
		loopObj.initialise();
		
		loopObj.printEvenNumbers();

 	}

}
