package week1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime number");
		int w= 73,j,prime,Counter=0;
		for (j =2; j<=w/2;j++)
			
		{
			prime = w %j;
			if (prime==0) 
			{
				Counter =1;
				break;
			}
			
		}
		
		if (Counter ==1)
		{
			System.out.print("Given number is prime no"+w);
		}
		else
		{
			System.out.print("Given numbser is not prime" +w);
						
		}
	}
		
	}


